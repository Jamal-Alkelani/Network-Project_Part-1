import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JTextField;
import java.awt.Window.Type;
import javax.swing.JLayeredPane;
import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;

public class ClientSide extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblNewLabel_1;
	private JLabel lblLocalPort;
	private JLabel lblServerIp;
	private JLabel lblServerPort;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientSide frame = new ClientSide();
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
	public ClientSide() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 576, 547);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField.setToolTipText("Send Message ...");
		textField.setBounds(12, 387, 500, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
				
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Images/Send.png"));
		lblNewLabel.setBounds(522, 395, 24, 24);
		contentPane.add(lblNewLabel);
		
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Baskerville Old Face", Font.BOLD, 18));
		textPane.setBounds(12, 13, 534, 361);
		contentPane.add(textPane);
		
		textField_1 = new JTextField();
		textField_1.setBounds(101, 432, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(101, 467, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(344, 432, 116, 22);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(344, 467, 116, 22);
		contentPane.add(textField_4);
		
		lblNewLabel_1 = new JLabel("Local IP");
		lblNewLabel_1.setBounds(265, 435, 56, 16);
		contentPane.add(lblNewLabel_1);
		
		lblLocalPort = new JLabel("Local Port");
		lblLocalPort.setBounds(265, 470, 67, 16);
		contentPane.add(lblLocalPort);
		
		lblServerIp = new JLabel("Server IP");
		lblServerIp.setBounds(12, 432, 56, 16);
		contentPane.add(lblServerIp);
		
		lblServerPort = new JLabel("Server Port");
		lblServerPort.setBounds(13, 467, 76, 16);
		contentPane.add(lblServerPort);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(486, 432, 60, 60);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("Images/Connect.png"));

	}
}
