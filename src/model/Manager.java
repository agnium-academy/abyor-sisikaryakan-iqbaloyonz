/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import abyorsisikaryakan.Gender;

/**
 *
 * @author User
 */
public class Manager extends Employee{
    
    private String categoryManager;

    public Manager(String id, String firstName, String lastName, String fullName, Gender gender, Integer age, 
            String categoryManager, Integer transportAllowance, Integer basicSalary, 
            String assignment, String address) {
        super(id, firstName, lastName, fullName, gender, age,"Manager "+categoryManager.toUpperCase(), transportAllowance, 
                basicSalary, assignment, address);
        
        this.categoryManager = categoryManager;
    }

    public String getCategoryManager() {
        return categoryManager;
    }

    public void setCategoryManager(String categoryManager) {
        this.categoryManager = categoryManager;
    }
    
    
    
}
