package atm_automation_system;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class SignupOne extends JFrame {
    
    SignupOne() {
        
        setLayout(null);
        
        Random ran = new Random();
        long random = Math.abs((ran.nextLong()% 9000L) + 1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM NO. " + random );
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personDetails = new JLabel("Page 1: Personal Details");
        personDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personDetails.setBounds(290,80,200,30);
        add(personDetails);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350,10);
        setVisible(true);
    }
    public static void main(String args[]){
        new SignupOne();
    }
}
