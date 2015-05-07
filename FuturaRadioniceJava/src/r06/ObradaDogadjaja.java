/**
 * 
 */
package r06;

/**
 * @author Krunoslav �ubrini�
 * 7. svi 2015.
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JTextArea;

/**
 * @author Krunoslav �ubrini�
 * 28. tra 2015.
 */
public class ObradaDogadjaja extends JFrame{
	private JLabel l;
	private JButton t;
	private JTextArea textArea;
	public static void main(String[] args) {
		try {
			SwingUtilities.invokeAndWait(new Runnable(){
				public void run() {
					ObradaDogadjaja window = new ObradaDogadjaja();
					window.pack();
					window.setVisible(true);
				}
			});
		} catch (Exception e) {
				e.printStackTrace();
		}
	}

	public ObradaDogadjaja() {
		initialize();
	}

	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l = new JLabel("0");
		// JPanel komponente centrira pa je to najjednostavniji na�in
		// da se ova labela pozicionira centrirano.
		JPanel p = new JPanel();
		p.add(l);
		// Ako nam centriranje nije va�no moglobi izravno: add(l,BorderLayout.NORTH);
		getContentPane().add(p, BorderLayout.NORTH);
		
		t = new JButton("Pove�aj");

		getContentPane().add(t, BorderLayout.SOUTH);
		
		textArea = new JTextArea();
		getContentPane().add(textArea, BorderLayout.CENTER);
		// Neimenovani razred koji implementira su�elje ActionListener
		t.addActionListener(new ActionListener() {
			// U su�elju ActionListener definirana je metoda actionPerformed
			public void actionPerformed(ActionEvent arg0) {
				int v = Integer.valueOf(l.getText())+1;
				l.setText(Integer.toString(v));
			} 
		});
	}
}
