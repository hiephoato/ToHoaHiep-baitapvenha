package giaodienphongkham;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.Color;

public class LogIn extends JFrame {

	private JPanel contentPane;
	private JTextField txt_user;
	private JPasswordField txt_password;

	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
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
	public LogIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_LogIn = new JLabel("Log In");
		lbl_LogIn.setForeground(Color.RED);
		lbl_LogIn.setIcon(new ImageIcon(LogIn.class.getResource("/giaodienphongkham/Images/lock.png")));
		lbl_LogIn.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_LogIn.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_LogIn.setBounds(282, 33, 179, 31);
		contentPane.add(lbl_LogIn);
		
		JLabel lbl_UserName = new JLabel("User :");
		lbl_UserName.setForeground(Color.RED);
		lbl_UserName.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		lbl_UserName.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_UserName.setBounds(161, 80, 109, 31);
		contentPane.add(lbl_UserName);
		
		JLabel lbl_PassWord = new JLabel("PassWord :");
		lbl_PassWord.setForeground(Color.RED);
		lbl_PassWord.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		lbl_PassWord.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_PassWord.setBounds(161, 114, 109, 31);
		contentPane.add(lbl_PassWord);
		
		
		
		
		txt_user = new JTextField();
		txt_user.setBounds(282, 87, 194, 20);
		contentPane.add(txt_user);
		txt_user.setColumns(10);
		
		txt_password = new JPasswordField();
		txt_password.setBounds(282, 121, 194, 20);
		contentPane.add(txt_password);
		
		JRadioButton rad_doctor = new JRadioButton("Doctor");
		rad_doctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rad_doctor.setActionCommand("Doctor");
			}
		});
		buttonGroup_1.add(rad_doctor);
		rad_doctor.setForeground(Color.RED);
		rad_doctor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rad_doctor.setBounds(204, 166, 109, 23);
		contentPane.add(rad_doctor);
		
		JRadioButton rad_patient = new JRadioButton("Patient");
		rad_patient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			rad_patient.setActionCommand("Patient");
			}
		});
		
		buttonGroup_1.add(rad_patient);
		rad_patient.setForeground(Color.RED);
		rad_patient.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rad_patient.setBounds(426, 166, 109, 23);
		contentPane.add(rad_patient);
	
		JButton btn_login = new JButton("Login");
		btn_login.setForeground(Color.RED);
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String username= txt_user.getText();
				String password= txt_password.getText();
				String chucvu = buttonGroup_1.getSelection().getActionCommand();
			
//				
//				if(rad_doctor.isSelected()) {
//					LogIn fr =new LogIn();
//					fr.show(true);
//				}
//				

				//xu li kiem tra du lieu
				String tenfile;
				tenfile="E:\\java\\baitapphongkhambenh\\data1.txt";
				
				try {
					File f =new File(tenfile);
					FileReader fr =new FileReader(f);
					BufferedReader bw = new BufferedReader(fr);
					String line =bw.readLine();
					Boolean success = false;
					while(line!= null) {
							String a[] =line.split("       ");
							if(a[0].equals(username) && a[1].equalsIgnoreCase(password) && a[5].equalsIgnoreCase(chucvu)  ) {
							   success= true;		
										String d = "Doctor";		
										if(chucvu  ==d) {
										JOptionPane.showMessageDialog(btn_login, "Logged in successlly!!!");
										bacsikhambenh b=new bacsikhambenh();
										b.setVisible(true);
										b.show();
										b.lbl_name.setText(a[7]);
										break;
							}else { //patient 
										JOptionPane.showMessageDialog(btn_login, "Welcom!!! "+a[7]);
										MedicalForm m = new MedicalForm();
										m.show();
										}
							}
						line =bw.readLine();
							
					}
					
					if(success == false ) {
						JOptionPane.showMessageDialog(btn_login, "Logged in unsuccessfully!!!");
					}else {
							
							
						}
//					System.out.println(line);
					bw.close();
					
				}catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
				
			 
			 
				
			}
		});
		btn_login.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_login.setBounds(251, 225, 89, 23);
		contentPane.add(btn_login);
		
		
		
		JButton btn_Cancel = new JButton("Cancel");
		btn_Cancel.setForeground(Color.RED);
		btn_Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				turnoff();
			}
		});
		btn_Cancel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_Cancel.setBounds(439, 225, 89, 23);
		contentPane.add(btn_Cancel);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(LogIn.class.getResource("/giaodienphongkham/Images/59390636_509527089586439_6313660770466922496_n.png")));
		lblNewLabel.setBounds(0, 0, 714, 350);
		contentPane.add(lblNewLabel);
	}
	private void turnoff() {
		this.hide();
	}
}
