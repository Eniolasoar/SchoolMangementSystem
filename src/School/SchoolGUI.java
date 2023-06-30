package School;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Objects;
import java.util.Scanner;

public class SchoolGUI {

    public void welcome(){

        JFrame welcome=new JFrame("Welcome");
        JLabel text1=new JLabel("Welcome To");
        JLabel text2=new JLabel("Bingham University");
        JLabel text3=new JLabel("School Management");
        JLabel text4=new JLabel("System");
        JButton nextButton=new JButton("Click Here To Continue");

        welcome.setSize(350, 450);
        welcome.getContentPane().setBackground(new Color(0, 162, 255));
        welcome.setLocationRelativeTo(null);
        welcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        welcome.setLayout(new GridBagLayout());


        text1.setFont(new Font("Gill sans", Font.BOLD, 24));
        text1.setForeground(new Color(94, 94, 94));

        text2.setFont(new Font("Gill sans", Font.BOLD, 24));
        text2.setForeground(new Color(94, 94, 94));

        text3.setFont(new Font("Gill sans", Font.BOLD, 24));
        text3.setForeground(new Color(94, 94, 94));

        text4.setFont(new Font("Gill sans", Font.BOLD, 24));
        text4.setForeground(new Color(94, 94, 94));

        nextButton.setFont(new Font("Gill sans", Font.BOLD, 18));
        nextButton.setForeground(new Color(94, 94, 94));

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        gridBagConstraints.insets = new Insets(10, 0, 10, 0);


        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridx = 0;
        gridBagConstraints2.gridy = 1;
        gridBagConstraints2.anchor = GridBagConstraints.CENTER;
        gridBagConstraints2.insets = new Insets(10, 0, 10, 0);


        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridx = 0;
        gridBagConstraints3.gridy = 2;
        gridBagConstraints3.anchor = GridBagConstraints.CENTER;
        gridBagConstraints3.insets = new Insets(10, 0, 10, 0);

        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.gridx = 0;
        gridBagConstraints4.gridy = 3;
        gridBagConstraints4.anchor = GridBagConstraints.CENTER;
        gridBagConstraints4.insets = new Insets(10, 0, 10, 0);

        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.gridx = 0;
        gridBagConstraints5.gridy = 4;
        gridBagConstraints5.ipadx = 60;
        gridBagConstraints5.ipady = 25;
        gridBagConstraints5.anchor = GridBagConstraints.SOUTHEAST;
        gridBagConstraints5.insets = new Insets(20, 0, 10, 0);

        welcome.add(text1,gridBagConstraints);
        welcome.add(text2,gridBagConstraints2);
        welcome.add(text3,gridBagConstraints3);
        welcome.add(text4,gridBagConstraints4);
        welcome.add(nextButton,gridBagConstraints5);

        welcome.setVisible(true);

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });
    }


    public void login(){
        JFrame frame=new JFrame("Login Page");
        //    JLabel image=new JLabel(new ImageIcon("src/buiding2.png"));
        JLabel label1=new JLabel("WELCOME!!!");
        JButton adminLogin=new JButton("Log In As Admin");
        JButton userLogin=new JButton("Log In As Student");

        frame.setSize(400, 450);
        frame.getContentPane().setBackground(new Color(0, 162, 255));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());


        label1.setFont(new Font("Gill sans", Font.BOLD, 24));
        label1.setForeground(new Color(94, 94, 94));

        userLogin.setFont(new Font("Gill sans", Font.BOLD, 24));
        userLogin.setForeground(new Color(94, 94, 94));

        adminLogin.setFont(new Font("Gill sans", Font.BOLD, 24));
        adminLogin.setForeground(new Color(94, 94, 94));

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        gridBagConstraints.insets = new Insets(10, 0, 10, 0);

        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridx = 0;
        gridBagConstraints2.gridy = 1;
        gridBagConstraints2.ipadx = 80;
        gridBagConstraints2.ipady = 20;
        gridBagConstraints2.anchor = GridBagConstraints.CENTER;
        gridBagConstraints2.insets = new Insets(20, 0, 20, 0);

        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridx = 0;
        gridBagConstraints3.gridy = 2;
        gridBagConstraints3.ipadx = 80;
        gridBagConstraints3.ipady = 20;
        gridBagConstraints3.anchor = GridBagConstraints.CENTER;
        gridBagConstraints3.insets = new Insets(20, 0, 10, 0);


        frame.add(label1,gridBagConstraints);
        frame.add(userLogin,gridBagConstraints2);
        frame.add(adminLogin,gridBagConstraints3);


        frame.setVisible(true);

        adminLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adminLogin();
            }
        });
        userLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userLogin();
            }
        });


    }

    JPasswordField passwordField2=new JPasswordField();
    JLabel text=new JLabel("Enter Pin To Continue");
    public void adminLogin(){
        JFrame frame=new JFrame("Admin Portal");

        JLabel text1=new JLabel("Welcome To Admin Portal");


        JButton nextButton=new JButton("Next");
        JButton prevButton=new JButton("Back");

        frame.setSize(400, 450);
        frame.getContentPane().setBackground(new Color(0, 162, 255));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());


        text1.setFont(new Font("Gill sans", Font.BOLD, 24));
        text1.setForeground(new Color(94, 94, 94));

        text.setFont(new Font("Gill sans", Font.BOLD, 24));
        text.setForeground(new Color(94, 94, 94));


        nextButton.setFont(new Font("Gill sans", Font.PLAIN, 18));
        nextButton.setForeground(new Color(94, 94, 94));

        prevButton.setFont(new Font("Gill sans", Font.PLAIN, 18));
        prevButton.setForeground(new Color(94, 94, 94));


        passwordField2.setHorizontalAlignment(JPasswordField.CENTER);


        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        gridBagConstraints.insets = new Insets(10, 0, 10, 0);

        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridx = 0;
        gridBagConstraints2.gridy = 1;
        gridBagConstraints2.anchor = GridBagConstraints.CENTER;
        gridBagConstraints2.insets = new Insets(5, 0, 5, 0);


        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.gridx = 0;
        gridBagConstraints5.gridy = 4;
        gridBagConstraints5.gridwidth = 3;
        gridBagConstraints5.gridheight = 1;
        gridBagConstraints5.ipadx = 270;
        gridBagConstraints5.ipady = 30;
        gridBagConstraints5.anchor = GridBagConstraints.CENTER;
        gridBagConstraints5.insets = new Insets(10, 0, 10, 0);

        GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.gridx = 0;
        gridBagConstraints6.gridy = 5;
        gridBagConstraints6.anchor = GridBagConstraints.CENTER;
        gridBagConstraints6.insets = new Insets(20, 0, 10, 0);


        JPanel panel=new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,30,30));
        panel.setBackground(new Color(0, 162, 255));
        panel.add(prevButton);
        panel.add(nextButton);
        frame.add(panel,gridBagConstraints6);

        frame.add(text1, gridBagConstraints);
        frame.add(text, gridBagConstraints2);
        frame.add(passwordField2, gridBagConstraints5);


        frame.setVisible(true);

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                loginHandling2(frame);
            }
        });

        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                back(frame);
            }
        });

    }

    public void back(JFrame frame){
        frame.dispose();
    }


    public void loginHandling2(JFrame frame) {
        char[] password = passwordField2.getPassword();
        if (password == null | password.length == 0) {
            passwordField2.setBorder(BorderFactory.createLineBorder(Color.red));
            text.setText("Enter Valid Pin: ");
            text.setForeground(Color.red);
        } else {
            String convertedPassword = new String(password);
            try {
                int result = Integer.parseInt(convertedPassword);
                if (result == 5555) {
                    disposeFrameAfterAdminHome(frame);
                } else {

                    passwordField2.setBorder(BorderFactory.createLineBorder(Color.red));
                    text.setText(" Enter the Right Pin: ");
                    text.setForeground(Color.red);
                }
            } catch (NumberFormatException numberFormatException) {
                passwordField2.setBorder(BorderFactory.createLineBorder(Color.red));
                text.setText("Invalid Pin: ");
                text.setForeground(Color.red);
            }


        }

    }
    // Create a method to dispose the frame after the adminHome() function completes
    public void disposeFrameAfterAdminHome(JFrame frame) {
        // Call the adminHome() function
        adminHome();

        // Dispose the frame
        frame.dispose();
    }



    JLabel user=new JLabel("Enter Username:");
    JTextField userInput=new JTextField();

    JLabel text2=new JLabel("Enter Password:");
    public void editProfile(){
        JFrame editFrame=new JFrame("Edit Profile");
        JButton editProfile=new JButton("UPDATE");

        editFrame.setSize(450, 550);
        editFrame.getContentPane().setBackground(new Color(0, 162, 255));
        editFrame.setLocationRelativeTo(null);
        editFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        editFrame.setLayout(new GridBagLayout());


        label.setFont(new Font("Gill sans", Font.BOLD, 24));
        label.setForeground(new Color(94, 94, 94));

        studentUserName.setFont(new Font("Gill sans", Font.BOLD, 24));
        studentUserName.setForeground(new Color(94, 94, 94));

        labelInput.setFont(new Font("Gill sans", Font.BOLD, 20));
        labelInput.setForeground(new Color(35, 34, 34));


        studentUserInput.setFont(new Font("Gill sans", Font.BOLD, 20));
        studentUserInput.setForeground(new Color(35, 34, 34));


        update.setFont(new Font("Gill sans", Font.BOLD, 24));
        update.setForeground(new Color(94, 94, 94));

        updateInput.setFont(new Font("Gill sans", Font.BOLD, 20));
        updateInput.setForeground(new Color(35, 34, 34));


        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        gridBagConstraints.insets = new Insets(20, 0, 30, 0);

        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridx = 0;
        gridBagConstraints2.gridy = 1;
        gridBagConstraints2.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints2.insets = new Insets(5, 0, 5, 0);


        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridx = 0;
        gridBagConstraints3.gridy = 2;
        gridBagConstraints3.ipadx = 350;
        gridBagConstraints3.ipady = 15;
        gridBagConstraints3.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints3.insets = new Insets(10, 20, 10, 0);

        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.gridx = 0;
        gridBagConstraints4.gridy = 3;
        gridBagConstraints4.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints4.insets = new Insets(20, 0, 10, 0);

        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.gridx = 0;
        gridBagConstraints5.gridy = 4;
        gridBagConstraints5.ipadx = 350;
        gridBagConstraints5.ipady = 20;
        gridBagConstraints5.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints5.insets = new Insets(10, 20, 10, 0);

        GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.gridx = 0;
        gridBagConstraints6.gridy = 5;
        gridBagConstraints6.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints6.insets = new Insets(20, 0, 10, 0);

        GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.gridx = 0;
        gridBagConstraints7.gridy = 6;
        gridBagConstraints7.ipadx = 350;
        gridBagConstraints7.ipady = 20;
        gridBagConstraints7.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints7.insets = new Insets(10, 20, 10, 0);

        GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
        gridBagConstraints8.gridx = 0;
        gridBagConstraints8.gridy = 7;
        gridBagConstraints8.ipadx=100;
        gridBagConstraints8.ipady=20;
        gridBagConstraints8.anchor = GridBagConstraints.CENTER;
        gridBagConstraints8.insets = new Insets(20, 0, 10, 0);



        editFrame.add(editLabel, gridBagConstraints);
        editFrame.add(label,gridBagConstraints2);
        editFrame.add(labelInput,gridBagConstraints3);
        editFrame.add(studentUserName, gridBagConstraints4);
        editFrame.add(studentUserInput, gridBagConstraints5);
        editFrame.add(update,gridBagConstraints6);
        editFrame.add(updateInput,gridBagConstraints7);
        editFrame.add(editProfile,gridBagConstraints8);


        editFrame.setVisible(true);

        editProfile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editFrame.dispose();
                updateProfile();
            }
        });

    }

    JPasswordField passwordField=new JPasswordField();
    JButton loginButton=new JButton("Login");
    public void userLogin(){
        JFrame userframe=new JFrame("Student Portal");
        JLabel text1=new JLabel("Welcome To Student Portal");

        JButton prevButton=new JButton("Back");
        userframe.setSize(500, 550);
        userframe.getContentPane().setBackground(new Color(0, 162, 255));
        userframe.setLocationRelativeTo(null);
        userframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        userframe.setLayout(new GridBagLayout());


        text1.setFont(new Font("Gill sans", Font.BOLD, 24));
        text1.setForeground(new Color(94, 94, 94));

        text2.setFont(new Font("Gill sans", Font.BOLD, 24));
        text2.setForeground(new Color(94, 94, 94));

        user.setFont(new Font("Gill sans", Font.BOLD, 24));
        user.setForeground(new Color(94, 94, 94));

        userInput.setFont(new Font("Gill sans", Font.BOLD, 24));
        userInput.setForeground(new Color(35, 34, 34));

        passwordField.setFont(new Font("Gill sans", Font.BOLD, 24));
        passwordField.setForeground(new Color(35, 34, 34));



       loginButton.setFont(new Font("Gill sans", Font.PLAIN, 18));
        loginButton.setForeground(new Color(94, 94, 94));

        loginButton.setPreferredSize(new Dimension(100,25));
        prevButton.setPreferredSize(new Dimension(100,25));

        prevButton.setFont(new Font("Gill sans", Font.PLAIN, 18));
        prevButton.setForeground(new Color(94, 94, 94));


        passwordField.setHorizontalAlignment(JPasswordField.CENTER);


        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        gridBagConstraints.insets = new Insets(20, 0, 30, 0);

        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridx = 0;
        gridBagConstraints2.gridy = 1;
        gridBagConstraints2.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints2.insets = new Insets(5, 0, 5, 0);


        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridx = 0;
        gridBagConstraints3.gridy = 2;
        gridBagConstraints3.ipadx = 350;
        gridBagConstraints3.ipady = 15;
        gridBagConstraints3.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints3.insets = new Insets(10, 20, 10, 0);

        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.gridx = 0;
        gridBagConstraints4.gridy = 3;
        gridBagConstraints4.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints4.insets = new Insets(20, 0, 10, 0);

        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.gridx = 0;
        gridBagConstraints5.gridy = 4;
        gridBagConstraints5.ipadx = 350;
        gridBagConstraints5.ipady = 20;
        gridBagConstraints5.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints5.insets = new Insets(10, 20, 10, 0);

        GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.gridx = 0;
        gridBagConstraints6.gridy = 5;
        gridBagConstraints6.anchor = GridBagConstraints.CENTER;
        gridBagConstraints6.insets = new Insets(20, 0, 10, 0);

        JPanel panel=new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,30,30));
        panel.setBackground(new Color(0, 162, 255));
        panel.add(prevButton);
        panel.add(loginButton);
        userframe.add(panel,gridBagConstraints6);

        userframe.add(text1, gridBagConstraints);
        userframe.add(user,gridBagConstraints2);
        userframe.add(userInput,gridBagConstraints3);
        userframe.add(text2, gridBagConstraints4);
        userframe.add(passwordField, gridBagConstraints5);


        userframe.setVisible(true);
