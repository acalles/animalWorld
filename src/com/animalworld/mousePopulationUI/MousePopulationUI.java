/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.animalworld.mousePopulationUI;

import animalworld.com.animalworld.mousePopulationInterfaces.IMousePopulationBusiness;

/**
 *
 * @author A196928
 */
public class MousePopulationUI {
    
    private AnimalWorldFrame animalWorldFrame;
    private IMousePopulationBusiness business;

    public AnimalWorldFrame getAnimalWorldFrame() {
        return animalWorldFrame;
    }

    public void setAnimalWorldFrame(AnimalWorldFrame animalWorldFrame) {
        this.animalWorldFrame = animalWorldFrame;
    }
    
    
    public MousePopulationUI(){
        animalWorldFrame = new AnimalWorldFrame();
        animalWorldFrame.show();
    }
    
    public void init(IMousePopulationBusiness nBusiness) {
        this.business = nBusiness;
        this.animalWorldFrame.setBusiness(nBusiness);
    }
    
}
