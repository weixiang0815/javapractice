import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
/**
 * 學生資料庫
 * 
 * v1.0.0 可新增學生資料，並且加入例外處理機制
 * 
 * @author kChen
 * @version 1.0.0
 */
public class WinStudentDB {

	private StudentList sList;

	// WindowBuilder 自動產生的
	private JFrame frmStudenDB;
	private JTextField txtName;
	private JTextField txtChinese;
	private JTextField txtEnglish;
	private JTextField txtMath;
	private JTextArea txtrStudentData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WinStudentDB window = new WinStudentDB();
					window.frmStudenDB.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WinStudentDB() {
		initialize();

		this.sList = new StudentList();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudenDB = new JFrame();
		frmStudenDB.setTitle("學生資料庫 v1.0");
		frmStudenDB.setBounds(100, 100, 468, 442);
		frmStudenDB.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudenDB.getContentPane().setLayout(null);

		JPanel palInputStudentData = new JPanel();
		palInputStudentData.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		palInputStudentData.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"\u8F38\u5165\u8CC7\u6599", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		palInputStudentData.setBounds(7, 17, 440, 111);
		frmStudenDB.getContentPane().add(palInputStudentData);
		palInputStudentData.setLayout(null);

		JLabel lblName = new JLabel("姓名");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblName.setBounds(8, 22, 53, 26);
		palInputStudentData.add(lblName);

		txtName = new JTextField();
		txtName.setText("張三");
		txtName.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		txtName.setColumns(10);
		txtName.setBounds(74, 22, 129, 26);
		palInputStudentData.add(txtName);

		JLabel lblChinese = new JLabel("國文");
		lblChinese.setHorizontalAlignment(SwingConstants.RIGHT);
		lblChinese.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblChinese.setBounds(216, 22, 53, 26);
		palInputStudentData.add(lblChinese);

		txtChinese = new JTextField();
		txtChinese.setHorizontalAlignment(SwingConstants.RIGHT);
		txtChinese.setText("80");
		txtChinese.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		txtChinese.setColumns(10);
		txtChinese.setBounds(282, 22, 129, 26);
		palInputStudentData.add(txtChinese);

		JLabel lblEnglish = new JLabel("英文");
		lblEnglish.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEnglish.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblEnglish.setBounds(8, 67, 53, 26);
		palInputStudentData.add(lblEnglish);

		txtEnglish = new JTextField();
		txtEnglish.setHorizontalAlignment(SwingConstants.RIGHT);
		txtEnglish.setText("70");
		txtEnglish.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		txtEnglish.setColumns(10);
		txtEnglish.setBounds(74, 67, 129, 26);
		palInputStudentData.add(txtEnglish);

		JLabel lblMath = new JLabel("數學");
		lblMath.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMath.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblMath.setBounds(216, 67, 53, 26);
		palInputStudentData.add(lblMath);

		txtMath = new JTextField();
		txtMath.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMath.setText("66");
		txtMath.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		txtMath.setColumns(10);
		txtMath.setBounds(282, 67, 129, 26);
		palInputStudentData.add(txtMath);

		JButton btnAddStudent = new JButton("新增");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAddStudent_Click();
			}
		});
		btnAddStudent.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		btnAddStudent.setBounds(359, 136, 85, 34);
		frmStudenDB.getContentPane().add(btnAddStudent);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(17, 190, 420, 198);
		frmStudenDB.getContentPane().add(scrollPane);

		txtrStudentData = new JTextArea();
		scrollPane.setViewportView(txtrStudentData);
		txtrStudentData.setFont(new Font("微軟正黑體", Font.PLAIN, 18));

	}

	protected void btnAddStudent_Click() {
		String strName = this.txtName.getText();
		String strChinese = this.txtChinese.getText();
		String strEnglish = this.txtEnglish.getText();
		String strMath = this.txtMath.getText();

		int iChinese = 0;
		int iEnglish = 0;
		int iMath = 0;

		boolean isChineseError = false;
		boolean isEnglishError = false;
		boolean isMathError = false;

		try {
			iChinese = Integer.parseInt(strChinese);
		} catch (NumberFormatException e) {

			isChineseError = true;
		}

		try {
			iEnglish = Integer.parseInt(strEnglish);
		} catch (NumberFormatException e) {

			isEnglishError = true;
		}
		try {
			iMath = Integer.parseInt(strMath);
		} catch (NumberFormatException e) {
			isMathError = true;
		}

		if (isChineseError || isEnglishError || isMathError) {
			if (isChineseError)
				this.showMessage("國文", strChinese);
			if (isEnglishError)
				this.showMessage("英文", strEnglish);
			if (isMathError)
				this.showMessage("數字", strMath);
			return;
		}

		// 產生學生資料
		Student s = null;

		try {
			s = new Student(strName, iChinese, iEnglish, iMath);
			
			// 將學生資料加入至 StudentList
			this.sList.add(s);

			// 將學生資料顯示在到視窗
			this.txtrStudentData.setText(this.sList.toString());
		} catch (IllegalChineseScoreException e) {
			//this.showMessage(e.getMessage());
			this.showMessage("國文", strChinese);
		} catch (IllegalEnglishScoreException e) {
			//this.showMessage(e.getMessage());
			this.showMessage("英文", strEnglish);
		} catch (IllegalMathScoreException e) {
			//this.showMessage(e.getMessage());
			this.showMessage("數字", strMath);
		}
	}

	protected void showMessage(String strMessage) {
		JOptionPane.showMessageDialog(this.frmStudenDB, strMessage, "成績錯誤", JOptionPane.ERROR_MESSAGE);
	}

	protected void showMessage(String str, String message) {
		String strMessage = str + "成績輸入錯誤，您輸入成：" + message;
		JOptionPane.showMessageDialog(this.frmStudenDB, strMessage, str + "成績錯誤", JOptionPane.ERROR_MESSAGE);
	}
}
