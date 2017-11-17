/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.automore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Janith
 */
@Entity
public class Model {
    private Integer modelId;
    private String modelName;
    private String year;
    
    // General
    private String introDate;
    private String status;
    private String bodyType;
    private Integer noDoors;
    private Integer noSeats;
    private Integer noPassengers;
    private String carType;
    private String colors;
    
    // Drive
    private String driveType;
    
    // Engine
    private String engineType;
    private String engineDescription;
    
    // Fuel
    private String avgConsumption;
    private String coEmmission;
    
    // Transmission
    private String transtype;
    private int noGears;
    
    // Suspension
    private String frontSus;
    private String rearSus;
    
    // Brakes
    private String frontBrake;
    private String rearBrake;
    
    // Safety
    private int noAirbags;
    private String ncap;
    
    // Performance
    private String acceleration;
    private String topSpeed;
    private String horsePower;

    // Measurements
    private String cargoTrunkCapacity;
    private String length;
    private String width;
    private String height;
    private String wheelbase;
    private String groundClearance;
    
    // Features
    private String features;
    
    // Price
    private String price;
    
    // Photo
    private String imgPath;

    /**
     * @return the modelId
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getModelId() {
        return modelId;
    }

    /**
     * @param modelId the modelId to set
     */
    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    /**
     * @return the modelName
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * @param modelName the modelName to set
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return the introDate
     */
    public String getIntroDate() {
        return introDate;
    }

