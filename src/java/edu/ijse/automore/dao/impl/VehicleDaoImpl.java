/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.automore.dao.impl;

import edu.ijse.automore.dao.VehicleDao;
import edu.ijse.automore.model.Model;
import edu.ijse.automore.model.Vehicle;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Janith
 */
@Repository
public class VehicleDaoImpl implements VehicleDao{
    @Autowired
    private HibernateTemplate hibernateTemplate;
    
    @Override
    public String addVehicle(Vehicle vehicle) {
        hibernateTemplate.save(vehicle);
        return "done";
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        List<Vehicle> vehicles = hibernateTemplate.getSessionFactory().openSession().createCriteria(Vehicle.class).list();
        return vehicles;
    }

    @Override
    public Vehicle getVehicle(String id) {
        Integer no = Integer.parseInt(id);
        Vehicle vehicle = (Vehicle)hibernateTemplate.getSessionFactory().openSession().get(Vehicle.class, no);
        return vehicle;
    }

    @Override
    public String updateVehicle(Vehicle vehicle) {
        hibernateTemplate.merge(vehicle);
        return "done";
    }

    @Override
    public List<Vehicle> searchModels(String kwd) {
        List<?> empList = hibernateTemplate.find("from Vehicle as vehi where vehi.vehicleName like (?)", "%"+kwd+"%");
        List<Vehicle> list = (List<Vehicle>)empList;
        System.out.println(list.size());
        return list;
    }
    
}
