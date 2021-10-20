package com.bridgeLabz;
import java.lang.*;
public class LineComparisonOops {
    public static void main(String[] args) {
        System.out.println("Welcome to the Line Comparision Computation program");
        double x1=2,x2=5,y1=4,y2=6;
        double length;
		length = Math.sqrt((x2-x1)*2 + (y2-y1)*2);
        System.out.println("length of the line : " +length);
    }
}