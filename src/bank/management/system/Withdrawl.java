
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
public class Withdrawl extends JFrame implements ActionListener{
    JTextField withdrawlField;
    JButton withdrawl,back;
    String pinnumber;
    Withdrawl(String pinnumber){
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
        
        withdrawlField = new JTextField();
        withdrawlField.setBounds(270,330,150,30);
        withdrawlField.setForeground(Color.black);
        withdrawlField.setFont(new Font("Oswald",Font.BOLD,15));
        atmImage.add(withdrawlField);
        
        withdrawl = new JButton("Withdraw");
        withdrawl.setBounds(320,380,110,30);
        withdrawl.setForeground(Color.black);
        withdrawl.setFont(new Font("Oswald",Font.BOLD,15));
        withdrawl.addActionListener(this);
        atmImage.add(withdrawl);
        
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
        else if(ae.getSource() == withdrawl){
            try{
            String amount = "" + withdrawlField.getText();
            if(amount.equals("")){
                JOptionPane.showMessageDialog(null,"Please enter some amount");
            }else{
                Conn c = new Conn();
                Date date = new Date();
                String query = "insert into bank values ('"+pinnumber+"','"+date+"','withdrawl','"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs. " + amount + " withdrawl successfully");
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
        new Withdrawl("");
        
    }
}
