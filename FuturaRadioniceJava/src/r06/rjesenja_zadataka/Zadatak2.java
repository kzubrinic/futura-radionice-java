/**
 * 
 */
package r06.rjesenja_zadataka;

import java.awt.EventQueue;

import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author Krunoslav Žubriniæ
 * 7. svi 2015.
 */
public class Zadatak2 {

	private JFrame f;
	private JTextField b1;
	private JTextField b2;
	private JTextField rez;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zadatak2 window = new Zadatak2();
					window.f.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Zadatak2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		f = new JFrame();
		f.setTitle("Osnovne ra\u010Dunske operacije");
		f.setBounds(100, 100, 355, 151);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(new MigLayout("", "[][grow]", "[][][][]"));
		
		JLabel lblPrviBroj = new JLabel("Prvi broj");
		f.getContentPane().add(lblPrviBroj, "cell 0 0,alignx trailing");
		
		b1 = new JTextField();
		f.getContentPane().add(b1, "flowx,cell 1 0,growx");
		b1.setColumns(10);
		
		JLabel lblDrugiBroj = new JLabel("Drugi broj");
		f.getContentPane().add(lblDrugiBroj, "cell 0 1,alignx trailing");
		
		b2 = new JTextField();
		f.getContentPane().add(b2, "flowx,cell 1 1,growx");
		b2.setColumns(10);
		
		JButton buttonPlus = new JButton("+");
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!popunjenaOba())
					return;
				float br1 = Float.parseFloat(b1.getText());
				float br2 = Float.parseFloat(b2.getText());
				rez.setText(String.valueOf(br1+br2));
			}
		});
		f.getContentPane().add(buttonPlus, "flowx,cell 1 2");
		
		JButton buttonMinus = new JButton("-");
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!popunjenaOba())
					return;
				float br1 = Float.parseFloat(b1.getText());
				float br2 = Float.parseFloat(b2.getText());
				rez.setText(String.valueOf(br1-br2));
			}
		});
		f.getContentPane().add(buttonMinus, "cell 1 2");
		
		JButton buttonPuta = new JButton("*");
		buttonPuta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!popunjenaOba())
					return;
				float br1 = Float.parseFloat(b1.getText());
				float br2 = Float.parseFloat(b2.getText());
				rez.setText(String.valueOf(br1*br2));
			}
		});
		f.getContentPane().add(buttonPuta, "cell 1 2");
		
		JButton buttonDij = new JButton("/");
		buttonDij.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!popunjenaOba())
					return;
				float br1 = Float.parseFloat(b1.getText());
				float br2 = Float.parseFloat(b2.getText());
				rez.setText(String.valueOf(br1/br2));
			}
		});
		f.getContentPane().add(buttonDij, "cell 1 2");
		
		JLabel lblRezultat = new JLabel("Rezultat");
		f.getContentPane().add(lblRezultat, "cell 0 3,alignx trailing");
		
		rez = new JTextField();
		rez.setEditable(false);
		f.getContentPane().add(rez, "flowx,cell 1 3,growx");
		rez.setColumns(10);
	}
	
	private boolean popunjenaOba(){
		if ((b1.getText()==null) || (b2.getText()==null) || (b1.getText().length()==0) || (b2.getText().length()==0)){
			JOptionPane.showMessageDialog(null, "Morate popuniti oba broja!");
			return false;
		}
				
		return true;
	}

}
