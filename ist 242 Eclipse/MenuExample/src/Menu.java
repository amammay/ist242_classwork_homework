import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JSlider;


public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenu mnFont = new JMenu("Font");
		menuBar.add(mnFont);
		
		JMenu mnFormat = new JMenu("Format");
		mnFont.add(mnFormat);
		
		
		
		

		
	
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblHelloWorld = new JLabel("Hello");
		contentPane.add(lblHelloWorld, BorderLayout.NORTH);
		
		
		
		
		JMenuItem mntmPlain = new JMenuItem("Plain");
		mntmPlain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblHelloWorld.setFont(new Font("Tahoma", Font.PLAIN, 24));
				
			}
		});
		mnFormat.add(mntmPlain);
		
		JMenuItem mntmItalic = new JMenuItem("Italic");
		mntmItalic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblHelloWorld.setFont(new Font("Tahoma", Font.ITALIC, 24));
			}
		});
		mnFormat.add(mntmItalic);
		JMenuItem mntmBold = new JMenuItem("Bold");
		mntmBold.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblHelloWorld.setFont(new Font("Tahoma", Font.BOLD, 24));
			}
		});
		mnFormat.add(mntmBold);
		
		
		
	}

}
