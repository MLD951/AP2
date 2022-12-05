package vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;

public class emprunt_livre {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					emprunt_livre window = new emprunt_livre();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public emprunt_livre() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblChoisirLeLivre = new JLabel("Choisir le livre à emprunter");
		lblChoisirLeLivre.setBounds(121, 12, 221, 15);
		frame.getContentPane().add(lblChoisirLeLivre);
		
		JList list = new JList();
		list.setBounds(121, 58, 213, 107);
		frame.getContentPane().add(list);
		
		JButton btnValiderLemprunt = new JButton("Valider l'emprunt");
		btnValiderLemprunt.setBounds(160, 216, 117, 25);
		frame.getContentPane().add(btnValiderLemprunt);
	}

}
