/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.animalworld.mousePopulationBusiness;

import animalworld.com.animalworld.mousePopulationInterfaces.IMousePopulationBusiness;
import animalworld.com.animalworld.mousePopulationInterfaces.IMousePopulationPersistance;
import com.animalworld.dto.PopulationDTO;

/**
 *
 * @author A196928
 */
public class MousePopulationBusiness implements IMousePopulationBusiness{
    IMousePopulationPersistance persistance;

    @Override
    public void initialize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PopulationDTO loadPopulation(PopulationDTO dto) {
        
        PopulationDTO myDto = new PopulationDTO("myPopulation",10, "myManager");
        
        
        return myDto;
        
             
    }
    
}
