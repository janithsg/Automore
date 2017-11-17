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
public class Brand {
    private Integer brandid;
    private String brandName;
    private String description;

    /**
     * @return the brandid
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getBrandid() {
        return brandid;
    }

    /**
     * @param brandid the brandid to set
     */
    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    /**
     * @return the brandName
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * @param brandName the brandName to set
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
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
    
    
}
