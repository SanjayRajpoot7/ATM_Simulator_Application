
package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;


public class SignupOne extends JFrame implements ActionListener{
    long random;
    JTextField nameText,FnameText,dobText,emailText,addressText,cityText,stateText,pincodeText;
    JButton next;
    JRadioButton male,female,married,unmarried,other;
    JDateChooser dateChooser;
    SignupOne(){

        setLayout(null);

        Random ran = new Random();
        long random=Math.abs((ran.nextLong()%9000L)+1000L);
        // System.out.println(Math.abs((ran.nextLong()%9000L)+1000L));
        
        JLabel formno = new JLabel("APPLICATION FORM NO."+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);

        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(290,80,400,40);
        add(personalDetails);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,22));
        name.setBounds(100,140,100,30);
        add(name);

        nameText = new JTextField();
        nameText.setFont(new Font("Raleway",Font.BOLD,14));
        nameText.setBounds(300,140,400,30);
        add(nameText);

        JLabel Fname = new JLabel("Father's Name:");
        Fname.setFont(new Font("Raleway",Font.BOLD,22));
        Fname.setBounds(100,190,200,30);
        add(Fname);

         FnameText = new JTextField();
        FnameText.setFont(new Font("Raleway",Font.BOLD,14));
        FnameText.setBounds(300,190,400,30);
        add(FnameText);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway",Font.BOLD,22));
        dob.setBounds(100,240,200,30);
        add(dob);

//         dtext = new JTextField();
//        dtext.setFont(new Font("Raleway",Font.BOLD,14));
//        dtext.setBounds(300,240,400,30);
//        add(dtext);

         dateChooser = new JDateChooser();
	//dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
	dateChooser.setForeground(new Color(105, 105, 105));
	dateChooser.setBounds(300,240,400,30);
	add(dateChooser);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,22));
        gender.setBounds(100,290,200,30);
        add(gender);

        male= new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);

        female= new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup genderGroup= new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);


        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway",Font.BOLD,22));
        email.setBounds(100,340,200,30);
        add(email);

         emailText = new JTextField();
        emailText.setFont(new Font("Raleway",Font.BOLD,14));
        emailText.setBounds(300,340,400,30);
        add(emailText);

        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway",Font.BOLD,22));
        marital.setBounds(100,390,200,30);
        add(marital);

        married= new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried= new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        other= new JRadioButton("Other");
        other.setBounds(630,390,100,30);
        other.setBackground(Color.WHITE);
        add(other);

        ButtonGroup maritalGroup= new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(other);

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,22));
        address.setBounds(100,440,200,30);
        add(address);

         addressText = new JTextField();
        addressText.setFont(new Font("Raleway",Font.BOLD,14));
        addressText.setBounds(300,440,400,30);
        add(addressText);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD,22));
        city.setBounds(100,490,200,30);
        add(city);

        cityText = new JTextField();
        cityText.setFont(new Font("Raleway",Font.BOLD,14));
        cityText.setBounds(300,490,400,30);
        add(cityText);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,22));
        state.setBounds(100,540,200,30);
        add(state);

        stateText = new JTextField();
        stateText.setFont(new Font("Raleway",Font.BOLD,14));
        stateText.setBounds(300,540,400,30);
        add(stateText);

        JLabel pincode = new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway",Font.BOLD,22));
        pincode.setBounds(100,590,200,30);
        add(pincode);

         pincodeText = new JTextField();
         pincodeText.setFont(new Font("Raleway",Font.BOLD,14));
         pincodeText.setBounds(300,590,400,30);
         add(pincodeText);

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
        String formno = "" + random;
        String name=nameText.getText();
        String fname=FnameText.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=male.isSelected()?"Male":"Female";

        String email=emailText.getText();
        String marital=null;
        if(married.isSelected()){
            marital="Married";
        }
        else if(unmarried.isSelected()){
            marital="Unmarried";
        }
        else{
            marital="Other";
        }

        String address=addressText.getText();
        String city=cityText.getText();
        String state=stateText.getText();
        String pincode=pincodeText.getText();
    
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Name is required");
            }
                else{
                    Conn c = new Conn();
                    String query = "insert into signup values('"+formno+"','"+name+"',"
                            + "'"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"',"
                            + "'"+address+"','"+city+"','"+pincode+"','"+state+"')";
                    c.s.executeUpdate(query);
                    
                    setVisible(false);
                    new SignupTwo(formno).setVisible(true);
                    }
        }
            catch(Exception e) {
                System.out.println(e);
                
            }
       
        }  
    

    public static void main(String[] args) {
        new SignupOne();
    }
    
}

