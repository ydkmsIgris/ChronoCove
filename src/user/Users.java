package user;

import java.io.Serializable;

public class Users implements Serializable {
    private static final long serialVersionUID = 1L;

    private String fName;
    private String lName;
    private String username;
    private String password;
    private String email;
    private String securityQuestion;
    private String securityAnswer;

    public Users(String username, String password, String email, String fName, String lName,
                 String securityQuestion, String securityAnswer) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.fName = fName;
        this.lName = lName;
        this.securityQuestion = securityQuestion;
        this.securityAnswer = securityAnswer;
    }

    // Getters
    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    // Setters
    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    // If you want to lock the username after registration, make this private or remove
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    // Utility method (optional)
    public String getFullName() {
        return fName + " " + lName;
    }

    @Override
    public String toString() {
        return "User{" +
               "username='" + username + '\'' +
               ", email='" + email + '\'' +
               ", name='" + getFullName() + '\'' +
               ", securityQuestion='" + securityQuestion + '\'' +
               '}';
    }
    
}
