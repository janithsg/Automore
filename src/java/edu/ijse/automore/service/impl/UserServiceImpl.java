/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.automore.service.impl;

import edu.ijse.automore.dao.UserDao;
import edu.ijse.automore.model.Member;
import edu.ijse.automore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userdao;
    
    @Override
    public String register(Member user) {
        userdao.register(user);
        return "added";
    }
    
}
