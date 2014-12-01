package megacasting.persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Creation - Ouverture et Fermeture d'une conneciton
 * @author julien
 *
 */
public class ConnectionBDD {
	
	//Cette class est une singleton, cad que l'instance et unique dans tout le projet
	
	private static ConnectionBDD instance = null;
	private Connection cnx = null;
	
	
	
	/**
	 * private pour empecher un new dans le code
	 */
	private ConnectionBDD(){
		
		try {
//            Chargement du driver MySQL
            Class.forName("com.mysql.jdbc.Driver");

//            Chargement du driver MSSQL Server
//            Class.forName("net.sourceforge.jtds.jdbc.Driver");

            System.out.println("Chargement du driver réussi !");

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

	}
	
	/**
	 * permet d'acceder a l instance de cette class dans le projet
	 * @return
	 */
	public static ConnectionBDD getInstance(){
		if(instance == null){
			instance = new ConnectionBDD();
		}
		return instance;
	}
	
	/**
	 * permet la connection
	 * @return
	 */
	public Connection getConnection() {
		
		if (cnx == null) {
//	        Connexion à MySQL
	        String url = "jdbc:mysql://localhost/MegaCasting_java";
//	        Connexion à MS SQL Server
//	        String url = "jdbc:jtds:sqlserver://localhost:1433/BDD_JAVA";

	        try {
	            cnx = DriverManager.getConnection(url, "root", "");
	            
	            System.out.println("Connexion réussie !");
	            
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        }
		}

		return cnx;
		
	}
	
	/**
	 * Methode de fermrture de la connection
	 */
	public void closeConnection(){
		if (cnx != null) {
			try {
				cnx.close();
			} catch (Exception e) {
				
			}
		}
		
		//on remet a null pour pouvoir l'ouvrir a nouveau
		cnx = null;
	}
}
