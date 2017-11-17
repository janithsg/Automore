/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.automore.dao.impl;

import edu.ijse.automore.dao.ModelDao;
import edu.ijse.automore.model.Model;
import java.util.List;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Janith
 */
@Repository
public class ModelDaoImpl implements ModelDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public String saveModel(Model model) {
        hibernateTemplate.save(model);
        return "done";
    }

    @Override
    public List<Model> searchModels(String kwd) {
        List<?> empList = hibernateTemplate.find("from Model as mdel where mdel.modelName like (?)", "%"+kwd+"%");
        List<Model> list = (List<Model>)empList;
        System.out.println(list.size());
        return list;
    }

}
