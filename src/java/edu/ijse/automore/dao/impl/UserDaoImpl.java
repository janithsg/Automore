/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.automore.dao.impl;

import edu.ijse.automore.dao.UserDao;
import edu.ijse.automore.model.Member;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private HibernateTemplate hibernateTemplate;
    
    public Serializable register(Member user) {
        System.out.println("Saved.");
        return hibernateTemplate.save(user);
    }
    
}