    /**
     * @param introDate the introDate to set
     */
    public void setIntroDate(String introDate) {
        this.introDate = introDate;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the bodyType
     */
    public String getBodyType() {
        return bodyType;
    }

    /**
     * @param bodyType the bodyType to set
     */
    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    /**
     * @return the noDoors
     */
    public Integer getNoDoors() {
        return noDoors;
    }

    /**
     * @param noDoors the noDoors to set
     */
    public void setNoDoors(Integer noDoors) {
        this.noDoors = noDoors;
    }

    /**
     * @return the noSeats
     */
    public Integer getNoSeats() {
        return noSeats;
    }

    /**
     * @param noSeats the noSeats to set
     */
    public void setNoSeats(Integer noSeats) {
        this.noSeats = noSeats;
    }

    /**
     * @return the noPassengers
     */
    public Integer getNoPassengers() {
        return noPassengers;
    }

    /**
     * @param noPassengers the noPassengers to set
     */
    public void setNoPassengers(Integer noPassengers) {
        this.noPassengers = noPassengers;
    }

    /**
     * @return the carType
     */
    public String getCarType() {
        return carType;
    }

    /**
     * @param carType the carType to set
     */
    public void setCarType(String carType) {
        this.carType = carType;
    }

    /**
     * @return the colors
     */
    public String getColors() {
        return colors;
    }

    /**
     * @param colors the colors to set
     */
    public void setColors(String colors) {
        this.colors = colors;
    }

    /**
     * @return the driveType
     */
    public String getDriveType() {
        return driveType;
    }

    /**
     * @param driveType the driveType to set
     */
    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    /**
     * @return the engineType
     */
    public String getEngineType() {
        return engineType;
    }

    /**
     * @param engineType the engineType to set
     */
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /**
     * @return the engineDescription
     */
    public String getEngineDescription() {
        return engineDescription;
    }

    /**
     * @param engineDescription the engineDescription to set
     */
    public void setEngineDescription(String engineDescription) {
        this.engineDescription = engineDescription;
    }

    /**
     * @return the avgConsumption
     */
    public String getAvgConsumption() {
        return avgConsumption;
    }

    /**
     * @param avgConsumption the avgConsumption to set
     */
    public void setAvgConsumption(String avgConsumption) {
        this.avgConsumption = avgConsumption;
    }

    /**
     * @return the coEmmission
     */
    public String getCoEmmission() {
        return coEmmission;
    }

    /**
     * @param coEmmission the coEmmission to set
     */
    public void setCoEmmission(String coEmmission) {
        this.coEmmission = coEmmission;
    }

    /**
     * @return the noGears
     */
    public int getNoGears() {
        return noGears;
    }

    /**
     * @param noGears the noGears to set
     */
    public void setNoGears(int noGears) {
        this.noGears = noGears;
    }

    /**
     * @return the frontSus
     */
    public String getFrontSus() {
        return frontSus;
    }

    /**
     * @param frontSus the frontSus to set
     */
    public void setFrontSus(String frontSus) {
        this.frontSus = frontSus;
    }

    /**
     * @return the rearSus
     */
    public String getRearSus() {
        return rearSus;
    }

    /**
     * @param rearSus the rearSus to set
     */
    public void setRearSus(String rearSus) {
        this.rearSus = rearSus;
    }

    /**
     * @return the frontBrake
     */
    public String getFrontBrake() {
        return frontBrake;
    }

    /**
     * @param frontBrake the frontBrake to set
     */
    public void setFrontBrake(String frontBrake) {
        this.frontBrake = frontBrake;
    }

    /**
     * @return the rearBrake
     */
    public String getRearBrake() {
        return rearBrake;
    }

    /**
     * @param rearBrake the rearBrake to set
     */
    public void setRearBrake(String rearBrake) {
        this.rearBrake = rearBrake;
    }

    /**
     * @return the noAirbags
     */
    public int getNoAirbags() {
        return noAirbags;
    }

    /**
     * @param noAirbags the noAirbags to set
     */
    public void setNoAirbags(int noAirbags) {
        this.noAirbags = noAirbags;
    }

    /**
     * @return the ncap
     */
    public String getNcap() {
        return ncap;
    }

    /**
     * @param ncap the ncap to set
     */
    public void setNcap(String ncap) {
        this.ncap = ncap;
    }

    /**
     * @return the acceleration
     */
    public String getAcceleration() {
        return acceleration;
    }

    /**
     * @param acceleration the acceleration to set
     */
    public void setAcceleration(String acceleration) {
        this.acceleration = acceleration;
    }

    /**
     * @return the topSpeed
     */
    public String getTopSpeed() {
        return topSpeed;
    }

    /**
     * @param topSpeed the topSpeed to set
     */
    public void setTopSpeed(String topSpeed) {
        this.topSpeed = topSpeed;
    }

    /**
     * @return the horsePower
     */
    public String getHorsePower() {
        return horsePower;
    }

    /**
     * @param horsePower the horsePower to set
     */
    public void setHorsePower(String horsePower) {
        this.horsePower = horsePower;
    }

    /**
     * @return the cargoTrunkCapacity
     */
    public String getCargoTrunkCapacity() {
        return cargoTrunkCapacity;
    }

    /**
     * @param cargoTrunkCapacity the cargoTrunkCapacity to set
     */
    public void setCargoTrunkCapacity(String cargoTrunkCapacity) {
        this.cargoTrunkCapacity = cargoTrunkCapacity;
    }

    /**
     * @return the length
     */
    public String getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     * @return the width
     */
    public String getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(String width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public String getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * @return the wheelbase
     */
    public String getWheelbase() {
        return wheelbase;
    }

    /**
     * @param wheelbase the wheelbase to set
     */
    public void setWheelbase(String wheelbase) {
        this.wheelbase = wheelbase;
    }

    /**
     * @return the groundClearance
     */
    public String getGroundClearance() {
        return groundClearance;
    }

    /**
     * @param groundClearance the groundClearance to set
     */
    public void setGroundClearance(String groundClearance) {
        this.groundClearance = groundClearance;
    }

    /**
     * @return the features
     */
    public String getFeatures() {
        return features;
    }

    /**
     * @param features the features to set
     */
    public void setFeatures(String features) {
        this.features = features;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return the imgPath
     */
    public String getImgPath() {
        return imgPath;
    }

    /**
     * @param imgPath the imgPath to set
     */
    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    /**
     * @return the transtype
     */
    public String getTranstype() {
        return transtype;
    }

    /**
     * @param transtype the transtype to set
     */
    public void setTranstype(String transtype) {
        this.transtype = transtype;
    }
    
    
}
