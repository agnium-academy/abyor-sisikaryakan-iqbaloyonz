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
public class Staff extends Employee{
    private Employee supervisor;
    private String categoryStaff;
    private Integer lodgmentAllowance;
    private Integer internetAllowance;

    public Staff(String id, String firstName, String lastName, String fullName, 
            Gender gender, Integer age, String categoryStaff, Integer transportAllowance, 
            Integer basicSalary, String assignment, String address, Employee supervisor, Integer lodgmentAllowance,
            Integer internetAllowance) {
        super(id, firstName, lastName, fullName, gender, age, categoryStaff, 
                transportAllowance, basicSalary, assignment, address);
        
        this.supervisor= supervisor;
        this.categoryStaff=categoryStaff;
        this.lodgmentAllowance=lodgmentAllowance;
        this.internetAllowance=internetAllowance;
    }

    public Employee getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    public String getCategoryStaff() {
        return categoryStaff;
    }

    public void setCategoryStaff(String categoryStaff) {
        this.categoryStaff = categoryStaff;
    }

    public Integer getLodgmentAllowance() {
        return lodgmentAllowance;
    }

    public void setLodgmentAllowance(Integer lodgmentAllowance) {
        this.lodgmentAllowance = lodgmentAllowance;
    }

    public Integer getInternetAllowance() {
        return internetAllowance;
    }

    public void setInternetAllowance(Integer internetAllowance) {
        this.internetAllowance = internetAllowance;
    }
    
    
    
    
}
