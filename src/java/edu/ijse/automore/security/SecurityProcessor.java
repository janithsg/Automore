/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.automore.security;

import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Janith
 */
public class SecurityProcessor {
    public static String encryptPwd(String pwd){
        String kwd = "";
        try {
            byte[] bar = pwd.getBytes();
            
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hashk = md.digest(bar);
            
            kwd = new String(HexBin.encode(hashk)); 
        } catch (NoSuchAlgorithmException ex) {
            
        }
        return kwd;
    }
}
