/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package animalworld.com.animalworld.mousePopulationInterfaces;

import com.animalworld.dto.PopulationDTO;

/**
 *
 * @author A196928
 */
public interface IMousePopulationBusiness {
    
    
    
    public void initialize();
    
    public PopulationDTO loadPopulation(PopulationDTO dto);
    
}
