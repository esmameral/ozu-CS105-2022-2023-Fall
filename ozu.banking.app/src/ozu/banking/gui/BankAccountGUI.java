package ozu.banking.gui;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import ozu.banking.model.BankAccount;
import ozu.banking.model.DepositTransaction;
import ozu.banking.model.Transaction;
import ozu.banking.model.WithdrawTransaction;

public class BankAccountGUI extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
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
	
	private BankAccount account;

	public BankAccountGUI() {
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
		btnCreate.addActionListener(this);
		c.add(btnCreate);

		btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Arial", Font.PLAIN, 15));
		btnClear.setSize(100, 20);
		btnClear.setLocation(290, 200);
		btnClear.addActionListener(this);
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
		btnPost.addActionListener(this);
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
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		lblResponse.setText("");
		if (e.getSource() == btnCreate) {
			account=new BankAccount(txtName.getText());
			try {
				account.increaseBalance(Double.parseDouble(txtBalance.getText()));
				System.out.println(account);
				txtLog.setText(account.toString());
				lblResponse.setText("Account created successfully..");
			}catch(Exception exception) {
				lblResponse.setText("Please enter a valid double value!!");
			}
	
		}
		else if (e.getSource() == btnPost) {
			Transaction trx;
			try {
				if(comboTrxType.getSelectedItem().equals("Withdraw")){
					trx=new WithdrawTransaction(Double.parseDouble(txtTrxAmount.getText()));

				}else {
					trx=new DepositTransaction(Double.parseDouble(txtTrxAmount.getText()));

				}
				
				account.post(trx);
				txtLog.setText(txtLog.getText()+"\n"+account.toString());
			} catch (Exception e1) {
				lblResponse.setText("Please enter a valid positive double value!!");
				e1.printStackTrace();
			} 
			
		}
		else if (e.getSource() == btnClear) {
			String def = "";
			txtName.setText(def);
			txtBalance.setText(def);
			lblResponse.setText(def);
			txtLog.setText(def);

		}

	}

	public static void main(String[] args) throws Exception {
		new BankAccountGUI();
	}
}
