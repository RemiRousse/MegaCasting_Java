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
	public static void main(String[] args, String message1) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					jFrameAlert frame = new jFrameAlert(message1);
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
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 400, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel labelAlert1 = new JLabel(message);
		labelAlert1.setFont(new Font("Calibri", Font.BOLD, 17));
		labelAlert1.setForeground(Color.RED);
		contentPane.add(labelAlert1, BorderLayout.CENTER);
		
		JLabel labelAlert2 = new JLabel("Si le probléme perciste, contactez votre administrateur.");
		labelAlert2.setFont(new Font("Calibri", Font.PLAIN, 11));
		contentPane.add(labelAlert2, BorderLayout.SOUTH);
	}
}
