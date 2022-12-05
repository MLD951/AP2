package vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Accueil {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accueil window = new Accueil();
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
	public Accueil() {
		initialize();
		frame.setVisible(true);
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JButton btnEmprunterUnLivre = new JButton("Emprunter un livre");
		btnEmprunterUnLivre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				emprunt_livre window = new emprunt_livre();
			}
		});
		btnEmprunterUnLivre.setBounds(26, 125, 164, 25);
		frame.getContentPane().add(btnEmprunterUnLivre);
		
		JButton btnNewButton = new JButton("RESTITUER UN LIVRE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				restitution_livre window = new restitution_livre();
				
			}
		});
		btnNewButton.setBounds(238, 125, 183, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Mon compte");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				info_compte window = new info_compte();
				
			}
		});
		btnNewButton_1.setBounds(137, 55, 164, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Liste des livres ");
		btnNewButton_2.addActionListener(new ActionListener() {
		   
			public void actionPerformed(ActionEvent e) {
				
				ListeLivres window = new ListeLivres();
			}
		});
		btnNewButton_2.setBounds(137, 199, 183, 25);
		frame.getContentPane().add(btnNewButton_2);
	}
}
