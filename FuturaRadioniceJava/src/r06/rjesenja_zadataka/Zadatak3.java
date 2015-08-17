/**
 * 
 */
package r06.rjesenja_zadataka;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.Color;

/**
 * @author Krunoslav Žubriniæ
 * 7. svi 2015.
 */
public class Zadatak3 {

	private JFrame frmRadSDatotekom;
	private File datoteka;
	private JLabel nazivDat;
	private JTextArea tekst;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zadatak3 window = new Zadatak3();
					window.frmRadSDatotekom.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Zadatak3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRadSDatotekom = new JFrame();
		frmRadSDatotekom.setTitle("Rad s datotekom");
		frmRadSDatotekom.setBounds(100, 100, 450, 300);
		frmRadSDatotekom.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmRadSDatotekom.getContentPane().add(panel, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("U\u010Ditaj");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ucitajDatoteku();
			}
		});
		panel.add(btnNewButton);
		
		JButton btnSpremi = new JButton("Spremi");
		panel.add(btnSpremi);
		
		JScrollPane scrollPane = new JScrollPane();
		frmRadSDatotekom.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		tekst = new JTextArea(20,30);
		tekst.append("Bla bla");
		tekst.setVisible(true);
		scrollPane.add(tekst);
		
		JPanel panel_1 = new JPanel();
		frmRadSDatotekom.getContentPane().add(panel_1, BorderLayout.NORTH);

		
		JButton btnNewButton_1 = new JButton("Izaberite datoteku");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
			    //FileNameExtensionFilter filter = new FileNameExtensionFilter("txt");
			    //chooser.setFileFilter(filter);
			    int returnVal = chooser.showOpenDialog(frmRadSDatotekom);
			    if(returnVal == JFileChooser.APPROVE_OPTION) {
			    	datoteka = chooser.getSelectedFile();
			    	nazivDat.setText(datoteka.getAbsolutePath());
			    }
			}
		});
		panel_1.add(btnNewButton_1);
		
		nazivDat = new JLabel("");
		panel_1.add(nazivDat);

	}
	
	public void ucitajDatoteku() {
        BufferedReader dat = null;
        String c = "";
        String ime = "README.TXT";
        StringBuffer b = new StringBuffer();
        try {
            dat = new BufferedReader(new FileReader(nazivDat.getText()));
            while ((c = dat.readLine()) != null) {
                // readLine() skida znak za novi red pa je potrebno dodati za prikaz na ekranu
                b.append(c);
            }
            tekst.append(b.toString());
            System.out.println(b.toString());
        } catch (FileNotFoundException e) {
            System.out.println("Datoteka "+ ime + " ne postoji!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Greška èitanja datoteke " + ime + " !");
            e.printStackTrace();
        }
        finally {
            try{
                if (dat != null)
                    dat.close();
            }
            catch (IOException e) {
                System.out.println("Greška pri zatvaranju datoteke " + ime + " !");
                e.printStackTrace();
            }
        }
    }

}
