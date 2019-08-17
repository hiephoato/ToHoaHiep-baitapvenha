package giaodienphongkham;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField txt_username;
	private JPasswordField txt_password;
	private JPasswordField txt_repassword;
	private JTextField txt_phone;
	private JTextField txt_email;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txt_fullname = new JTextField();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_username = new JLabel("User Name:");
		lbl_username.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_username.setBounds(159, 74, 112, 14);
		contentPane.add(lbl_username);
		
		JLabel lbl_password = new JLabel("PassWord:");
		lbl_password.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_password.setBounds(159, 134, 112, 14);
		contentPane.add(lbl_password);
		
		JLabel lbl_signup = new JLabel("Sign Up");
		lbl_signup.setIcon(new ImageIcon(SignUp.class.getResource("/giaodienphongkham/Images/clipboard-with-pencil-.png")));
		lbl_signup.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_signup.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_signup.setBounds(238, 11, 174, 39);
		contentPane.add(lbl_signup);
		
		txt_username = new JTextField();
		txt_username.setBounds(271, 71, 151, 20);
		contentPane.add(txt_username);
		txt_username.setColumns(10);
		
		txt_password = new JPasswordField();
		txt_password.setBounds(271, 131, 151, 20);
		contentPane.add(txt_password);
		
		JLabel lbl_repassword = new JLabel("Repassword:");
		lbl_repassword.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_repassword.setBounds(159, 166, 112, 20);
		contentPane.add(lbl_repassword);
		
		txt_repassword = new JPasswordField();
		txt_repassword.setBounds(271, 166, 151, 20);
		contentPane.add(txt_repassword);
		
		JLabel lbl_phone = new JLabel("Phone:");
		lbl_phone.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_phone.setBounds(159, 197, 112, 14);
		contentPane.add(lbl_phone);
		
		JLabel lbl_email = new JLabel("Email:");
		lbl_email.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_email.setBounds(159, 222, 112, 14);
		contentPane.add(lbl_email);
		
		txt_phone = new JTextField();
		txt_phone.setBounds(271, 194, 151, 20);
		contentPane.add(txt_phone);
		txt_phone.setColumns(10);
		
		txt_email = new JTextField();
		txt_email.setBounds(271, 219, 151, 20);
		contentPane.add(txt_email);
		txt_email.setColumns(10);
		
		JRadioButton rad_male = new JRadioButton("Male");
		rad_male.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rad_male.setActionCommand("Male");
			}
		});
		buttonGroup.add(rad_male);
		rad_male.setBounds(238, 246, 109, 23);
		contentPane.add(rad_male);
		
		JRadioButton rad_female = new JRadioButton("Female");
		rad_female.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rad_female.setActionCommand("Female");
			}
		});
		buttonGroup.add(rad_female);
		rad_female.setHorizontalAlignment(SwingConstants.CENTER);
		rad_female.setBounds(371, 246, 109, 23);
		contentPane.add(rad_female);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Doctor", "Patient"}));
		comboBox.setBounds(271, 284, 141, 36);
		contentPane.add(comboBox);
		
		JButton btn_accept = new JButton("Accept");
		btn_accept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String username= txt_username.getText();
				String password= txt_password.getText();
				String repassword= txt_repassword.getText();
				String phone= txt_phone.getText();
				String email= txt_email.getText();
				String gender = buttonGroup.getSelection().getActionCommand();
				String fullname = txt_fullname.getText();
						
						if(rad_male.isSelected()) {
							SignUp fr =new SignUp();
							fr.show(true);
						}
						
						else
						if(rad_female.isSelected()) {
							SignUp fr = new SignUp ();
							fr.show(true);
						}
		
				// xu li  combobox



				String value = (String) comboBox.getSelectedItem();
				
				
				
				//phuong thuc luu du lieu
				String tenfile;
				tenfile="E:\\java\\baitapphongkhambenh\\data1.txt";
				try {
					
					
					
					File f=new File(tenfile);
					
					FileWriter fw= new FileWriter(f,true);
					BufferedWriter bw = new BufferedWriter(fw);
					
					bw.write(username +"       "+ password+"       "+repassword+"       "+ phone+"       "+email+ "       "+ value + "       "+ gender+"       "+fullname );
					bw.newLine();
					bw.close();
				}catch(Exception e1) {
						
				}
				
				
			
	
	
				JOptionPane.showMessageDialog(getRootPane(), "You registered successfully!!! ");
				
				
			LogIn l= new LogIn();
			l.setVisible(true);
			l.show();
				
				
			}
			
			});
		btn_accept.setBounds(174, 339, 89, 23);
		contentPane.add(btn_accept);
		
		JButton btn_cancel = new JButton("Cancel");
		btn_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				turnoff();
			}
			
		});
		btn_cancel.setBounds(408, 339, 89, 23);
		contentPane.add(btn_cancel);
		
		
		txt_fullname.setBounds(271, 102, 151, 21);
		contentPane.add(txt_fullname);
		txt_fullname.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Fullname:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(169, 102, 81, 21);
		contentPane.add(lblNewLabel);
	
	}
	private void turnoff() {
		this.hide();
	
		
	}
}
