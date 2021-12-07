package com.SpringBootProject.Farmer.Model;

public class FarmerUser {

    private int id;
    private String Username;
    private String Name;
    private String EmailId;
    private int ContactNo;

    public FarmerUser(int id, String username, String name, String emailId, int contactNo) {
        this.id = id;
        Username = username;
        Name = name;
        EmailId = emailId;
        ContactNo = contactNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String emailId) {
        EmailId = emailId;
    }

    public int getContactNo() {
        return ContactNo;
    }

    public void setContactNo(int contactNo) {
        ContactNo = contactNo;
    }

    @Override
    public String toString() {
        return "FarmerUser{" +
                "id=" + id +
                ", Username='" + Username + '\'' +
                ", Name='" + Name + '\'' +
                ", EmailId='" + EmailId + '\'' +
                ", ContactNo=" + ContactNo +
                '}';
    }
}
