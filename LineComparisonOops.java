package com.bridgeLabz;
import java.lang.*;
public class LineComparisonOops {
    public static void main(String[] args) {
        System.out.println("Welcome to the Line Comparision Computation program");
        double x1=2,x2=5,y1=4,y2=6;
		double x3=1,x4=6,y3=8,y4=5;
        double length1,length2;;
		length1 = Math.sqrt((x2-x1)*2 + (y2-y1)*2);
		length2 = Math.sqrt((x4-x3)*2 + (y4-y3)*2);
        System.out.println("length of the line 1 is : " +length1);
		System.out.println("length of the line 2 is : " +length2);
    }
}