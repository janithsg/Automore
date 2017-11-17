/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.automore.controller;

import edu.ijse.automore.model.Brand;
import edu.ijse.automore.service.BrandService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Janith
 */
@Controller
public class BrandController {
    
    @Autowired
    private BrandService brandService;
    
    @RequestMapping(value = ("/getAllBrands"), method = RequestMethod.POST)
    @ResponseBody
    public String getAll() {
        String names = "";
        ArrayList<Brand> brands = (ArrayList<Brand>)brandService.getAll();
        for(Brand brn:brands){
            names = names + ":" + brn.getBrandName();
        }
        names = names.substring(1);
        return names;
    }
}
