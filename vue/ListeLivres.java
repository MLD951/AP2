package vue;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.List;


public class ListeLivres {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListeLivres window = new ListeLivres();
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
	public ListeLivres() {
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
		
		JLabel lblLi = new JLabel("Liste des livres ");
		lblLi.setBounds(149, 25, 161, 15);
		frame.getContentPane().add(lblLi);
		
		List list = new List();
		list.setBounds(130, 72, 139, 72);
		frame.getContentPane().add(list);
		//for(int i=0;i!=ListAdherent.size();i++)
		//{
	}
}
