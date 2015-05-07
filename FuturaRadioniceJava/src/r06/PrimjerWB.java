/**
 * 
 */
package r06;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

/**
 * @author Krunoslav Žubriniæ
 * 7. svi 2015.
 */
public class PrimjerWB {

	private JFrame f;
	private JTextField eMail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimjerWB window = new PrimjerWB();
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
	public PrimjerWB() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		f = new JFrame();
		f.setTitle("Pretplata na poruke");
		f.setBounds(100, 100, 382, 156);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(new MigLayout("", "[][grow]", "[][][][]"));
		
		JLabel lEmail = new JLabel("E-mail");
		f.getContentPane().add(lEmail, "cell 0 0,alignx trailing");
		
		eMail = new JTextField();
		f.getContentPane().add(eMail, "cell 1 0,growx");
		eMail.setColumns(20);
		
		JCheckBox zelimPrimati = new JCheckBox("\u017Delim primati poruke");
		f.getContentPane().add(zelimPrimati, "cell 1 1");
		
		JLabel lOblikPoruke = new JLabel("Oblik poruke");
		f.getContentPane().add(lOblikPoruke, "cell 0 2,alignx trailing");
		
		JComboBox oblikPoruke = new JComboBox();
		oblikPoruke.setModel(new DefaultComboBoxModel(new String[] {"Odmah", "Dnevno", "Tjedno", "Mjese\u010Dno"}));
		f.getContentPane().add(oblikPoruke, "cell 1 2,growx");
		
		JButton btnURedu = new JButton("U redu");
		f.getContentPane().add(btnURedu, "flowx,cell 1 3");
		
		JButton btnOcisti = new JButton("O\u010Disti");
		f.getContentPane().add(btnOcisti, "cell 1 3");
	}
}
