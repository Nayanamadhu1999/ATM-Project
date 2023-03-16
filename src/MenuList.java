import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuList implements ActionListener {
    JFrame frame = new JFrame(" Login Here..!");
    JButton DepositButtton = new JButton("DEPOSIT");
    JButton WithdrawButton = new JButton("WITHDRAW");
    JButton CheckingBalanceButton = new JButton("CHECKING BALANCE");
    JButton CheckingTransactionHistoryButton = new JButton("TRANSACTION");
    JButton FundTransfersWithinTheBank= new JButton("FUND TRANSFER");


    MenuList(){
        DepositButtton.setBounds(100, 150, 300, 70);
        DepositButtton.setFont(new Font("Times New Roman", Font.BOLD, 24));
        DepositButtton.setFocusable(false);
        DepositButtton.addActionListener(this);
        frame.add(DepositButtton);

        WithdrawButton.setBounds(100, 300, 300, 70);
        WithdrawButton.setFont(new Font("Times New Roman", Font.BOLD, 24));
        WithdrawButton.setFocusable(false);
        WithdrawButton.addActionListener(this);
        frame.add(WithdrawButton);

        CheckingBalanceButton.setBounds(100, 450, 300, 70);
        CheckingBalanceButton.setFont(new Font("Times New Roman", Font.BOLD, 24));
        CheckingBalanceButton.setFocusable(false);
        CheckingBalanceButton.addActionListener(this);
        frame.add(CheckingBalanceButton);

        CheckingTransactionHistoryButton.setBounds(600, 150, 300, 70);
        CheckingTransactionHistoryButton.setFont(new Font("Times New Roman", Font.BOLD, 24));
        CheckingTransactionHistoryButton.setFocusable(false);
        CheckingTransactionHistoryButton.addActionListener(this);
        frame.add(CheckingTransactionHistoryButton);

        FundTransfersWithinTheBank.setBounds(600, 300, 300, 70);
        FundTransfersWithinTheBank.setFont(new Font("Times New Roman", Font.BOLD, 24));
        FundTransfersWithinTheBank.setFocusable(false);
        FundTransfersWithinTheBank.addActionListener(this);
        frame.add(FundTransfersWithinTheBank);





        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.setLayout(null);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        MenuList menuList = new MenuList();
    }


}
