package prtf;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class Achievements extends Blueprint {	//extends refers that a class is inheriting from the another class

	
	private Image backgroundpic = new ImageIcon(Blueprint.class.getResource("PICS/background.jpg")).getImage().getScaledInstance(1500, 1000, Image.SCALE_DEFAULT);
	private Image schoolmedals = new ImageIcon(Blueprint.class.getResource("PICS/medal.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
	private Image tournament = new ImageIcon(Blueprint.class.getResource("PICS/Trophy.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Achievements frame = new Achievements();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Achievements() {
		 
		super();	//calls the constructor of the parent class and its functions
		
		achievementsInfo t = new achievementsInfo();	//object that contains informations in the achievementsInfo class
		
		JLabel title = new JLabel(t.title);
		title.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		title.setBounds(115, 122, 312, 47);
		getContentPane().add(title);
		
		JLabel medalIcon = new JLabel("");
		medalIcon.setBounds(249, 179, 106, 100);
		getContentPane().add(medalIcon);
		medalIcon.setIcon(new ImageIcon(schoolmedals));
		
		JLabel text1 = new JLabel(t.text1);
		text1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		text1.setBounds(200, 279, 177, 27);
		getContentPane().add(text1);
		
		JLabel text2 = new JLabel(t.text2);
		text2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		text2.setBounds(200, 316, 177, 27);
		getContentPane().add(text2);
		
		JLabel text3 = new JLabel(t.text3);
		text3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		text3.setBounds(200, 353, 164, 27);
		getContentPane().add(text3);
		
		JLabel text4 = new JLabel(t.text4);
		text4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		text4.setBounds(200, 390, 177, 27);
		getContentPane().add(text4);
		
		JLabel text5 = new JLabel(t.text5);
		text5.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		text5.setBounds(83, 427, 432, 27);
		getContentPane().add(text5);
		
		JLabel text6 = new JLabel(t.text6);
		text6.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		text6.setBounds(83, 464, 432, 27);
		getContentPane().add(text6);
		
		JLabel text9 = new JLabel(t.text9);
		text9.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		text9.setBounds(173, 575, 242, 27);
		getContentPane().add(text9);
		
		JLabel text8 = new JLabel(t.text8);
		text8.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		text8.setBounds(173, 538, 236, 27);
		getContentPane().add(text8);
		
		JLabel text7 = new JLabel(t.text7);
		text7.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		text7.setBounds(177, 501, 257, 27);
		getContentPane().add(text7);
		
		JLabel text10 = new JLabel(t.text10);
		text10.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		text10.setBounds(173, 612, 305, 27);
		getContentPane().add(text10);
		
		JLabel text11 = new JLabel(t.text11);
		text11.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		text11.setBounds(173, 649, 305, 27);
		getContentPane().add(text11);
		
		JLabel trophyIcon = new JLabel("");
		trophyIcon.setBounds(953, 179, 106, 100);
		getContentPane().add(trophyIcon);
		trophyIcon.setIcon(new ImageIcon(tournament));
		
		JLabel text12 = new JLabel(t.text12);
		text12.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		text12.setBounds(769, 290, 512, 27);
		getContentPane().add(text12);
		
		JLabel text13 = new JLabel(t.text13);
		text13.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		text13.setBounds(895, 327, 224, 27);
		getContentPane().add(text13);
		
		JLabel text14 = new JLabel(t.text14);
		text14.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		text14.setBounds(949, 364, 110, 27);
		getContentPane().add(text14);
		
		JLabel text15 = new JLabel(t.text15);
		text15.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		text15.setBounds(804, 401, 441, 27);
		getContentPane().add(text15);
		
		JLabel text16 = new JLabel(t.text16);
		text16.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		text16.setBounds(826, 438, 405, 27);
		getContentPane().add(text16);
		
		JLabel mainbackground = new JLabel("");
		mainbackground.setBounds(0, 0, 1486, 763);
		getContentPane().add(mainbackground);
		mainbackground.setIcon(new ImageIcon(backgroundpic));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
