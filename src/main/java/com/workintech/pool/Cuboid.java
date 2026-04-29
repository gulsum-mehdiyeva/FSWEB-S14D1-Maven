package com.workintech.pool;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
public class Cuboid extends Rectangle {
    private int height;

    public void setHeight(int height){
        if(height < 0){
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    public Cuboid(int width, int length, int height) {
        super(width, length);
        setHeight(height);
            }

    public int getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }

}