package com.company;

import java.util.ArrayList;

public class Picture {
    private int number;
    private double price;
    private String pictureName;
    private String author;
    private int year;
    private String seller;
    private String buyer;
    private ArrayList<String> listHeader;
    private ArrayList<Picture> listPictureFullInfo;
    private ArrayList<Integer> listNumber;

    public Picture(double price, String pictureName, String author, int year, String seller, String buyer) {
        this.price = price;
        this.pictureName = pictureName;
        this.author = author;
        this.year = year;
        this.seller = seller;
        this.buyer = buyer;
    }

    public Picture(ArrayList<String> listHeader, ArrayList<Integer> listNumber) {
        this.listHeader = listHeader;
        this.listNumber = listNumber;
    }

    public Picture() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public void printHeader(){
        for(int i = 0; i < listHeader.size(); i++){
            System.out.println(listHeader.get(i) + " ");
        }
    }

    public void printNumber(int index){
        System.out.print(listNumber.get(index) + " ");
    }

    public void printPicture(){
        System.out.println(price + " " + pictureName + " " + author + " " + year + " " + seller + " " + buyer);
    }

}
