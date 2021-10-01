package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // Think Java - Exercise 10.1

        int x = 5;
        Point blank = new Point(1, 2);

        //1
        System.out.println(riddle(x, blank));
        //2
        System.out.println(x);
        //3
        System.out.println(blank.x);
        //4
        System.out.println(blank.y);
    }


    public static int riddle(int x, Point p) {
        x = x + 7;
        return x + p.x + p.y;
    }

    // Point 2:
    // The output of this program is four "println" and the first print shows the return value of "x + p.x + p.y" which is "15".
    // The second print is the integer variable "x", value 5, the third print is "blank"'s first attribute: 1, and
    // the last print is "blank"'s second attribute: 2.

    // Point 3:
    // Point "blank" is a mutable object, because the attributes can be modified.
}
