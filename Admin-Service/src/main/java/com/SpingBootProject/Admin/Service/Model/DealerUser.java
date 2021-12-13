package com.SpingBootProject.Admin.Service.Model;

public class DealerUser {
    private int dealerId;
    private String dealerUsername;
    private String dealerName;
    private String dealerEmailId;
    private int dealerContactNo;

    public DealerUser(int dealerId, String dealerUsername, String dealerName, String dealerEmailId, int dealerContactNo)
    {
        this.dealerId = dealerId;
        this.dealerUsername = dealerUsername;
        this.dealerName = dealerName;
        this.dealerEmailId = dealerEmailId;
        this.dealerContactNo = dealerContactNo;
    }

    public DealerUser(){}

    public int getDealerId() {
        return dealerId;
    }

    public void setDealerId(int dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerUsername() {
        return dealerUsername;
    }

    public void setDealerUsername(String dealerUsername) {
        this.dealerUsername = dealerUsername;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getDealerEmailId() {
        return dealerEmailId;
    }

    public void setDealerEmailId(String dealerEmailId) {
        this.dealerEmailId = dealerEmailId;
    }

    public int getDealerContactNo() {
        return dealerContactNo;
    }

    public void setDealerContactNo(int dealerContactNo) {
        this.dealerContactNo = dealerContactNo;
    }

    @Override
    public String toString() {
        return "DealerUser{" +
                "dealerId=" + dealerId +
                ", dealerUsername='" + dealerUsername + '\'' +
                ", dealerName='" + dealerName + '\'' +
                ", dealerEmailId='" + dealerEmailId + '\'' +
                ", dealerContactNo=" + dealerContactNo +
                '}';
    }
}



