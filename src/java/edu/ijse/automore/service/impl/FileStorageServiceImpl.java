/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.automore.service.impl;

import edu.ijse.automore.io.ImageStorageHandler;
import edu.ijse.automore.service.FileStorageService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Janith
 */
@Service
@Transactional
public class FileStorageServiceImpl implements FileStorageService{
    @Override
    public String savefile(MultipartFile file) {
        return ImageStorageHandler.saveImage(file);
    }
    
}
