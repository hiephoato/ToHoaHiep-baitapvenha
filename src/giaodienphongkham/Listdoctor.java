package giaodienphongkham;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Listdoctor extends JFrame {

	private JPanel contentPane;

    String tenbacsi[] ={"Nguyen Phi Khanh", "Vo Ngoc Hien", "Vu Huy Loc", "Truong Hoai Bao", "Cao Manh Hoan"};
    String chungbenh[]= {"Foreskin", "Reproductive Health", "Prosate Disease", "Weak Physiological", "Male Infertility"};	
    String chucvu [] = {"bac si cao cap","pho giao su","tien si","bac si chuyen khoa ","thac si "};
    String hinhanh []= {"/giaodienphongkham/Images/59722082_2103719609697087_2385014211555098624_n.png","/giaodienphongkham/Images/58902171_1245710665583011_3490345640276262912_n.png","/giaodienphongkham/Images/59285428_2206366339679180_4323252546157150208_n.png","/giaodienphongkham/Images/59347750_424517914791250_8228883998827347968_n.jpg","/giaodienphongkham/Images/58870181_2461717720529354_6938380106020683776_n.png"};
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Listdoctor frame = new Listdoctor();
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
	public Listdoctor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1910, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Danh sa\u0301ch ba\u0301c si\u0303\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(320, 11, 530, 49);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 72, 1900, 950);
		contentPane.add(panel);
//		panel.setBackground(Color.gray);
		panel.setLayout(null);
		
		JButton btn_exit = new JButton("Exit");
		btn_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				turnoff();
			}
		});
		btn_exit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_exit.setBounds(1430, 11, 164, 49);
		contentPane.add(btn_exit);
		int y =0;
		int x =0;
		for(int i=0;i<tenbacsi.length;i++) {
		
			JPanel p =new JPanel();
			p.setLayout(null);
			p.setBounds(10+650*x+10*x,10+y*260+10*y,521,235);
				y++;
					if((y%3)==0) {
					y=0;
					x++;
				}
			
			
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon(Listdoctor.class.getResource(""+hinhanh[i])));
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setBounds(10, 12, 135, 145);
			p.add(label);
//			t.add(label);
			
			JLabel label_1 = new JLabel(""+tenbacsi[i]);
			label_1.setForeground(Color.RED);
			label_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
			label_1.setBounds(166, 11, 260, 26);
			p.add(label_1);
//			t.add(label_1);
			
			JLabel label_2 = new JLabel(""+chucvu[i]);
//			label_2.setForeground(Color.GREEN);
			label_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
			label_2.setBounds(166, 50, 260, 26);
			p.add(label_2);
//			t.add(label_2);
			
			
			JLabel label_3 = new JLabel(""+chungbenh[i]);
//			label_3.setForeground(Color.CYAN);
			label_3.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
			label_3.setBounds(166, 87, 260, 32);
			p.add(label_3);
//			t.add(label_3);
			
			JLabel label_4 = new JLabel("B\u1EC7nh vi\u1EC7n \u0111a khoa Qu\u1ED1c t\u1EBF");
			label_4.setForeground(Color.MAGENTA);
			label_4.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
			label_4.setBounds(161, 124, 235, 32);
			p.add(label_4);
//			t.add(label_4);
			
			JTextArea textArea = new JTextArea();
			textArea.setText("Working time : 8h ==> 12h || 13h  ==>> 17h");
			textArea.setForeground(Color.BLUE);
			textArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
			textArea.setEditable(false);
			textArea.setBounds(10, 168, 366, 22);
			p.add(textArea);
//			t.add(textArea);
			
			JTextArea textArea_1 = new JTextArea();
			textArea_1.setText("Working Date : thu 2 den thu 7");
			textArea_1.setForeground(Color.BLUE);
			textArea_1.setEditable(false);
			textArea_1.setBounds(10, 199, 366, 22);
			p.add(textArea_1);
//			t.add(textArea_1);
			JButton button = new JButton("\u0110\u0103ng k\u00FD kh\u00E1m");
			button.setForeground(Color.RED);
			button.setBounds(399, 16, 116, 23);
			p.add(button);
//			t.add(button);
			button.addActionListener(new  ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					MedicalForm h = new MedicalForm();
					h.show();
					
				}
			});
				
				
			

			panel.add(p);
//			panel.add(t);
			panel.revalidate();
			
			
			
		}
		
	
		
		contentPane.repaint();
	}
	private void turnoff() {
		this.hide();
	}
}
