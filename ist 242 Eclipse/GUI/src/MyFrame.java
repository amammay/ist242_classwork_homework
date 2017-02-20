
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MyFrame extends JFrame {

	private JPanel contentPane;
	
	private JTextField txtInputName;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
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
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Input Name: ");
		contentPane.add(lblNewLabel, BorderLayout.WEST);
		
		txtInputName = new JTextField();
		
		contentPane.add(txtInputName, BorderLayout.CENTER);
		txtInputName.setColumns(10);
		
		
		lblNewLabel_1 = new JLabel("");
		contentPane.add(lblNewLabel_1, BorderLayout.SOUTH);
		
		btnNewButton = new JButton("Click Me");
		contentPane.add(btnNewButton, BorderLayout.EAST);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = txtInputName.getText();
				System.out.println(name);
				lblNewLabel_1.setText("Hello, " + name);
			}
		});
		
		
		
	}

}
