
package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
//import com.toedter.calendar.JDateChooser;


public class SignupTwo extends JFrame implements ActionListener{
   
    JTextField nameText,aadharno,pan;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,category,occupation,education,income;
    String formno;
    
    SignupTwo(String formno){
       this.formno=formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
       

        JLabel AdditionalDetails = new JLabel("Page 2: Additional Details");
        AdditionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        AdditionalDetails.setBounds(290,80,400,40);
        add(AdditionalDetails);

        JLabel name = new JLabel("Religion");
        name.setFont(new Font("Raleway",Font.BOLD,22));
        name.setBounds(100,140,100,30);
        add(name);
        
        String valReligion[]={"Hindu","Muslim","Christian","Jain","Other"};
        religion=new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);

        nameText = new JTextField();
        nameText.setFont(new Font("Raleway",Font.BOLD,14));
        nameText.setBounds(300,140,400,30);
        add(nameText);

        JLabel Fname = new JLabel("Category");
        Fname.setFont(new Font("Raleway",Font.BOLD,22));
        Fname.setBounds(100,190,200,30);
        add(Fname);
        
        
        String valcategory[] = {"General","OBC","SC","ST","Other"};
        category = new JComboBox(valcategory);
        category.setBackground(Color.WHITE);
        category.setBounds(300,190,400,30);
        add(category);
        
        

        JLabel dob = new JLabel("Income");
        dob.setFont(new Font("Raleway",Font.BOLD,22));
        dob.setBounds(100,240,200,30);
        add(dob);
        
         String incomevalue[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};       
        income=new JComboBox(incomevalue);
        income.setBackground(Color.WHITE);
        income.setBounds(300,240,400,30);
        income.setFont(new Font("Raleway", Font.BOLD, 14));
          add(income);
          
          
        JLabel gender = new JLabel("Education");
        gender.setFont(new Font("Raleway",Font.BOLD,22));
        gender.setBounds(100,290,200,30);
        add(gender);

       String educationvalues[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
       education = new JComboBox(educationvalues);
        education.setBackground(Color.WHITE);
        education.setBounds(300,315,400,30);
        add(education);
        
        JLabel email = new JLabel("Qualification");
        email.setFont(new Font("Raleway",Font.BOLD,22));
        email.setBounds(100,315,200,30);
        add(email);

       

        JLabel marital = new JLabel("Occupation");
        marital.setFont(new Font("Raleway",Font.BOLD,22));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        String occupationvalues[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
        occupation= new JComboBox(occupationvalues);
        occupation.setBackground(Color.WHITE);
        occupation.setBounds(300,390,400,30);
        add(occupation);

        syes= new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno= new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);


        ButtonGroup maritalGroup= new ButtonGroup();
        maritalGroup.add(syes);
        maritalGroup.add(sno);

        JLabel address = new JLabel("PAN number");
        address.setFont(new Font("Raleway",Font.BOLD,22));
        address.setBounds(100,440,200,30);
        add(address);

        pan = new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        add(pan);

        JLabel city = new JLabel("Aadhar number");
        city.setFont(new Font("Raleway",Font.BOLD,22));
        city.setBounds(100,490,200,30);
        add(city);

        aadharno = new JTextField();
        aadharno.setFont(new Font("Raleway",Font.BOLD,14));
        aadharno.setBounds(300,490,400,30);
        add(aadharno);

        JLabel state = new JLabel("Senior Citizen");
        state.setFont(new Font("Raleway",Font.BOLD,22));
        state.setBounds(100,540,200,30);
        add(state);

//        stateText = new JTextField();
//        stateText.setFont(new Font("Raleway",Font.BOLD,14));
//        stateText.setBounds(300,540,400,30);
//        add(stateText);

        JLabel pincode = new JLabel("Existing Account");
        pincode.setFont(new Font("Raleway",Font.BOLD,22));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
//        existText = new JTextField();
//        existText.setFont(new Font("Raleway",Font.BOLD,14));
//        existText.setBounds(300,590,400,30);
//        add(existText);

        eyes= new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno= new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);


        ButtonGroup seniorc= new ButtonGroup();
        maritalGroup.add(syes);
        maritalGroup.add(sno);

         next = new JButton("Next");
         next.setBackground(Color.BLACK);
         next.setForeground(Color.WHITE);
         next.setFont(new Font("Raleway",Font.BOLD,14));
         next.setBounds(620,60,80,30);
         next.addActionListener(this);
         add(next);

        //  setTitle("Automated Teller Machine - Sign Up");
         getContentPane().setBackground(Color.WHITE);
          setSize(820,800);
          setLocation(350,10);
          setVisible(true);
    }

    
    public void actionPerformed(ActionEvent ae){
        String sreligion = (String)religion.getSelectedItem(); 
        String scategory = (String)category.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String seducation = (String)education.getSelectedItem();
        String soccupation = (String)occupation.getSelectedItem();
        
        String scitizen = null;
        if(syes.isSelected()){ 
            scitizen = "Yes";
        }
        else if(sno.isSelected()){ 
            scitizen = "No";
        }
        
        String eaccount = "";
        if(eyes.isSelected()){ 
            eaccount = "Yes";
        }else if(eno.isSelected()){ 
            eaccount = "No";
        }
        

        String span = pan.getText();
        String saadhar = aadharno.getText();
    
        try{
                    Conn c = new Conn();
                    String q1 = "insert into signuptwo values('"+formno+"','"+sreligion+"',"
                    + "'"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"',"
                    + "'"+span+"','"+saadhar+"','"+scitizen+"','"+eaccount+"')";
                    
                    c.s.executeUpdate(q1);
                
                setVisible(false);
                new SignupThree(formno).setVisible(true);
                  
        }
            catch(Exception e) {
                System.out.println(e);
                
            }
       
        // try{
        //     if(state.isEmpty()){
        //         JOptionPane.showMessageDialog(null,"State field is required");
        //     }
        // }
        //     catch(Exception e){
        //         System.out.println(e);

        //     }
        
        }  
    

    public static void main(String[] args) {
        new SignupTwo("");
    }
    
}

