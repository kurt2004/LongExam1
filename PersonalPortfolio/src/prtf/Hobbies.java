package prtf;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class Hobbies extends Blueprint {	//extends refers that a class is inheriting from the another class

	private Image backgroundpic = new ImageIcon(Blueprint.class.getResource("PICS/background.jpg")).getImage().getScaledInstance(1500, 1000, Image.SCALE_DEFAULT);
	private Image hobby1 = new ImageIcon(Blueprint.class.getResource("PICS/bball.png")).getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
	private Image hobby2 = new ImageIcon(Blueprint.class.getResource("PICS/vgames.jpg")).getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hobbies frame = new Hobbies();
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
	public Hobbies() {
		
		super();	//calls the constructor of the parent class and its functions
		
		hobbiesInfo t = new hobbiesInfo();	//object that contains informations in the hobbiesInfo class
		
		JLabel ballIcon = new JLabel("");
		ballIcon.setBounds(152, 125, 307, 253);
		getContentPane().add(ballIcon);
		ballIcon.setIcon(new ImageIcon(hobby1));
		
		JLabel gameIcon = new JLabel("");
		gameIcon.setBounds(152, 459, 307, 253);
		getContentPane().add(gameIcon);
		gameIcon.setIcon(new ImageIcon(hobby2));
		
		JLabel text1 = new JLabel(t.text1);
		text1.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		text1.setBounds(519, 181, 646, 47);
		getContentPane().add(text1);
		
		JLabel text2 = new JLabel(t.text2);
		text2.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		text2.setBounds(519, 239, 661, 47);
		getContentPane().add(text2);
		
		JLabel text3 = new JLabel(t.text3);
		text3.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		text3.setBounds(519, 499, 641, 47);
		getContentPane().add(text3);
		
		JLabel text4 = new JLabel(t.text4);
		text4.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		text4.setBounds(519, 556, 766, 47);
		getContentPane().add(text4);
		
		JLabel text5 = new JLabel(t.text5);
		text5.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		text5.setBounds(519, 613, 641, 47);
		getContentPane().add(text5);
		
		JLabel mainbackground = new JLabel("");
		mainbackground.setBounds(0, 0, 1486, 763);
		getContentPane().add(mainbackground);
		mainbackground.setIcon(new ImageIcon(backgroundpic));
		

		
		
		
		
	}

}
