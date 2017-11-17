/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.automore.io;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Janith
 */
public class ImageStorageHandler {

    public static String saveImage(MultipartFile file) {
        String fileinfo = "";
        try {
            // Select Directory
            Date date = new Date();
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            
            // Generate file name
            Random rand = new Random();
            int num = rand.nextInt(1000000) + 100000;
            String fname = year + "" + month + day + num + file.getOriginalFilename();
            
            // Save the file
            String path = System.getProperty("user.dir") + "\\web\\resources\\img\\images" + "\\" + year + "\\" + month + "\\" + day + "\\" + fname;
            File dest = new File(path);
            
            file.transferTo(dest);
            
            fileinfo = "resources\\img\\images" + "\\" + year + "\\" + month + "\\" + day + "\\" + fname; 
        } catch (IOException ex) {
            Logger.getLogger(ImageStorageHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalStateException ex) {
            Logger.getLogger(ImageStorageHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fileinfo;
    }
}
