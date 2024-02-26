
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class CheckBalance extends JFrame implements ActionListener {
   String pinnumber;
   JButton back;
    CheckBalance(String pinnumber){
    this.pinnumber = pinnumber;
        setTitle("Deposit Page");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel atmImage = new JLabel(i3);
        atmImage.setBounds(0,0,900,900);
        add(atmImage);
        
        Conn c = new Conn();
        int balance = 0;
        try{
            ResultSet rs = c.s.executeQuery("select * from bank where pinnumber = '"+pinnumber+"'");
            while(rs.next()){
                if(rs.getString("type").equals("deposit")){
                balance += Integer.parseInt(rs.getString("amount"));
                
            }else if(rs.getString("type").equals("withdrawl")){
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        }    
        catch(Exception e){
            System.out.println(e);
        }
        
        JLabel heading = new JLabel("Your account Balance is: " + balance);
        heading.setBounds(100,280,400,40);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Oswald",Font.BOLD,20));
        atmImage.add(heading);
        
        back = new JButton("Back");
        back.setBounds(150,380,110,30);
        back.setForeground(Color.black);
        back.setFont(new Font("Oswald",Font.BOLD,15));
        back.addActionListener(this);
        atmImage.add(back);
        
        
        getContentPane().setBackground(new Color(162, 14, 55));
        setSize(800,800);
        setLocation(350,10);
        setVisible(true);
}
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == back){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
    public static void main(String[] args) {
        new CheckBalance("");
    }
}