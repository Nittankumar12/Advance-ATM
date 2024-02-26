package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class signupThree extends JFrame implements ActionListener{
    
    JRadioButton m1,m2,m3,m4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit;
    String formno;
    signupThree(String formno){
        this.formno = formno;
        setLayout(null);
        setTitle("New Account Details");
        JLabel page3 = new JLabel("Account Details");
        page3.setBounds(270,70,400,50);
        page3.setFont(new Font("Serif",Font.PLAIN,30));
        page3.setForeground(new Color(251, 188, 9));
        add(page3);
        
        JLabel accountType = new JLabel("Account Type");
        accountType.setBounds(50,160,200,40);
        accountType.setFont(new Font("Serif",Font.PLAIN,25));
        accountType.setForeground(new Color(251, 188, 9));
        add(accountType);
        
        m1=new JRadioButton("Savings Account");    
        m2=new JRadioButton("Current Account");  
        m3 = new JRadioButton("Fixed Deposit Account");
        m4 = new JRadioButton("Other");
        m1.setBounds(230,140,200,40);  
        m1.setFont(new Font("Serif",Font.PLAIN,20));
        m1.setForeground(Color.BLACK);
        m1.setBackground(new Color(162, 14, 55));
        m1.setBorder(new LineBorder(new Color(162, 14, 55),0));
        m2.setBounds(230,200,200,40);  
        m2.setFont(new Font("Serif",Font.PLAIN,20));
        m2.setForeground(Color.BLACK);
        m2.setBackground(new Color(162, 14, 55));
        m2.setBorder(new LineBorder(new Color(162, 14, 55),0));
        m3.setBounds(450,140,200,40);
        m3.setFont(new Font("Serif",Font.PLAIN,20));
        m3.setForeground(Color.BLACK);
        m3.setBackground(new Color(162, 14, 55));
        m3.setBorder(new LineBorder(new Color(162, 14, 55),0));
        m4.setBounds(450,200,100,40);
        m4.setFont(new Font("Serif",Font.PLAIN,20));
        m4.setForeground(Color.BLACK);
        m4.setBackground(new Color(162, 14, 55));
        m4.setBorder(new LineBorder(new Color(162, 14, 55),0));
        ButtonGroup bg2=new ButtonGroup();    
        bg2.add(m1);
        bg2.add(m2);
        bg2.add(m3);
        bg2.add(m4);
        add(m1);
        add(m2);
        add(m3);
        add(m4);
        
        JLabel cardno = new JLabel("Card Number");
        cardno.setBounds(50,260,200,40);
        cardno.setFont(new Font("Serif",Font.PLAIN,25));
        cardno.setForeground(new Color(251, 188, 9));
        add(cardno);
        
        JTextField cardnoField = new JTextField("XXXX-XXXX-XXXX-XXXX");
        cardnoField.setBounds(230,260,250,40);
        cardnoField.setFont(new Font("Serif",Font.PLAIN,20));
        cardnoField.setForeground(Color.black);
        cardnoField.setBackground(new Color(162, 14, 55));
        cardnoField.setBorder(new LineBorder(new Color(251, 188, 9),1));
        add(cardnoField);
        
        JLabel cardDetails = new JLabel("Your 16-digit card number will be displayed after submission of form");
        cardDetails.setBounds(50,300,700,40);
        cardDetails.setFont(new Font("Serif",Font.BOLD,14));
        cardDetails.setForeground(Color.white);
        cardDetails.setBackground(new Color(162, 14, 55));
        add(cardDetails);
        
        JLabel pinno = new JLabel("PIN");
        pinno.setBounds(50,360,200,40);
        pinno.setFont(new Font("Serif",Font.PLAIN,25));
        pinno.setForeground(new Color(251, 188, 9));
        add(pinno);
        
        JTextField pinnoField = new JTextField("XXXX");
        pinnoField.setBounds(230,360,250,40);
        pinnoField.setFont(new Font("Serif",Font.PLAIN,20));
        pinnoField.setForeground(Color.black);
        pinnoField.setBackground(new Color(162, 14, 55));
        pinnoField.setBorder(new LineBorder(new Color(251, 188, 9),1));
        add(pinnoField);
        
        JLabel pinnoDetails = new JLabel("Your 4-digit PIN will be displayed after submission of form");
        pinnoDetails.setBounds(50,400,700,40);
        pinnoDetails.setFont(new Font("Serif",Font.BOLD,14));
        pinnoDetails.setForeground(Color.white);
        pinnoDetails.setBackground(new Color(162, 14, 55));
        add(pinnoDetails);
        
        JLabel services = new JLabel("Services Required");
        services.setBounds(50,460,200,40);
        services.setFont(new Font("Serif",Font.PLAIN,25));
        services.setForeground(new Color(251, 188, 9));
        add(services);
        
        c1 = new JCheckBox("ATM Card");
        c1.setBounds(100,500,200,40);
        c1.setFont(new Font("Serif",Font.PLAIN,17));
        c1.setForeground(Color.black);
        c1.setBackground(new Color(162, 14, 55));
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Serif",Font.PLAIN,17));
        c2.setBounds(400,500,200,40);
        c2.setForeground(Color.black);
        c2.setBackground(new Color(162, 14, 55));
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBounds(100,550,200,40);
        c3.setFont(new Font("Serif",Font.PLAIN,17));
        c3.setForeground(Color.black);
        c3.setBackground(new Color(162, 14, 55));
        add(c3);
        
        c4 = new JCheckBox("Checkque Book");
        c4.setBounds(400,550,200,40);
        c4.setFont(new Font("Serif",Font.PLAIN,17));
        c4.setForeground(Color.black);
        c4.setBackground(new Color(162, 14, 55));
        add(c4);
        
        c5 = new JCheckBox("Emails & SMS Alerts");
        c5.setBounds(100,600,200,40);
        c5.setFont(new Font("Serif",Font.PLAIN,17));
        c5.setForeground(Color.black);
        c5.setBackground(new Color(162, 14, 55));
        add(c5);
        
        c6 = new JCheckBox("E-statement");
        c6.setBounds(400,600,200,40);
        c6.setFont(new Font("Serif",Font.PLAIN,17));
        c6.setForeground(Color.black);
        c6.setBackground(new Color(162, 14, 55));
        add(c6);
        
        c7 = new JCheckBox("I hereby declare that the information provided is best of my knowledge");
        c7.setBounds(200,650,500,40);
        c7.setFont(new Font("Serif",Font.PLAIN,13));
        c7.setForeground(Color.black);
        c7.setBackground(new Color(162, 14, 55));
        add(c7);
        
        submit = new JButton("Submit");
        submit.setBounds(640,700,120,35);
        submit.setFont(new Font("Serif",Font.BOLD,23));
        submit.setForeground(Color.white);
        submit.setBackground(Color.BLACK);
        submit.addActionListener(this);
        add(submit);
        
        getContentPane().setBackground(new Color(162, 14, 55));
        setSize(800,800);
        setLocation(350,10);
        setVisible(true);
        
    } 
    public void actionPerformed(ActionEvent ae){
        String accountType = null;
        if(m1.isSelected()){
            accountType = "Savings";
        }else if(m2.isSelected()){
            accountType = "Current";
        }else if(m3.isSelected()){
            accountType = "Fixed Deposit";
        }else if(m4.isSelected()){
            accountType = "Others";
        }
        Random random = new Random();
        String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 3172000000000000L);
        String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
        String services = "";
        if(c1.isSelected()){
            services += " ATM service";
        }else if(c2.isSelected()){
            services += " Internet Banking";
        }else if(c3.isSelected()){
            services += " Mobile Banking";
        }else if(c4.isSelected()){
            services += " CheckBook Banking";
        }else if(c5.isSelected()){
            services += "  Emails & SMS services";
        }else if(c6.isSelected()){
            services += " E-statement";
        }
        
        try{
            if(!c7.isSelected()){
                JOptionPane.showMessageDialog(null,"Please tick the checkbox");  
            }else{
                Conn c = new Conn();
                
                String query = "insert into signupThree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+services+"')";
                String query2 = "insert into loginData values ('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                c.s.executeUpdate(query);
                c.s.executeUpdate(query2);
            }
            JOptionPane.showMessageDialog(null, "Your Card Number is: " + cardnumber +"\n" +"Your PIN is: " + pinnumber);
            JOptionPane.showMessageDialog(null,"Now you  have to deposit some amount");  
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
        
    }
    public static void main(String[] args) {
        new signupThree("");
    }
}
