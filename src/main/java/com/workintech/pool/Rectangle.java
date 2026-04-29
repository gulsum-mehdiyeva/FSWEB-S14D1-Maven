package com.workintech.pool;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Rectangle {

    private int width;
    private int length;

    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
    }
    public void setWidth(int width){
        if(width < 0){
            this.width = 0;}else{
               this.width = width;}
    }
    public void setLength(int length){
        if(length < 0){
            this.length = 0;
        }else{
        this.length = length;}
    }

       public int getWidth(){
        return width;
    }

    public int getLength(){
        return length;
    }

    public double getArea() {
        return width * length;
    }

    }