//        frame.dispose();
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                userLoginHandling();
                userframe.dispose();
            }
        });

        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                login();
                userframe.dispose();
            }
        });
    }

    public void userLoginHandling() {


        String user=userInput.getText();

        char[] password=passwordField.getPassword();

        String userPassword=new String(password);
        try{
            File file=new File("src/School/database.txt");
            Scanner scanner=new Scanner(file);
            while(scanner.hasNext()){
                String dataFile=scanner.nextLine();
                String[] array = dataFile.split(" ");
                if((Objects.equals(array[4], user))&&(Objects.equals(array[5],userPassword))){
                    studentHome(array);
                }

            }
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.out.println("file does not exist");

        }


    }
    //view profile
    public void studentHome(String[] array){
        JFrame studentHome=new JFrame("Student Profile");
        JLabel profile=new JLabel("Your Profile Details");
        JLabel userName=new JLabel("UserName:");
        JLabel firstName=new JLabel("First Name:");
        JLabel lastName=new JLabel("Last Name:");
        JLabel age=new JLabel("Age:");
        JLabel department=new JLabel("Department:");
        JLabel matric=new JLabel("Matriculation Number:");

        JLabel userNameValue=new JLabel(array[4]);
        JLabel firstNameValue=new JLabel(array[0]);
        JLabel lastNameValue=new JLabel(array[1]);
        JLabel ageValue=new JLabel(array[2]);
        JLabel departmentValue=new JLabel(array[3]);
        JLabel matricValue=new JLabel(array[6]);


        JButton prevButton=new JButton("Back");


        studentHome.setSize(900, 650);
        studentHome.getContentPane().setBackground(new Color(0, 162, 255));
        studentHome.setLocationRelativeTo(null);
        studentHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studentHome.setLayout(new GridBagLayout());


        profile.setFont(new Font("Gill sans", Font.BOLD, 24));
        profile.setForeground(new Color(94, 94, 94));

        firstName.setFont(new Font("Gill sans", Font.BOLD, 24));
        firstName.setForeground(new Color(94, 94, 94));

        firstNameValue.setFont(new Font("Gill sans", Font.BOLD, 24));
        firstNameValue.setForeground(new Color(35, 34, 34));

        lastName.setFont(new Font("Gill sans", Font.BOLD, 24));
        lastName.setForeground(new Color(94, 94, 94));

        lastNameValue.setFont(new Font("Gill sans", Font.BOLD, 24));
        lastNameValue.setForeground(new Color(35, 34, 34));

        age.setFont(new Font("Gill sans", Font.BOLD, 24));
        age.setForeground(new Color(94, 94, 94));

        ageValue.setFont(new Font("Gill sans", Font.BOLD, 24));
        ageValue.setForeground(new Color(35, 34, 34));

        department.setFont(new Font("Gill sans", Font.BOLD, 24));
        department.setForeground(new Color(94, 94, 94));

        departmentValue.setFont(new Font("Gill sans", Font.BOLD, 24));
        departmentValue.setForeground(new Color(35, 34, 34));

        userName.setFont(new Font("Gill sans", Font.BOLD, 24));
        userName.setForeground(new Color(94, 94, 94));

        userNameValue.setFont(new Font("Gill sans", Font.BOLD, 24));
        userNameValue.setForeground(new Color(35, 34, 34));

        matric.setFont(new Font("Gill sans", Font.BOLD, 24));
        matric.setForeground(new Color(94, 94, 94));

        matricValue.setFont(new Font("Gill sans", Font.BOLD, 24));
        matricValue.setForeground(new Color(35, 34, 34));

        prevButton.setFont(new Font("Gill sans", Font.BOLD, 24));
        prevButton.setForeground(new Color(94, 94, 94));


        JPanel panel=new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,60,5));
        panel.add(userName);
        panel.add(userNameValue);
        panel.setBackground(new Color(0, 162, 255));

        JPanel panel2=new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER,65,5));
        panel2.setBackground(new Color(0, 162, 255));
        panel2.add(firstName);
        panel2.add(firstNameValue);


        JPanel panel3=new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER,65,5));
        panel3.setBackground(new Color(0, 162, 255));
        panel3.add(lastName);
        panel3.add(lastNameValue);


        JPanel panel4=new JPanel();
        panel4.setLayout(new FlowLayout(FlowLayout.CENTER,80,5));
        panel4.setBackground(new Color(0, 162, 255));
        panel4.add(age);
        panel4.add(ageValue);


        JPanel panel5=new JPanel();
        panel5.setLayout(new FlowLayout(FlowLayout.CENTER,65,5));
        panel5.setBackground(new Color(0, 162, 255));
        panel5.add(department);
        panel5.add(departmentValue);

        JPanel panel6=new JPanel();
        panel6.setLayout(new FlowLayout(FlowLayout.CENTER,60,5));
        panel6.setBackground(new Color(0, 162, 255));
        panel6.add(matric);
        panel6.add(matricValue);


        prevButton.setPreferredSize(new Dimension(150,60));

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        gridBagConstraints.insets = new Insets(10, 0, 10, 0);

        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridx = 0;
        gridBagConstraints2.gridy = 1;
        gridBagConstraints2.anchor = GridBagConstraints.CENTER;
        gridBagConstraints2.insets = new Insets(10, 0, 10, 0);

        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridx = 0;
        gridBagConstraints3.gridy = 2;
        gridBagConstraints3.anchor = GridBagConstraints.CENTER;
        gridBagConstraints3.insets = new Insets(10, 0, 10, 0);

        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.gridx = 0;
        gridBagConstraints4.gridy = 3;
        gridBagConstraints4.anchor = GridBagConstraints.CENTER;
        gridBagConstraints4.insets = new Insets(10, 0, 10, 0);

        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.gridx = 0;
        gridBagConstraints5.gridy = 4;
        gridBagConstraints5.anchor = GridBagConstraints.CENTER;
        gridBagConstraints5.insets = new Insets(10, 0, 10, 0);

        GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.gridx = 0;
        gridBagConstraints6.gridy = 5;
        gridBagConstraints6.anchor = GridBagConstraints.CENTER;
        gridBagConstraints6.insets = new Insets(10, 0, 10, 0);

        GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.gridx = 0;
        gridBagConstraints7.gridy = 6;
        gridBagConstraints7.anchor = GridBagConstraints.CENTER;
        gridBagConstraints7.insets = new Insets(10, 0, 10, 0);


        GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
        gridBagConstraints8.gridx = 0;
        gridBagConstraints8.gridy = 7;
        gridBagConstraints8.anchor = GridBagConstraints.CENTER;
        gridBagConstraints8.insets = new Insets(10, 0, 10, 0);



        studentHome.add(profile,gridBagConstraints);
        studentHome.add(panel,gridBagConstraints2);
        studentHome.add(panel2,gridBagConstraints3);
        studentHome.add(panel3,gridBagConstraints4);
        studentHome.add(panel4,gridBagConstraints5);
        studentHome.add(panel5,gridBagConstraints6);
        studentHome.add(panel6,gridBagConstraints7);
        studentHome.add(prevButton,gridBagConstraints8);

        studentHome.setVisible(true);

        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                back(studentHome);
            }
        });
    }
    //studentRegistration
    //profile Edit

    public void adminHome(){

        JFrame adminframe=new JFrame("Admin Home");
        JLabel label1=new JLabel("Welcome!!!");
        JLabel label2=new JLabel("Pick An Option:");
        JButton studentReg=new JButton("Student Registration");
        JButton editProfile=new JButton("Edit Profile");

        JButton nextButton=new JButton("Next");
        JButton prevButton=new JButton("Back");

        adminframe.setSize(400, 450);
        adminframe.getContentPane().setBackground(new Color(0, 162, 255));
        adminframe.setLocationRelativeTo(null);
        adminframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        adminframe.setLayout(new GridBagLayout());


        label1.setFont(new Font("Gill sans", Font.BOLD, 24));
        label1.setForeground(new Color(94, 94, 94));

        label2.setFont(new Font("Gill sans", Font.BOLD, 24));
        label2.setForeground(new Color(94, 94, 94));



        nextButton.setFont(new Font("Gill sans", Font.PLAIN, 18));
        nextButton.setForeground(new Color(94, 94, 94));

        prevButton.setFont(new Font("Gill sans", Font.PLAIN, 18));
        prevButton.setForeground(new Color(94, 94, 94));

        JPanel panel=new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,30,30));
        panel.setBackground(new Color(0, 162, 255));
        panel.add(prevButton);
        panel.add(nextButton);
