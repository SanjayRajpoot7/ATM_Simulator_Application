package bank_management_system;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;
//import java.util.*;

class BalanceEnquiry extends JFrame implements ActionListener {
    
    JButton b1;
    JLabel l1;
    String pinnumber;

    BalanceEnquiry(String pinnumber) {
        this.pinnumber = pinnumber;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800,800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 800,650);
        add(l3);

        l1 = new JLabel();
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 14));

        b1 = new JButton("BACK");

        setLayout(null);

        l1.setBounds(145,210,350,30);
        l3.add(l1);

        b1.setBounds(295,390,155,28);
        l3.add(b1);
        int balance = 0;
        Conn c1 = new Conn();
        try{
            
            ResultSet rs = c1.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
            
            while (rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        }catch(Exception e){
        System.out.println(e);
        }
        
//        l1.setText("Your Current Account Balance is Rs "+balance);
        JLabel text = new JLabel("Your Current Account Balance is Rs "+balance);
        text.setForeground(Color.WHITE);
        text.setBounds(170,230,400,30);
        l3.add(text);
  
        b1.addActionListener(this);

        setSize(800,680);
        setLocation(300,10);
        setUndecorated(true);
        setVisible(true);
       
 
       
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Transactions(pinnumber).setVisible(true);
    }

    public static void main(String[] args) {
        new BalanceEnquiry("").setVisible(true);
    }
}