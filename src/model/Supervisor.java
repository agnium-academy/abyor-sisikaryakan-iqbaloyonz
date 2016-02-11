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
public class Supervisor extends Employee{
    
    private Employee manager;
    private String categorySupervisor;
    private Integer holidayAllowance;
    private Integer healthBenefit;
    private String studyComperatif;

    public Supervisor(String id, String firstName, String lastName, String fullName, 
            Gender gender, Integer age, String categorySupervisor, Integer transportAllowance, 
            Integer basicSalary, String assignment, String address, Employee manager, Integer holidayAllowance,
            Integer healthBenefit, String studyComperatif) {
        super(id, firstName, lastName, fullName, gender, age, categorySupervisor, transportAllowance, 
                basicSalary, assignment, address);
        
        this.categorySupervisor=categorySupervisor;
        this.manager=manager;
        this.holidayAllowance=holidayAllowance;
        this.healthBenefit=healthBenefit;
        this.studyComperatif=studyComperatif;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public String getCategorySupervisor() {
        return categorySupervisor;
    }

    public void setCategorySupervisor(String categorySupervisor) {
        this.categorySupervisor = categorySupervisor;
    }

    public Integer getHolidayAllowance() {
        return holidayAllowance;
    }

    public void setHolidayAllowance(Integer holidayAllowance) {
        this.holidayAllowance = holidayAllowance;
    }

    public Integer getHealthBenefit() {
        return healthBenefit;
    }

    public void setHealthBenefit(Integer healthBenefit) {
        this.healthBenefit = healthBenefit;
    }

    public String getStudyComperatif() {
        return studyComperatif;
    }

    public void setStudyComperatif(String studyComperatif) {
        this.studyComperatif = studyComperatif;
    }
    
    
}