//        userframe.add(panel,gridBagConstraints6);

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        gridBagConstraints.insets = new Insets(10, 0, 10, 0);

        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridx = 0;
        gridBagConstraints2.gridy = 1;
        gridBagConstraints2.anchor = GridBagConstraints.CENTER;
        gridBagConstraints2.insets = new Insets(5, 0, 5, 0);

        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridx = 0;
        gridBagConstraints3.gridy = 4;
        gridBagConstraints3.anchor = GridBagConstraints.CENTER;
        gridBagConstraints3.insets = new Insets(5, 0, 5, 0);


        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.gridx = 0;
        gridBagConstraints5.gridy = 2;
        gridBagConstraints5.ipadx = 60;
        gridBagConstraints5.ipady = 20;
        gridBagConstraints5.anchor = GridBagConstraints.CENTER;
        gridBagConstraints5.insets = new Insets(10, 0, 10, 0);


        GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.gridx = 0;
        gridBagConstraints6.gridy = 3;
        gridBagConstraints6.ipadx = 60;
        gridBagConstraints6.ipady = 20;
        gridBagConstraints6.anchor = GridBagConstraints.CENTER;
        gridBagConstraints6.insets = new Insets(10, 0, 10, 0);

        adminframe.add(label1,gridBagConstraints);
        adminframe.add(label2,gridBagConstraints2);
        adminframe.add(studentReg,gridBagConstraints5);
        adminframe.add(editProfile,gridBagConstraints6);
        adminframe.add(panel,gridBagConstraints3);

        adminframe.setVisible(true);
        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                back(adminframe);
            }
        });
        studentReg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                studentReg();
                adminframe.dispose();
            }
        });

        editProfile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                editProfile();
                adminframe.dispose();
            }
        });
    }

    JLabel editLabel=new JLabel("Student Profile Edit Page");
    JLabel label=new JLabel("What would you like to Update");
    JTextField labelInput=new JTextField();
    JLabel studentUserName=new JLabel("Enter Student's UserName:");
    JTextField studentUserInput=new JTextField();
    JLabel update=new JLabel("Enter New Information");
    JTextField updateInput=new JTextField();
    public void updateProfile(){
        String userNameInput=studentUserInput.getText();
        String infoToUpdate=labelInput.getText();
        String updatedInfo=updateInput.getText();
        int updateNo = switch (infoToUpdate.toLowerCase()) {
            case "firstname" -> 0;
            case "lastname" -> 1;
            case "age" -> 2;
            case "department" -> 3;
            case "username" -> 4;
            case "matriculation number" -> 6;
            default -> 0;
        };
        try {
            File file = new File("src/School/database.txt");
            File tempFile = new File("src/School/temp.txt");
            FileWriter fileWriter = new FileWriter(tempFile);

            StringBuilder newData = new StringBuilder();
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String dataFile = scanner.nextLine();
                String[] array = dataFile.split(" ");
                if ((Objects.equals(array[4], userNameInput))) {
                    array[updateNo] = updatedInfo;
                }
                newData.append(String.join(" ", array)).append("\n");
            }

            fileWriter.write(newData.toString());

            scanner.close();
            fileWriter.close();

            Path originalPath = file.toPath();
            Path tempPath = tempFile.toPath();
            Files.move(tempPath, originalPath, StandardCopyOption.REPLACE_EXISTING);

            updateSuccess();
        } catch (IOException ioException) {
            System.out.println("ERROR");
        }

    }
    public void updateSuccess(){
        JOptionPane.showMessageDialog(null,"success");
        login();
    }


    JLabel label1=new JLabel("Input the Details Below:");

    JLabel firstName=new JLabel("First Name:");
    JTextField firstNameInput=new JTextField();

    JLabel lastName=new JLabel("Last Name:");
    JTextField lastNameInput=new JTextField();

    JLabel age=new JLabel("Age:");
    JTextField ageInput=new JTextField();

    JLabel department=new JLabel("Department:");
    JTextField departmentInput=new JTextField();


    JLabel userName=new JLabel("UserName:");
    JTextField userNameInput=new JTextField();

    JLabel password=new JLabel("Password:");
    JPasswordField passwordInput=new JPasswordField();
    public void studentReg(){
        JFrame studentReg=new JFrame("Student Registration");
        JButton signup=new JButton("SIGNUP");

        JButton prevButton=new JButton("Back");

        studentReg.setSize(900, 650);
        studentReg.getContentPane().setBackground(new Color(0, 162, 255));
        studentReg.setLocationRelativeTo(null);
        studentReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studentReg.setLayout(new GridBagLayout());


        label1.setFont(new Font("Gill sans", Font.BOLD, 24));
        label1.setForeground(new Color(94, 94, 94));

        firstName.setFont(new Font("Gill sans", Font.BOLD, 24));
        firstName.setForeground(new Color(94, 94, 94));

        firstNameInput.setFont(new Font("Gill sans", Font.BOLD, 20));
        firstNameInput.setForeground(new Color(35, 34, 34));

        lastName.setFont(new Font("Gill sans", Font.BOLD, 24));
        lastName.setForeground(new Color(94, 94, 94));

        lastNameInput.setFont(new Font("Gill sans", Font.BOLD, 20));
        lastNameInput.setForeground(new Color(35, 34, 34));

        age.setFont(new Font("Gill sans", Font.BOLD, 24));
        age.setForeground(new Color(94, 94, 94));

        ageInput.setFont(new Font("Gill sans", Font.BOLD, 20));
        ageInput.setForeground(new Color(35, 34, 34));

        department.setFont(new Font("Gill sans", Font.BOLD, 24));
        department.setForeground(new Color(94, 94, 94));

        departmentInput.setFont(new Font("Gill sans", Font.BOLD, 20));
        departmentInput.setForeground(new Color(35, 34, 34));

        userName.setFont(new Font("Gill sans", Font.BOLD, 24));
        userName.setForeground(new Color(94, 94, 94));

        userNameInput.setFont(new Font("Gill sans", Font.BOLD, 24));
        userNameInput.setForeground(new Color(35, 34, 34));

        password.setFont(new Font("Gill sans", Font.BOLD, 24));
        password.setForeground(new Color(94, 94, 94));

        passwordInput.setFont(new Font("Gill sans", Font.BOLD, 20));
        passwordInput.setForeground(new Color(35, 34, 34));

        signup.setFont(new Font("Gill sans", Font.BOLD, 24));
        signup.setForeground(new Color(94, 94, 94));



        prevButton.setFont(new Font("Gill sans", Font.BOLD, 24));
        prevButton.setForeground(new Color(94, 94, 94));

        studentReg.setVisible(true);



        JPanel panel=new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,60,5));
        panel.add(firstName);
        panel.add(firstNameInput);
        panel.setBackground(new Color(0, 162, 255));
        firstNameInput.setPreferredSize(new Dimension(200,40));

        JPanel panel2=new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER,65,5));
        panel2.setBackground(new Color(0, 162, 255));
        panel2.add(lastName);
        panel2.add(lastNameInput);

        lastNameInput.setPreferredSize(new Dimension(200,40));

        JPanel panel3=new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER,150,5));
        panel3.setBackground(new Color(0, 162, 255));
        panel3.add(age);
        panel3.add(ageInput);

        ageInput.setPreferredSize(new Dimension(200,40));

        JPanel panel4=new JPanel();
        panel4.setLayout(new FlowLayout(FlowLayout.CENTER,50,5));
        panel4.setBackground(new Color(0, 162, 255));
        panel4.add(department);
        panel4.add(departmentInput);

        departmentInput.setPreferredSize(new Dimension(200,40));

        JPanel panel5=new JPanel();
        panel5.setLayout(new FlowLayout(FlowLayout.CENTER,65,5));
        panel5.setBackground(new Color(0, 162, 255));
        panel5.add(userName);
        panel5.add(userNameInput);

        userNameInput.setPreferredSize(new Dimension(200,40));

        JPanel panel6=new JPanel();
        panel6.setLayout(new FlowLayout(FlowLayout.CENTER,80,5));
        panel6.setBackground(new Color(0, 162, 255));
        panel6.add(password);
        panel6.add(passwordInput);

        passwordInput.setPreferredSize(new Dimension(200,40));

        JPanel panel7=new JPanel();
        panel7.setLayout(new FlowLayout(FlowLayout.CENTER,70,30));
        panel7.setBackground(new Color(0, 162, 255));
        panel7.add(prevButton);
        panel7.add(signup);

        signup.setPreferredSize(new Dimension(150,60));
        prevButton.setPreferredSize(new Dimension(150,60));

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        gridBagConstraints.insets = new Insets(10, 0, 10, 0);

        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridx = 0;
        gridBagConstraints2.gridy = 1;
        gridBagConstraints2.anchor = GridBagConstraints.CENTER;
        gridBagConstraints2.insets = new Insets(10, 0, 10, 0);

        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridx = 0;
        gridBagConstraints3.gridy = 2;
        gridBagConstraints3.anchor = GridBagConstraints.CENTER;
        gridBagConstraints3.insets = new Insets(10, 0, 10, 0);

        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.gridx = 0;
        gridBagConstraints4.gridy = 3;
        gridBagConstraints4.anchor = GridBagConstraints.CENTER;
        gridBagConstraints4.insets = new Insets(10, 0, 10, 0);

        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.gridx = 0;
        gridBagConstraints5.gridy = 4;
        gridBagConstraints5.anchor = GridBagConstraints.CENTER;
        gridBagConstraints5.insets = new Insets(10, 0, 10, 0);

        GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.gridx = 0;
        gridBagConstraints6.gridy = 5;
        gridBagConstraints6.anchor = GridBagConstraints.CENTER;
        gridBagConstraints6.insets = new Insets(10, 0, 10, 0);


        GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.gridx = 0;
        gridBagConstraints7.gridy = 6;
        gridBagConstraints7.anchor = GridBagConstraints.CENTER;
        gridBagConstraints7.insets = new Insets(10, 0, 10, 0);

        GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
        gridBagConstraints8.gridx = 0;
        gridBagConstraints8.gridy = 7;
        gridBagConstraints8.anchor = GridBagConstraints.CENTER;
        gridBagConstraints8.insets = new Insets(10, 0, 10, 0);

        studentReg.setVisible(true);

        studentReg.add(label1,gridBagConstraints);
        studentReg.add(panel,gridBagConstraints2);
        studentReg.add(panel2,gridBagConstraints3);
        studentReg.add(panel3,gridBagConstraints4);
        studentReg.add(panel4,gridBagConstraints5);
        studentReg.add(panel5,gridBagConstraints6);
        studentReg.add(panel6,gridBagConstraints7);
        studentReg.add(panel7,gridBagConstraints8);

        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                back(studentReg);
            }
        });

        signup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    saveToFile();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                studentReg.dispose();
            }
        });

    }
    public void saveToFile() throws IOException {
        String firstName=firstNameInput.getText();
        String lastName=lastNameInput.getText();
        int age=Integer.parseInt(ageInput.getText());
        String matricNo = "";
        String department=departmentInput.getText();

        File counterFile = new File("src/School/counter.txt");
        FileReader counterFileReader = new FileReader(counterFile);
        BufferedReader counterBufferedReader = new BufferedReader(counterFileReader);

        // Read each counter value from separate lines and assign them to the corresponding variables
        int compStudent = Integer.parseInt(counterBufferedReader.readLine());
        int cyberStudent = Integer.parseInt(counterBufferedReader.readLine());
        int itStudent = Integer.parseInt(counterBufferedReader.readLine());

        counterBufferedReader.close();
        counterFileReader.close();


        if(Objects.equals(department, "computer")){
            compStudent++;
            matricNo="BHU/21/04/05/000"+compStudent;

        }

        if(Objects.equals(department, "cybersecurity")){
            cyberStudent++;
            matricNo="BHU/21/04/09/000"+cyberStudent;

        }

        if(Objects.equals(department, "it")){
            itStudent++;
            matricNo="BHU/21/04/10/000"+itStudent;

        }

        try {
            // Save the current counter values to the file
            FileWriter counterFileWriter = new FileWriter(counterFile);
            BufferedWriter counterBufferedWriter = new BufferedWriter(counterFileWriter);
            PrintWriter counterPrintWriter = new PrintWriter(counterBufferedWriter);

            // Save each counter value on separate lines
            counterPrintWriter.println(compStudent);
            counterPrintWriter.println(cyberStudent);
            counterPrintWriter.println(itStudent);

            counterPrintWriter.close();
            counterBufferedWriter.close();
            counterFileWriter.close();

            regSuccess();
        } catch (IOException ioException) {
            System.out.println("ERROR OCCURRED WHILE SAVING COUNTER VALUES");
        }
        String userName=userNameInput.getText();
        char[] password=passwordInput.getPassword();
        String userPassword=new String(password);

        String savedData=firstName +" "+ lastName+" " +age+" "+department+" "+userName+" "+userPassword+" "+matricNo;
        try{
            File file=new File("src/School/database.txt");
            FileWriter fileWriter=new FileWriter(file,true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            PrintWriter printWriter=new PrintWriter(bufferedWriter);
            printWriter.println(savedData);

            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();


            regSuccess();
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.out.println("file does not exist");

        }
        catch (IOException ioException){
            System.out.println("ERROR OCCURRED");
        }

    }
    public void regSuccess(){

        JFrame frame=new JFrame("Success!!");
        JLabel message=new JLabel("Registration was successful!!!");
        JButton backToHome=new JButton("<<Back To Home");

        frame.setSize(400, 450);
        frame.getContentPane().setBackground(new Color(0, 162, 255));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());


        message.setFont(new Font("Gill sans", Font.BOLD, 24));
        message.setForeground(new Color(29, 114, 40));

        backToHome.setFont(new Font("Gill sans", Font.BOLD, 24));
        backToHome.setForeground(new Color(94, 94, 94));

        GridBagConstraints gridBagConstraints=new GridBagConstraints();
        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=0;
        gridBagConstraints.anchor=GridBagConstraints.CENTER;
        gridBagConstraints.insets=new Insets(50,0,50,0);

        GridBagConstraints gridBagConstraints2=new GridBagConstraints();
        gridBagConstraints2.gridx=0;
        gridBagConstraints2.gridy=1;
        gridBagConstraints2.ipadx=60;
        gridBagConstraints2.ipady=25;
        gridBagConstraints2.anchor=GridBagConstraints.CENTER;
        gridBagConstraints2.insets=new Insets(50,0,50,0);

        frame.setVisible(true);

        frame.add(message,gridBagConstraints);
        frame.add(backToHome,gridBagConstraints2);

        backToHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                login();
                frame.dispose();
            }
        });
    }
}

