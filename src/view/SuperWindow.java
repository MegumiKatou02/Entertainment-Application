package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ControllerWindow;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class SuperWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textField;
	public JLabel answerLabel;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public SuperWindow() {
		setTitle("Siêu ứng dụng tính tuổi");
		setIconImage(Toolkit.getDefaultToolkit().getImage(SuperWindow.class.getResource("/view/brainstorm.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 196);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titleLabel = new JLabel("Nhập vào số tuổi của bạn: ");
		titleLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		titleLabel.setHorizontalAlignment(SwingConstants.LEFT);
		titleLabel.setBounds(29, 11, 355, 29);
		contentPane.add(titleLabel);
		
		ControllerWindow controllerWindow = new ControllerWindow(this);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(27, 51, 378, 29);
		textField.addKeyListener(controllerWindow);
		contentPane.add(textField);
		textField.setColumns(10);
		
		answerLabel = new JLabel("");
		answerLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		answerLabel.setBounds(29, 91, 376, 55);
		contentPane.add(answerLabel);
		setVisible(true);
	}
}
