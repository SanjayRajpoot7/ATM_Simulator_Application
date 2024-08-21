package bank_management_system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Transactions extends JFrame implements ActionListener{

    JLabel l1;
    JButton deposit,cashwithdrawl,fastcash,ministatement,pinchange,balanceenquiry,exit;
    String pinnumber;
    
    Transactions(String pinnumber){
        this.pinnumber = pinnumber;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800,800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(0, 0, 800, 650);
        add(l2);
        
        l1 = new JLabel("Please Select Your Transaction");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        
       
        deposit = new JButton("DEPOSIT");
        cashwithdrawl = new JButton("CASH WITHDRAWL");
        fastcash = new JButton("FAST CASH");
        ministatement= new JButton("MINI STATEMENT");
        pinchange= new JButton("PIN CHANGE");
        balanceenquiry = new JButton("BALANCE ENQUIRY");
        exit = new JButton("EXIT");
        
        setLayout(null);
        
        l1.setBounds(180,185,600,35);
        l2.add(l1);
        
        deposit.setBounds(150,295,120,27);
        l2.add(deposit);
        
        cashwithdrawl.setBounds(298,295,151,27);
        l2.add(cashwithdrawl);
        
        fastcash.setBounds(150,327,120,27);
        l2.add(fastcash);
        
        
        ministatement.setBounds(298,327,151,27);
        l2.add(ministatement);
        
        pinchange.setBounds(150,359,120,27);
        l2.add(pinchange);
        
        balanceenquiry.setBounds(298,359,151,27);
        l2.add(balanceenquiry);
        
        exit.setBounds(298,390,151,27);
        l2.add(exit);
        
        
        deposit.addActionListener(this);
        cashwithdrawl.addActionListener(this);
        fastcash.addActionListener(this);
        ministatement.addActionListener(this);
        pinchange.addActionListener(this);
        balanceenquiry.addActionListener(this);
        exit.addActionListener(this);
        
        
        setSize(800,680);
        setLocation(300,10);
        setUndecorated(true);
        setVisible(true);   
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==deposit){ 
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
            
        }else if(ae.getSource()==cashwithdrawl){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
      
        }else if(ae.getSource()==fastcash){ 
          setVisible(false);
            new FastCash(pinnumber).setVisible(true);
            
        }else if(ae.getSource()==ministatement){ 
            new MiniStatement(pinnumber).setVisible(true);
            
        }else if(ae.getSource()==pinchange){ 
          setVisible(false);
            new PinChange(pinnumber).setVisible(true);
            
        }else if(ae.getSource()==balanceenquiry){ 
             setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
            
        }else if(ae.getSource()==exit){ 
            System.exit(0);
        }
    }
    
    public static void main(String[] args){
        new Transactions("");
    }
}