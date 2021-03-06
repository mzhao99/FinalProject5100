/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinic.Treating;

import Business.UserAccount.UserAccount;
import Clinic.Admin.Clinic;
import java.util.ArrayList;

/**
 *
 * @author gyt
 */
public class TreatDorDirectory {
    private ArrayList<TreatmentDoctors> treatDorList;

    public TreatDorDirectory() {
        treatDorList = new ArrayList<>();
    }

    public ArrayList<TreatmentDoctors> getTreatDorList() {
        return treatDorList;
    }
    
    public TreatmentDoctors createTreatDr(String name, int age, String phoneNum,Clinic clinic, UserAccount ua){
        TreatmentDoctors treatmentDoctors = new TreatmentDoctors();
        treatmentDoctors.setAge(age);
        treatmentDoctors.setName(name);
        treatmentDoctors.setPhoneNum(phoneNum);
        treatmentDoctors.setClinic(clinic);
        treatmentDoctors.setUa(ua);
        treatDorList.add(treatmentDoctors);
        return treatmentDoctors;
    }
    
    public void removeTreatDr(TreatmentDoctors t){
        treatDorList.remove(t);
    }
    
    public void updateTreatDr(int id,String name, int age, String phoneNum,Clinic clinic, UserAccount ua){
        for(TreatmentDoctors td:this.treatDorList){
            if(td.getId()==id){
                td.setAge(age);
                td.setName(name);
                td.setPhoneNum(phoneNum);
                td.setClinic(clinic);
                td.setUa(ua);
            }
        }
    }
    
}
