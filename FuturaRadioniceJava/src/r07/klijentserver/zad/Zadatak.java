package r07.klijentserver.zad;

import java.awt.EventQueue;

import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @author Krunoslav Žubriniæ
 * 20. svi 2015.
 */
public class Zadatak {

	private JFrame frmPitija;
	private JTextField txtPitanje;
	private JTextField txtServer;
	private JLabel lblPort;
	private JLabel lblOdgovor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zadatak window = new Zadatak();
					window.frmPitija.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Zadatak() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPitija = new JFrame();
		frmPitija.setTitle("Pitija");
		frmPitija.setBounds(100, 100, 457, 146);
		frmPitija.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPitija.getContentPane().setLayout(new MigLayout("", "[][grow]", "[][][][]"));

		JLabel lblPosluitelj = new JLabel("Poslu\u017Eitelj");
		frmPitija.getContentPane().add(lblPosluitelj, "cell 0 0,alignx trailing");

		txtServer = new JTextField();
		txtServer.setText("localhost");
		frmPitija.getContentPane().add(txtServer, "flowx,cell 1 0,growx");
		txtServer.setColumns(10);

		JLabel lblPitanje = new JLabel("Pitanje");
		frmPitija.getContentPane().add(lblPitanje, "cell 0 1,alignx trailing");

		txtPitanje = new JTextField();
		frmPitija.getContentPane().add(txtPitanje, "cell 1 1,growx");
		txtPitanje.setColumns(10);

		JLabel lblo = new JLabel("Odgovor");
		frmPitija.getContentPane().add(lblo, "cell 0 2");

		lblOdgovor = new JLabel("");
		frmPitija.getContentPane().add(lblOdgovor, "flowx,cell 1 2");

		JButton btnPitaj = new JButton("Pitaj");
		btnPitaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radi();
			}
		});
		frmPitija.getContentPane().add(btnPitaj, "cell 1 3");

		JLabel lblPo = new JLabel("Port");
		frmPitija.getContentPane().add(lblPo, "cell 1 0");

		lblPort = new JLabel("999");
		frmPitija.getContentPane().add(lblPort, "cell 1 0");

	}

	private void radi(){
		Socket echoSocket = null;
		PrintWriter out = null;
		BufferedReader in = null;
		try {
			echoSocket = new Socket(txtServer.getText(), Integer.parseInt(lblPort.getText()));
			out = new PrintWriter(echoSocket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
			out.println(txtPitanje.getText());
			lblOdgovor.setText(in.readLine());
		} catch (UnknownHostException e) {
			System.err.println("Nepoznat poslužitelj " + txtServer.getText());
			System.exit(1);
		} catch (IOException e) {
			System.err.println("Greška spajanja na poslužitelj " + txtServer.getText());
			System.exit(1);
		}
		finally {

			try {
				if (echoSocket != null)
					echoSocket.close();
				if (in != null)
					in.close();
				if (out != null)
					out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
