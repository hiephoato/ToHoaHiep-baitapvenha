package giaodienphongkham;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class bacsikhambenh extends JFrame {

	private JPanel contentPane;
	public JLabel lbl_name = new JLabel("New label");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bacsikhambenh frame = new bacsikhambenh();
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
	public bacsikhambenh() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lbl_name.setBounds(10, 11, 200, 31);
		contentPane.add(lbl_name);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 53, 518, 222);
		contentPane.add(panel);
		panel.setLayout(null);
//		panel.setBackground(Color.GREEN);
		//doc file medical
		String tenfile;
		tenfile="E:\\java\\baitapphongkhambenh\\medicalform.txt";
		
		//vi du bs login co ten Cao Manh Hoan
		
		ArrayList<String> lst =new ArrayList<String>();
		
		try {
			File f =new File(tenfile);
		
			FileReader fr =new FileReader(f);
			BufferedReader bw = new BufferedReader(fr);
			String line =bw.readLine();
			Boolean success = false;
			while(line != null) {
					String a[] =line.split("       ");
					String tenbs =lbl_name.getText();
					
					if(a[4].equalsIgnoreCase(tenbs)) {
						
						lst.add(a[0]+a[1]);
						
					}
//					
//				line =bw.readLine();
			
			}
			  bw.close();
			
			
		}catch (Exception e2) {
//			System.out.println(e2.getMessage());
		}
		
		//
	
	}	
}
