/**
 * 
 */
package r06;

import java.awt.EventQueue;

/**
 * @author Krunoslav �ubrini�
 * 7. svi 2015.
 */
import javax.swing.*;
public class PrviProzor extends JFrame {
  public static void main(String[] args) {
    try {
       //SwingUtilities.invokeAndWait(new Runnable(){
   	   EventQueue.invokeLater(new Runnable() {	   
         public void run() {
           PrviProzor p = new PrviProzor();
           p.setTitle("Prvi prozor");
           p.setSize(400, 200);           
           p.setLocation(100, 100);
           p.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
           p.setVisible(true);
         }
       });
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
} 
