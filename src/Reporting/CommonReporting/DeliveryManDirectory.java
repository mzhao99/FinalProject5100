/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporting.CommonReporting;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    private ArrayList<DeliveryMan> deliveryManDirectory;
    
    public DeliveryManDirectory(){
        deliveryManDirectory = new ArrayList<>();
    }

    public ArrayList<DeliveryMan> getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(ArrayList<DeliveryMan> deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    public DeliveryMan createDeliveryMan(String name, String phone, String license, String username, String password){
        DeliveryMan deliveryMan = new DeliveryMan();
        deliveryMan.setName(name);
        deliveryMan.setPhone(phone);
        deliveryMan.setCarLicense(license);
        deliveryMan.setUsername(username);
        deliveryMan.setPassword(password);
        deliveryManDirectory.add(deliveryMan);
        return deliveryMan;
    }
    
    public void deleteDeliveryMan(DeliveryMan d){
        deliveryManDirectory.remove(d);
    }
    
    public DeliveryMan getDeliveryMan(String name){
        for(DeliveryMan d: deliveryManDirectory){
            if(d.getName().equals(name)){
                return d;
            }
        }
        return null;
    }
}