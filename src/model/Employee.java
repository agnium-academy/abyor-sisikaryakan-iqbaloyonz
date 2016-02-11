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
public class Employee {
    
    private String id;
    private String firstName;
    private String lastName;
    private String fullName;
    private Gender gender;
    private Integer age;
    private String employment;
    private Integer transportAllowance;
    private Integer basicSalary;
    private String assignment;
    private String address;

    public Employee(String id, String firstName, String lastName, String fullName, Gender gender, Integer age, String employment, Integer transportAllowance, Integer basicSalary, String assignment, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;
        this.employment = employment;
        this.transportAllowance = transportAllowance;
        this.basicSalary = basicSalary;
        this.assignment = assignment;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmployment() {
        return employment;
    }

    public void setEmployment(String employment) {
        this.employment = employment;
    }

    public Integer getTransportAllowance() {
        return transportAllowance;
    }

    public void setTransportAllowance(Integer transportAllowance) {
        this.transportAllowance = transportAllowance;
    }

    public Integer getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Integer basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
    
    
}
