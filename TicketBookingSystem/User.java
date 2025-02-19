package TicketBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userId;
    private String userName;
    private String address;
    private String mobileNo;
    private String password;

    public User(String userId, String userName, String address, String mobileNo,String password) {
        this.userId = userId;
        this.userName = userName;
        this.address = address;
        this.mobileNo = mobileNo;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    public boolean checkPassword(String password){
        return this.password.equals(password);
    }
}
