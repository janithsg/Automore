/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.automore.service.impl;

import edu.ijse.automore.dao.BrandDao;
import edu.ijse.automore.model.Brand;
import edu.ijse.automore.service.BrandService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Janith
 */
@Service
@Transactional
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandDao brandDao;
    
    @Override
    public List<Brand> getAll() {
        return brandDao.getAll();
    }

    @Override
    public Brand getBrand(String id) {
        return brandDao.getBrand(id);
    }
    
}
