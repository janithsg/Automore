/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.automore.service;

import edu.ijse.automore.model.Brand;
import java.util.List;

/**
 *
 * @author Janith
 */
public interface BrandService {
    List<Brand> getAll();
    Brand getBrand(String id);
}
