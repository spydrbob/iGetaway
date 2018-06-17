/**
 * User.java
 * Author: Chris Speidel
 * Last Revision: 6/4/2018
 * This logic serves as a user data object
 */

package igetaway.models;

import java.io.*;

public class User implements Serializable {
    //Variables
    private static final long serialVersionUID = 1234L;
    private String firstName;
    private String lastName;
    private String middleInit;
    private String email;
    private String phone;
    private String userName;
    private String passWord;
    private String confirmedPassWord;
    private static final String filePath = System.getProperty("user.dir") + 
            "\\users\\";

    // Constructors
    public User(){

    }// End constructor

    // Get and Set methods
    public String getFirstName() {

        return firstName;
    }// End method

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }// End method

    public String getLastName() {

        return lastName;
    }// End method

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }// End method

    public String getMiddleInit() {

        return middleInit;
    }// End method

    public void setMiddleInit(String middleInit) {

        this.middleInit = middleInit;
    }// End method

    public String getEmail() {

        return email;
    }// End method

    public void setEmail(String email) {

        this.email = email;
    }// End method

    public String getPhone() {

        return phone;
    }// End method

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserName() {

        return userName;
    }// End method

    public void setUserName(String userName) {

        this.userName = userName;
    }// End method

    public String getPassWord() {

        return passWord;
    }// End method

    public void setPassWord(String passWord) {

        this.passWord = passWord;
    }// End method

    public String getConfirmedPassWord() {

        return confirmedPassWord;
    }// End method

    public void setConfirmedPassWord(String confirmedPassWord) {

        this.confirmedPassWord = confirmedPassWord;
    }// End method

    public static int serializeUser(User user) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath.trim() + user.getUserName() + ".txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fos);
            outputStream.writeObject(user);
            outputStream.close();

            return 0;
        }// End try
        catch (IOException ex) {
            System.err.println(ex);
            return -1;
        }// End catch
    }// End method

    public static User deserialize(String username) {
        User savedUser = null;

        try {
            FileInputStream fis = new FileInputStream(filePath.trim() + username + ".txt");
            ObjectInputStream inputStream = new ObjectInputStream(fis);
            savedUser = (User) inputStream.readObject();
            inputStream.close();
        }// End try
        catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex);
        }// End catch

        return savedUser;
    }// End method

}// End class