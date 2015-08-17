/**
 * 
 */
package r06.rjesenja_zadataka;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 * @author Krunoslav Žubriniæ
 * 7. svi 2015.
 */
public class Zadatak1 {

	private JFrame f;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zadatak1 window = new Zadatak1();
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
	public Zadatak1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		f = new JFrame();
		f.setResizable(false);
		f.setTitle("Kalkulator");
		f.setBounds(100, 100, 150, 166);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(new MigLayout("", "[][][]", "[][][][][]"));
		
		textField = new JTextField();
		f.getContentPane().add(textField, "cell 0 0 3 1");
		textField.setColumns(20);
		
		JButton button = new JButton("1");
		f.getContentPane().add(button, "cell 0 1");
		
		JButton button_1 = new JButton("2");
		f.getContentPane().add(button_1, "cell 1 1");
		
		JButton button_2 = new JButton("3");
		f.getContentPane().add(button_2, "cell 2 1");
		
		JButton button_3 = new JButton("4");
		f.getContentPane().add(button_3, "cell 0 2");
		
		JButton button_4 = new JButton("5");
		f.getContentPane().add(button_4, "cell 1 2");
		
		JButton button_5 = new JButton("6");
		f.getContentPane().add(button_5, "cell 2 2");
		
		JButton button_6 = new JButton("7");
		f.getContentPane().add(button_6, "cell 0 3");
		
		JButton button_7 = new JButton("8");
		f.getContentPane().add(button_7, "cell 1 3");
		
		JButton button_8 = new JButton("9");
		f.getContentPane().add(button_8, "cell 2 3");
		
		JButton button_9 = new JButton("0");
		f.getContentPane().add(button_9, "cell 0 4");
		
		JButton button_10 = new JButton("+");
		f.getContentPane().add(button_10, "cell 1 4");
		
		JButton button_11 = new JButton("=");
		f.getContentPane().add(button_11, "cell 2 4");
	}

}
