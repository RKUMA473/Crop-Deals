package com.SpingBootProject.Admin.Service.Model;

import java.util.ArrayList;

public class FarmerUser {

    private int farmerId;
    private String farmerUsername;
    private String farmerName;
    private String farmerEmailId;
    private int farmerContactNo;

    public FarmerUser(int farmerId, String farmerUsername, String farmerName, String farmerEmailId, int farmerContactNo)
    {
        this.farmerId = farmerId;
        this.farmerUsername = farmerUsername;
        this.farmerName = farmerName;
        this.farmerEmailId = farmerEmailId;
        this.farmerContactNo = farmerContactNo;
    }

    public FarmerUser() {
    }

    public int getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(int farmerId) {
        this.farmerId = farmerId;
    }

    public String getFarmerUsername() {
        return farmerUsername;
    }

    public void setFarmerUsername(String farmerUsername) {
        this.farmerUsername = farmerUsername;
    }

    public String getFarmerName() {
        return farmerName;
    }

    public void setFarmerName(String farmerName) {
        this.farmerName = farmerName;
    }

    public String getFarmerEmailId() {
        return farmerEmailId;
    }

    public void setFarmerEmailId(String farmerEmailId) {
        this.farmerEmailId = farmerEmailId;
    }

    public int getFarmerContactNo() {
        return farmerContactNo;
    }

    public void setFarmerContactNo(int farmerContactNo) {
        this.farmerContactNo = farmerContactNo;
    }

    @Override
    public String toString() {
        return "FarmerUser{" +
                "farmerId=" + farmerId +
                ", farmerUsername='" + farmerUsername + '\'' +
                ", farmerName='" + farmerName + '\'' +
                ", farmerEmailId='" + farmerEmailId + '\'' +
                ", farmerContactNo=" + farmerContactNo +
                '}';
    }
}
