package edu.market.auto.models;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
    //List<Car> getCars();
   
}
