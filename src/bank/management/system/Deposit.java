
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
public class Deposit extends JFrame implements ActionListener{
    JTextField depositField;
    JButton deposit,back;
    String pinnumber;
    Deposit(String pinnumber){
        this.pinnumber = pinnumber;
        setTitle("Deposit Page");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel atmImage = new JLabel(i3);
        atmImage.setBounds(0,0,900,900);
        add(atmImage);
        
        JLabel heading = new JLabel("Please enter the amount");
        heading.setBounds(140,280,400,40);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Oswald",Font.BOLD,20));
        atmImage.add(heading);
        
        depositField = new JTextField();
        depositField.setBounds(270,330,150,30);
        depositField.setForeground(Color.black);
        depositField.setFont(new Font("Oswald",Font.BOLD,15));
        atmImage.add(depositField);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(320,380,110,30);
        deposit.setForeground(Color.black);
        deposit.setFont(new Font("Oswald",Font.BOLD,15));
        deposit.addActionListener(this);
        atmImage.add(deposit);
        
        back = new JButton("Back");
        back.setBounds(120,380,110,30);
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
        else if(ae.getSource() == deposit){
            try{
            String amount = "" + depositField.getText();
            if(amount.equals("")){
                JOptionPane.showMessageDialog(null,"Please enter some amount");
            }else{
                Conn c = new Conn();
                Date date = new Date();
                String query = "insert into bank values ('"+pinnumber+"','"+date+"','deposit','"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs. " + amount + " deposited successfully");
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        }
        
    }
    
    public static void main(String[] args) {
        new Deposit("");
        
    }
}
