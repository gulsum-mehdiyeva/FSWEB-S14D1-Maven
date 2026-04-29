package com.workintech.cylinder;

public class Cylinder extends Circle {
    private int height;
    public Cylinder(int radius,int height) {
        super(radius);
        if(height<0){
            this.height=0;
        }else {
            this.height=height;
        }
    }
    public int getHeight(){
        return height;
    }
    public  double getVolume(){
        return getArea()*height;
    }
}
