import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class About extends JDialog {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4260567613872822067L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			About dialog = new About();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public About() {
		setResizable(false);
		setTitle("關於");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblName = new JLabel("應用程式名稱:");
			lblName.setHorizontalAlignment(SwingConstants.RIGHT);
			lblName.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
			lblName.setBounds(38, 21, 75, 25);
			contentPanel.add(lblName);
		}
		{
			JLabel lblTradingRecords = new JLabel("奔向財務自由股票交易紀錄");
			lblTradingRecords.setHorizontalAlignment(SwingConstants.LEFT);
			lblTradingRecords.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
			lblTradingRecords.setBounds(123, 21, 144, 25);
			contentPanel.add(lblTradingRecords);
		}
		{
			JLabel lblVersion = new JLabel("應用程式版本:");
			lblVersion.setHorizontalAlignment(SwingConstants.RIGHT);
			lblVersion.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
			lblVersion.setBounds(38, 56, 75, 25);
			contentPanel.add(lblVersion);
		}
		{
			JLabel lblversion = new JLabel("v1.0.0");
			lblversion.setHorizontalAlignment(SwingConstants.LEFT);
			lblversion.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
			lblversion.setBounds(123, 56, 31, 25);
			contentPanel.add(lblversion);
		}
		{
			JLabel lblDeveloper = new JLabel("開發者:");
			lblDeveloper.setHorizontalAlignment(SwingConstants.RIGHT);
			lblDeveloper.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
			lblDeveloper.setBounds(38, 91, 75, 25);
			contentPanel.add(lblDeveloper);
		}
		{
			JLabel lblHenryWang = new JLabel("王威翔");
			lblHenryWang.setHorizontalAlignment(SwingConstants.LEFT);
			lblHenryWang.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
			lblHenryWang.setBounds(123, 91, 36, 25);
			contentPanel.add(lblHenryWang);
		}
		{
			JLabel lblStudentID = new JLabel("開發者學號:");
			lblStudentID.setHorizontalAlignment(SwingConstants.RIGHT);
			lblStudentID.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
			lblStudentID.setBounds(38, 126, 75, 25);
			contentPanel.add(lblStudentID);
		}
		{
			JLabel lblstudentid = new JLabel("B07302229");
			lblstudentid.setHorizontalAlignment(SwingConstants.LEFT);
			lblstudentid.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
			lblstudentid.setBounds(123, 126, 61, 25);
			contentPanel.add(lblstudentid);
		}
		{
			JLabel lblIntroduction = new JLabel("功能簡介");
			lblIntroduction.setHorizontalAlignment(SwingConstants.RIGHT);
			lblIntroduction.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
			lblIntroduction.setBounds(38, 161, 75, 25);
			contentPanel.add(lblIntroduction);
		}
		{
			JLabel lblFunction = new JLabel("紀錄並儲存股票購買紀錄；可試算交易總金額");
			lblFunction.setHorizontalAlignment(SwingConstants.LEFT);
			lblFunction.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
			lblFunction.setBounds(123, 161, 240, 25);
			contentPanel.add(lblFunction);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnClose = new JButton("關閉");
				btnClose.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
				btnClose.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						okButton_Click();
					}
				});
				btnClose.setActionCommand("OK");
				buttonPane.add(btnClose);
				getRootPane().setDefaultButton(btnClose);
			}
		}
	}

	protected void okButton_Click() {
		this.setVisible(false);
		
	}

}
