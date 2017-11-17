/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.automore.controller;

import edu.ijse.automore.model.Model;
import edu.ijse.automore.model.Vehicle;
import edu.ijse.automore.service.ModelService;
import edu.ijse.automore.service.VehicleService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Janith
 */
@Controller
public class SearchController {
    @Autowired
    private ModelService modelService;
    
    @RequestMapping(value = ("/search"), method = RequestMethod.GET)
    public String search(HttpServletRequest req){
        String txt = req.getParameter("nametxt");
        
        List<Model> list = modelService.searchModels(txt);

        req.setAttribute("rst", list);
        
        return "forward:/searchresult";
    }
    
    @RequestMapping(value = ("/searchresult"), method = RequestMethod.GET)
    public String searchresult(HttpServletRequest req){        
        return "searchresult";
    }
}
