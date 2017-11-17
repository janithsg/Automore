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
public class Log {
    private Integer logId;
    private Member member;
    private String action;
    private String dateTime;

    /**
     * @return the logId
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getLogId() {
        return logId;
    }

    /**
     * @param logId the logId to set
     */
    public void setLogId(Integer logId) {
        this.logId = logId;
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
     * @return the action
     */
    public String getAction() {
        return action;
    }

    /**
     * @param action the action to set
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * @return the dateTime
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * @param dateTime the dateTime to set
     */
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
    
    
}
