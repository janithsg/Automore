/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.automore.controller;

import edu.ijse.automore.model.Brand;
import edu.ijse.automore.model.Model;
import edu.ijse.automore.model.Vehicle;
import edu.ijse.automore.service.BrandService;
import edu.ijse.automore.service.VehicleService;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 *
 * @author Janith
 */
@Controller
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private BrandService brandService;

    @RequestMapping(value = ("/addcar"), method = RequestMethod.GET)
    public String addVehicle() {
        return "addvehicle";
    }

    @RequestMapping(value = ("/savecar"), method = RequestMethod.POST)
    @ResponseBody
    public String saveVehicle(HttpServletRequest req) {
        String brnd = req.getParameter("brand");
        String carName = req.getParameter("vname");
        String successor = req.getParameter("successor");

        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleName(carName);
        vehicle.setSuccessor(successor);
        Brand brand = brandService.getBrand(brnd);
        vehicle.setBrand(brand);

        return vehicleService.addCar(vehicle);
    }

    @RequestMapping(value = ("/getAllVehicle"), method = RequestMethod.POST)
    @ResponseBody
    public String getAllVehicle() {
        String vehicleNames = "";

        List<Vehicle> vehicles = vehicleService.getAllVehicles();

        for (Vehicle v : vehicles) {
            vehicleNames = vehicleNames + ":" + v.getVehicleName();
        }
        vehicleNames = vehicleNames.substring(1);

        return vehicleNames;
    }

    @RequestMapping(value = ("/viewcar"), method = RequestMethod.GET)
    public String showSearch() {
        return "viewcar";
    }

    @RequestMapping(value = ("/v{vid}"), method = RequestMethod.GET)
    public String showCar(@PathVariable String vid,HttpServletRequest req, HttpServletResponse resp) {
        List<Vehicle> vehicles = vehicleService.getAllVehicles();
        if("".equals(vid)){
            req.setAttribute("status", "not");
            return "forward:/viewcar";
        }
        
        Integer id = Integer.parseInt(vid);
        for(Vehicle v:vehicles){
            ArrayList<Model> models = new ArrayList<>(v.getModels());
            
            for(Model m:models){
                if(id == m.getModelId()){
                    req.setAttribute("status", "got");
                    req.setAttribute("vehicle", v);
                    return "forward:/viewcar";
                }
            }
        }
        req.setAttribute("status", "not");
        
        return "forward:/viewcar";
    }

    @RequestMapping(value = ("/viewc"), method = RequestMethod.POST)
    @ResponseBody
    public String viewCar() {
        return "";
    }

}
