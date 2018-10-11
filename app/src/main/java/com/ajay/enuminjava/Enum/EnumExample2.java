package com.ajay.enuminjava.Enum;

// Enum with switch statement

public class EnumExample2 {

    public static Directions d;

    public EnumExample2(Directions d) {
        this.d = d;
    }

    public enum Directions {
        SOUTH,
        EAST,
        WEST,
        NORTH
    }


    public static void main(String args[]) {

        EnumExample2 enumExample2 = new EnumExample2(Directions.EAST);

        switch(d){
            case SOUTH:
                System.out.println("SOUTH");
                break;
            case EAST:
                System.out.println("EAST");
                break;
            case WEST:
                System.out.println("WEST");
                break;
            case NORTH:
                System.out.println("NORTH");
                break;
            default:
                System.out.println("No Directions");
        }

    }
}
