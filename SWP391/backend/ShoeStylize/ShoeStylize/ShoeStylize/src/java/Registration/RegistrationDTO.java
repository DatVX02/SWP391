package Registration;

import java.sql.Date;

public class RegistrationDTO {
    private int userID;
    private String email;
    private String password;
    private String phone;
    private String fullname;
    private String birthDate;
    private String roleID;
    private String gender;
    
    public RegistrationDTO() {
    }

    public RegistrationDTO(int userID, String email, String password, String phone, String fullname, String birthDate, String roleID, String gender) {
        this.userID = userID;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.fullname = fullname;
        this.birthDate = birthDate;
        this.roleID = roleID;
        this.gender = gender;
    }

    

    public RegistrationDTO(int userID, String email, String fullname, String phone, String birthDate, String gender) {
        this.userID = userID;
        this.email = email;
        this.fullname = fullname;
        this.phone = phone;
        this.birthDate = birthDate;
        this.gender = gender;
    }
  
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    
    
}
