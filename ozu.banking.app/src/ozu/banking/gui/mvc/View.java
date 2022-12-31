package ozu.banking.gui.mvc;



import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class View extends JFrame{
	private Container c;
	private JLabel title;
	private JLabel lblName;
	private JTextField txtName;
	
	private JLabel lblBalance;
	private JTextField txtBalance;
	private JLabel lblTrxAmount;
	private JTextField txtTrxAmount;
	

	private JButton btnCreate;
	private JButton btnPost;
	private JButton btnClear;
	private JTextArea txtLog;
	private JLabel lblResponse;
	private JComboBox<String> comboTrxType;
	private JLabel lblTrxInfo;
	
	public View() {
		setTitle("Account Form");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		c = getContentPane();
		c.setLayout(null);

		title = new JLabel("Bank Account Form");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setLocation(300, 30);
		c.add(title);

		lblName = new JLabel("Owner");
		lblName.setFont(new Font("Arial", Font.PLAIN, 20));
		lblName.setSize(100, 20);
		lblName.setLocation(100, 100);
		c.add(lblName);

		txtName = new JTextField();
		txtName.setFont(new Font("Arial", Font.PLAIN, 15));
		txtName.setSize(190, 20);
		txtName.setLocation(200, 100);
		c.add(txtName);

		lblBalance = new JLabel("Balance");
		lblBalance.setFont(new Font("Arial", Font.PLAIN, 20));
		lblBalance.setSize(100, 20);
		lblBalance.setLocation(100, 148);
		c.add(lblBalance);

		txtBalance = new JTextField();
		txtBalance.setFont(new Font("Arial", Font.PLAIN, 15));
		txtBalance.setSize(150, 20);
		txtBalance.setLocation(200, 150);
		c.add(txtBalance);

		btnCreate = new JButton("Create");
		btnCreate.setFont(new Font("Arial", Font.PLAIN, 15));
		btnCreate.setSize(100, 20);
		btnCreate.setLocation(172, 200);
		//btnCreate.addActionListener(new CreateButtonActionLister());
		c.add(btnCreate);

		btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Arial", Font.PLAIN, 15));
		btnClear.setSize(100, 20);
		btnClear.setLocation(290, 200);
//		btnClear.addActionListener(this);
		c.add(btnClear);
		
		comboTrxType=new JComboBox<String>();
		comboTrxType.addItem("Deposit");
		comboTrxType.addItem("Withdraw");
		comboTrxType.setLocation(270, 262);
		comboTrxType.setFont(new Font("Arial", Font.PLAIN, 15));
		comboTrxType.setSize(100, 20);
		c.add(comboTrxType);
		
		
		lblTrxAmount = new JLabel("Transaction Amount");
		lblTrxAmount.setFont(new Font("Arial", Font.PLAIN, 20));
		lblTrxAmount.setSize(250, 20);
		lblTrxAmount.setLocation(100, 231);
		c.add(lblTrxAmount);

		txtTrxAmount = new JTextField();
		txtTrxAmount.setFont(new Font("Arial", Font.PLAIN, 15));
		txtTrxAmount.setSize(150, 20);
		txtTrxAmount.setLocation(110, 262);
		c.add(txtTrxAmount);
		
		btnPost = new JButton("Post");
		btnPost.setFont(new Font("Arial", Font.PLAIN, 15));
		btnPost.setSize(100, 20);
		btnPost.setLocation(390, 262);
//		btnPost.addActionListener(this);
		c.add(btnPost);

		txtLog = new JTextArea();
		txtLog.setFont(new Font("Arial", Font.PLAIN, 15));
		txtLog.setSize(300, 400);
		txtLog.setLocation(500, 100);
		txtLog.setLineWrap(true);
		txtLog.setEditable(false);
		c.add(txtLog);

		lblResponse = new JLabel("");
		lblResponse.setFont(new Font("Arial", Font.PLAIN, 20));
		lblResponse.setSize(500, 25);
		lblResponse.setLocation(100, 500);
		c.add(lblResponse);
		
		lblTrxInfo = new JLabel(".....");
		lblTrxInfo.setBounds(100, 308, 184, 30);
		c.add(lblTrxInfo);
		setVisible(true);
	}


	public JButton getBtnCreate() {
		return btnCreate;
	}


	public void setBtnCreate(JButton btnCreate) {
		this.btnCreate = btnCreate;
	}


	public JTextField getTxtName() {
		return txtName;
	}


	public JTextField getTxtBalance() {
		return txtBalance;
	}


	public void setTxtBalance(JTextField txtBalance) {
		this.txtBalance = txtBalance;
	}


	public Container getC() {
		return c;
	}


	public void setC(Container c) {
		this.c = c;
	}


	


	

	public JLabel getLblName() {
		return lblName;
	}


	public void setLblName(JLabel lblName) {
		this.lblName = lblName;
	}


	public JLabel getLblBalance() {
		return lblBalance;
	}


	public void setLblBalance(JLabel lblBalance) {
		this.lblBalance = lblBalance;
	}


	public JLabel getLblTrxAmount() {
		return lblTrxAmount;
	}


	public void setLblTrxAmount(JLabel lblTrxAmount) {
		this.lblTrxAmount = lblTrxAmount;
	}


	public JTextField getTxtTrxAmount() {
		return txtTrxAmount;
	}


	public void setTxtTrxAmount(JTextField txtTrxAmount) {
		this.txtTrxAmount = txtTrxAmount;
	}


	public JButton getBtnPost() {
		return btnPost;
	}


	public void setBtnPost(JButton btnPost) {
		this.btnPost = btnPost;
	}


	public JButton getBtnClear() {
		return btnClear;
	}


	public void setBtnClear(JButton btnClear) {
		this.btnClear = btnClear;
	}


	public JTextArea getTxtLog() {
		return txtLog;
	}


	public void setTxtLog(JTextArea txtLog) {
		this.txtLog = txtLog;
	}


	public JLabel getLblResponse() {
		return lblResponse;
	}


	public void setLblResponse(JLabel lblResponse) {
		this.lblResponse = lblResponse;
	}


	public JComboBox<String> getComboTrxType() {
		return comboTrxType;
	}


	public void setComboTrxType(JComboBox<String> comboTrxType) {
		this.comboTrxType = comboTrxType;
	}


	public void setTxtName(JTextField txtName) {
		this.txtName = txtName;
	}


	public JLabel getLblTrxInfo() {
		return lblTrxInfo;
	}


	public void setLblTrxInfo(JLabel lblTrxInfo) {
		this.lblTrxInfo = lblTrxInfo;
	}


	

	



	
	

	

	

	
}
