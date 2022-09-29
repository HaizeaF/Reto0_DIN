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
 * This class is the implementation of the model with database connection. This class implements the model interface.
 * @author Julen and Haizea
 */
public class DBModelImplementation implements Model {

    private Connection connetion;
    private PreparedStatement sttmt = null;
    private ResultSet rs = null;
    
    final String selectGreeting = "SELECT GREETING FROM GREETINGS WHERE GREETING_ID = 1;";
    
    ResourceBundle bdConfig = ResourceBundle.getBundle("helloworldproject.model.dbconfig");
    private final String url = bdConfig.getString("URL");
    private final String user = bdConfig.getString("USER");
    private final String password = bdConfig.getString("PASSWORD");
    
    /**
     * This method opens the connection with the database.
     */
    public void openConnection(){
        try {
            connetion = DriverManager.getConnection(url,user,password);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    /**
     * This method closes the statements, the connection and the resultset if they are open.
     */
    public void closeConnection(){
        if(sttmt != null){
            try {
                sttmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(DBModelImplementation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }if(connetion != null){
            try {
                connetion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DBModelImplementation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }if(rs != null){
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DBModelImplementation.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
    }
    
    /**
     * This method gets the greeting via id.
     * @return greeting obtained from the database.
     */
    @Override
    public String getGreeting() {
        String greeting = null;
        
        this.openConnection();
        
        try {
            sttmt = connetion.prepareStatement(selectGreeting);
            
            rs = sttmt.executeQuery();
            rs.next();
            
            greeting = rs.getString("greeting");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }finally{
            this.closeConnection();
        }
        
        return greeting;
    }
    
}
