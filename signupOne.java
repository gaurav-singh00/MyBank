package bankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
public class signupOne extends JFrame implements ActionListener {
    long random;
    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pinTextField;
    JButton next;
    JRadioButton male, female, married, unmarried, other;
    JDateChooser dateChooser;

    signupOne() {
        setLayout(null);

        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        JLabel formNo = new JLabel("APPLICATION FORM NO. " + random); //set text on display
        formNo.setFont(new Font("Raleway", Font.BOLD, 38));  //SET new font and size
        formNo.setBounds(140, 20, 600, 40); //set coordinates of text
        add(formNo);

        JLabel personalDetails = new JLabel("Page 1: Personal Details"); //set text on display
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));  //SET new font and size
        personalDetails.setBounds(290, 80, 400, 30); //set coordinates of text
        add(personalDetails);

        JLabel name = new JLabel("Name:"); //set text on display
        name.setFont(new Font("Raleway", Font.BOLD, 20));  //SET new font and size
        name.setBounds(100, 140, 100, 30); //set coordinates of text
        add(name);

        nameTextField = new JTextField();  // user can enter input
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));  //set font of user input password
        nameTextField.setBounds(300, 140, 400, 30);  //set coordinates
        add(nameTextField);

        JLabel fname = new JLabel("Father's Name:"); //set text on display
        fname.setFont(new Font("Raleway", Font.BOLD, 20));  //SET new font and size
        fname.setBounds(100, 190, 200, 30); //set coordinates of text
        add(fname);

        fnameTextField = new JTextField();  // user can enter input
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));  //set font of user input password
        fnameTextField.setBounds(300, 190, 400, 30);  //set coordinates
        add(fnameTextField);

        JLabel dob = new JLabel("Date of Birth:"); //set text on display
        dob.setFont(new Font("Raleway", Font.BOLD, 20));  //SET new font and size
        dob.setBounds(100, 240, 200, 30); //set coordinates of text
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);

        JLabel gender = new JLabel("Gender:"); //set text on display
        gender.setFont(new Font("Raleway", Font.BOLD, 20));  //SET new font and size
        gender.setBounds(100, 290, 200, 30); //set coordinates of text
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);
        female = new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.WHITE);
        add(female);
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

        JLabel email = new JLabel("Email Address:"); //set text on display
        email.setFont(new Font("Raleway", Font.BOLD, 20));  //SET new font and size
        email.setBounds(100, 340, 200, 30); //set coordinates of text
        add(email);

        emailTextField = new JTextField();  // user can enter input
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));  //set font of user input password
        emailTextField.setBounds(300, 340, 400, 30);  //set coordinates
        add(emailTextField);

        JLabel marital = new JLabel("Marital Status:"); //set text on display
        marital.setFont(new Font("Raleway", Font.BOLD, 20));  //SET new font and size
        marital.setBounds(100, 390, 200, 30); //set coordinates of text
        add(marital);

        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        other = new JRadioButton("Other");
        other.setBounds(630, 390, 100, 30);
        other.setBackground(Color.WHITE);
        add(other);
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);

        JLabel address = new JLabel("Address:"); //set text on display
        address.setFont(new Font("Raleway", Font.BOLD, 20));  //SET new font and size
        address.setBounds(100, 440, 200, 30); //set coordinates of text
        add(address);

        addressTextField = new JTextField();  // user can enter input
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));  //set font of user input password
        addressTextField.setBounds(300, 440, 400, 30);  //set coordinates
        add(addressTextField);

        JLabel city = new JLabel("City:"); //set text on display
        city.setFont(new Font("Raleway", Font.BOLD, 20));  //SET new font and size
        city.setBounds(100, 490, 200, 30); //set coordinates of text
        add(city);

        cityTextField = new JTextField();  // user can enter input
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));  //set font of user input password
        cityTextField.setBounds(300, 490, 400, 30);  //set coordinates
        add(cityTextField);

        JLabel state = new JLabel("State:"); //set text on display
        state.setFont(new Font("Raleway", Font.BOLD, 20));  //SET new font and size
        state.setBounds(100, 540, 200, 30); //set coordinates of text
        add(state);

        stateTextField = new JTextField();  // user can enter input
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));  //set font of user input password
        stateTextField.setBounds(300, 540, 400, 30);  //set coordinates
        add(stateTextField);

        JLabel pincode = new JLabel("Pin Code:"); //set text on display
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));  //SET new font and size
        pincode.setBounds(100, 590, 200, 30); //set coordinates of text
        add(pincode);

        pinTextField = new JTextField();  // user can enter input
        pinTextField.setFont(new Font("Raleway", Font.BOLD, 14));  //set font of user input password
        pinTextField.setBounds(300, 590, 400, 30);  //set coordinates
        add(pinTextField);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));  //SET new font and size
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);  //this is for actionPerformed when login clicked
        add(next);

        getContentPane().setBackground(Color.WHITE);   //set background color
        setSize(850, 800);  //display function
        setVisible(true);   // now display visible to user
        setLocation(350, 10);  //display coordinates
    }

    public void actionPerformed(ActionEvent ae) {  //this is used for what action is going to Performed
        String formNo = "" + random;  //long convert into String now
        String name  = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob =((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        }
        String email = emailTextField.getText();
        String marital = null;
        if (married.isSelected()){
            marital = "Married";
        } else if (unmarried.isSelected()) {
            marital = "Unmarried";
        } else if (other.isSelected()) {
            marital = "Other";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();

        try {
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is Required");  //this will show a popup when entry appears empty
            } else if (fname.equals("")) {
                JOptionPane.showMessageDialog(null, "Father's Name is Required");
            } else if (dob.equals("")) {
                JOptionPane.showMessageDialog(null, "Enter your Date of Birth");
            } else if (gender.equals("")) {
                JOptionPane.showMessageDialog(null, "Choose your Gender");
            } else if (email.equals("")) {
                JOptionPane.showMessageDialog(null, "Email is Required");
            } else if (marital.equals("")) {
                JOptionPane.showMessageDialog(null, "Choose Your Marital Status");
            } else if (address.equals("")) {
                JOptionPane.showMessageDialog(null, "Address is Required");
            } else if (city.equals("")) {
                JOptionPane.showMessageDialog(null, "City is Required");
            } else if (state.equals("")) {
                JOptionPane.showMessageDialog(null, "State is Required");
            } else if (pin.equals("")) {
                JOptionPane.showMessageDialog(null, "PinCode is Required");
            }else {
                Conn c = new Conn();
                String query = "insert into signup values('"+formNo+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+state+"', '"+pin+"')";
                c.s.executeUpdate(query);//this will execute with help of statement(s)
                setVisible(false);
                new signupTwo(formNo).setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new signupOne();
    }
}
