/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.automore.controller;

import edu.ijse.automore.model.Member;
import edu.ijse.automore.security.SecurityProcessor;
import edu.ijse.automore.service.UserService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = ("/register"), method = RequestMethod.GET)
    public String register() {
        return "register";
    }

    @RequestMapping(value = ("/register"), method = RequestMethod.POST)
    
    public @ResponseBody String save(@RequestParam("profpic") MultipartFile file,HttpServletRequest request) {
        //Member user = new Member();
        //user.setName(request.getParameter("name"));
        //user.setPhone(request.getParameter("phone"));
        //user.setEmail(request.getParameter("email"));
        //String pwd = SecurityProcessor.encryptPwd(request.getParameter("pwd"));
        //user.setPassword(pwd);
        //user.setType("Member");
        //user.setDescription("Normal");

        //return user.getName() + " - " + user.getPhone() + " - " + user.getEmail() + " - " + user.getPassword();
        
        String resp = file.getOriginalFilename();          //userService.register(user);
        
        return resp;
        
//        if(resp.equals("added")){  
//            return "done";
//        }else{
//            return "failed";
//        }
    }
}
