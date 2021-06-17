import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import exception.IllegalCode;
import exception.IllegalDate;
import exception.IllegalFee;
import exception.IllegalNumber;
import exception.IllegalPrice;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

/**
 * 
 * @author HenryWang
 * @version 1.0.0
 *
 */

public class Trading_Records {

	private String version = "v1.0.0";
	private String project_name = "奔向財務自由股票交易紀錄";
	private TradingRecordList trList;
	private About dlgAbout;
	

	/**
	 * WindowBuilder自動產生
	 */
	private JFrame frmMain;
	private JTextField textName;
	private JTextField textDate;
	private JTextField textNumber;
	private JTextField textCode;
	private JTextField textPrice;
	private JTextField textHandlingFee;
	private JTextField textTotalCost;
	private JTextArea txtTradingRecords;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Trading_Records window = new Trading_Records();
					window.frmMain.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Trading_Records() {
		initialize();
		
		this.dlgAbout = new About();
		
		frmMain.setTitle(this.project_name+" "+this.version);
		frmMain.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 220, 666, 210);
		frmMain.getContentPane().add(scrollPane);
		
		txtTradingRecords = new JTextArea();
		txtTradingRecords.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		scrollPane.setViewportView(txtTradingRecords);
		
		JPanel palInputStudentData = new JPanel();
		palInputStudentData.setLayout(null);
		palInputStudentData.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		palInputStudentData.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u8F38\u5165\u8CC7\u6599", TitledBorder.LEADING, TitledBorder.TOP, null, Color.DARK_GRAY));
		palInputStudentData.setBounds(10, 10, 666, 164);
		frmMain.getContentPane().add(palInputStudentData);
		
		JLabel lblName = new JLabel("股票名字");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		lblName.setBounds(22, 22, 72, 26);
		palInputStudentData.add(lblName);
		
		textName = new JTextField();
		textName.setHorizontalAlignment(SwingConstants.RIGHT);
		textName.setText("館長健身房");
		textName.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		textName.setColumns(10);
		textName.setBounds(104, 22, 96, 26);
		palInputStudentData.add(textName);
		
		JLabel lblDate = new JLabel("購買日期");
		lblDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDate.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		lblDate.setBounds(8, 67, 86, 26);
		palInputStudentData.add(lblDate);
		
		textDate = new JTextField();
		textDate.setText("YYYY/MM/DD");
		textDate.setHorizontalAlignment(SwingConstants.RIGHT);
		textDate.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		textDate.setColumns(10);
		textDate.setBounds(104, 67, 96, 26);
		palInputStudentData.add(textDate);
		
		JLabel lblCode = new JLabel("股票代號");
		lblCode.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCode.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		lblCode.setBounds(210, 22, 86, 26);
		palInputStudentData.add(lblCode);
		
		JLabel lblNumber = new JLabel("購買股數");
		lblNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumber.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		lblNumber.setBounds(8, 113, 86, 26);
		palInputStudentData.add(lblNumber);
		
		textNumber = new JTextField();
		textNumber.setText("999");
		textNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		textNumber.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		textNumber.setColumns(10);
		textNumber.setBounds(104, 113, 96, 26);
		palInputStudentData.add(textNumber);
		
		JLabel lblPrice = new JLabel("購買價格");
		lblPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrice.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		lblPrice.setBounds(210, 67, 86, 26);
		palInputStudentData.add(lblPrice);
		
		JLabel lblHandlingFee = new JLabel("手續費");
		lblHandlingFee.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHandlingFee.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		lblHandlingFee.setBounds(210, 113, 86, 26);
		palInputStudentData.add(lblHandlingFee);
		
		textCode = new JTextField();
		textCode.setHorizontalAlignment(SwingConstants.RIGHT);
		textCode.setText("1234");
		textCode.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		textCode.setColumns(10);
		textCode.setBounds(306, 22, 96, 26);
		palInputStudentData.add(textCode);
		
		textPrice = new JTextField();
		textPrice.setText("999.99");
		textPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		textPrice.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		textPrice.setColumns(10);
		textPrice.setBounds(306, 67, 96, 26);
		palInputStudentData.add(textPrice);
		
		textHandlingFee = new JTextField();
		textHandlingFee.setText("1");
		textHandlingFee.setHorizontalAlignment(SwingConstants.RIGHT);
		textHandlingFee.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		textHandlingFee.setColumns(10);
		textHandlingFee.setBounds(306, 113, 96, 26);
		palInputStudentData.add(textHandlingFee);
		
		JLabel lblTotalCost = new JLabel("購買總成本");
		lblTotalCost.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalCost.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		lblTotalCost.setBounds(442, 22, 96, 26);
		palInputStudentData.add(lblTotalCost);
		
		textTotalCost = new JTextField();
		textTotalCost.setEditable(false);
		textTotalCost.setHorizontalAlignment(SwingConstants.RIGHT);
		textTotalCost.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		textTotalCost.setColumns(10);
		textTotalCost.setBounds(548, 22, 96, 26);
		palInputStudentData.add(textTotalCost);
		
