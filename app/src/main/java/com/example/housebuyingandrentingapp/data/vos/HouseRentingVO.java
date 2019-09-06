package com.example.housebuyingandrentingapp.data.vos;

import com.google.gson.annotations.SerializedName;

public class HouseRentingVO {

    @SerializedName("id")
    private int id;

    @SerializedName("house_image_url")
    private String houseImageUrl;

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @SerializedName("price")
    private float price;

    @SerializedName("address")
    private String address;

    @SerializedName("square_feet")
    private int squareFeet;

    @SerializedName("latitude")
    private float latitude;

    @SerializedName("longitude")
    private float longitude;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHouseImageUrl() {
        return houseImageUrl;
    }

    public void setHouseImageUrl(String houseImageUrl) {
        this.houseImageUrl = houseImageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
}
