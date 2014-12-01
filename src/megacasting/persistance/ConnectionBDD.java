/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package megacasting.persistance;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Mousse
 */
public class ConnectionBDD {
    
    private static ConnectionBDD instance = null;
    private Connection cnx = null;
    
    // Constructeur en privé : on ne pourra pas créer d'instance dans le projet
    private ConnectionBDD() {
         
        try {
            // Chargement du driver MySQL
            Class.forName("com.mysql.jdbc.Driver");
            
            // System.out.println("Chargement du driver réussi");
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
    }
    
    public static ConnectionBDD getInstance() {
        if(instance == null) {
            instance = new ConnectionBDD();
        }
        return instance;
    }
    
    public Connection getConnection() {
        if (cnx == null) {
            String url = "jdbc:mysql://localhost/MegaCasting_Java";
            try {
                cnx = DriverManager.getConnection(url, "root", "");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return cnx;
    }
    
    public void close() {
        if (cnx != null) {
            try {
                cnx.close();
            } catch (Exception e) {
            }
        }
        cnx = null;
    }
}
