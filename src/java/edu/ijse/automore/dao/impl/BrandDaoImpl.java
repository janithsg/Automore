/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.automore.dao.impl;

import edu.ijse.automore.dao.BrandDao;
import edu.ijse.automore.model.Brand;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Janith
 */
@Repository
public class BrandDaoImpl implements BrandDao{
    
    @Autowired
    private HibernateTemplate hibernateTemplate;
    
    @Override
    public List<Brand> getAll() {
        List<Brand> brands = hibernateTemplate.getSessionFactory().openSession().createCriteria(Brand.class).list();
        return brands;
    }

    @Override
    public Brand getBrand(String id) {
        Integer no = Integer.parseInt(id);
        Brand brand = (Brand)hibernateTemplate.getSessionFactory().openSession().get(Brand.class,no + 1);
        return brand;
    }
    
}
