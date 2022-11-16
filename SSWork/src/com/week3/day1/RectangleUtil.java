package com.week3.day1;

import java.awt.*;

public class RectangleUtil {

    public static void main(String[] args) {


        Rec rec = new Rec();
        rec.setLength(12);
        rec.setWidth(6);
        doubleRectangle(rec);

        Rec rec1 = new Rec();
        rec1.setLength(10);
        rec1.setWidth(20);
        halveRectangle(rec1);
    }

    public static void doubleRectangle(Rec rect){
        rect.setWidth(rect.getWidth()*2);
        rect.setLength(rect.getLength()*2);
        System.out.println(rect);
    }

    public static void halveRectangle(Rec rect){
        double width = rect.getWidth() / 2;
        double length = rect.getLength() / 2;
        rect = new Rec(width, length);
        System.out.println(rect);
    }
}
