/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package manager;

/**
 *
 * @author User
 */
public class ManagerDrilling extends CategoryPosition{
    
    private String nama;

    public ManagerDrilling(String id, String name, String position) {
        super(id, name, position);
    }
    
    
    public void getNip(String nama){
        this.nama = nama;
    }
    
    public String setNama(){
        return nama;
    }
}
