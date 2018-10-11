package com.ajay.enuminjava.Enum;

// enum with if statement

public class EnumExample3 {

    public static Directions d;

    public EnumExample3(Directions d) {
        this.d = d;
    }

    public enum Directions {
        SOUTH,
        EAST,
        WEST,
        NORTH
    }

    public static void main(String args[]) {

        EnumExample3 enumExample3 = new EnumExample3(Directions.EAST);

        if(d == Directions.EAST) {
            System.out.println("Hey i am in 1 "+d);
        }else  if(d == Directions.WEST) {
            System.out.println("Hey i am in 2 "+d);
        }else  if(d == Directions.NORTH) {
            System.out.println("Hey i am in 3 "+d);
        }else  if(d == Directions.SOUTH) {
            System.out.println("Hey i am in 4 "+d);
        }

    }
}