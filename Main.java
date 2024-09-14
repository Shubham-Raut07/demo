package com.inheritance;

public class Main
{
    public static void main(String[] args) {
        Box box =new Box();
     //   Box box1 = new Box(box);
        System.out.println(box.h + " " + box.w + " " + box.l);

        BoxWeight box3 = new BoxWeight(2,3,4,4);
        System.out.println( box3.w+box3.h + " " + box3.w + " " + box3.l);
    }
}
