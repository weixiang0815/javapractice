import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

public class Java_Labels {

	public static void main(String[] args) {
		ImageIcon image = new ImageIcon("smile.png");
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		JLabel label = new JLabel();
		label.setText("Henry, do you even code?");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(0x880815));
		label.setFont(new Font("Mv Boli",Font.PLAIN,100));
		label.setIconTextGap(-100);
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
//		label.setBounds(300, 25, 600, 600);
		
		JFrame frame = new JFrame();
//		frame.setSize(500,500);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.add(label);
		frame.setIconImage(image.getImage());
//		frame.setLayout(null);
		frame.pack();
		frame.setVisible(true);

	}

}
