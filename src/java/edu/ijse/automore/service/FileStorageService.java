/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.automore.service;

import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Janith
 */
public interface FileStorageService {
    String savefile(MultipartFile file);
}
