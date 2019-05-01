/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.animalworld.dto;

/**
 *
 * @author A196928
 */
public class PopulationDTO {

    public PopulationDTO(String name, int days, String manager) {
        this.name = name;
        this.days = days;
        this.manager = manager;
    }
    
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
    int days;
    String manager;
    
}
