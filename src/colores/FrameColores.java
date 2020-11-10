package colores;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class FrameColores {

	private JFrame frmObservableColors;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameColores window = new FrameColores();
					window.frmObservableColors.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrameColores() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmObservableColors = new JFrame();
		//frmObservableColors.getContentPane().setBackground(Color.YELLOW);
		//frmObservableColors.getContentPane().setBackground(Color.BLUE);
		//frmObservableColors.getContentPane().setBackground(Color.RED);
		frmObservableColors.setTitle("Observable Colors");
		frmObservableColors.setBounds(100, 100, 450, 300);
		frmObservableColors.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmObservableColors.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Color Amarillo");
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				changeColor(Color.YELLOW);
			}
		});
		btnNewButton.setBounds(24, 150, 124, 23);
		frmObservableColors.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Color Azul");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.BLUE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				changeColor(Color.BLUE);
			}
		});
		btnNewButton_1.setBounds(175, 150, 106, 23);
		frmObservableColors.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Color Rojo");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.RED);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				changeColor(Color.RED);
			}
		});
		btnNewButton_2.setBounds(307, 150, 106, 23);
		frmObservableColors.getContentPane().add(btnNewButton_2);
	}
	
	void changeColor(Color c) {
		frmObservableColors.getContentPane().setBackground(c);
	}
}
