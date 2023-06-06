package prtf;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Blueprint extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Blueprint frame = new Blueprint();
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
	public Blueprint() {
		setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1500, 800);
        
        contentPane = new JPanel();
        contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//event handler for the Home Page
		JLabel homeLabel = new JLabel("HOME");
		homeLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home home = new Home();
        		home.setVisible(true);
        		Blueprint.this.dispose();
			}
		});
		homeLabel.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 35));
		homeLabel.setBounds(126, 10, 126, 75);
		contentPane.add(homeLabel);
		
		
		//event handler for the About Page
		JLabel aboutLabel = new JLabel("ABOUT");
		aboutLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				About about = new About();
        		about.setVisible(true);
        		Blueprint.this.dispose();
			}
		});
		aboutLabel.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 35));
		aboutLabel.setBounds(324, 10, 145, 75);
		contentPane.add(aboutLabel);
		
		
		//event handler for the Achievements Page
		JLabel achieveLabel = new JLabel("ACHIEVEMENTS");
		achieveLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Achievements achievement = new Achievements();
        		achievement.setVisible(true);
        		Blueprint.this.dispose();
			}
		});
		achieveLabel.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 35));
		achieveLabel.setBounds(534, 10, 337, 75);
		contentPane.add(achieveLabel);
		
		
		//event handler for the Hobbies Page
		JLabel hobbiesLabel = new JLabel("HOBBIES");
		hobbiesLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Hobbies hobbies = new Hobbies();
        		hobbies.setVisible(true);
        		Blueprint.this.dispose();
			}
		});
		hobbiesLabel.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 35));
		hobbiesLabel.setBounds(934, 10, 188, 75);
		contentPane.add(hobbiesLabel);
		
		
		//event handler for the Skills Page
		JLabel skillsLabel = new JLabel("SKILLS");
		skillsLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Skills skills = new Skills();
        		skills.setVisible(true);
        		Blueprint.this.dispose();
			}
		});
		skillsLabel.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 35));
		skillsLabel.setBounds(1204, 10, 154, 75);
		contentPane.add(skillsLabel);
		
		
		
		
		
		
	}
}
