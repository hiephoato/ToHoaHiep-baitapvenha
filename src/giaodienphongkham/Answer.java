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
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JDesktopPane;

public class Answer extends JFrame {

	private JPanel contentPane;
	private JTextField txt_name;
	private JTextField txt_phone;
	private JTextField txt_email;
	private JTextField txt_question;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Answer frame = new Answer();
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
	public Answer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 764, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_information = new JLabel("Information");
		lbl_information.setIcon(new ImageIcon(Answer.class.getResource("/giaodienphongkham/Images/operator (1).png")));
		lbl_information.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_information.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_information.setBounds(271, 11, 232, 36);
		contentPane.add(lbl_information);
		
		JLabel lbl_username = new JLabel("Email:");
		lbl_username.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_username.setBounds(178, 64, 83, 20);
		contentPane.add(lbl_username);
		
		JLabel lbl_name = new JLabel("Name:");
		lbl_name.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_name.setBounds(178, 89, 83, 20);
		contentPane.add(lbl_name);
		
		txt_name = new JTextField();
		txt_name.setBounds(270, 89, 233, 20);
		contentPane.add(txt_name);
		txt_name.setColumns(10);
		
		JLabel lbl_phone = new JLabel("Phone:");
		lbl_phone.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_phone.setBounds(178, 120, 83, 14);
		contentPane.add(lbl_phone);
		
		txt_phone = new JTextField();
		txt_phone.setBounds(271, 117, 232, 20);
		contentPane.add(txt_phone);
		txt_phone.setColumns(10);
		
		JLabel lbl_question = new JLabel("Question");
		lbl_question.setIcon(new ImageIcon(Answer.class.getResource("/giaodienphongkham/Images/questions.png")));
		lbl_question.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_question.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_question.setBounds(271, 176, 232, 54);
		contentPane.add(lbl_question);
		
		JButton btn_send = new JButton("Send");
		btn_send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email =txt_email.getText();
				String name =txt_name.getText();
				String phone =txt_phone.getText();
				String question =txt_question.getText();
				
				String tenfile;
				tenfile="E:\\java\\baitapphongkhambenh\\medicalform.txt";
				try {
					File f=new File(tenfile);
					
					FileWriter fw= new FileWriter(f,true);
					BufferedWriter bw = new BufferedWriter(fw);
					
					bw.write(email+"       "+name+"       "+phone+"       "+question);
					bw.newLine();
					bw.close();
				}catch(Exception e1) {
						
				}
				
				JOptionPane.showMessageDialog(btn_send, "Successfully sent the request");
			}
		});
		btn_send.setIcon(new ImageIcon(Answer.class.getResource("/giaodienphongkham/Images/paper-plane.png")));
		btn_send.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_send.setBounds(600, 401, 138, 36);
		contentPane.add(btn_send);
		
		txt_email = new JTextField();
		txt_email.setBounds(271, 64, 232, 20);
		contentPane.add(txt_email);
		txt_email.setColumns(10);
		
		JButton btn_exit = new JButton("Exit");
		btn_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				turnoff();
			}
		});
		btn_exit.setBounds(659, 0, 89, 23);
		contentPane.add(btn_exit);
		
		txt_question = new JTextField();
		txt_question.setHorizontalAlignment(SwingConstants.LEFT);
		txt_question.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txt_question.setBounds(10, 241, 728, 149);
		contentPane.add(txt_question);
		txt_question.setColumns(10);
	}
	private void turnoff() {
		this.hide();
	}
}
