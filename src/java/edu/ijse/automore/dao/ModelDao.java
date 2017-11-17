/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.automore.dao;

import edu.ijse.automore.model.Model;
import java.util.List;

/**
 *
 * @author Janith
 */
public interface ModelDao {
    String saveModel(Model model);
    List<Model> searchModels(String kwd);
}
