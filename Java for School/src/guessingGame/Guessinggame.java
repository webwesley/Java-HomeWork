package guessingGame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Guessinggame {

	private JFrame frame;
	private JTextField textFieldGuess;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Guessinggame window = new Guessinggame();
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
	public Guessinggame() {
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		final Guessing guessing = new Guessing();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldGuess = new JTextField();
		textFieldGuess.setBounds(272, 73, 86, 20);
		frame.getContentPane().add(textFieldGuess);
		textFieldGuess.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Please input a number between 1 and 10:\r\n\r\n");
		lblNewLabel.setBounds(10, 65, 252, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnGuess = new JButton("Guess");
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				guessing.setGuess(Integer.parseInt(textFieldGuess.getText()));
				try{
					if(guessing.getGuess()> 10 || guessing.getGuess() < 1){
						throw new Exception();
					}
					if(guessing.play()){
						JOptionPane.showMessageDialog(null, "Your number was correct. Good job");
						System.exit(0);
					} else if(guessing.getGuess() > guessing.getValue()){
						JOptionPane.showMessageDialog(null, "Sorry, you failed. Your number was to large");						
					} else {
						JOptionPane.showMessageDialog(null, "Sorry, you failed. Your number was to small");
					}
					
				} catch(Exception e){
					JOptionPane.showMessageDialog(null, "Sorry, that is not a valid number:");
				}
			}
		});
		btnGuess.setBounds(126, 112, 89, 23);
		frame.getContentPane().add(btnGuess);
	}
}
