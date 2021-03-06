/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinic.DNAtesting;

import Business.UserAccount.UserAccount;
import Clinic.Admin.Clinic;
import java.util.ArrayList;

/**
 *
 * @author gyt
 */
public class DnaTestingDirectory {
    private ArrayList<DnaTester> dnaTesterList;

    public DnaTestingDirectory() {
        dnaTesterList = new ArrayList<>();
    }

    public ArrayList<DnaTester> getDnaTesterList() {
        return dnaTesterList;
    }

    public DnaTester createDnaTester(String name, int age,String phoneNum,Clinic clinic,UserAccount ua){
        DnaTester dnaTester = new DnaTester();
        dnaTester.setAge(age);
        dnaTester.setName(name);
        dnaTester.setPhoneNum(phoneNum);
        dnaTester.setClinic(clinic);
        dnaTester.setUa(ua);
        dnaTesterList.add(dnaTester);      
        return dnaTester;
    }
    
    public void removeDnaTester(DnaTester dnaTester){
        dnaTesterList.remove(dnaTester);
    }
    
    public void updateTester(int id,String name, int age,String phoneNum,Clinic clinic,UserAccount ua){
        for(DnaTester dnaTester:this.getDnaTesterList()){
            if(dnaTester.getId()==id){
                dnaTester.setAge(age);
                dnaTester.setName(name);
                dnaTester.setPhoneNum(phoneNum);
                dnaTester.setClinic(clinic);
                dnaTester.setUa(ua);
            }
        }
    }
}
