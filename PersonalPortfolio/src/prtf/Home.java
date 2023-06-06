package prtf;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class Home extends Blueprint {	//extends refers that a class is inheriting from the another class

	
	private Image backgroundpic = new ImageIcon(Blueprint.class.getResource("PICS/background.jpg")).getImage().getScaledInstance(1500, 1000, Image.SCALE_DEFAULT);
	private Image prtflPic = new ImageIcon(Blueprint.class.getResource("PICS/profilepic.png")).getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
	private Image facebook = new ImageIcon(Blueprint.class.getResource("PICS/fb.png")).getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT);
	private Image instagram = new ImageIcon(Blueprint.class.getResource("PICS/ig.png")).getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT);
	private Image email = new ImageIcon(Blueprint.class.getResource("PICS/email.png")).getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT);
	private Image contact = new ImageIcon(Blueprint.class.getResource("PICS/phone.png")).getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT);
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		
		super();	//calls the constructor of the parent class and its functions
		
		homeInfo t = new homeInfo();	//object that contains informations in the homeInfo class
		
		JLabel text1 = new JLabel(t.text1);
		text1.setFont(new Font("Century Gothic", Font.BOLD, 46));
		text1.setBounds(468, 175, 633, 111);
		getContentPane().add(text1);
		
		JLabel text2 = new JLabel(t.text2);
		text2.setFont(new Font("Tekton Pro", Font.PLAIN, 20));
		text2.setBounds(577, 324, 256, 38);
		getContentPane().add(text2);
		
		JLabel text3 = new JLabel(t.text3);
		text3.setFont(new Font("Tekton Pro", Font.PLAIN, 20));
		text3.setBounds(577, 404, 256, 38);
		getContentPane().add(text3);
		
		JLabel text4 = new JLabel(t.text4);
		text4.setFont(new Font("Tekton Pro", Font.PLAIN, 20));
		text4.setBounds(577, 487, 275, 38);
		getContentPane().add(text4);
		
		JLabel text5 = new JLabel(t.text5);
		text5.setFont(new Font("Tekton Pro", Font.PLAIN, 20));
		text5.setBounds(577, 571, 148, 38);
		getContentPane().add(text5);
		
		JLabel Profilepic = new JLabel("");
		Profilepic.setBounds(73, 234, 300, 353);
		getContentPane().add(Profilepic);
		Profilepic.setIcon(new ImageIcon(prtflPic));
		
		JLabel fbIcon = new JLabel("");
		fbIcon.setBounds(468, 306, 75, 75);
		getContentPane().add(fbIcon);
		fbIcon.setIcon(new ImageIcon(facebook));
		
		JLabel instaIcon = new JLabel("");
		instaIcon.setBounds(468, 379, 75, 87);
		getContentPane().add(instaIcon);
		instaIcon.setIcon(new ImageIcon(instagram));
		
		JLabel emailIcon = new JLabel("");
		emailIcon.setBounds(468, 461, 75, 87);
		getContentPane().add(emailIcon);
		emailIcon.setIcon(new ImageIcon(email));
		
		JLabel numIcon = new JLabel("");
		numIcon.setBounds(468, 546, 75, 87);
		getContentPane().add(numIcon);
		numIcon.setIcon(new ImageIcon(contact));
		
		JLabel mainbackground = new JLabel("");
		mainbackground.setBounds(0, 0, 1486, 763);
		getContentPane().add(mainbackground);
		mainbackground.setIcon(new ImageIcon(backgroundpic));
		
		
		
		
		
		
		
		
		
		
	
			
		
	}
}
