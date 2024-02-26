package bank.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class signupTwo extends JFrame implements ActionListener{
    
    JTextField aadharField,panField;
    JComboBox educationBox,incomeBox,religionBox,occupationBox,categoryBox;
    JButton next;
    JRadioButton yes,no;
    String formno;
    signupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        setTitle("New Account: Additional Details");
        JLabel label  = new JLabel();
        label.setBounds(200,15,400,50);
        label.setForeground(new Color(251, 188, 9));
        label.setFont(new Font("Serif",Font.BOLD,40));
        add(label);
        
        JLabel page2 = new JLabel("Page 2: Additional Details");
        page2.setBounds(220,70,400,50);
        page2.setFont(new Font("Serif",Font.PLAIN,30));
        page2.setForeground(new Color(251, 188, 9));
        add(page2);
        
        JLabel religion = new JLabel("Religion");
        religion.setBounds(100,140,200,40);
        religion.setFont(new Font("Serif",Font.PLAIN,25));
        religion.setForeground(new Color(251, 188, 9));
        add(religion);
        
        String valReligion[] = {"Hindu","Muslim","Sikh","Christian"};
        religionBox = new JComboBox(valReligion);
        religionBox.setBounds(300,140,300,40);
        religionBox.setFont(new Font("Serif",Font.PLAIN,20));
        add(religionBox);
        
        JLabel category = new JLabel("Category");
        category.setBounds(100,200,200,40);
        category.setFont(new Font("Serif",Font.PLAIN,25));
        category.setForeground(new Color(251, 188, 9));
        add(category);
        
        String valCategory[] = {"SC","ST","OBC","GEN","Other"};
        categoryBox = new JComboBox(valCategory);
        categoryBox.setBounds(300,200,300,40);
        categoryBox.setFont(new Font("Serif",Font.PLAIN,20));
        add(categoryBox);
        
        JLabel income = new JLabel("Income");
        income.setBounds(100,260,200,40);
        income.setFont(new Font("Serif",Font.PLAIN,25));
        income.setForeground(new Color(251, 188, 9));
        add(income);
        
        String valIncome[] = {"Below 5 Lacs","5-8 Lacs","8-12 Lacs","12-18 Lacs","Above 8 Lacs"};
        incomeBox = new JComboBox(valIncome);
        incomeBox.setBounds(300,260,300,40);
        incomeBox.setFont(new Font("Serif",Font.PLAIN,20));
        incomeBox.setForeground(Color.BLACK);
        add(incomeBox);
        
        JLabel education = new JLabel("Education");
        education.setBounds(100,340,200,40);
        education.setFont(new Font("Serif",Font.PLAIN,25));
        education.setForeground(new Color(251, 188, 9));
        add(education);
        
        JLabel qualification = new JLabel("Qualification");
        qualification.setBounds(100,370,200,40);
        qualification.setFont(new Font("Serif",Font.PLAIN,25));
        qualification.setForeground(new Color(251, 188, 9));
        add(qualification);
        
        String valEducation[] = {"Non-Graduate","Graduate","Post Graduation","Doctrate","Others"};
        educationBox = new JComboBox(valEducation);
        educationBox.setBounds(300,360,300,40);
        educationBox.setFont(new Font("Serif",Font.PLAIN,20));
        educationBox.setForeground(Color.BLACK);
        add(educationBox);
        
        JLabel occupation = new JLabel("Occupation");
        occupation.setBounds(100,440,200,40);
        occupation.setFont(new Font("Serif",Font.PLAIN,25));
        occupation.setForeground(new Color(251, 188, 9));
        add(occupation);
        
        String valOccupation[] = {"Salaried","Self-Employed","Business","Student","Retired","Others"};
        occupationBox = new JComboBox(valOccupation);
        occupationBox.setBounds(300,440,300,40); 
        occupationBox.setFont(new Font("Serif",Font.PLAIN,20));
        occupationBox.setForeground(Color.BLACK);
        add(occupationBox);
        
        JLabel panno = new JLabel("PAN No.");
        panno.setBounds(100,500,200,40);
        panno.setFont(new Font("Serif",Font.PLAIN,25));
        panno.setForeground(new Color(251, 188, 9));
        add(panno);
        
        panField = new JTextField();
        panField.setBounds(300,500,300,40);
        panField.setFont(new Font("Serif",Font.PLAIN,20));
        panField.setForeground(Color.BLACK);
        add(panField);
        
        JLabel citizen = new JLabel("Citizen");
        citizen.setBounds(100,560,200,40);
        citizen.setFont(new Font("Serif",Font.PLAIN,25));
        citizen.setForeground(new Color(251, 188, 9));
        add(citizen);
        
        yes = new JRadioButton("Yes");
        no = new JRadioButton("No");
        yes.setBounds(300,560,100,40);
        no.setBounds(500,560,100,40);
        yes.setFont(new Font("Serif",Font.PLAIN,20));
        yes.setForeground(Color.BLACK);
        yes.setBackground(new Color(162, 14, 55));
        no.setFont(new Font("Serif",Font.PLAIN,20));
        no.setBackground(new Color(162, 14, 55));
        no.setForeground(Color.BLACK);
        add(yes);
        add(no);
        
        JLabel aadharno = new JLabel("Aadhar No.");
        aadharno.setBounds(100,620,200,40);
        aadharno.setFont(new Font("Serif",Font.PLAIN,25));
        aadharno.setForeground(new Color(251, 188, 9));
        add(aadharno);
        
        aadharField = new JTextField();
        aadharField.setBounds(300,620,300,40);
        aadharField.setFont(new Font("Serif",Font.PLAIN,20));
        aadharField.setForeground(Color.BLACK);
        add(aadharField);
        
        JLabel existingaccount = new JLabel("Existing Account");
        existingaccount.setBounds(100,680,200,40);
        existingaccount.setFont(new Font("Serif",Font.PLAIN,25));
        existingaccount.setForeground(new Color(251, 188, 9));
        add(existingaccount);
        
        yes = new JRadioButton("Yes");
        no = new JRadioButton("No");
        yes.setBounds(300,680,100,40);
        no.setBounds(500,680,100,40);
        yes.setFont(new Font("Serif",Font.PLAIN,20));
        yes.setForeground(Color.BLACK);
        yes.setBackground(new Color(162, 14, 55));
        no.setFont(new Font("Serif",Font.PLAIN,20));
        no.setBackground(new Color(162, 14, 55));
        no.setForeground(Color.BLACK);
        add(yes);
        add(no);
        
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
         String category = (String) categoryBox.getSelectedItem();
         String religion = (String) religionBox.getSelectedItem();
         String income = (String) incomeBox.getSelectedItem();
         String education = (String) educationBox.getSelectedItem();
         String occupation = (String) categoryBox.getSelectedItem();
         String citizen = null;
         if(yes.isSelected()){
             citizen = "Yes";
         }else{
             citizen = "No";
         }
         String existingAccount = null;
         if(yes.isSelected())
             existingAccount = "Yes";
         else
             existingAccount = "No";
         String panNo = panField.getText();
         String aadharNo = aadharField.getText();
         
        try{
                Conn c2 = new Conn();
                String query = "insert into signupTwo values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+panNo+"','"+aadharNo+"','"+citizen+"','"+existingAccount+"')";
                c2.s.executeUpdate(query);
        }
            catch (Exception e){
                    System.out.println(e);
               }
         setVisible(false);
        new signupThree(formno).setVisible(true);
        }
        
    public static void main(String[] args) {
        new signupTwo("");
    }
}
