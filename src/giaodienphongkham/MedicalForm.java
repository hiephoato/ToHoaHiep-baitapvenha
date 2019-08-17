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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.event.ItemListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MedicalForm extends JFrame {

	private JPanel contentPane;
	private JTextField txt_1;
	private JTextField txt_3;
	private JTextField txt_2;
	private JTextField txt_4;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	JComboBox cb_2 = new JComboBox();
	
	JComboBox cb_1 = new JComboBox();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MedicalForm frame = new MedicalForm();
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
	public MedicalForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_3 = new JLabel("Date of birth :");
		lbl_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_3.setBounds(10, 95, 105, 26);
		contentPane.add(lbl_3);
		
		JLabel lbl_2 = new JLabel("First name :");
		lbl_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_2.setBounds(10, 65, 105, 24);
		contentPane.add(lbl_2);
		
		txt_1 = new JTextField();
		txt_1.setBounds(125, 65, 130, 24);
		contentPane.add(txt_1);
		txt_1.setColumns(10);
		
		txt_3 = new JTextField();
		txt_3.setColumns(10);
		txt_3.setBounds(125, 95, 130, 26);
		contentPane.add(txt_3);
		
		JLabel lbl_4 = new JLabel("Last name :");
		lbl_4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_4.setBounds(273, 65, 105, 24);
		contentPane.add(lbl_4);
		
		txt_2 = new JTextField();
		txt_2.setColumns(10);
		txt_2.setBounds(388, 65, 130, 24);
		contentPane.add(txt_2);
		
		JLabel lbl_1 = new JLabel("MEDICAL FORM");
		lbl_1.setBounds(156, 11, 264, 30);
		contentPane.add(lbl_1);
		lbl_1.setIcon(new ImageIcon(MedicalForm.class.getResource("/giaodienphongkham/Images/clipboard-with-pencil-.png")));
		lbl_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbl_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		txt_4 = new JTextField();
		txt_4.setBounds(388, 95, 130, 26);
		contentPane.add(txt_4);
		txt_4.setColumns(10);
		
		JLabel lbl_5 = new JLabel("Phone :");
		lbl_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_5.setBounds(283, 95, 95, 26);
		contentPane.add(lbl_5);
		
		cb_1.setModel(new DefaultComboBoxModel(new String[] {"Prosate Disease", "Male Infertility", "Reproductive Health", "Foreskin", "Weak Physiological"}));
		cb_1.setToolTipText("benh1");
		cb_1.setBounds(186, 141, 192, 36);
		contentPane.add(cb_1);
		cb_2.setModel(new DefaultComboBoxModel(new String[] {"Nguyen Phi Khanh", "Vo Ngoc Hien", "Vu Huy Loc", "Truong Hoai Bao", "Cao Manh Hoan"}));
		cb_2.setBounds(186, 185, 192, 36);
		contentPane.add(cb_2);
		
	
		cb_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
//				String s1 = cb_1.getSelectedItem().toString();
//				int index1 = cb_1.getSelectedIndex();
//				
//				
//				System.out.println(s1);
//				if(s1.equals("Prosate Disease")) {
//					
//					//cb_1.repaint();
////					
////					JOptionPane.showMessageDialog(getRootPane(), s+"-"+index);
//					cb_2.setSelectedIndex(2);
//					//cb_1.setSelectedItem("Foreskin");
//				}
////
//				if(s1.equals("Male Infertility")) {
//					
//					//cb_1.repaint();
//					
////					JOptionPane.showMessageDialog(getRootPane(), s+"-"+index);
//					cb_2.setSelectedIndex(4);
//					//cb_1.setSelectedItem("Foreskin");
//				}
//
//				if(s1.equals("Reproductive Health")) {
//					
//					//cb_1.repaint();
//					
////					JOptionPane.showMessageDialog(getRootPane(), s+"-"+index);
//					cb_2.setSelectedIndex(1);
//					//cb_1.setSelectedItem("Foreskin");
//				}
//
//				if(s1.equals("Foreskin")) {
//					
//					//cb_1.repaint();
//					
////					JOptionPane.showMessageDialog(getRootPane(), s+"-"+index);
//					cb_2.setSelectedIndex(0);
//					//cb_1.setSelectedItem("Foreskin");
//				}
//				if(s1.equals("Weak Physiological")) {
//					
//					//cb_1.repaint();
////					
////					JOptionPane.showMessageDialog(getRootPane(), s+"-"+index);
//					cb_2.setSelectedIndex(3);
//					//cb_1.setSelectedItem("Foreskin");
//				}
				
			}
		});
		
		JLabel lbl_6 = new JLabel("List Of Disease");
		lbl_6.setIcon(new ImageIcon(MedicalForm.class.getResource("/giaodienphongkham/Images/medical-history.png")));
		lbl_6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_6.setBounds(10, 142, 166, 30);
		contentPane.add(lbl_6);
		
		
		cb_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String s = cb_2.getSelectedItem().toString();
