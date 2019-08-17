package giaodienphongkham;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;

public class Agency extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agency frame = new Agency();
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
	public Agency() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1026, 778);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_Address = new JLabel("93 Cao Th\u1EAFng, Ph\u01B0\u1EDDng 3, Qu\u1EADn 3, TP.HCM");
		lbl_Address.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_Address.setIcon(new ImageIcon(Agency.class.getResource("/giaodienphongkham/Images/home.png")));
		lbl_Address.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Address.setBounds(10, 47, 358, 36);
		contentPane.add(lbl_Address);
		
		JLabel lbl_PKDK = new JLabel("Ph\u00F2ng Kh\u00E1m \u0110a Khoa");
		lbl_PKDK.setIcon(new ImageIcon(Agency.class.getResource("/giaodienphongkham/Images/health-care.png")));
		lbl_PKDK.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_PKDK.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl_PKDK.setBounds(10, 11, 268, 36);
		contentPane.add(lbl_PKDK);
		
		JLabel lbl_Phone = new JLabel("HotLine: 028 3838 3838");
		lbl_Phone.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Phone.setIcon(new ImageIcon(Agency.class.getResource("/giaodienphongkham/Images/old-typical-phone.png")));
		lbl_Phone.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_Phone.setBounds(745, 47, 255, 30);
		contentPane.add(lbl_Phone);
		
		JLabel lbl_MedicalTime = new JLabel("Medical Time : 08:00-20:00");
		lbl_MedicalTime.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_MedicalTime.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_MedicalTime.setBounds(378, 47, 357, 36);
		contentPane.add(lbl_MedicalTime);
		
		JLabel lbl_1 = new JLabel("Vision and Mission");
		lbl_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_1.setBounds(10, 138, 167, 14);
		contentPane.add(lbl_1);
		
		JButton btn_homepage = new JButton("Home Page");
		btn_homepage.setIcon(new ImageIcon(Agency.class.getResource("/giaodienphongkham/Images/home.png")));
		btn_homepage.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_homepage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				turnoff ();
			}
		});
		btn_homepage.setBounds(10, 93, 167, 34);
		contentPane.add(btn_homepage);
		
		JLabel lbl_2 = new JLabel("Good team of specialist doctors");
		lbl_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_2.setBounds(10, 275, 282, 25);
		contentPane.add(lbl_2);
		
		JLabel lbl_3 = new JLabel("Professional consultant");
		lbl_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_3.setBounds(10, 432, 199, 14);
		contentPane.add(lbl_3);
		
		JTextArea txtrFreeOnlineDirect = new JTextArea();
		txtrFreeOnlineDirect.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtrFreeOnlineDirect.setEditable(false);
		txtrFreeOnlineDirect.setText("Free, online, direct medical consultation service answers all concerns and questions about the fastest pathology.\r\n-Quick online consulting service.\r\n-Free phone consultation and online chat.\r\n- Direct consultation at the clinic.\r\nThe therapist directly advises and answers the patient's questions.\r\nPatients do not have to wait, consult and come to see them immediately.\r\n-How 1: At the website address: phong khamdakhoa.vn, you leave the phone number in the chat window, the consultant will call \r\nyou directly\r\n-How 2: Click on the live chat window to be shared secretly, difficult to tell the consultant\r\n-How 3: Call the hotline number: 02839608888 for pharmacists on phone advice");
		txtrFreeOnlineDirect.setBounds(10, 470, 1013, 214);
		contentPane.add(txtrFreeOnlineDirect);
		
		JTextArea txtrFocusingOnBuilding = new JTextArea();
		txtrFocusingOnBuilding.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtrFocusingOnBuilding.setEditable(false);
		txtrFocusingOnBuilding.setText("Focusing on building a team of experts and medical doctors who are good and virtuous, aiming to bring the quality\r\n of professional medical services, diagnose and support the treatment of diseases with the highest efficiency as the\r\n leading factor multidisciplinary direction. In particular, experts and doctors from large hospital across the country\r\n are regularly organized and trained in foreign countries to apply medical techniques most  smoothly.");
		txtrFocusingOnBuilding.setBounds(10, 311, 955, 92);
		contentPane.add(txtrFocusingOnBuilding);
		
		JTextArea txtrThePolyclinicAlways = new JTextArea();
		txtrThePolyclinicAlways.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtrThePolyclinicAlways.setEditable(false);
		txtrThePolyclinicAlways.setText("The polyclinic always pays special attention to the team of specialists, medical professionals with professional experience,\r\n a system of modern medical equipment, a professional medical environment to carry out the main mission of carrying health, \r\n joy, happiness for patients. Constructing according to international clinic standards, we are also a prestigious address\r\n to provide high quality medical examination and treatment services, aiming to become become the leading medical clinic\r\n in the country.\r\n");
		txtrThePolyclinicAlways.setBounds(10, 163, 1013, 112);
		contentPane.add(txtrThePolyclinicAlways);
		
		JButton btn_infrastructure = new JButton("Infrastructure");
		btn_infrastructure.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Infrastructure j= new Infrastructure();
				j.show(true);
			}
		});
		btn_infrastructure.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_infrastructure.setBounds(187, 94, 167, 33);
		contentPane.add(btn_infrastructure);
		
		JButton btn_listofdoctor = new JButton("List of Doctor");
		btn_listofdoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Listdoctor j= new Listdoctor();
				j.show(true);
			}
		});
		btn_listofdoctor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_listofdoctor.setBounds(364, 94, 167, 32);
		contentPane.add(btn_listofdoctor);
		
		JButton btn_answer = new JButton("Answer");
		btn_answer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Answer j= new Answer();
				j.show(true);
			}
		});
		btn_answer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_answer.setBounds(541, 94, 167, 30);
		contentPane.add(btn_answer);
	}
	private void turnoff() {
		this.hide();
	}
}
