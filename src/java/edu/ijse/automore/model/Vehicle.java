/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.automore.model;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Janith
 */
@Entity
public class Vehicle {
    private Integer vehicleId;
    private Brand brand;
    private String vehicleName;
    private String successor;
    private Collection<Model> models = new ArrayList<>();

    /**
     * @return the vehicleId
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getVehicleId() {
        return vehicleId;
    }

    /**
     * @param vehicleId the vehicleId to set
     */
    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    /**
     * @return the brand
     */
    @OneToOne(cascade = CascadeType.ALL)
    public Brand getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    /**
     * @return the vehicleName
     */
    public String getVehicleName() {
        return vehicleName;
    }

    /**
     * @param vehicleName the vehicleName to set
     */
    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    /**
     * @return the successor
     */
    public String getSuccessor() {
        return successor;
    }

    /**
     * @param successor the successor to set
     */
    public void setSuccessor(String successor) {
        this.successor = successor;
    }

    /**
     * @return the models
     */
    @OneToMany(cascade = CascadeType.ALL)
    public Collection<Model> getModels() {
        return models;
    }

    /**
     * @param models the models to set
     */
    public void setModels(Collection<Model> models) {
        this.models = models;
    }
    
    
}
