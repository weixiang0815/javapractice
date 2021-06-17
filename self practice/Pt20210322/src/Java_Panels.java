import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Java_Panels {

	public static void main(String[] args) {
		ImageIcon icon = new ImageIcon("thumbsup.png");
		
		JLabel label = new JLabel();
		label.setText("Hi");
		label.setIcon(icon);
//		label.setVerticalAlignment(JLabel.BOTTOM);
//		label.setHorizontalAlignment(JLabel.RIGHT);
		label.setBounds(100, 100, 100, 100);
		label.setFont(new Font("Mv Boli",Font.PLAIN,20));
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);
//		redPanel.setLayout(new BorderLayout());
		redPanel.setLayout(null);

		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);
//		bluePanel.setLayout(new BorderLayout());
		bluePanel.setLayout(null);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);
//		greenPanel.setLayout(new BorderLayout());
		greenPanel.setLayout(null);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);
//		redPanel.add(label);
//		bluePanel.add(label);
		greenPanel.add(label);
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
		frame.setVisible(true);
	}

}
