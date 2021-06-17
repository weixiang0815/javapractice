import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class WinBMI {

	private JFrame frmBMI;
	private JTextField txtHeight;
	private JTextField txtWeight;
	private JTextField txtBMI;

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
		frmBMI.getContentPane().setBackground(new Color(240, 248, 255));
		frmBMI.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		frmBMI.setTitle("BMI計算機");
		frmBMI.setBounds(100, 100, 295, 262);
		frmBMI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBMI.getContentPane().setLayout(null);
		
		JLabel lblHeight = new JLabel("身高");
		lblHeight.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHeight.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblHeight.setBounds(18, 15, 51, 32);
		frmBMI.getContentPane().add(lblHeight);
		
		txtHeight = new JTextField();
		txtHeight.setBackground(new Color(173, 216, 230));
		txtHeight.setHorizontalAlignment(SwingConstants.RIGHT);
		txtHeight.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		txtHeight.setText("175");
		txtHeight.setBounds(80, 13, 132, 36);
		frmBMI.getContentPane().add(txtHeight);
		txtHeight.setColumns(10);
		
		JLabel lblCM = new JLabel("cm");
		lblCM.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblCM.setBounds(224, 14, 35, 35);
		frmBMI.getContentPane().add(lblCM);
		
		JLabel lblWeight = new JLabel("體重");
		lblWeight.setHorizontalAlignment(SwingConstants.RIGHT);
		lblWeight.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblWeight.setBounds(18, 64, 51, 32);
		frmBMI.getContentPane().add(lblWeight);
		
		txtWeight = new JTextField();
		txtWeight.setBackground(new Color(173, 216, 230));
		txtWeight.setText("85");
		txtWeight.setHorizontalAlignment(SwingConstants.RIGHT);
		txtWeight.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		txtWeight.setColumns(10);
		txtWeight.setBounds(80, 62, 132, 36);
		frmBMI.getContentPane().add(txtWeight);
		
		JLabel lblKG = new JLabel("kg");
		lblKG.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblKG.setBounds(224, 63, 35, 35);
		frmBMI.getContentPane().add(lblKG);
		
		JLabel lblBMI = new JLabel("BMI值");
		lblBMI.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBMI.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblBMI.setBounds(7, 113, 62, 32);
		frmBMI.getContentPane().add(lblBMI);
		
		txtBMI = new JTextField();
		txtBMI.setEditable(false);
		txtBMI.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBMI.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		txtBMI.setColumns(10);
		txtBMI.setBounds(80, 111, 132, 36);
		frmBMI.getContentPane().add(txtBMI);
		
		JButton btnCalc = new JButton("計算");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalc_Click();
			}
		});
		btnCalc.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		btnCalc.setBounds(25, 163, 103, 41);
		frmBMI.getContentPane().add(btnCalc);
		
		JButton btnReset = new JButton("重設");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnReset_Click();
			}
		});
		btnReset.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		btnReset.setBounds(153, 163, 103, 41);
		frmBMI.getContentPane().add(btnReset);
	}

	/**
	 * 當重設按鈕被按到時執行
	 */
	protected void btnReset_Click() {
		this.txtHeight.setText("");
		this.txtWeight.setText("");
		this.txtBMI.setText("");
	}

	/**
	 * 當計算按鈕被按到時執行
	 */
	protected void btnCalc_Click() {
		//取得視窗的資料
		String strHeight=this.txtHeight.getText();
		String strWeight=this.txtWeight.getText();
		
		//文字轉數字
		double dHeight=Double.parseDouble(strHeight);
		double dWeight=Double.parseDouble(strWeight);
		
		//計算BMI
		double dBMI=MyMath.calcBMI(dHeight, dWeight);
		
		//小數點第四位做四捨五入
		dBMI=Math.floor(dBMI*10000+0.5)/10000;
		
		
		//將計算結果顯示在視窗上
		this.txtBMI.setText(String.valueOf(dBMI));
		//this.textBMI.setText(dBMI+"");
	}
}
