/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import abyorsisikaryakan.Gender;
import model.Employee;
import model.Manager;
import model.Staff;

/**
 *
 * @author User
 */
public class Application {
    
    public static Employee registerManager(){
        
        Manager iqbal = new Manager("001", "Muhammad", "Iqbal", "Muhammad Iqbal", 
                Gender.MALE, 23, "Manager Drilling", 500000, 4000000, "Koordinator", "Brebes");
        System.out.println("Data General Manager :");
        System.out.println("ID : "+ iqbal.getId());
        System.out.println("First Name : " + iqbal.getFirstName());
        System.out.println("Last Name : "+ iqbal.getLastName());
        System.out.println("Gender : " + iqbal.getGender());
        System.out.println("Age : " + iqbal.getAge());
        System.out.println("Category manager : " + iqbal.getCategoryManager());
        System.out.println("Transport Allowance : " + iqbal.getTransportAllowance());
        System.out.println("Basic Salary: " + iqbal.getBasicSalary());
        System.out.println("Assignment :" + iqbal.getAssignment());
        System.out.println("Address : " +iqbal.getAddress());
    return iqbal;
    }
    
    public static Employee registerStaff(){
        
        Staff sani = new Staff("002", "Abdul", "Hasani", "Abdul Kadir Hasani", Gender.MALE, 23, 
                "Staff Drilling Riau", 500000, 4000000, "Developer", "Bumiayu", null, 
                1000000, 300000);
        return sani;
    }
    
}
