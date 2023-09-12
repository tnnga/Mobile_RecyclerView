package com.example.test;

public class Cat {
    private String name;
    private int imageID;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getImageID(){
        return imageID;
    }
    public void setImageID(int imageID){
        this.imageID = imageID;
    }
    public Cat(String name, int imageID){
        this.name = name;
        this.imageID = imageID;
    }

}
