/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldproject.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Julen
 */
public class DBModelImp implements InterfaceModel {
    
    private ResourceBundle bdConfig;
    private String url;
    private String user;
    private String password;
    private Connection connetion;
    private PreparedStatement sttmt = null;
    private ResultSet rs = null;
    
    final String selectGreeting = "SELECT GREETING FROM GREETINGS WHERE GREETING_ID = 1;";
    
    
    public void connectionBD(){
        
        bdConfig = ResourceBundle.getBundle("helloworldproject.model.dbconfig");
        url = bdConfig.getString("URL");
        user = bdConfig.getString("USER");
        password = bdConfig.getString("PASSWORD");
        
    }
    
    public void openConnection(){
        
        connectionBD();
        
        try {
            connetion = DriverManager.getConnection(url,user,password);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
    }
    
    public void closeConnection(){
        
        if(sttmt != null){
            try {
                sttmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(DBModelImp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }if(connetion != null){
            try {
                connetion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DBModelImp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }if(rs != null){
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DBModelImp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
    }
    

    @Override
    public String getGreeting() {
        
        String greeting = null;
        
        this.openConnection();
        
        try {
            
            sttmt = connetion.prepareStatement(selectGreeting);
            
            rs = sttmt.executeQuery();
            
            greeting = rs.getString("greeting");
       
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }finally{
            this.closeConnection();
        }
        
        return greeting;
        
    }
    
}
