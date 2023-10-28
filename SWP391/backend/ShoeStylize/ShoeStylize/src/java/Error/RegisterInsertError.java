package Error;

public class RegisterInsertError {
    private String emailDuplicate;
    private String emailLengthErr;
    private String usernameLengthErr;
    private String passwordLengthErr;
    private String confirmNotMatch;
    private String genderNull;
    private String phoneLengthErr;
    private String bDateNull;
    
    public RegisterInsertError(){
        
    }

    public RegisterInsertError(String emailDuplicate, String emailLengthErr, String usernameLengthErr, String passwordLengthErr, String confirmNotMatch, String genderNull, String phoneLengthErr, String bDateNull) {
        this.emailDuplicate = emailDuplicate;
        this.emailLengthErr = emailLengthErr;
        this.usernameLengthErr = usernameLengthErr;
        this.passwordLengthErr = passwordLengthErr;
        this.confirmNotMatch = confirmNotMatch;
        this.genderNull = genderNull;
        this.phoneLengthErr = phoneLengthErr;
        this.bDateNull = bDateNull;
    }

    public String getEmailDuplicate() {
        return emailDuplicate;
    }

    public void setEmailDuplicate(String emailDuplicate) {
        this.emailDuplicate = emailDuplicate;
    }

    public String getEmailLengthErr() {
        return emailLengthErr;
    }

    public void setEmailLengthErr(String emailLengthErr) {
        this.emailLengthErr = emailLengthErr;
    }

    public String getUsernameLengthErr() {
        return usernameLengthErr;
    }

    public void setUsernameLengthErr(String usernameLengthErr) {
        this.usernameLengthErr = usernameLengthErr;
    }

    public String getPasswordLengthErr() {
        return passwordLengthErr;
    }

    public void setPasswordLengthErr(String passwordLengthErr) {
        this.passwordLengthErr = passwordLengthErr;
    }

    public String getConfirmNotMatch() {
        return confirmNotMatch;
    }

    public void setConfirmNotMatch(String confirmNotMatch) {
        this.confirmNotMatch = confirmNotMatch;
    }

    public String getGenderNull() {
        return genderNull;
    }

    public void setGenderNull(String genderNull) {
        this.genderNull = genderNull;
    }

    public String getPhoneLengthErr() {
        return phoneLengthErr;
    }

    public void setPhoneLengthErr(String phoneLengthErr) {
        this.phoneLengthErr = phoneLengthErr;
    }

    public String getbDateNull() {
        return bDateNull;
    }

    public void setbDateNull(String bDateNull) {
        this.bDateNull = bDateNull;
    }
    
    
}
