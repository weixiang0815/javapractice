package genedu.java.studentdatabase;
import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JSeparator;
/**
 * 學生資料庫視窗應用程式
 * 
 * v1.0.0 可新增學生資料，並且加入例外處理機制
 * v1.1.0 新增選單欄，新增關於視窗
 * @author kChen
 * @version 1.0.0 可新增學生資料，並且加入例外處理機制
 * @version 1.1.0 新增選單欄，新增關於視窗
 */
public class WinStudentDB {

	private StudentList sList;
	private String project_name = "學生資料庫";
	private String version = "v1.1";
	private WinAbout dlgAbout;
	
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
		
		this.frmStudenDB.setTitle(this.project_name+" "+this.version);
		this.dlgAbout = new WinAbout();
		
		this.sList = new StudentList();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudenDB = new JFrame();
		frmStudenDB.setResizable(false);
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
		btnAddStudent.setBounds(359, 140, 85, 34);
		frmStudenDB.getContentPane().add(btnAddStudent);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(9, 190, 435, 198);
		frmStudenDB.getContentPane().add(scrollPane);

		txtrStudentData = new JTextArea();
		txtrStudentData.setSize(440, 196);
		scrollPane.setViewportView(txtrStudentData);
		txtrStudentData.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		
		JMenuBar menuBar = new JMenuBar();
		frmStudenDB.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("檔案");
		menuBar.add(mnFile);
		
		JMenuItem mntmOpenFile = new JMenuItem("開啟檔案");
		mntmOpenFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		mnFile.add(mntmOpenFile);
		
		JMenuItem mntmSaveFile = new JMenuItem("儲存檔案");
		mntmSaveFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnFile.add(mntmSaveFile);
		
		JSeparator separator = new JSeparator();
		mnFile.add(separator);
		
		JMenuItem mntmExit = new JMenuItem("結束");
		mnFile.add(mntmExit);
		
		JMenu mnHelp = new JMenu("說明");
		menuBar.add(mnHelp);
		
		JMenuItem mntmAbout = new JMenuItem("關於");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mntmAbout_Click();
			}
		});
		mnHelp.add(mntmAbout);

	}

	/**
	 * 當 menu 的「說明」被按到時執行的程式
	 */
	protected void mntmAbout_Click() {
		
		//JOptionPane.showMessageDialog(frmStudenDB, this.project_name+" "+this.version+"\n學號：d96922030\n姓名：陳琨");
		this.dlgAbout.setVisible(true);
		
	}

	/**
	 * 當按下「新增」按鈕時執行的程式
	 */
	protected void btnAddStudent_Click() {
		// 取得視窗資料
		String strName = this.txtName.getText();
		String strChinese = this.txtChinese.getText();
		String strEnglish = this.txtEnglish.getText();
		String strMath = this.txtMath.getText();

		// 判斷輸入資料是否正確
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

		// 判斷輸入的資料是否為學生成績
		try {
			s = new Student(strName, iChinese, iEnglish, iMath);
			
			// 將學生資料加入至 StudentList
			this.sList.add(s);

			// 將學生資料顯示在到視窗
			this.txtrStudentData.setText(this.sList.toString());
			
			JOptionPane.showMessageDialog(frmStudenDB, "學生資料新增成功", "新增成功", JOptionPane.INFORMATION_MESSAGE);
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

	/**
	 * 顯示訊息窗
	 * @param course 課程名稱
	 * @param message 要顯示的訊息
	 */
	protected void showMessage(String course, String message) {
		String strMessage = course + "成績輸入錯誤，您輸入成：" + message;
		JOptionPane.showMessageDialog(this.frmStudenDB, strMessage, course + "成績錯誤", JOptionPane.ERROR_MESSAGE);
	}
}
