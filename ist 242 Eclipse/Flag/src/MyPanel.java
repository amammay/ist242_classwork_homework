import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JPanel;


public class MyPanel extends JPanel {

	

	/**
	 * Create the panel.
	 */
	public MyPanel() {
	}

		public void paintComponent(Graphics g){
			Graphics2D g2 = (Graphics2D) g;
			g2.setColor(Color.RED);
			g2.fillRect(0,0,100,100);
		}
		
		
		
	

}
