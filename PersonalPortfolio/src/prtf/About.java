package prtf;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class About extends Blueprint {	//extends refers that a class is inheriting from the another class

	private Image backgroundpic = new ImageIcon(Blueprint.class.getResource("PICS/background.jpg")).getImage().getScaledInstance(1500, 1000, Image.SCALE_DEFAULT);
	private Image school = new ImageIcon(Blueprint.class.getResource("PICS/NU.png")).getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
	 
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
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
	public About() {
		
		super();	//calls the constructor of the parent class and its functions
		
		aboutInfo t = new aboutInfo();	//object that contains informations in the aboutInfo class
		
		JLabel text1 = new JLabel(t.text1);
		text1.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		text1.setBounds(261, 207, 700, 47);
		getContentPane().add(text1);
		
		JLabel text2 = new JLabel(t.text2);
		text2.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		text2.setBounds(259, 246, 1009, 47);
		getContentPane().add(text2);
		
		JLabel text3 = new JLabel(t.text3);
		text3.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		text3.setBounds(261, 287, 1026, 47);
		getContentPane().add(text3);
		
		JLabel nuIcon = new JLabel("");
		nuIcon.setBounds(49, 270, 200, 240);
		getContentPane().add(nuIcon);
		nuIcon.setIcon(new ImageIcon(school));
		
		JLabel text4 = new JLabel(t.text4);
		text4.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		text4.setBounds(261, 422, 1126, 47);
		getContentPane().add(text4);
		
		JLabel text5 = new JLabel(t.text5);
		text5.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		text5.setBounds(261, 463, 1126, 47);
		getContentPane().add(text5);
		
		JLabel text6 = new JLabel(t.text6);
		text6.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		text6.setBounds(261, 505, 1147, 47);
		getContentPane().add(text6);
		
		JLabel text7 = new JLabel(t.text7);
		text7.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		text7.setBounds(261, 548, 1126, 47);
		getContentPane().add(text7);
		
		JLabel mainbackground = new JLabel("");
		mainbackground.setBounds(0, 0, 1486, 763);
		getContentPane().add(mainbackground);
		mainbackground.setIcon(new ImageIcon(backgroundpic));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