//				int index = cb_2.getSelectedIndex();
				
				if(s.equals("Nguyen Phi Khanh")) {
					
					//cb_1.repaint();
//					
//					JOptionPane.showMessageDialog(getRootPane(), s+"-"+index);
					cb_1.setSelectedIndex(3);
					//cb_1.setSelectedItem("Foreskin");
				}

				if(s.equals("Vo Ngoc Hien")) {
					
					//cb_1.repaint();
					
//					JOptionPane.showMessageDialog(getRootPane(), s+"-"+index);
					cb_1.setSelectedIndex(2);
					//cb_1.setSelectedItem("Foreskin");
				}

				if(s.equals("Vu Huy Loc")) {
					
					//cb_1.repaint();
					
//					JOptionPane.showMessageDialog(getRootPane(), s+"-"+index);
					cb_1.setSelectedIndex(0);
					//cb_1.setSelectedItem("Foreskin");
				}

				if(s.equals("Cao Manh Hoan")) {
					
					//cb_1.repaint();
					
//					JOptionPane.showMessageDialog(getRootPane(), s+"-"+index);
					cb_1.setSelectedIndex(1);
					//cb_1.setSelectedItem("Foreskin");
				}
				if(s.equals("Truong Hoai Bao")) {
					
					//cb_1.repaint();
//					
//					JOptionPane.showMessageDialog(getRootPane(), s+"-"+index);
					cb_1.setSelectedIndex(4);
					//cb_1.setSelectedItem("Foreskin");
				}
		
			}
		});
		
		JLabel lbl_7 = new JLabel("Doctor");
		lbl_7.setIcon(new ImageIcon(MedicalForm.class.getResource("/giaodienphongkham/Images/doctor.png")));
		lbl_7.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_7.setBounds(10, 183, 166, 36);
		contentPane.add(lbl_7);
		
		JRadioButton rad_t2 = new JRadioButton("th\u01B0\u0301 2");
		rad_t2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rad_t2.setActionCommand("thu 2");
			}
		});
		buttonGroup_1.add(rad_t2);
		rad_t2.setToolTipText("");
		rad_t2.setBounds(156, 237, 60, 23);
		contentPane.add(rad_t2);
		
		JRadioButton rad_t3 = new JRadioButton("th\u01B0\u0301 3");
		rad_t3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rad_t3.setActionCommand("thu 3");
			}
		});
		buttonGroup_1.add(rad_t3);
		rad_t3.setToolTipText("th\u01B0\u0301 3");
		rad_t3.setBounds(218, 237, 60, 23);
		contentPane.add(rad_t3);
		
		JRadioButton rad_t4 = new JRadioButton("th\u01B0\u0301 4");
		rad_t4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rad_t4.setActionCommand("thu 4");
			}
		});
		buttonGroup_1.add(rad_t4);
		rad_t4.setBounds(283, 237, 60, 23);
		contentPane.add(rad_t4);
		
		JRadioButton rad_t5 = new JRadioButton("th\u01B0\u0301 5");
		rad_t5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rad_t5.setActionCommand("thu 5");
			}
		});
		buttonGroup_1.add(rad_t5);
		rad_t5.setBounds(345, 237, 60, 23);
		contentPane.add(rad_t5);
		
		JRadioButton rad_t6 = new JRadioButton("th\u01B0\u0301 6");
		rad_t6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			rad_t6.setActionCommand("thu 6");
			}
		});
		buttonGroup_1.add(rad_t6);
		rad_t6.setBounds(407, 237, 60, 23);
		contentPane.add(rad_t6);

		JRadioButton rad_t7 = new JRadioButton("Th\u1EE9 7");
		rad_t7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rad_t7.setActionCommand("thu 7");
			}
		});
		buttonGroup_1.add(rad_t7);
		rad_t7.setBounds(469, 237, 60, 23);
		contentPane.add(rad_t7);
		
		JButton btn_1 = new JButton("Register");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				String h = txt_1.getText();
//				String h1 = txt_2.getText();
				
