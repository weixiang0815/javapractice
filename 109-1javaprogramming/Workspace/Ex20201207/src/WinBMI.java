import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WinBMI {

	private JFrame frmBMI;
	private JTextField textHeight;
	private JTextField textWeight;
	private JTextField textBMI;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WinBMI window = new WinBMI();
					window.frmBMI.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WinBMI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBMI = new JFrame();
		frmBMI.setResizable(false);
		frmBMI.getContentPane().setBackground(new Color(0, 255, 255));
		frmBMI.getContentPane().setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		frmBMI.setTitle("BMI計算機");
		frmBMI.setBounds(100, 100, 368, 274);
		frmBMI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBMI.getContentPane().setLayout(null);
		
		JLabel lblHeight = new JLabel("身高");
		lblHeight.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHeight.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblHeight.setBounds(53, 35, 62, 31);
		frmBMI.getContentPane().add(lblHeight);
		
		textHeight = new JTextField();
		textHeight.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		textHeight.setHorizontalAlignment(SwingConstants.RIGHT);
		textHeight.setBounds(125, 35, 118, 31);
		frmBMI.getContentPane().add(textHeight);
		textHeight.setColumns(10);
		
		JLabel lblCM = new JLabel("cm");
		lblCM.setHorizontalAlignment(SwingConstants.LEFT);
		lblCM.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblCM.setBounds(253, 35, 62, 31);
		frmBMI.getContentPane().add(lblCM);
		
		JLabel lblWeight = new JLabel("體重");
		lblWeight.setHorizontalAlignment(SwingConstants.RIGHT);
		lblWeight.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblWeight.setBounds(53, 76, 62, 25);
		frmBMI.getContentPane().add(lblWeight);
		
		textWeight = new JTextField();
		textWeight.setHorizontalAlignment(SwingConstants.RIGHT);
		textWeight.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		textWeight.setColumns(10);
		textWeight.setBounds(125, 73, 118, 31);
		frmBMI.getContentPane().add(textWeight);
		
		JLabel lblKG = new JLabel("kg");
		lblKG.setHorizontalAlignment(SwingConstants.LEFT);
		lblKG.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblKG.setBounds(253, 76, 62, 25);
		frmBMI.getContentPane().add(lblKG);
		
		JLabel lblBMI = new JLabel("BMI值");
		lblBMI.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBMI.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblBMI.setBounds(39, 111, 76, 31);
		frmBMI.getContentPane().add(lblBMI);
		
		textBMI = new JTextField();
		textBMI.setEditable(false);
		textBMI.setHorizontalAlignment(SwingConstants.RIGHT);
		textBMI.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		textBMI.setColumns(10);
		textBMI.setBounds(125, 111, 118, 31);
		frmBMI.getContentPane().add(textBMI);
		
		JButton btnCalc = new JButton("計算");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalc_Click();
			}
		});
		btnCalc.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		btnCalc.setBounds(51, 167, 124, 40);
		frmBMI.getContentPane().add(btnCalc);
		
		JButton btnClear = new JButton("重設");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnReset_Click();
			}
		});
		btnClear.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		btnClear.setBounds(188, 167, 124, 40);
		frmBMI.getContentPane().add(btnClear);
	}
	
	/**
	 * 當計算按鈕被按到時執行
	 */
	protected void btnCalc_Click() {
		//取得視窗的資料
		String strHeight=this.textHeight.getText();
		String strWeight=this.textWeight.getText();
		
		//文字轉數字
		double dHeight=Double.parseDouble(strHeight);
		double dWeight=Double.parseDouble(strWeight);
		
		//計算BMI
		double dBMI=MyMath.calcBMI(dHeight, dWeight);
		
		//小數點第四位做四捨五入
		dBMI=Math.floor(dBMI*10000+0.5)/10000;
		
		
		//將計算結果顯示在視窗上
		this.textBMI.setText(String.valueOf(dBMI));
		//this.textBMI.setText(dBMI+"");
	}

	/**
	 * 當重設按鈕被按到時執行
	 */
	protected void btnReset_Click() {
		this.textHeight.setText("");
		this.textWeight.setText("");
		this.textBMI.setText("");
	}
}
