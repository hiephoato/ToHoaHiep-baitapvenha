import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI extends JFrame{
	JButton btn, btn1,btn2 ,btn3 ,btn4 ,btn5 ;
	JPanel panel_center;
	JPanel panel_north;
	JLabel lbl_title;
		
	
	
	public void acept() {
			lbl_title = new JLabel ("General Clinic");
			btn = new JButton ("Home Page");
			btn1 =new JButton ("Agency");
			btn2 =new JButton ("GroupOfDiseases");
			btn3 =new JButton ("Infrastructure");
			btn4 =new JButton ("Answers");
			btn5 =new JButton ("Doctor");
			
			
			
			panel_center =new JPanel ();
			panel_north =new JPanel ();
			
			
			
			
			panel_center.add(lbl_title);
			panel_north.add(btn);
			panel_north.add(btn1);
			panel_north.add(btn2);
			panel_north.add(btn3);
			panel_north.add(btn4);
			panel_north.add(btn5);
			
			
			
			getContentPane ().add(panel_center, BorderLayout.NORTH);
			getContentPane ().add (panel_north,BorderLayout.CENTER);
			
			
			
			
			
			setSize (1000,500);
			setVisible (true);
			
			
			
			
			
		}
	

	
}
