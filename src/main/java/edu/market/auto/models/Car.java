package edu.market.auto.models;

import jakarta.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   
    private String carModel;
    private String carBrand;
    private int carYear;
    private int carMileage;
    private String carBody;
    private int carPrice;
    private String carColor;
    private String carEngine;
    private int carVolume;
    private int carPower;
    private String carTransmission;
    private String carDrive;
    private String carCondition;
    private int carOwners;
    private String carCustoms;
    private String bagrain;
    private String carVin;
    private String carPlate;

    public String getCarPlate() {
        return carPlate;
    }
    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getcarModel() {
        return carModel;
    }
    public void setcarModel(String carModel) {
        this.carModel = carModel;
    }
    public String getcarBrand() {
        return carBrand;
    }
    public void setcarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
    public int getcarPrice(){
        return carPrice;
    }
    
    public int getcarYear(){
        return carYear;
    }
    public void setcarYear(int carYear){
        this.carYear = carYear;
    }
    
    public int getCarMileage() {
        return carMileage;
    }
    public void setCarMileage(int carMileage) {
        this.carMileage = carMileage;
    }

    public String getCarBody() {
        return carBody;
    }
    public void setCarBody(String carBody) {
        this.carBody = carBody;
    }

    public String getCarColor() {
        return carColor;
    }
    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarEngine() {
        return carEngine;
    }
    public void setCarEngine(String carEngine) {
        this.carEngine = carEngine;
    }

    public int getCarVolume() {
        return carVolume;
    }
    public void setCarVolume(int carVolume) {
        this.carVolume = carVolume;
    }

    public int getCarPower() {
        return carPower;
    }
    public void setCarPower(int carPower) {
        this.carPower = carPower;
    }
    
    public String getCarTransmission() {
        return carTransmission;
    }
    public void setCarTransmission(String carTransmission) {
        this.carTransmission = carTransmission;
    }

    public String getCarDrive() {
        return carDrive;
    }
    public void setCarDrive(String carDrive) {
        this.carDrive = carDrive;
    }

    public String getCarCondition() {
        return carCondition;
    }
    public void setCarCondition(String carCondition) {
        this.carCondition = carCondition;
    }

    public int getCarOwners() {
        return carOwners;
    }
    public void setCarOwners(int carOwners) {
        this.carOwners = carOwners;
    }

    public String getCarCustoms() {
        return carCustoms;
    }
    public void setCarCustoms(String carCustoms) {
        this.carCustoms = carCustoms;
    }

    public String getBagrain() {
        return bagrain;
    }
    public void setBagrain(String bagrain) {
        this.bagrain = bagrain;
    }

    public String getCarVin() {
        return carVin;
    }
    public void setCarVin(String carVin) {
        this.carVin = carVin;
    }
}
