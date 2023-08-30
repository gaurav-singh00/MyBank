package bankManagementSystem;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
public class signupTwo extends JFrame implements ActionListener {
    JTextField pan, aadhar;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JDateChooser dateChooser;
    JComboBox religion, category, occupation, educate, income;
    String formNo;

    public signupTwo(String formNo) {
        this.formNo = formNo;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");


        JLabel additionalDetails = new JLabel("Page 2: Additional  Details"); //set text on display
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));  //SET new font and size
        additionalDetails.setBounds(290, 80, 400, 30); //set coordinates of text
        add(additionalDetails);

        JLabel name = new JLabel("Religion:"); //set text on display
        name.setFont(new Font("Raleway", Font.BOLD, 20));  //SET new font and size
        name.setBounds(100, 140, 100, 30); //set coordinates of text
        add(name);


        String[] valReligion = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);  //set coordinates
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel fname = new JLabel("Category:"); //set text on display
        fname.setFont(new Font("Raleway", Font.BOLD, 20));  //SET new font and size
        fname.setBounds(100, 190, 200, 30); //set coordinates of text
        add(fname);

        String[] valcategory = {"Genral", "OBC", "SC", "ST", "Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300, 190, 400, 30);  //set coordinates
        category.setBackground(Color.WHITE);
        add(category);

        JLabel dob = new JLabel("Income:"); //set text on display
        dob.setFont(new Font("Raleway", Font.BOLD, 20));  //SET new font and size
        dob.setBounds(100, 240, 200, 30); //set coordinates of text
        add(dob);

        String[] incomecategory = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300, 240, 400, 30);  //set coordinates
        income.setBackground(Color.WHITE);
        add(income);


        JLabel gender = new JLabel("Educational:"); //set text on display
        gender.setFont(new Font("Raleway", Font.BOLD, 20));  //SET new font and size
        gender.setBounds(100, 290, 200, 30); //set coordinates of text
        add(gender);


        JLabel email = new JLabel("Qualification:"); //set text on display
        email.setFont(new Font("Raleway", Font.BOLD, 20));  //SET new font and size
        email.setBounds(100, 315, 200, 30); //set coordinates of text
        add(email);

        String[] educationvalues = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Others"};
        educate = new JComboBox(educationvalues);
        educate.setBounds(300, 315, 400, 30);  //set coordinates
        educate.setBackground(Color.WHITE);
        add(educate);


        JLabel marital = new JLabel("Occupation:"); //set text on display
        marital.setFont(new Font("Raleway", Font.BOLD, 20));  //SET new font and size
        marital.setBounds(100, 390, 200, 30); //set coordinates of text
        add(marital);

        String[] occupationvalues = {"Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Others"};
        occupation = new JComboBox(occupationvalues);
        occupation.setBounds(300, 390, 400, 30);  //set coordinates
        occupation.setBackground(Color.WHITE);
        add(occupation);

        JLabel address = new JLabel("PAN Number:"); //set text on display
        address.setFont(new Font("Raleway", Font.BOLD, 20));  //SET new font and size
        address.setBounds(100, 440, 200, 30); //set coordinates of text
        add(address);

        pan = new JTextField();  // user can enter input
        pan.setFont(new Font("Raleway", Font.BOLD, 14));  //set font of user input password
        pan.setBounds(300, 440, 400, 30);  //set coordinates
        add(pan);

        JLabel city = new JLabel("Aadhar Number:"); //set text on display
        city.setFont(new Font("Raleway", Font.BOLD, 20));  //SET new font and size
        city.setBounds(100, 490, 200, 30); //set coordinates of text
        add(city);

        aadhar = new JTextField();  // user can enter input
        aadhar.setFont(new Font("Raleway", Font.BOLD, 14));  //set font of user input password
        aadhar.setBounds(300, 490, 400, 30);  //set coordinates
        add(aadhar);

        JLabel state = new JLabel("Senior Citizen:"); //set text on display
        state.setFont(new Font("Raleway", Font.BOLD, 20));  //SET new font and size
        state.setBounds(100, 540, 200, 30); //set coordinates of text
        add(state);

        syes = new JRadioButton("YES");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        sno = new JRadioButton("NO");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);

        JLabel pincode = new JLabel("Existing Account:"); //set text on display
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));  //SET new font and size
        pincode.setBounds(100, 590, 200, 30); //set coordinates of text
        add(pincode);

        eyes = new JRadioButton("YES");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        eno = new JRadioButton("NO");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        ButtonGroup emaritalgroup = new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);

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
        String sreligion  = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome =(String) income.getSelectedItem();
        String seducation = (String) educate.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seniorcitizen = null;
        if (syes.isSelected()) {
            seniorcitizen = "Yes";
        } else if (sno.isSelected()) {
            seniorcitizen = "No";
        }
        String existingaccount = null;
        if (eyes.isSelected()){
            existingaccount = "Yes";
        } else if (eno.isSelected()) {
            existingaccount = "No";
        }
        String span = pan.getText();
        String saadhar = aadhar.getText();


        try{
            Conn c = new Conn();
            String query = "insert into signuptwo values('"+formNo+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"', '"+existingaccount+"')";
            c.s.executeUpdate(query);//this will execute with help of statement(s)

            setVisible(false);
            new signup3(formNo).setVisible(true);
        }catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new signupTwo("");
    }
}