//				JOptionPane.showMessageDialog(btn_1, "Congratulation!!!" + "  "+ h + "  " + h1 + "  " + ".You registered successfully");
//				HomePage H =new HomePage();
//				H.show(true);
				
				String firstname = txt_1.getText();
				String lastname = txt_2.getText();
				String dateofbirth = txt_3.getText();
				String phone = txt_4.getText();
				String thoigian= buttonGroup_1.getSelection().getActionCommand();
				String thoigiankhambenh= buttonGroup_2.getSelection().getActionCommand();
				
				//xu li combobox
				

				String value = (String) cb_2.getSelectedItem();
				String value1 = (String) cb_1.getSelectedItem();
			      
				
				
				//xu li su kien luu thong tin xuong file
				String tenfile;
				tenfile="E:\\java\\baitapphongkhambenh\\medicalform.txt";
				try {
					File f=new File(tenfile);
					
					FileWriter fw= new FileWriter(f,true);
					BufferedWriter bw = new BufferedWriter(fw);
					
					bw.write(firstname +"      "+ lastname+"       "+dateofbirth+"      "+ phone+"      "+value+"      "+value1+ "      "+thoigian+"      "+ thoigiankhambenh);
					bw.newLine();
					bw.close();
				}catch(Exception e1) {
						System.out.println(e1.getMessage());
					}
				
				JOptionPane.showMessageDialog(getRootPane(), "Dang ky kham benh  thanh cong ");
				
				
			}
		});
		btn_1.setBounds(172, 423, 144, 23);
		contentPane.add(btn_1);
		
		JButton btn_2 = new JButton("Cancel");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				turnoff();
			}
		});
		btn_2.setBounds(379, 423, 130, 23);
		contentPane.add(btn_2);
		
		
		JLabel lbl_9 = new JLabel("Choose the date :");
		lbl_9.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_9.setBounds(10, 237, 130, 23);
		contentPane.add(lbl_9);
		
		JLabel lbl_10 = new JLabel("Choose the time :");
		lbl_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_10.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_10.setBounds(10, 272, 130, 23);
		contentPane.add(lbl_10);
		
		JRadioButton rad_1 = new JRadioButton("8h - 9h");
		rad_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rad_1.setActionCommand("8h-9h");
			}
		});
		buttonGroup_2.add(rad_1);
		rad_1.setBounds(156, 274, 80, 23);
		contentPane.add(rad_1);
		
		JRadioButton rad_2 = new JRadioButton("9h - 10h");
		rad_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rad_2.setActionCommand("9h-10h");
			}
		});
		buttonGroup_2.add(rad_2);
		rad_2.setBounds(238, 274, 80, 23);
		contentPane.add(rad_2);
		
		JRadioButton rad_3 = new JRadioButton("10h - 11h");
		rad_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rad_3.setActionCommand("10h-11h");
			}
		});
		buttonGroup_2.add(rad_3);
		rad_3.setBounds(320, 274, 80, 23);
		contentPane.add(rad_3);
		
		JRadioButton rad_4 = new JRadioButton("11h - 12h");
		rad_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rad_4.setActionCommand("11h-12h");
			}
		});
		buttonGroup_2.add(rad_4);
		rad_4.setBounds(407, 274, 80, 23);
		contentPane.add(rad_4);
		
		JRadioButton rad_5 = new JRadioButton("13h - 14h");
		rad_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rad_5.setActionCommand("13h-14h");
			}
		});
		buttonGroup_2.add(rad_5);
		rad_5.setBounds(156, 311, 80, 23);
		contentPane.add(rad_5);
		
		JRadioButton rad_6 = new JRadioButton("14h - 15h");
		rad_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rad_6.setActionCommand("14h-15h");
			}
		});
		buttonGroup_2.add(rad_6);
		rad_6.setBounds(238, 311, 80, 23);
		contentPane.add(rad_6);
		
		JRadioButton rad_7 = new JRadioButton("15h - 16h");
		rad_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rad_7.setActionCommand("15h-16h");
			}
		});
		buttonGroup_2.add(rad_7);
		rad_7.setBounds(320, 311, 80, 23);
		contentPane.add(rad_7);
		
		JRadioButton rad_8 = new JRadioButton("16h - 17h");
		rad_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rad_8.setActionCommand("16h-17h");
			}
		});
		buttonGroup_2.add(rad_8);
		rad_8.setBounds(407, 311, 80, 23);
		contentPane.add(rad_8);
	}
	private void turnoff() {
		this.hide();

	}
		
}