		JButton btnReset = new JButton("重新輸入");
		btnReset.setBounds(548, 113, 96, 26);
		palInputStudentData.add(btnReset);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnReset_Click();
			}
		});
		btnReset.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		
		JButton btnCalculate = new JButton("試算總成本");
		btnCalculate.setBounds(548, 67, 96, 26);
		palInputStudentData.add(btnCalculate);
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalculate_Click();
			}
		});
		btnCalculate.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		
		JButton btnAdd = new JButton("新增紀錄");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAdd_Click();
			}
		});
		btnAdd.setBounds(580, 184, 96, 26);
		frmMain.getContentPane().add(btnAdd);
		btnAdd.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		this.trList = new TradingRecordList();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMain = new JFrame();
		frmMain.setBackground(new Color(255, 0, 0));
		frmMain.setForeground(new Color(255, 0, 0));
		frmMain.setResizable(false);
		frmMain.setBounds(100, 100, 700, 500);
		frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//在視窗標題加版本
		setVersion();
		
		JMenuBar menuBar = new JMenuBar();
		frmMain.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("檔案");
		mnFile.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("離開程式");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mntmExit_Click();
			}
		});
		mntmExit.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		mnFile.add(mntmExit);
		
		JMenu mnHelp = new JMenu("說明");
		mnHelp.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		menuBar.add(mnHelp);
		
		JMenuItem mntmAbout = new JMenuItem("關於");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mntmAbout_Click();
			}
		});
		mntmAbout.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		mnHelp.add(mntmAbout);
	}

	protected void btnCalculate_Click() {
		
		String price = this.textPrice.getText();
		String number = this.textNumber.getText();
		String fee = this.textHandlingFee.getText();
		
		double dprice = Double.parseDouble(price);
		int inumber = Integer.parseInt(number);
		int ifee;
		if(fee=="") {
			ifee=0;
		}
		else {
			ifee=Integer.parseInt(fee);
		}
		
		int cost = (int)TradingRecord.costCalc(dprice,inumber,ifee);
		
		this.textTotalCost.setText(String.valueOf(cost));
	}
	
	protected void mntmAbout_Click() {
		this.dlgAbout.setVisible(true);
		
	}

	private void setVersion() {
		this.frmMain.setTitle(this.frmMain.getTitle()+" "+this.version);
		
	}

	protected void mntmExit_Click() {
		this.frmMain.dispose();
		
	}
	
	protected void btnReset_Click() {
		this.textCode.setText(null);
		this.textDate.setText(null);
		this.textHandlingFee.setText(null);
		this.textName.setText(null);
		this.textNumber.setText(null);
		this.textPrice.setText(null);
		this.textTotalCost.setText(null);
		
	}

	protected void btnAdd_Click() {
		String strName = this.textName.getText();
		String strCode = this.textCode.getText();
		String strDate = this.textDate.getText();
		String strPrice = this.textPrice.getText();
		String strNumber = this.textNumber.getText();
		String strFee = this.textHandlingFee.getText();
		
		double dPrice = 0;
		int iNumber = 0;
		int iFee = 0;
		
		boolean isPrice = false;
		boolean isNumber = false;
		boolean isFee = false;
		
		try {
			dPrice=Double.parseDouble(strPrice);
		}catch(NumberFormatException e){
			isPrice=true;
		}
		
		try {
			iNumber=Integer.parseInt(strNumber);
		}catch(NumberFormatException e) {
			isNumber=true;
		}
		
		try {
			iFee=Integer.parseInt(strFee);
		}catch(NumberFormatException e) {
			isFee=true;
		}
		
		if(isPrice||isNumber||isFee) {
			if(isPrice) {
				this.showMessage("購買價格",strPrice);
			}
			if(isNumber) {
				this.showMessage("購買股數",strNumber);
			}
			if(isFee) {
				this.showMessage("手續費",strFee);
			}
			return;
		}
		
		TradingRecord tr = null;
		
		try {
			tr=new TradingRecord(strName,strCode,strDate,iNumber,dPrice,iFee);
			this.trList.add(tr);
			this.txtTradingRecords.setText(this.trList.toString());
			JOptionPane.showMessageDialog(this.frmMain, "交易紀錄新增成功", "新增成功", JOptionPane.INFORMATION_MESSAGE);
		}catch(IllegalCode e){
			this.showMessage("股票代號",strCode);
		}catch(IllegalDate e){
			this.showMessage("購買日期",strDate);
		}catch(IllegalFee e){
			this.showMessage("手續費",strFee);
		}catch(IllegalNumber e){
			this.showMessage("購買股數",strNumber);
		}catch(IllegalPrice e){
			this.showMessage("購買價格",strPrice);
		}
	}

	protected void showMessage(String strMessage) {
		JOptionPane.showMessageDialog(this.frmMain, strMessage, "輸入錯誤", JOptionPane.ERROR_MESSAGE);
		
	}
	
	protected void showMessage(String str, String message) {
		String strMessage = str + "輸入錯誤，您輸入成：" + message;
		JOptionPane.showMessageDialog(this.frmMain, strMessage, str + "輸入錯誤", JOptionPane.ERROR_MESSAGE);
		
	}
}
