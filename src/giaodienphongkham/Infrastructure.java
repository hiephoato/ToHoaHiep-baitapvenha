package giaodienphongkham;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Infrastructure extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Infrastructure frame = new Infrastructure();
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
	public Infrastructure() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 856, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_PKDK = new JLabel("Ph\u00F2ng Kh\u00E1m \u0110a Khoa");
		lbl_PKDK.setIcon(new ImageIcon(Infrastructure.class.getResource("/giaodienphongkham/Images/health-care.png")));
		lbl_PKDK.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_PKDK.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl_PKDK.setBounds(10, 11, 268, 36);
		contentPane.add(lbl_PKDK);
		
		JLabel label_Address = new JLabel("93 Cao Th\u1EAFng, Ph\u01B0\u1EDDng 3, Qu\u1EADn 3, TP.HCM");
		label_Address.setIcon(new ImageIcon(Infrastructure.class.getResource("/giaodienphongkham/Images/home.png")));
		label_Address.setHorizontalAlignment(SwingConstants.CENTER);
		label_Address.setBounds(20, 58, 282, 17);
		contentPane.add(label_Address);
		
		JLabel lbl_MedicalTime = new JLabel("Medical Time : 08:00-20:00");
		lbl_MedicalTime.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_MedicalTime.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_MedicalTime.setBounds(312, 47, 167, 36);
		contentPane.add(lbl_MedicalTime);
		
		JLabel lbl_Phone = new JLabel("HotLine: 028 3838 3838");
		lbl_Phone.setIcon(new ImageIcon(Infrastructure.class.getResource("/giaodienphongkham/Images/old-typical-phone.png")));
		lbl_Phone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_Phone.setBounds(541, 50, 184, 25);
		contentPane.add(lbl_Phone);
		
		JLabel lbl_Infrastructure = new JLabel("Introduce Infrastructure");
		lbl_Infrastructure.setForeground(Color.BLACK);
		lbl_Infrastructure.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_Infrastructure.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Infrastructure.setBounds(10, 127, 206, 25);
		contentPane.add(lbl_Infrastructure);
		
		JButton btn_homepage = new JButton("Home Page");
		btn_homepage.setIcon(new ImageIcon(Infrastructure.class.getResource("/giaodienphongkham/Images/home.png")));
		btn_homepage.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_homepage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				turnoff ();
				
			}
		});
		btn_homepage.setBounds(10, 80, 160, 36);
		contentPane.add(btn_homepage);
		
		JTextArea txtrtheModernClinic = new JTextArea();
		txtrtheModernClinic.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtrtheModernClinic.setEditable(false);
		txtrtheModernClinic.setText("-The modern clinic uses modern information technology, each individual will be set up an electronic\r\n medical record to store all information related to illness from the beginning of the follow-up\r\n to the end of life, thereby Doctors can provide continuous care for individual patients as well as\r\n family members.\r\n-In particular, with open and open space design, the general hospital is an odorless hospital,\r\ncreating a comfortable feeling for customers when they come for medical examination and treatment.\r\n Inaddition, the construction design carries high ventilation elements, making good use of natural\r\n light and wind. This helps bring savings in the cost of operating electricity and good for the\r\n health of the patient.");
		txtrtheModernClinic.setBounds(10, 150, 830, 211);
		contentPane.add(txtrtheModernClinic);
		
		JButton btn_agency = new JButton("Agency");
		btn_agency.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Agency j= new Agency();
				j.show(true);
			}
		});
		btn_agency.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_agency.setBounds(180, 80, 160, 36);
		contentPane.add(btn_agency);
		
		JButton btn_listofdoctor = new JButton("List of Doctor");
		btn_listofdoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Listdoctor j= new Listdoctor();
				j.show(true);
			}
		});
		btn_listofdoctor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_listofdoctor.setBounds(350, 80, 160, 36);
		contentPane.add(btn_listofdoctor);
		
		JButton btn_answer = new JButton("Answer");
		btn_answer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Answer j= new Answer();
				j.show(true);
			}
		});
		btn_answer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_answer.setBounds(520, 80, 160, 36);
		contentPane.add(btn_answer);
	}
	private void turnoff() {
		this.hide();
	}
}
