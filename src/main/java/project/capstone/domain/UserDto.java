package project.capstone.domain;

import java.util.Date;

public class UserDto {
   private String userName;
   private String userId;
   private String userPW;
   private String phoneNumber;
   private Date userBirth;

   public UserDto() {}

    public UserDto(String userName, String userId, String userPW, String phoneNumber, Date userBirth) {
        this.userName = userName;
        this.userId = userId;
        this.userPW = userPW;
        this.phoneNumber = phoneNumber;
        this.userBirth = userBirth;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                ", userPW='" + userPW + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", userBirth=" + userBirth +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPW() {
        return userPW;
    }

    public void setUserPW(String userPW) {
        this.userPW = userPW;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(Date userBirth) {
        this.userBirth = userBirth;
    }
}
