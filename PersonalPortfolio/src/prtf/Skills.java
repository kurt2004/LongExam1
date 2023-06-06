package prtf;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class Skills extends Blueprint {	//extends refers that a class is inheriting from the another class

	private Image backgroundpic = new ImageIcon(Blueprint.class.getResource("PICS/background.jpg")).getImage().getScaledInstance(1500, 1000, Image.SCALE_DEFAULT);
	private Image hardskills = new ImageIcon(Blueprint.class.getResource("PICS/hardskills.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
	private Image softskills = new ImageIcon(Blueprint.class.getResource("PICS/softskills.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Skills frame = new Skills();
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
	public Skills() {
		
		super();	//calls the constructor of the parent class and its functions
		
		skillsInfo t = new skillsInfo();	//object that contains informations in the skillsInfo class
		
		JLabel hardIcon = new JLabel("");
		hardIcon.setBounds(359, 132, 106, 100);
		hardIcon.setIcon(new ImageIcon(hardskills));
		getContentPane().add(hardIcon);
		
		JLabel softIcon = new JLabel("");
		softIcon.setBounds(991, 132, 106, 100);
		softIcon.setIcon(new ImageIcon(softskills));
		getContentPane().add(softIcon);
		
		JLabel text1 = new JLabel(t.text1);
		text1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		text1.setBounds(286, 331, 191, 27);
		getContentPane().add(text1);
		
		JLabel text4 = new JLabel(t.text4);
		text4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		text4.setBounds(286, 442, 323, 27);
		getContentPane().add(text4);
		
		JLabel text5 = new JLabel(t.text5);
		text5.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		text5.setBounds(286, 479, 353, 27);
		getContentPane().add(text5);
		
		JLabel text2 = new JLabel(t.text2);
		text2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		text2.setBounds(286, 368, 121, 27);
		getContentPane().add(text2);
		
		JLabel text3 = new JLabel(t.text3);
		text3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		text3.setBounds(286, 405, 205, 27);
		getContentPane().add(text3);
		
		JLabel text6 = new JLabel(t.text6);
		text6.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		text6.setBounds(939, 331, 191, 27);
		getContentPane().add(text6);
		
		JLabel text7 = new JLabel(t.text7);
		text7.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		text7.setBounds(939, 368, 224, 27);
		getContentPane().add(text7);
		
		JLabel text8 = new JLabel(t.text8);
		text8.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		text8.setBounds(939, 405, 121, 27);
		getContentPane().add(text8);
		
		JLabel text9 = new JLabel(t.text9);
		text9.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		text9.setBounds(939, 442, 121, 27);
		getContentPane().add(text9);
		
		JLabel text10 = new JLabel(t.text10);
		text10.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		text10.setBounds(939, 479, 142, 27);
		getContentPane().add(text10);
		
		JLabel title1 = new JLabel(t.title1);
		title1.setFont(new Font("Times New Roman", Font.BOLD, 60));
		title1.setBounds(224, 242, 414, 79);
		getContentPane().add(title1);
		
		JLabel title2 = new JLabel(t.title2);
		title2.setFont(new Font("Times New Roman", Font.BOLD, 60));
		title2.setBounds(847, 242, 390, 79);
		getContentPane().add(title2);
		
		JLabel mainbackground = new JLabel("");
		mainbackground.setBounds(0, 0, 1486, 763);
		getContentPane().add(mainbackground);
		mainbackground.setIcon(new ImageIcon(backgroundpic));
		
	
		
		
		
	}

}
