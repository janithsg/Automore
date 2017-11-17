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
public class Stat {
    private Integer statId;
    private Collection<Love> loves = new ArrayList<>();
    private Collection<Comment> comments = new ArrayList<>();
    private Integer noHits;
    private String popularity;

    /**
     * @return the statId
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getStatId() {
        return statId;
    }

    /**
     * @param statId the statId to set
     */
    public void setStatId(Integer statId) {
        this.statId = statId;
    }

    /**
     * @return the loves
     */
    @OneToMany(cascade = CascadeType.ALL)
    public Collection<Love> getLoves() {
        return loves;
    }

    /**
     * @param loves the loves to set
     */
    public void setLoves(Collection<Love> loves) {
        this.loves = loves;
    }

    /**
     * @return the comments
     */
    @OneToMany(cascade = CascadeType.ALL)
    public Collection<Comment> getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(Collection<Comment> comments) {
        this.comments = comments;
    }

    /**
     * @return the noHits
     */
    public Integer getNoHits() {
        return noHits;
    }

    /**
     * @param noHits the noHits to set
     */
    public void setNoHits(Integer noHits) {
        this.noHits = noHits;
    }

    /**
     * @return the popularity
     */
    public String getPopularity() {
        return popularity;
    }

    /**
     * @param popularity the popularity to set
     */
    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    
}
