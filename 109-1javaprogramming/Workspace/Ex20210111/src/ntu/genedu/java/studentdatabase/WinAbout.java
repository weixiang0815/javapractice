package ntu.genedu.java.studentdatabase;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WinAbout extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblVersion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			WinAbout dialog = new WinAbout();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public WinAbout() {
		setTitle("關於");
		setBounds(100, 100, 450, 337);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblProjectName = new JLabel("學生資料庫");
		lblProjectName.setFont(new Font("微軟正黑體", Font.PLAIN, 26));
		lblProjectName.setBounds(19, 223, 144, 29);
		contentPanel.add(lblProjectName);
		
		lblVersion = new JLabel("v1.1");
		lblVersion.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblVersion.setBounds(161, 222, 65, 30);
		contentPanel.add(lblVersion);
		
		JLabel lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon(WinAbout.class.getResource("/ntu/genedu/java/studentdatabase/學生資料庫說明視窗.jpg")));
		lblImage.setBounds(18, 18, 400, 198);
		contentPanel.add(lblImage);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("離開");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						okButton_Click();
					}
				});
				okButton.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}

	/**
	 * 設定目前程式版本
	 * @param version 版本編號
	 */
	protected void setVersion(String version) {
		this.lblVersion.setText(version);
	}
	protected void okButton_Click() {
		this.setVisible(false);
		
	}
}
