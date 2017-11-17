/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.automore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Janith
 */
@Controller
public class ErrorController {
    @RequestMapping(value = "/error",method = RequestMethod.GET)
    public String errorPage(){
        return "error";
    }
}
