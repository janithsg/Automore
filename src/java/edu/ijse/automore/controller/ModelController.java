/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.automore.controller;

import edu.ijse.automore.model.Model;
import edu.ijse.automore.model.Vehicle;
import edu.ijse.automore.service.FileStorageService;
import edu.ijse.automore.service.ModelService;
import edu.ijse.automore.service.VehicleService;
import java.util.Iterator;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

/**
 *
 * @author Janith
 */
@Controller
public class ModelController {

    @Autowired
    private VehicleService vehicleService;
    
    @Autowired
    private ModelService modelService;
    

    @RequestMapping(value = ("/addmodel"), method = RequestMethod.GET)
    public String addModel() {
        return "addmodel";
    }

    @RequestMapping(value = ("/savemodel"), method = RequestMethod.POST)
    @ResponseBody
    public String saveModel(HttpServletRequest req) {

        // Take Parameters
        String vehicleid = req.getParameter("vehicle");
        String modelName = req.getParameter("modelName");
        String year = req.getParameter("year");
        String introDate = req.getParameter("introDate");
        String status = req.getParameter("status");
        String bodyType = req.getParameter("bodyType");
        String noDoors = req.getParameter("noDoors");
        String noSeats = req.getParameter("noSeats");
        String noPassengers = req.getParameter("noPassengers");
        String carType = req.getParameter("carType");
        String colors = req.getParameter("colors");
        String driveType = req.getParameter("driveType");
        String engineType = req.getParameter("engineType");
        String engineDescription = req.getParameter("engineDescription");
        String avgConsumption = req.getParameter("avgConsumption");
        String coEmmission = req.getParameter("coEmmission");
        String transtype = req.getParameter("transtype");
        String noGears = req.getParameter("noGears");
        String frontSus = req.getParameter("frontSus");
        String rearSus = req.getParameter("rearSus");
        String frontBrake = req.getParameter("frontBrake");
        String rearBrake = req.getParameter("rearBrake");
        String noAirbags = req.getParameter("noAirbags");
        String ncap = req.getParameter("ncap");
        String acceleration = req.getParameter("acceleration");
        String topSpeed = req.getParameter("topSpeed");
        String horsePower = req.getParameter("horsePower");
        String cargoTrunkCapacity = req.getParameter("cargoTrunkCapacity");
        String length = req.getParameter("length");
        String width = req.getParameter("width");
        String height = req.getParameter("height");
        String wheelbase = req.getParameter("wheelbase");
        String groundClearance = req.getParameter("groundClearance");
        String features = req.getParameter("features");
        String price = req.getParameter("price");
        String imgPath = req.getParameter("imgPath");

        // Create Model
        Model model = new Model();
        model.setModelName(modelName);
        model.setYear(year);
        model.setIntroDate(introDate);
        model.setStatus(status);
        model.setBodyType(bodyType);
        model.setNoDoors(Integer.parseInt(noDoors));
        model.setNoSeats(Integer.parseInt(noSeats));
        model.setNoPassengers(Integer.parseInt(noPassengers));
        model.setCarType(carType);
        model.setColors(colors);
        model.setDriveType(driveType);
        model.setEngineType(engineType);
        model.setEngineDescription(engineDescription);
        model.setAvgConsumption(avgConsumption);
        model.setCoEmmission(coEmmission);
        model.setTranstype(transtype);
        model.setNoGears(Integer.parseInt(noGears));
        model.setFrontSus(frontSus);
        model.setRearSus(rearSus);
        model.setFrontBrake(frontBrake);
        model.setRearBrake(rearBrake);
        model.setNoAirbags(Integer.parseInt(noAirbags));
        model.setNcap(ncap);
        model.setAcceleration(acceleration);
        model.setTopSpeed(topSpeed);
        model.setHorsePower(horsePower);
        model.setCargoTrunkCapacity(cargoTrunkCapacity);
        model.setLength(length);
        model.setWidth(width);
        model.setHeight(height);
        model.setWheelbase(wheelbase);
        model.setGroundClearance(groundClearance);
        model.setFeatures(features);
        model.setPrice(price);
        model.setImgPath(imgPath);
        
        modelService.saveModel(model);
        
        Vehicle v = vehicleService.getVehicle(vehicleid);
        v.getModels().add(model);
        
        vehicleService.updateVehicle(v);
        
        return "done";
    }
}
