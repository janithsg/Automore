/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.automore.service.impl;

import edu.ijse.automore.dao.ModelDao;
import edu.ijse.automore.model.Model;
import edu.ijse.automore.service.ModelService;
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
public class ModelServiceImpl implements ModelService{
    @Autowired
    private ModelDao modelDao;
    
    @Override
    public String saveModel(Model model) {
        return modelDao.saveModel(model);
    }

    @Override
    public List<Model> searchModels(String kwd) {
        return modelDao.searchModels(kwd);
    }
    
}
