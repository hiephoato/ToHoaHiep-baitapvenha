package giaodienphongkham;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class DoctorDetails extends JPanel {
	 String hinhanh [] = {"/giaodienphongkham/Images/phikhanh.png","/giaodienphongkham/Imagesngochien.png","/giaodienphongkham/Imageshuyloc.png","/giaodienphongkham/Imageshoaibao.png","/giaodienphongkham/Imagesmanhhoan.png"};
	/**
	 * Create the panel.
	 */
	public DoctorDetails() {
		setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 12, 135, 145);
		label.setIcon(new ImageIcon(DoctorDetails.class.getResource("/giaodienphongkham/Images/phikhanh.png")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		add(label);
		
		
		JLabel label_1 = new JLabel("V\u0169 Huy L\u1ED9c");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		label_1.setBounds(166, 11, 260, 26);
		add(label_1);
		
		
		JLabel label_2 = new JLabel("B\u00E1c s\u0129 cao c\u1EA5p");
		label_2.setForeground(Color.GREEN);
		label_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_2.setBounds(166, 50, 260, 26);
		add(label_2);
		
		JLabel label_3 = new JLabel("Prosate Disease");
		label_3.setForeground(Color.CYAN);
		label_3.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_3.setBounds(166, 87, 260, 32);
		add(label_3);
		
		JLabel label_4 = new JLabel("B\u1EC7nh vi\u1EC7n \u0111a khoa Qu\u1ED1c t\u1EBF");
		label_4.setForeground(Color.MAGENTA);
		label_4.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label_4.setBounds(161, 124, 235, 32);
		add(label_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("Working time : 8h ==> 12h || 13h  ==>> 17h");
		textArea.setForeground(Color.BLUE);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
		textArea.setEditable(false);
		textArea.setBounds(10, 168, 366, 22);
		add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setText("Working Date : th\u1EE9 2 || th\u1EE9 4 || th\u1EE9 6");
		textArea_1.setForeground(Color.BLUE);
		textArea_1.setEditable(false);
		textArea_1.setBounds(10, 199, 366, 22);
		add(textArea_1);
		
		JButton button = new JButton("\u0110\u0103ng k\u00FD kh\u00E1m");
		button.setForeground(Color.RED);
		button.setBounds(399, 16, 116, 23);
		add(button);

		
		
		
		
		
	}
}
