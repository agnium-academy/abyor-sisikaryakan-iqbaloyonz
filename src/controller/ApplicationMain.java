/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import abyorsisikaryakan.Gender;
import model.Employee;
import model.Manager;

/**
 *
 * @author User
 */
public class ApplicationMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Manager manager = new Manager("001", "Muhammad", "Iqbal", "Muhammad Iqbal", Gender.MALE, 23, 
//                "General Manager", 500000, 4000000, "Koordinator", "Brebes");
//        System.out.println("Data General Manager :");
//        System.out.println("ID : "+ manager.getId());
//        System.out.println("First Name : " + manager.getFirstName());
//        System.out.println("Last Name : "+ manager.getLastName());
//        System.out.println("Gender : " + manager.getGender());
//        System.out.println("Age : " + manager.getAge());
//        System.out.println("Category manager : " + manager.getCategoryManager());
//        System.out.println("Transport Allowance : " + manager.getTransportAllowance());
//        System.out.println("Basic Salary: " + manager.getBasicSalary());
//        System.out.println("Assignment :" + manager.getAssignment());
//        System.out.println("Address : " +manager.getAddress());
        
        Application.registerManager();
      
    }
    
}
