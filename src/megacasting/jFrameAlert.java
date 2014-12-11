package megacasting;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class jFrameAlert extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args, String message) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					jFrameAlert frame = new jFrameAlert(message);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public jFrameAlert(String message) {
		setType(Type.POPUP);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel labelAlert = new JLabel(message);
		labelAlert.setFont(new Font("Calibri", Font.BOLD, 17));
		labelAlert.setForeground(Color.RED);
		contentPane.add(labelAlert, BorderLayout.CENTER);
	}

}
