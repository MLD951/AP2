package vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class restitution_livre {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					restitution_livre window = new restitution_livre();
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
	public restitution_livre() {
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
		
		JButton btnRestituerLeLivre = new JButton("Restituer le livre");
		btnRestituerLeLivre.setBounds(98, 182, 238, 25);
		frame.getContentPane().add(btnRestituerLeLivre);
		
		JLabel lblSlectionnerLeLivre = new JLabel("Sélectionner le livre à restituer ");
		lblSlectionnerLeLivre.setBounds(111, 28, 238, 15);
		frame.getContentPane().add(lblSlectionnerLeLivre);
	}
}
