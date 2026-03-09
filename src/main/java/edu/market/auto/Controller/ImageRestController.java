package edu.market.auto.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@RestController
public class ImageRestController {

    // Базовая директория для сохранения изображений
    private static final String BASE_UPLOAD_DIR = "uploads/";
    
    @PostMapping("/api/upload")
    public ResponseEntity<String> uploadImage(
            @RequestParam("file") MultipartFile file,
            @RequestParam("carModel") String carModel) {
        
        try {
            // Проверка на пустой файл
            if (file.isEmpty()) {
                return ResponseEntity.badRequest().body("Файл не выбран");
            }
            
            // Проверка типа файла
            String contentType = file.getContentType();
            if (contentType == null || 
                !(contentType.equals("image/jpeg") || 
                  contentType.equals("image/png") || 
                  contentType.equals("image/gif"))) {
                return ResponseEntity.badRequest().body("Разрешены только JPG, PNG или GIF изображения");
            }
            
            // Проверка размера файла (до 5MB)
            if (file.getSize() > 5 * 1024 * 1024) {
                return ResponseEntity.badRequest().body("Файл слишком большой (макс. 5MB)");
            }
            
            // Нормализация названия модели для имени папки
            String normalizedCarModel = carModel.trim()
                .replaceAll("[^a-zA-Z0-9а-яА-Я]", "_")
                .toLowerCase();
            
            // Создание пути для конкретного автомобиля
            Path carDirectory = Paths.get(BASE_UPLOAD_DIR + normalizedCarModel);
            
            // Создание директории, если не существует
            if (!Files.exists(carDirectory)) {
                Files.createDirectories(carDirectory);
            }
            
            // Генерация уникального имени файла
            String originalFilename = file.getOriginalFilename();
            String fileExtension = originalFilename != null ? 
                originalFilename.substring(originalFilename.lastIndexOf(".")) : ".jpg";
            String uniqueFileName = UUID.randomUUID() + fileExtension;
            
            // Сохранение файла
            Path filePath = carDirectory.resolve(uniqueFileName);
            Files.copy(file.getInputStream(), filePath);
            
            // Здесь можно сохранить информацию о файле в БД
            // imageService.saveImageInfo(normalizedCarModel, uniqueFileName, carModel);
            
            return ResponseEntity.ok("Изображение успешно загружено в папку: " + normalizedCarModel + 
                                  "/" + uniqueFileName);
            
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().body("Ошибка при загрузке файла: " + e.getMessage());
        }
    }
}
