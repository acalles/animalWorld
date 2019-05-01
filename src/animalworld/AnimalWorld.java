/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package animalworld;

import animalworld.com.animalworld.mousePopulationInterfaces.IMousePopulationBusiness;
import com.animalworld.mousePopulationBusiness.MousePopulationBusiness;
import com.animalworld.mousePopulationUI.MousePopulationUI;

/**
 *
 * @author A196928
 */
public class AnimalWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        IMousePopulationBusiness business = new MousePopulationBusiness();
        
        
        MousePopulationUI ui = new MousePopulationUI();
        ui.init(business);
      
        
    }
    
}
