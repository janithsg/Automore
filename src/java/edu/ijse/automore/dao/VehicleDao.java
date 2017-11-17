/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.automore.dao;

import edu.ijse.automore.model.Model;
import edu.ijse.automore.model.Vehicle;
import java.util.List;

/**
 *
 * @author Janith
 */
public interface VehicleDao {
    String addVehicle(Vehicle vehicle);
    List<Vehicle> getAllVehicles();
    Vehicle getVehicle(String id);
    String updateVehicle(Vehicle vehicle);
    List<Vehicle> searchModels(String kwd);
}
