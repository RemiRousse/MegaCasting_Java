/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package megacasting;

/**
 *
 * @author Mousse
 */
public class MegaCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
	java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrameMegaCasting().setVisible(true);
            }
        });	
		
		//petit commentaire pour tester git -> julien 14/11/14 16:01
    }
    
}
