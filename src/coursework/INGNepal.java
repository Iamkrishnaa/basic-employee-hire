package coursework;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class INGNepal implements ActionListener {

    ArrayList<StaffHire> staffHires;
    JFrame frame;
    JPanel panel, datePanel;
    JLabel labelVacancyNumber, labelDesignation, labelJobType, labelSalary, labelWorkingHour, labelStaffName, labelQualification, labelJoiningDate, labelAppointedBy, labelWorkingShifts, labelWagesPerHour;
    JTextField textFieldVacancyNumber, textFieldDesignation, textFieldSalary, textFieldWorkingHour, textFieldStaffName, textFieldQualification, textFieldAppointedBy, textFieldWagesPerHour;
    JButton buttonAdd, buttonAppoint, buttonTerminate, buttonDisplay, buttonClear;
    Font fontLabel;
    Font fontTextFields;
    JComboBox<String> jobTypeCombo, workingShiftsCombo, dateMonthCombo, dateDayCombo, dateYearCombo;
    String[] jobTypes = {"", "Full Time", "Part Time"};
    String[] workingShifts = {"", "Day", "Night"};
    String[] dateDay = {"Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
    String[] dateMonth = {"Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
    String[] dateYear = {"Year", "2015", "2016", "2017", "2018", "2019", "2020"};


    public INGNepal(){
        //designing of frame of ING Nepal GUI
        frame = new JFrame();
        frame.setTitle("ING Nepal");
        frame.setSize(900,520);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        staffHires = new ArrayList<>();

        panel = new JPanel();
        frame.add(panel);
        panel.setLayout(layout);
        panel.setBackground(Color.orange);


        fontLabel = new Font("Arial", Font.BOLD, 17); //defining font for labels
        fontTextFields = new Font("Arial", Font.PLAIN, 16); //defining fonts for textfields


        //first Row
        labelVacancyNumber = new JLabel();
        labelVacancyNumber.setText("Vacancy Number: ");
        labelVacancyNumber.setFont(fontLabel);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth =1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5,5,5,5);
        panel.add(labelVacancyNumber, gbc);


        textFieldVacancyNumber = new JTextField(15);
        textFieldVacancyNumber.setFont(fontTextFields);
        textFieldVacancyNumber.setPreferredSize(new Dimension(200,30));
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5,5,5,5);
        panel.add(textFieldVacancyNumber, gbc);


        //label for job type
        labelJobType = new JLabel();
        labelJobType.setText("Job Type: ");
        labelJobType.setFont(fontLabel);
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridwidth =1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5,25,5,5);
        panel.add(labelJobType, gbc);


        jobTypeCombo = new JComboBox<>(jobTypes);
        jobTypeCombo.setFont(fontLabel);
        jobTypeCombo.setPreferredSize(new Dimension(100,30));
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5,5,5,5);
        panel.add(jobTypeCombo, gbc);

        // Second Row
        labelDesignation = new JLabel();
        labelDesignation.setText("Designation: ");
        labelDesignation.setFont(fontLabel);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth =1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5,5,5,5);
        panel.add(labelDesignation, gbc);

        textFieldDesignation = new JTextField(15);
        textFieldDesignation.setFont(fontTextFields);
        textFieldDesignation.setPreferredSize(new Dimension(100,30));
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5,5,5,5);
        panel.add(textFieldDesignation, gbc);

        labelWorkingHour = new JLabel();
        labelWorkingHour.setText("Working Hour: ");
        labelWorkingHour.setFont(fontLabel);
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth =1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5,25,5,5);
        panel.add(labelWorkingHour, gbc);


        textFieldWorkingHour = new JTextField(15);
        textFieldWorkingHour.setFont(fontTextFields);
        textFieldWorkingHour.setPreferredSize(new Dimension(100,30));
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5,5,5,5);
        panel.add(textFieldWorkingHour, gbc);

        //Third Row

        labelSalary = new JLabel();
        labelSalary.setText("Salary: ");
        labelSalary.setFont(fontLabel);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth =1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5,5,5,5);
        panel.add(labelSalary, gbc);

        textFieldSalary = new JTextField(15);
        textFieldSalary.setFont(fontTextFields);
        textFieldSalary.setPreferredSize(new Dimension(100,30));
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(5,5,5,5);
        panel.add(textFieldSalary, gbc);


        labelWagesPerHour = new JLabel();
        labelWagesPerHour.setText("Wages Per Hour: ");
        labelWagesPerHour.setFont(fontLabel);
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridwidth =1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5,25,5,5);
        panel.add(labelWagesPerHour, gbc);

        textFieldWagesPerHour = new JTextField(15);
        textFieldWagesPerHour.setFont(fontTextFields);
        textFieldWagesPerHour.setPreferredSize(new Dimension(100,30));
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(5,5,5,5);
        panel.add(textFieldWagesPerHour, gbc);



        //fourth row
        labelWorkingShifts = new JLabel();
        labelWorkingShifts.setText("Working Shifts: ");
        labelWorkingShifts.setFont(fontLabel);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth =1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5,5,5,5);
        panel.add(labelWorkingShifts, gbc);

        workingShiftsCombo = new JComboBox<>(workingShifts);
        workingShiftsCombo.setFont(fontLabel);
        workingShiftsCombo.setPreferredSize(new Dimension(100,30));
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5,5,5,5);
        panel.add(workingShiftsCombo, gbc);

        buttonAdd = new JButton();
        buttonAdd.setText("Add Vacancy");
        buttonAdd.addActionListener(this);
        buttonAdd.setFont(fontLabel);
        buttonAdd.setPreferredSize(new Dimension(100,50));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(5,5,5,5);
        panel.add(buttonAdd, gbc);

        //fifth row
        labelStaffName = new JLabel();
        labelStaffName.setText("Staff Name: ");
        labelStaffName.setFont(fontLabel);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth =1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(50,5,5,5);
        panel.add(labelStaffName, gbc);


        textFieldStaffName = new JTextField(15);
        textFieldStaffName.setFont(fontTextFields);
        textFieldStaffName.setPreferredSize(new Dimension(100,30));
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(50,5,5,5);
        panel.add(textFieldStaffName, gbc);

        labelJoiningDate = new JLabel();
        labelJoiningDate.setText("Joining Date: ");
        labelJoiningDate.setFont(fontLabel);
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.gridwidth =1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(50,25,5,5);
        panel.add(labelJoiningDate, gbc);

        datePanel = new JPanel();
        datePanel.setLayout(new FlowLayout());
        datePanel.setBackground(Color.WHITE);
        datePanel.setPreferredSize(new Dimension(200,30));
        datePanel.setBackground(Color.orange);
        gbc.gridx = 3;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(50,5,5,5);
        panel.add(datePanel, gbc);

        dateDayCombo = new JComboBox<>(dateDay);
        dateMonthCombo = new JComboBox<>(dateMonth);
        dateYearCombo = new JComboBox<>(dateYear);
        datePanel.add(dateDayCombo);
        datePanel.add(dateMonthCombo);
        datePanel.add(dateYearCombo);


        //sixth row
        labelQualification = new JLabel();
        labelQualification.setText("Qualification: ");
        labelQualification.setFont(fontLabel);
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth =1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5,5,5,5);
        panel.add(labelQualification, gbc);

        textFieldQualification = new JTextField(15);
        textFieldQualification.setFont(fontTextFields);
        textFieldQualification.setPreferredSize(new Dimension(100,30));
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5,5,5,5);
        panel.add(textFieldQualification, gbc);

        labelAppointedBy = new JLabel();
        labelAppointedBy.setText("Appointed By: ");
        labelAppointedBy.setFont(fontLabel);
        gbc.gridx = 2;
        gbc.gridy = 5;
        gbc.gridwidth =1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5,25,5,5);
        panel.add(labelAppointedBy, gbc);


        textFieldAppointedBy = new JTextField(15);
        textFieldAppointedBy.setFont(fontTextFields);
        textFieldAppointedBy.setPreferredSize(new Dimension(100,30));
        gbc.gridx = 3;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5,5,5,5);
        panel.add(textFieldAppointedBy, gbc);

        //seventh and eighth row
        buttonAppoint = new JButton();
        buttonAppoint.setText("Appoint");
        buttonAppoint.addActionListener(this);
        buttonAppoint.setFont(fontLabel);
        buttonAppoint.setPreferredSize(new Dimension(100,40));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(30,5,5,5);
        panel.add(buttonAppoint, gbc);


        buttonTerminate = new JButton();
        buttonTerminate.setText("Terminate");
        buttonTerminate.addActionListener(this);
        buttonTerminate.setFont(fontLabel);
        buttonTerminate.setPreferredSize(new Dimension(100,40));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 3;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        buttonTerminate.setBackground(Color.red);
        buttonTerminate.setForeground(Color.white);
        gbc.insets = new Insets(30,5,5,5);
        panel.add(buttonTerminate, gbc);

        buttonDisplay = new JButton();
        buttonDisplay.setText("Display");
        buttonDisplay.addActionListener(this);
        buttonDisplay.setFont(fontLabel);
        buttonDisplay.setPreferredSize(new Dimension(100,40));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(10,5,5,5);
        panel.add(buttonDisplay, gbc);


        buttonClear = new JButton();
        buttonClear.setText("Clear");
        buttonClear.addActionListener(this);
        buttonClear.setFont(fontLabel);
        buttonClear.setPreferredSize(new Dimension(100,40));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 3;
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(10,5,5,5);
        panel.add(buttonClear, gbc);

        frame.setVisible(true);


    }
    
    //below are methods to return value of each text fields
    public int getSalary() {
        return Integer.parseInt(textFieldSalary.getText());
    }

    public int getWorkingHour() {
        return Integer.parseInt(textFieldWorkingHour.getText());
    }

    public int getVacancyNumber() {
        return Integer.parseInt(textFieldVacancyNumber.getText());
    }

    public int getWagesPerHour() {
        return Integer.parseInt(textFieldWagesPerHour.getText());
    }

    public String getStaffName() {
        return textFieldStaffName.getText();
    }

    public String getDesignation() {
        return textFieldDesignation.getText();
    }

    public String getJobType() {
        return String.valueOf(jobTypeCombo.getItemAt(jobTypeCombo.getSelectedIndex()));
    }

    public String getWorkingShifts() {
        return String.valueOf(workingShiftsCombo.getItemAt(workingShiftsCombo.getSelectedIndex()));
    }

    public String getQualification() {
        return textFieldQualification.getText();
    }

    public String getDay(){
        return dateDayCombo.getItemAt(dateDayCombo.getSelectedIndex());
    }
    public String getMonth(){
        return dateMonthCombo.getItemAt(dateMonthCombo.getSelectedIndex());
    }
    public String getYear(){
        return dateYearCombo.getItemAt(dateYearCombo.getSelectedIndex());
    }

    public String getJoiningDate() {
        return (getYear() + "-" + getMonth() + "-" + getDay());
    }

    public String getAppointedBy() {
        return textFieldAppointedBy.getText();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        //Check the specific button click and applying method for that specific process
        if(e.getSource() == buttonAdd){
            switch (getJobType()) {
                case "Full Time":

                    handleFullTimeVacancyAdd();

                    break;
                case "Part Time":

                    handlePartTimeVacancyAdd();

                    break;
                case "":
                    JOptionPane.showMessageDialog(frame, "Job Type is required.");
                    jobTypeCombo.requestFocus();
                    break;

            }
        } else if(e.getSource() == buttonAppoint){
            switch (getJobType()) {
                case "Full Time":

                    handleFullTimeAppoint();

                    break;
                case "Part Time":

                    handlePartTimeAppoint();

                    break;
                case "":
                    JOptionPane.showMessageDialog(frame, "Job Type is required. Please select One.");
                    jobTypeCombo.requestFocus();
                    break;
            }

        } else if(e.getSource() == buttonTerminate){
            switch (getJobType()) {
                case "Part Time":

                    handleTerminate();

                    break;
                case "Full Time":
                    JOptionPane.showMessageDialog(frame, "Staff termination for full time is not available yet.");
                    break;
                case "":
                    jobTypeCombo.setSelectedIndex(2); // automatically select part time job if user select nothing and proceed termination
                    handleTerminate();
                    break;
            }
        }else if(e.getSource() == buttonDisplay){
            handleDisplay();
        } else if(e.getSource() == buttonClear){
            clear();
        }
    }


    //The below method is used to handle addition of vacancy for full time staff
    public void handleFullTimeVacancyAdd() {
        //using try-catch to handle exceptions occoured
        try {
            //checking if vacancy number isn't empty
            if (!textFieldVacancyNumber.getText().equals("")) {

                boolean vacancyPresent = false;

                /*
                using for loop checking if vacancy number entered match with existing vacancy number
                if match found, toggle vacancyPresent to true
                 */
                for (StaffHire staffHire : staffHires) {
                    if (staffHire.getVacancyNumber() == getVacancyNumber()) {
                        vacancyPresent = true;
                        break;
                    }
                }

                /*
                 * checking if vacancy is present or not
                 * if  present show appropriate message if not check size of vacancy entered is greater or not
                 * if it is greater than size of arrayList, display appropriate message and if not
                 * checking values entered add object to arrayList*/

                if (vacancyPresent) {
                    JOptionPane.showMessageDialog(frame, "Vacancy with this number already present.");
                } else {
                    if (getVacancyNumber() > staffHires.size()) {
                        JOptionPane.showMessageDialog(frame, "You can't add vacancy number greater than " + staffHires.size() + " at this time");
                    } else {
                        if (!getDesignation().equals("") && getSalary() != 0 && getWorkingHour() != 0) {
                            FullTimeStaffHire fullTimeStaffHire = new FullTimeStaffHire(getVacancyNumber(), getDesignation(), getJobType(), getSalary(), getWorkingHour());
                            staffHires.add(getVacancyNumber(), fullTimeStaffHire);
                            JOptionPane.showMessageDialog(frame, "Vacancy for Full time with vacancy number : " + getVacancyNumber() + " successfully added.");
                            clear();
                        } else {
                            JOptionPane.showMessageDialog(frame, "Designation is entered incorrectly. ");
                            textFieldDesignation.requestFocus();
                        }
                    }
                }

            } else {
                JOptionPane.showMessageDialog(frame, "Please Enter vacancy Number.");
                textFieldVacancyNumber.requestFocus();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Make sure vacancy number, salary and working hour \n are in numeric format.");
        }
    }


    //The below method is used to handle addition of vacancy for part time staff
    public void handlePartTimeVacancyAdd(){
        //using try-catch to handle exceptions occoured
        try {
            //checking if vacancy number isn't empty
            if (!textFieldVacancyNumber.getText().equals("")) {

                boolean vacancyPresent = false;

                /*
                using for loop checking if vacancy number entered match with existing vacancy number
                if match found, toggle vacancyPresent to true
                 */
                for (StaffHire staffHire : staffHires) {
                    if (staffHire.getVacancyNumber() == getVacancyNumber()) {
                        vacancyPresent = true;
                        break;
                    }
                }

                /*
                * checking if vacancy is present or not
                * if  present show appropriate message if not check size of vacancy entered is greater or not
                * if it is greater than size of arrayList, display appropriate message and if not
                * checking values entered add object to arrayList*/
                if (vacancyPresent) {
                    JOptionPane.showMessageDialog(frame, "Vacancy with this number already present.");
                } else {
                    if (getVacancyNumber() > staffHires.size()) {
                        JOptionPane.showMessageDialog(frame, "You can't add vacancy number greater than " + staffHires.size() + " at this time");
                    } else {
                        if (!getDesignation().equals("") && getWagesPerHour() != 0 && getWorkingHour() != 0 && !getWorkingShifts().equals("")) {
                            PartTimeStaffHire partTimeStaffHire = new PartTimeStaffHire(getVacancyNumber(), getDesignation(), getJobType(), getWorkingHour(), getWagesPerHour(), getWorkingShifts());
                            staffHires.add(getVacancyNumber(), partTimeStaffHire);
                            JOptionPane.showMessageDialog(frame, "Vacancy for Part time with vacancy number : " + getVacancyNumber() + " successfully added.");
                            clear();
                        } else {
                            JOptionPane.showMessageDialog(frame, "Either designation/working shifts,  are entered incorrectly.");
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Please Enter vacancy Number.");
                textFieldVacancyNumber.requestFocus();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Make sure vacancy number, wages Per Hour and working hour \n are in numeric format.");
        }
    }


    //The below method is used to handle Appointing of full time staff
    public void handleFullTimeAppoint(){
        /*Down-casting. Casting object of super class to reference of sub class
          Can't perform directly so we have used instance of to prevent errors.
        */

        try {
            boolean vacancyPresent = false;

            if (!textFieldVacancyNumber.getText().equals("")){
                if (!getStaffName().equals("") && !getQualification().equals("") && !getAppointedBy().equals("") && !getDay().equals("Day") && !getMonth().equals("Month") && !getYear().equals("Year")){
                    for (StaffHire staffHire : staffHires){
                        if (getVacancyNumber() == staffHire.getVacancyNumber()){
                            vacancyPresent = true;
                            if (staffHires.get(getVacancyNumber()) instanceof FullTimeStaffHire){
                                if (!((FullTimeStaffHire) staffHire).isJoined()){
                                    FullTimeStaffHire fullTimeStaffHire = (FullTimeStaffHire) staffHire;
                                    fullTimeStaffHire.hireFullTimeStaff(getStaffName(),getJoiningDate(),getQualification(),getAppointedBy());
                                    JOptionPane.showMessageDialog(frame, "Full Time Staff " + getStaffName() + " appointed successfully.");
                                    clear();
                                }else {
                                    JOptionPane.showMessageDialog(frame, "Staff Already appointed");
                                }
                            } else{
                                JOptionPane.showMessageDialog(frame, "The vacancy number is of part time. And you are trying to appoint full time");
                                jobTypeCombo.requestFocus();
                            }
                            break;
                        }
                    }

                    if (!vacancyPresent){
                        JOptionPane.showMessageDialog(frame, "The vacancy number you entered is not present.");
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Either joining date/staff name/qualification\nor appointed by is incorrect/invalid. ");
                }
            }else {
                JOptionPane.showMessageDialog(frame, "Please Enter vacancy Number.");
            }
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(frame, "Vacancy Number must be in numeric format.");
        }catch (Exception e){
            JOptionPane.showMessageDialog(frame, "Something went wrong.");
        }
    }


    //The below method is used to handle Appointing of part time staff
    public void handlePartTimeAppoint(){
        /*Down-casting. Casting object of super class to reference of sub class
          Can't perform directly so we have used instance of to prevent errors.
        */

        try {
            boolean vacancyPresent = false;

            if (!textFieldVacancyNumber.getText().equals("")){
                if (!getStaffName().equals("") && !getQualification().equals("") && !getAppointedBy().equals("") && !getDay().equals("Day") && !getMonth().equals("Month") && !getYear().equals("Year")){
                    for (StaffHire staffHire : staffHires){
                        if (getVacancyNumber() == staffHire.getVacancyNumber()){
                            vacancyPresent = true;
                            if (staffHires.get(getVacancyNumber()) instanceof PartTimeStaffHire){
                                if (!((PartTimeStaffHire) staffHire).isJoined()){
                                    PartTimeStaffHire partTimeStaffHire = (PartTimeStaffHire) staffHire;
                                    partTimeStaffHire.hirePartTimeStaff(getStaffName(),getJoiningDate(),getQualification(),getAppointedBy());
                                    JOptionPane.showMessageDialog(frame, "Part Time Staff " + getStaffName() + " appointed successfully.");
                                    clear();
                                }else {
                                    JOptionPane.showMessageDialog(frame, "Staff Already appointed");
                                }
                            } else{
                                JOptionPane.showMessageDialog(frame, "The vacancy number is of full time. And you are trying to appoint part time");
                                jobTypeCombo.requestFocus();
                            }
                            break;
                        }
                    }

                    if (!vacancyPresent){
                        JOptionPane.showMessageDialog(frame, "The vacancy number you entered is not present.");
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Either joining date/staff name/qualification\nor appointed by is incorrect/invalid. ");
                }
            }else {
                JOptionPane.showMessageDialog(frame, "Please Enter vacancy Number.");
            }
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(frame, "Vacancy Number must be in numeric format.");
        }catch (Exception e){
            JOptionPane.showMessageDialog(frame, "Something went wrong.");
        }

    }



    //The below method is used to handle part time staff termination
    public void handleTerminate(){
        /*Down-casting. Casting object of super class to reference of sub class
          Can't perform directly so we have used instance of to prevent errors.
        */

        boolean vacancyPresent = false; //supposing the entered vacancy number is already present in array list

        //if user enters nothing i.e user leave vacancy number empty then dialog will be shown
        if(!textFieldVacancyNumber.getText().equals("")){
            if(staffHires.size() > 0){ //checks if there is any item in array list or not
                for(StaffHire staffHire : staffHires){
                    if(getVacancyNumber() == staffHire.getVacancyNumber()){ //matching vacancy number entered with that already present
                            vacancyPresent = true; //if matched change it to true
                        if (staffHires.get(getVacancyNumber()) instanceof PartTimeStaffHire){ //checks if the element in array list is instance of part time or not
                            if (!((PartTimeStaffHire) staffHire).isTerminated()){ //checks termination status of staff
                                PartTimeStaffHire partTimeStaffHire = (PartTimeStaffHire) staffHire;
                                partTimeStaffHire.terminateStaff();
                                JOptionPane.showMessageDialog(frame, "Part Time Staff with vacancy number " + getVacancyNumber() + " terminated successfully.");
                            }else {
                                JOptionPane.showMessageDialog(frame, "Staff already terminated.");
                            }
                        } else {
                            JOptionPane.showMessageDialog(frame, "Vacancy Number you entered is of full time staff.\n Please enter it of type part time.");
                        }
                        break;
                    }
                }

                if (!vacancyPresent){
                    JOptionPane.showMessageDialog(frame, "Vacancy number doesn't match.\nTry Again!");
                }

            }else {
                JOptionPane.showMessageDialog(frame, "There are no staffs appointed yet. Add some vacancies and try again.");
            }

        } else{
            JOptionPane.showMessageDialog(frame, "Please Enter Vacancy Number.");
        }

    }

    // The below method is used to display information regarding specific class
    public void handleDisplay() {
        JFrame displayFrame = new JFrame("Details");
        displayFrame.setLocation(100,100);
        displayFrame.setUndecorated(true);
        displayFrame.setResizable(false);
        displayFrame.setSize(1300,720);

        JTable table = new JTable();

        Object[] columnsFullTime = {"Vacancy Number", "Designation", "Job Type", "Name", "Qualification", "Appointed By", "Working Hour", "Salary", "Joining Date"};
        Object[] columnsPartTime = {"Vacancy Number", "Designation", "Job Type", "Name", "Qualification", "Appointed By", "Working Hour", "Wages/Hr", "Joining Date"};

        DefaultTableModel model = new DefaultTableModel();
        Font headerFont = new Font("Arial", Font.BOLD, 14);
        JTableHeader header = table.getTableHeader();
        header.setFont(headerFont);

        table.getTableHeader().setResizingAllowed(false); //setting resizing column width false
        table.getTableHeader().setReorderingAllowed(false); // setting reordering column false

        if (getJobType().equals("Part Time")){
            model.setColumnIdentifiers(columnsPartTime);
        } else if(getJobType().equals("Full Time")){
            model.setColumnIdentifiers(columnsFullTime);
        }

        table.setModel(model);

        table.setBackground(Color.DARK_GRAY);
        table.setForeground(Color.white);
        Font font = new Font("",Font.PLAIN,14);
        table.setRowHeight(25);
        table.setFont(font);

        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(10,10,1280,500);
        displayFrame.setLayout(null);
        displayFrame.add(pane);

        JButton buttonClose = new JButton("Close");
        buttonClose.setBounds(600,510,120,40);
        displayFrame.add(buttonClose);
        buttonClose.addActionListener(e -> displayFrame.setVisible(false)); //lambda is used instead of action listener

        Object [] row = new Object[10];

        if (getJobType().equals("Full Time")) {
            for (StaffHire staffHire : staffHires) {
                if (staffHire instanceof FullTimeStaffHire) {
                    FullTimeStaffHire fullTimeStaffHire = (FullTimeStaffHire) staffHire;
                    fullTimeStaffHire.display();
                    row[0] = staffHire.getVacancyNumber();
                    row[1] = staffHire.getDesignation();
                    row[2] = staffHire.getJobType();
                    row[3] = ((FullTimeStaffHire) staffHire).getStaffName();
                    row[4] = ((FullTimeStaffHire) staffHire).getQualification();
                    row[5] = ((FullTimeStaffHire) staffHire).getAppointedBy();
                    row[6] = ((FullTimeStaffHire) staffHire).getWorkingHour();
                    row[7] = "$  " + ((FullTimeStaffHire) staffHire).getSalary();
                    row[8] = ((FullTimeStaffHire) staffHire).getJoiningDate();


                    model.addRow(row);
                }
            }

            displayFrame.setVisible(true);

        } else if (getJobType().equals("Part Time")) {
            for (StaffHire staffHire : staffHires) {
                if (staffHire instanceof PartTimeStaffHire) {
                    PartTimeStaffHire partTimeStaffHire = (PartTimeStaffHire) staffHire;
                    partTimeStaffHire.display();

                    row[0] = staffHire.getVacancyNumber();
                    row[1] = staffHire.getDesignation();
                    row[2] = staffHire.getJobType();
                    row[3] = ((PartTimeStaffHire) staffHire).getStaffName();
                    row[4] = ((PartTimeStaffHire) staffHire).getQualification();
                    row[5] = ((PartTimeStaffHire) staffHire).getAppointedBy();
                    row[6] = ((PartTimeStaffHire) staffHire).getWorkingHour();
                    row[7] = "$  " + ((PartTimeStaffHire) staffHire).getWagesPerHour();
                    row[8] = ((PartTimeStaffHire) staffHire).getJoiningDate();


                    model.addRow(row);
                }
            }

            displayFrame.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(frame, "Please select Job Type to display respective information.");
            jobTypeCombo.requestFocus();
        }
    }
    public void clear(){
        textFieldVacancyNumber.setText("");
        jobTypeCombo.setSelectedIndex(0);
        textFieldDesignation.setText("");
        textFieldStaffName.setText("");
        textFieldQualification.setText("");
        textFieldWorkingHour.setText("");
        textFieldSalary.setText("");
        textFieldWagesPerHour.setText("");
        workingShiftsCombo.setSelectedIndex(0);
        dateDayCombo.setSelectedIndex(0);
        dateMonthCombo.setSelectedIndex(0);
        dateYearCombo.setSelectedIndex(0);
        textFieldAppointedBy.setText("");
    }

    public static void main(String[] args) {
        new INGNepal();

    }
}
