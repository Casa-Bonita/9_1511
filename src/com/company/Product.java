package com.company;

public class Product {
    private int price;
    private String name;
    private String description;

    public Product(int price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}