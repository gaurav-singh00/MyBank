package bankManagementSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener {

    //these are globly defined variable, this will work outside the constructor
    JButton login, clear, signup;
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login () {
        setLayout(null);    //default layout

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);   //image set on upper left corner
        add(label);   //logo image is set on display

        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));  //SET new font and size
        text.setBounds(200, 40, 400, 40);
        add(text);

        JLabel cardno = new JLabel("Card No:");  //set text on display
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));  //SET new font and size
        cardno.setBounds(120, 150, 150, 30);
        add(cardno);

        cardTextField = new JTextField();  // user can enter input cardNo
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));  //set font of user input
        add(cardTextField);

        JLabel pin = new JLabel("PIN No:");  //set text on display
        pin.setFont(new Font("Raleway", Font.BOLD, 28));  //SET new font and size
        pin.setBounds(120, 220, 250, 30);
        add(pin);

        pinTextField = new JPasswordField();  // user can enter input pinNo
        pinTextField.setBounds(300, 220, 230, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));  //set font of user input password
        add(pinTextField);

        login = new JButton("SIGN IN");  //sign in button
        login.setBounds(300, 300, 100, 30);  //cordinates for sign in button
        login.setBackground(Color.BLACK);  //sign in button background color
        login.setForeground(Color.WHITE);  //sign in button foreground color
        login.addActionListener(this);  //this is for actionPerformed when login clicked
        add(login);

        clear = new JButton("CLEAR");  //clear button
        clear.setBounds(430, 300, 100, 30);  //cordinates for clear button
        clear.setBackground(Color.BLACK);  //clear button background color
        clear.setForeground(Color.WHITE);  //clear button foreground color
        clear.addActionListener(this);  //this is for actionPerformed when login clicked
        add(clear);

        signup = new JButton("SIGN UP");  //sign up button
        signup.setBounds(300, 350, 230, 30);  //cordinates for signup button
        signup.setBackground(Color.BLACK);  //signup button background color
        signup.setForeground(Color.WHITE);  //signup button foreground color
        signup.addActionListener(this);  //this is for actionPerformed when login clicked
        add(signup);

        getContentPane().setBackground(Color.WHITE);   //set background color

        setTitle("ATM By Gaurav - Kashif - Himansh");
        setSize(800, 440);  //display fuction
        setVisible(true);   // now display visible to user
        setLocation(350, 200);  //display cordinates

    }

    public void actionPerformed(ActionEvent ae) {   //this is used for what action is going to Performed when login, clear and signup button clicked
        if (ae.getSource() == login) {  //when login button clicked, it will work
            Conn c1 = new Conn();
            String cardno  = cardTextField.getText();
            String pin  = pinTextField.getText();
            String query  = "select * from login where cardNumber = '"+cardno+"' and pin = '"+pin+"'";

            try{
                ResultSet rs = c1.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }
            }catch(Exception e) {
                System.out.println(e);
            }
        }
        if (ae.getSource() == clear) {  //when clear button clicked, it will work
            cardTextField.setText("");  //this will clear the text in cardNo when clear button clicked
            pinTextField.setText("");   //this will clear the text in PINNo when clear button clicked
        }
        if (ae.getSource() == signup) {  //when signup button clicked, it will work
            setVisible(false);
            new signupOne().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
