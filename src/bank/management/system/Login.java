package bank.management.system;
import javax.swing.*;
import java.awt.*;
//import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.border.LineBorder;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    JButton loginButton,clearButton,signupButton;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login(){
        
        setTitle("ATM");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));

        Image i2  = i1.getImage().getScaledInstance(180,180,Image.SCALE_DEFAULT);
//        i2.setBackground(Color.white);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel label = new JLabel(i3);
        label.setBounds(30,30,200,200);
        label.setForeground(new Color(162, 14, 55));
        add(label);
        
        getContentPane().setBackground(new Color(162, 14, 55));
        
        JLabel text = new JLabel("Welcome to PNB ATM");
        text.setBounds(250,40,400,40);
        text.setFont(new Font("Serif",Font.BOLD,36));
        text.setForeground(new Color(251, 188, 9));
        add(text);
        
        JLabel cardno = new JLabel("Card No");
        cardno.setBounds(250,150,400,40);
        cardno.setFont(new Font("Serif",Font.BOLD,30));
        cardno.setForeground(new Color(251, 188, 9));
        add(cardno);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(370,150,250,40);
        cardTextField.setBorder(new LineBorder(new Color(251, 188, 9),2));
        cardTextField.setFont(new Font("Ariel",Font.PLAIN,24));
        add(cardTextField);
        
        JLabel pin = new JLabel("PIN");
        pin.setBounds(250,200,400,40);
        pin.setFont(new Font("Serif",Font.BOLD,30));
        pin.setForeground(new Color(251, 188, 9));
        
        add(pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(370,200,250,40);
        pinTextField.setBorder(new LineBorder(new Color(251, 188, 9),2));
        pinTextField.setFont(new Font("Ariel",Font.PLAIN,24));
        add(pinTextField);
        
        loginButton = new JButton("Sign in");
        loginButton.setFont(new Font("Serif",Font.BOLD,18));
        loginButton.setBackground(Color.black);
        loginButton.setForeground(new Color(251, 188, 9));
        loginButton.setBounds(600,300,100,40);
        loginButton.addActionListener(this);
        add(loginButton);
        
        clearButton = new JButton("Clear");
        clearButton.setFont(new Font("Serif",Font.BOLD,18));
        clearButton.setBackground(Color.black);
        clearButton.setForeground(new Color(251, 188, 9));
        clearButton.setBounds(240,300,100,40);
        clearButton.addActionListener(this);
        add(clearButton);
        
        signupButton = new JButton("Sign up");
        signupButton.setFont(new Font("Serif",Font.BOLD,18));
        signupButton.setBackground(Color.black);
        signupButton.setForeground(new Color(251, 188, 9));
        signupButton.setBounds(410,300,100,40);
        signupButton.addActionListener(this);
        add(signupButton);

        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clearButton){
            cardTextField.setText("");
            pinTextField.setText("");
        }else if(ae.getSource() == signupButton){
            setVisible(false);
            new signupOne().setVisible(true);
        }else if(ae.getSource() == loginButton){
            Conn c = new Conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "select * from loginData where cardnumber = '"+cardnumber+"' and pinnumber = '"+pinnumber+"'";
            try{
                ResultSet rs =  c.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN Number");
                }
                
            }
            catch(Exception e){
                System.out.println(e);
                
            }
                    
               
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}