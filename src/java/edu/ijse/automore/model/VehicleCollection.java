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

/**
 *
 * @author Janith
 */
@Entity
public class VehicleCollection {
    private Integer collectionId;
    private String collectionName;
    private String description;
    private Collection<Model> cars = new ArrayList<>();

    /**
     * @return the collectionId
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getCollectionId() {
        return collectionId;
    }

    /**
     * @param collectionId the collectionId to set
     */
    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * @return the collectionName
     */
    public String getCollectionName() {
        return collectionName;
    }

    /**
     * @param collectionName the collectionName to set
     */
    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the cars
     */
    @OneToMany(cascade = CascadeType.ALL)
    public Collection<Model> getCars() {
        return cars;
    }

    /**
     * @param cars the cars to set
     */
    public void setCars(Collection<Model> cars) {
        this.cars = cars;
    }
    
    
}
