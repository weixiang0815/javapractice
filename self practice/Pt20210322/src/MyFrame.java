import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class MyFrame extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JButton button;
	JLabel label;
	
	MyFrame(){
		ImageIcon image = new ImageIcon("smile.png");
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(0x880815));
		
		ImageIcon icon = new ImageIcon("thumbsup.png");
		ImageIcon icon2 = new ImageIcon("smile.png");
		
		label = new JLabel("Label!");
		label.setIcon(icon2);
		label.setBounds(150, 250, 150, 150);
		label.setVisible(false);
		label.setFont(new Font("Mv Boli",Font.ITALIC,20));
		
		button = new JButton();
		button.setBounds(100, 100, 250, 100);
		button.setText("I'm a button!");
		button.setFocusable(false);
		button.addActionListener(this);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans", Font.BOLD, 20));
//		button.setIconTextGap(-15);
		button.setForeground(Color.darkGray);
		button.setBackground(Color.lightGray);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		this.setSize(500,500);
		this.setTitle("JFrame title goes here");
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//		this.setResizable(false);
		this.setLayout(null);
		this.add(button);
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("I'm a button!");
			button.setEnabled(false);
			label.setVisible(true);
		}
	}

}
