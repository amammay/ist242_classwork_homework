import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class LayoutFrame extends JFrame 
{

	private JPanel contentPane;
	private JTextField nameText;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					LayoutFrame frame = new LayoutFrame();
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
	public LayoutFrame() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel northPanel = new JPanel();
		contentPane.add(northPanel, BorderLayout.NORTH);
		
		JLabel headerNorthLabel = new JLabel("My First User Interface");
		//color in Red, Green, Blue
		headerNorthLabel.setForeground(new Color(204, 0, 0));
		headerNorthLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		northPanel.add(headerNorthLabel);
		
		JPanel westPanel = new JPanel();
		westPanel.setBackground(new Color(153, 204, 255));
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JLabel selectWestLabel = new JLabel("Select a color:");
		westPanel.add(selectWestLabel);
		
		JComboBox colorWestCombo = new JComboBox();
		
		colorWestCombo.setModel(new DefaultComboBoxModel(new String[] {"Red", "Orange", "Yellow", "Green", "Blue", "Purple"}));
		westPanel.add(colorWestCombo);
		
		JPanel centerPanel = new JPanel();
		contentPane.add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel nameLabel = new JLabel("Enter Name:");
		nameLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		centerPanel.add(nameLabel);
		
		nameText = new JTextField();
		centerPanel.add(nameText);
		nameText.setColumns(10);
		
		JButton clickButton = new JButton("Click me!");
		centerPanel.add(clickButton);
		
		JLabel leftLabel = new JLabel("");
		centerPanel.add(leftLabel);
		
		JPanel panel = new JPanel();
		centerPanel.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JRadioButton rdbtnItalics = new JRadioButton("Italics");
		rdbtnItalics.setFont(new Font("Tahoma", Font.ITALIC, 11));
		rdbtnItalics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if (rdbtnItalics.isSelected()){
					Container lblCenter;
					//lblCenter.setFont(new Font(Font.ITALIC));
					
				}
			
			}
		});
		buttonGroup.add(rdbtnItalics);
		panel.add(rdbtnItalics);
		
		JRadioButton rdbtnUnderlin = new JRadioButton("Bold Italic");
		rdbtnUnderlin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		rdbtnUnderlin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		buttonGroup.add(rdbtnUnderlin);
		panel.add(rdbtnUnderlin);
		
		JRadioButton rdbtnBold = new JRadioButton("Bold");
		rdbtnBold.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnBold.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonGroup.add(rdbtnBold);
		panel.add(rdbtnBold);
		
		JLabel centerLabel = new JLabel("");
		centerPanel.add(centerLabel);
		
		JLabel rightLabel = new JLabel("");
		centerPanel.add(rightLabel);
		
		//always cut and put the event handler (listener) at the bottom of the code from where it was pasted to 
		colorWestCombo.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if (colorWestCombo.getSelectedIndex() == 0)
				{
					//can use C.red or find the hexadecimal online
					westPanel.setBackground(Color.RED);
				}
				else if (colorWestCombo.getSelectedIndex() == 1)
				{
					westPanel.setBackground(Color.ORANGE);
				}
				else if (colorWestCombo.getSelectedIndex() == 2)
				{
					westPanel.setBackground(Color.YELLOW);
				}
				else if (colorWestCombo.getSelectedIndex() == 3)
				{
					westPanel.setBackground(Color.GREEN);
				}
				else if (colorWestCombo.getSelectedIndex() == 4)
				{
					westPanel.setBackground(Color.BLUE);
				}
				else if (colorWestCombo.getSelectedIndex() == 5)
				{
					//no color for purple so we need to use the hexadecimal 
					westPanel.setBackground(new Color(102, 02, 03));
				}
			}
		});
		
		clickButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String name = nameText.getText();
				centerLabel.setText("Hello, " + name);
			}
		});
	}
}
