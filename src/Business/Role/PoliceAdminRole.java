/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Police.PoliceAdminJPanel;

/**
 *
 * @author harold
 */
public class PoliceAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        return new PoliceAdminJPanel(userProcessContainer, system, account);//To change body of generated methods, choose Tools | Templates.
    }
    
}
