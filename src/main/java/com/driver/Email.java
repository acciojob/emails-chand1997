package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }



    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(password.equals(oldPassword)){
            if(newPassword.length()<8) return;
            int upper=0;
            int lower=0;
            int digit=0;
            int specChar=0;
            for(char ch:newPassword.toCharArray()){
                if(ch>='a' && ch<='z') lower++;
                else if(ch>='0' && ch<='9') digit++;
                else if(ch>='A' && ch<='Z') upper++;
                else specChar++;
            }
            if(upper>=1 && lower>=1 && digit>=1 && specChar>=1){
                password=newPassword;
            }
        }
    }
}
