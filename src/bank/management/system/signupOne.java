package bank.management.system;
import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class signupOne extends JFrame implements ActionListener{
    long random;
    JTextField nameField,fatherField,emailField,cityField,addressField,stateField,pincodeField;
    JFormattedTextField dobField;
    JButton next;
    JRadioButton r1,r2,r3,m1,m2,m3;
    signupOne(){
        setLayout(null);
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        JLabel label  = new JLabel("Application no: " + random);
        label.setBounds(200,15,400,50);
        label.setForeground(new Color(251, 188, 9));
        label.setFont(new Font("Serif",Font.BOLD,40));
        add(label);
        
        JLabel page1 = new JLabel("Page 1: Personal Details");
        page1.setBounds(220,70,400,50);
        page1.setFont(new Font("Serif",Font.PLAIN,30));
        page1.setForeground(new Color(251, 188, 9));
        add(page1);
        
        JLabel name = new JLabel("Name");
        name.setBounds(100,140,200,40);
        name.setFont(new Font("Serif",Font.PLAIN,25));
        name.setForeground(new Color(251, 188, 9));
        add(name);
        
        nameField = new JTextField();
        nameField.setBounds(300,140,300,40);
        nameField.setFont(new Font("Serif",Font.PLAIN,20));
        nameField.setForeground(Color.BLACK);
        add(nameField);
        
        JLabel fathername = new JLabel("Father's Name");
        fathername.setBounds(100,200,200,40);
        fathername.setFont(new Font("Serif",Font.PLAIN,25));
        fathername.setForeground(new Color(251, 188, 9));
        add(fathername);
        
        fatherField = new JTextField();
        fatherField.setBounds(300,200,300,40);
        fatherField.setFont(new Font("Serif",Font.PLAIN,20));
        fatherField.setForeground(Color.BLACK);
        add(fatherField);
        
        JLabel dob = new JLabel("Date of Birth");
        dob.setBounds(100,260,200,40);
        dob.setFont(new Font("Serif",Font.PLAIN,25));
        dob.setForeground(new Color(251, 188, 9));
        add(dob);
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        dobField = new JFormattedTextField(dateFormat);
        dobField.setBounds(300,260,300,40);
        dobField.setFont(new Font("Serif",Font.PLAIN,20));
        dobField.setForeground(Color.BLACK);
        dobField.setValue(new Date());
        add(dobField);

        
        JLabel gender = new JLabel("Gender");
        gender.setBounds(100,320,200,40);
        gender.setFont(new Font("Serif",Font.PLAIN,25));
        gender.setForeground(new Color(251, 188, 9));
        add(gender);
        
        r1=new JRadioButton("A) Male");    
        r2=new JRadioButton("B) Female");  
        r3 = new JRadioButton("C) Other");
        r1.setBounds(270,320,130,40);  
        r1.setFont(new Font("Serif",Font.PLAIN,20));
        r1.setForeground(Color.BLACK);
        r1.setBackground(new Color(162, 14, 55));
        r1.setBorder(new LineBorder(new Color(162, 14, 55),0));
        r2.setBounds(400,320,130,40);  
        r2.setFont(new Font("Serif",Font.PLAIN,20));
        r2.setForeground(Color.BLACK);
        r2.setBackground(new Color(162, 14, 55));
        r2.setBorder(new LineBorder(new Color(162, 14, 55),0));
        r3.setBounds(530,320,130,40);
        r3.setFont(new Font("Serif",Font.PLAIN,20));
        r3.setForeground(Color.BLACK);
        r3.setBackground(new Color(162, 14, 55));
        r3.setBorder(new LineBorder(new Color(162, 14, 55),0));
        
        ButtonGroup bg=new ButtonGroup();    
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        add(r1);
        add(r2);
        add(r3);
         
        JLabel email = new JLabel("Email Address");
        email.setBounds(100,380,200,40);
        email.setFont(new Font("Serif",Font.PLAIN,25));
        email.setForeground(new Color(251, 188, 9));
        add(email);
        
        emailField = new JTextField();
        emailField.setBounds(300,380,300,40);
        emailField.setFont(new Font("Serif",Font.PLAIN,20));
        emailField.setForeground(Color.BLACK);
        add(emailField);
        
        JLabel martial = new JLabel("Martial");
        martial.setBounds(100,440,200,40);
        martial.setFont(new Font("Serif",Font.PLAIN,25));
        martial.setForeground(new Color(251, 188, 9));
        add(martial);
        
        m1=new JRadioButton("A) Married");    
        m2=new JRadioButton("B) Unmarried");  
        m3 = new JRadioButton("C) Other");
        m1.setBounds(270,440,130,40);  
        m1.setFont(new Font("Serif",Font.PLAIN,20));
        m1.setForeground(Color.BLACK);
        m1.setBackground(new Color(162, 14, 55));
        m1.setBorder(new LineBorder(new Color(162, 14, 55),0));
        m2.setBounds(400,440,130,40);  
        m2.setFont(new Font("Serif",Font.PLAIN,20));
        m2.setForeground(Color.BLACK);
        m2.setBackground(new Color(162, 14, 55));
        m2.setBorder(new LineBorder(new Color(162, 14, 55),0));
        m3.setBounds(540,440,130,40);
        m3.setFont(new Font("Serif",Font.PLAIN,20));
        m3.setForeground(Color.BLACK);
        m3.setBackground(new Color(162, 14, 55));
        m3.setBorder(new LineBorder(new Color(162, 14, 55),0));
        
        ButtonGroup bg2=new ButtonGroup();    
        bg2.add(m1);
        bg2.add(m2);
        bg2.add(m3);
        add(m1);
        add(m2);
        add(m3);
        
        JLabel address = new JLabel("Address");
        address.setBounds(100,500,200,40);
        address.setFont(new Font("Serif",Font.PLAIN,25));
        address.setForeground(new Color(251, 188, 9));
        add(address);
        
        addressField = new JTextField();
        addressField.setBounds(300,500,300,40);
        addressField.setFont(new Font("Serif",Font.PLAIN,20));
        addressField.setForeground(Color.BLACK);
        add(addressField);
        
        JLabel city = new JLabel("City");
        city.setBounds(100,560,200,40);
        city.setFont(new Font("Serif",Font.PLAIN,25));
        city.setForeground(new Color(251, 188, 9));
        add(city);
        
        cityField = new JTextField();
        cityField.setBounds(300,560,300,40);
        cityField.setFont(new Font("Serif",Font.PLAIN,20));
        cityField.setForeground(Color.BLACK);
        add(cityField);
        
        JLabel state = new JLabel("State");
        state.setBounds(100,620,200,40);
        state.setFont(new Font("Serif",Font.PLAIN,25));
        state.setForeground(new Color(251, 188, 9));
        add(state);
        
        stateField = new JTextField();
        stateField.setBounds(300,620,300,40);
        stateField.setFont(new Font("Serif",Font.PLAIN,20));
        stateField.setForeground(Color.BLACK);
        add(stateField);
        
        JLabel pincode = new JLabel("Pincode");
        pincode.setBounds(100,680,200,40);
        pincode.setFont(new Font("Serif",Font.PLAIN,25));
        pincode.setForeground(new Color(251, 188, 9));
        add(pincode);
        
        pincodeField = new JTextField();
        pincodeField.setBounds(300,680,300,40);
        pincodeField.setFont(new Font("Serif",Font.PLAIN,20));
        pincodeField.setForeground(Color.BLACK);
        add(pincodeField);
        
        next = new JButton("Next");
        next.setBounds(640,700,80,35);
        next.setFont(new Font("Serif",Font.BOLD,23));
        next.setForeground(Color.white);
        next.setBackground(Color.BLACK);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(new Color(162, 14, 55));
        setSize(800,800);
        setLocation(350,10);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;
        String name = nameField.getText();
        String fname = fatherField.getText();
        String dob = dobField.getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "male";
        }
        else if(r2.isSelected()){
            gender = "female";
        }
        else if(r3.isSelected()){
            gender = "other";
        }
        String email = emailField.getText();
        String martial = null;
        if(m1.isSelected()){
            martial = "married";
        }
        else if(m2.isSelected()){
            martial = "unmarried";
        }
        else if(m3.isSelected()){
            martial = "other";
        }
        String address = addressField.getText();
        String city = cityField.getText();
        String pincode = pincodeField.getText();
        String state = stateField.getText();
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required");
            }
            else{
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+martial+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
                c.s.executeUpdate(query);
                
            }
        }
            catch (Exception e){
                    System.out.println(e);
               }
        setVisible(false);
        new signupTwo(formno).setVisible(true);
        
        }
        
    public static void main(String[] args) {
        new signupOne();
    }
}
