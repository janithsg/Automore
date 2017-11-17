/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.automore.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Janith
 */
@Entity
public class Love {
    private Integer loveid;
    private Member member;
    private Integer loved;
    private String date;

    /**
     * @return the loveid
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getLoveid() {
        return loveid;
    }

    /**
     * @param loveid the loveid to set
     */
    public void setLoveid(Integer loveid) {
        this.loveid = loveid;
    }

    /**
     * @return the member
     */
    @OneToOne(cascade = CascadeType.ALL)
    public Member getMember() {
        return member;
    }

    /**
     * @param member the member to set
     */
    public void setMember(Member member) {
        this.member = member;
    }

    /**
     * @return the loved
     */
    public Integer getLoved() {
        return loved;
    }

    /**
     * @param loved the loved to set
     */
    public void setLoved(Integer loved) {
        this.loved = loved;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
    
    
}
