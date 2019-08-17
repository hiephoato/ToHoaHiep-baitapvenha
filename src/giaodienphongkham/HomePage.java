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
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HomePage extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_PKDK = new JLabel("Ph\u00F2ng Kh\u00E1m \u0110a Khoa");
		lbl_PKDK.setIcon(new ImageIcon(HomePage.class.getResource("/giaodienphongkham/Images/health-care.png")));
		lbl_PKDK.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_PKDK.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl_PKDK.setBounds(10, 36, 268, 36);
		contentPane.add(lbl_PKDK);
		
		JLabel lbl_Address = new JLabel("93 Cao Th\u1EAFng, Ph\u01B0\u1EDDng 3, Qu\u1EADn 3, TP.HCM");
		lbl_Address.setIcon(new ImageIcon(HomePage.class.getResource("/giaodienphongkham/Images/home.png")));
		lbl_Address.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Address.setBounds(26, 11, 282, 14);
		contentPane.add(lbl_Address);
		
		JButton btn_HomePage = new JButton("HomePage");
		btn_HomePage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage h =new HomePage();
				h.show(true);
			}
		});
		btn_HomePage.setBounds(10, 117, 157, 23);
		contentPane.add(btn_HomePage);
		
		JButton btn_Agency = new JButton("Agency");
		btn_Agency.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Agency a= new Agency();
				a.show(true);
				
			}
		});
		btn_Agency.setBounds(177, 117, 131, 23);
		contentPane.add(btn_Agency);
		
		JButton btn_Infrastructure = new JButton("Infrastructure");
		btn_Infrastructure.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Infrastructure j= new Infrastructure();
				j.show(true);
			}
		});
		btn_Infrastructure.setBounds(482, 117, 136, 23);
		contentPane.add(btn_Infrastructure);
		
		JButton btn_Answer = new JButton("Answer");
		btn_Answer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Answer k =new Answer();
				k.show();
			}
		});
		btn_Answer.setBounds(628, 117, 130, 23);
		contentPane.add(btn_Answer);
		
		JLabel lbl_Phone = new JLabel("HotLine: 028 3838 3838");
		lbl_Phone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_Phone.setIcon(new ImageIcon(HomePage.class.getResource("/giaodienphongkham/Images/old-typical-phone.png")));
		lbl_Phone.setBounds(570, 69, 184, 26);
		contentPane.add(lbl_Phone);
		
		JButton btn_LogIn = new JButton("Log In");
		btn_LogIn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_LogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogIn d =new LogIn();
				d.show(true);
				
			}
		});
		btn_LogIn.setBounds(402, 7, 93, 36);
		contentPane.add(btn_LogIn);
		
		JButton btn_medicalform = new JButton("Medical Form");
		btn_medicalform.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_medicalform.setIcon(new ImageIcon(HomePage.class.getResource("/giaodienphongkham/Images/clipboard-with-pencil-.png")));
		btn_medicalform.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MedicalForm s =new MedicalForm();
				s.show(true);
			}
		});
		btn_medicalform.setBounds(614, 7, 144, 36);
		contentPane.add(btn_medicalform);
		
		JButton btn_listofdoctor = new JButton("List Of Doctor");
		btn_listofdoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Listdoctor h = new Listdoctor();
				h.show();
				
				
			}
		});
		btn_listofdoctor.setBounds(320, 117, 152, 23);
		contentPane.add(btn_listofdoctor);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(HomePage.class.getResource("/giaodienphongkham/Images/59617723_2275058442815599_9000493801474621440_n.jpg")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 151, 748, 170);
		contentPane.add(lblNewLabel);
		
		JButton btn_signup = new JButton("Sign Up");
		btn_signup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp su = new SignUp();
				su.show();
			}
		});
		btn_signup.setBounds(505, 8, 99, 36);
		contentPane.add(btn_signup);
	}
}
