/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.automore.service.impl;

import edu.ijse.automore.dao.VehicleDao;
import edu.ijse.automore.model.Model;
import edu.ijse.automore.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import edu.ijse.automore.service.VehicleService;
import java.util.List;

/**
 *
 * @author Janith
 */
@Service
@Transactional
public class VehicleServiceImpl implements VehicleService{

    @Autowired
    private VehicleDao vehicleDao;
    
    @Override
    public String addCar(Vehicle vehicle) {
        vehicleDao.addVehicle(vehicle);
        return "done";
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleDao.getAllVehicles();
    }

    @Override
    public Vehicle getVehicle(String id) {
        return vehicleDao.getVehicle(id);
    }

    @Override
    public String updateVehicle(Vehicle vehicle) {
        return vehicleDao.updateVehicle(vehicle);
    }
    @Override
    public List<Vehicle> searchModels(String kwd) {
        return vehicleDao.searchModels(kwd);
    }
}
