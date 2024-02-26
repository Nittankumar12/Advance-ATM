
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Transactions extends JFrame implements ActionListener {
    JButton deposit, cashWithdrawl,fastCash,balanceEnquiry,pinChange,miniStatement,exit;
    String pinnumber;
    Transactions(String pinnumber){
        this.pinnumber = pinnumber;
        setTitle("Please find services");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel atmImage = new JLabel(i3);
        atmImage.setBounds(0,0,900,900);
        add(atmImage);
        
        JLabel heading = new JLabel("Please select your Transaction");
        heading.setBounds(160,280,300,40);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Oswald",Font.BOLD,20));
        atmImage.add(heading);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(160,360,120,30);
        deposit.setForeground(Color.black);
        deposit.setFont(new Font("Oswald",Font.BOLD,15));
        deposit.addActionListener(this);
        atmImage.add(deposit);
        
        fastCash = new JButton("Fast Cash");
        fastCash.setBounds(160,410,120,30);
        fastCash.setForeground(Color.black);
        fastCash.setFont(new Font("Oswald",Font.BOLD,15));
        atmImage.add(fastCash);
        
        pinChange = new JButton("Pin Change");
        pinChange.setBounds(160,460,120,30);
        pinChange.setForeground(Color.black);
        pinChange.setFont(new Font("Oswald",Font.BOLD,15));
        atmImage.add(pinChange);
        
        cashWithdrawl = new JButton("Cash Withdrawl");
        cashWithdrawl.setBounds(360,360,150,30);
        cashWithdrawl.setForeground(Color.black);
        cashWithdrawl.setFont(new Font("Oswald",Font.BOLD,15));
        cashWithdrawl.addActionListener(this);
        atmImage.add(cashWithdrawl);
        
        miniStatement = new JButton("Mini Statement");
        miniStatement.setBounds(360,410,150,30);
        miniStatement.setForeground(Color.black);
        miniStatement.setFont(new Font("Oswald",Font.BOLD,15));
        atmImage.add(miniStatement);
        
        balanceEnquiry = new JButton("Check Balance");
        balanceEnquiry.setBounds(360,460,150,30);
        balanceEnquiry.setForeground(Color.black);
        balanceEnquiry.setFont(new Font("Oswald",Font.BOLD,15));
        balanceEnquiry.addActionListener(this);
        atmImage.add(balanceEnquiry);
        
        exit = new JButton("Exit");
        exit.setBounds(420,500,70,20);
        exit.setForeground(Color.black);
        exit.setFont(new Font("Oswald",Font.BOLD,12));
        exit.addActionListener(this);
        atmImage.add(exit);
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == exit){
            System.exit(0);
        }
        else if(ae.getSource() == deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }
        else if(ae.getSource() == cashWithdrawl){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }else if(ae.getSource() == balanceEnquiry){
            setVisible(false);
            new CheckBalance(pinnumber).setVisible(true);
        }
    }
    
    public static void main(String[] args) {
        new Transactions("");
    }
}
