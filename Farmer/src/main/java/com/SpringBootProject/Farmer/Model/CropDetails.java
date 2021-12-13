package com.SpringBootProject.Farmer.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Crop Details")
public class CropDetails {

    @Id
    private int cropId;
    private String cropName;
    private Double cropQuantity;
    private Double cropPrice;


    public CropDetails(int cropId, String cropName, Double cropQuantity, Double cropPrice)
    {
        this.cropId = cropId;
        this.cropName = cropName;
        this.cropQuantity = cropQuantity;
        this.cropPrice = cropPrice;
    }

    public CropDetails(){

    }

    public int getCropId() {
        return cropId;
    }

    public void setCropId(int cropId) {
        this.cropId = cropId;
    }

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public Double getCropQuantity() {
        return cropQuantity;
    }

    public void setCropQuantity(Double cropQuantity) {
        this.cropQuantity = cropQuantity;
    }

    public Double getCropPrice() {
        return cropPrice;
    }

    public void setCropPrice(Double cropPrice) {
        this.cropPrice = cropPrice;
    }

    @Override
    public String toString() {
        return "CropDetails{" +
                "cropId=" + cropId +
                ", cropName='" + cropName + '\'' +
                ", cropQuantity='" + cropQuantity + '\'' +
                ", cropPrice=" + cropPrice +
                '}';
    }


}
