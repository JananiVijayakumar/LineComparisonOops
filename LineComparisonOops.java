package com.bridgelabz;

import java.lang.*;
public class LineComparisonOops {
    double x1,x2,y1,y2;
    public LineComparisonOops(double x1, double x2 , double y1 ,double y2){
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }
    public double calOfLength(){
        double length = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        return length;
    }
    public static void comparison(double a , double b){

        boolean EQUAL = (a == b);
        System.out.println("Lines are Equal : "+EQUAL);
        double line = Double.compare(a,b);
        if (line == 1){
            System.out.println("line1 is greater than line 2");
        }
        else
            System.out.println("line1 is lesser than line 2");

    }
    public static void main(String[] args) {
        LineComparisonOops lineComparison1 = new LineComparisonOops(3,4,5,6);
        LineComparisonOops lineComparison2 = new LineComparisonOops(9,6,7,8);
        double lengthOfLine1 = lineComparison1.calOfLength();
        double lengthOfLine2 = lineComparison2.calOfLength();
        comparison(lengthOfLine1,lengthOfLine2);
    }
}