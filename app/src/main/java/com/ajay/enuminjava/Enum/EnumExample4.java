package com.ajay.enuminjava.Enum;

import java.util.EnumMap;

public class EnumExample4 {
    // example of Enum Map

    public enum Directions {
        SOUTH,
        EAST,
        WEST,
        NORTH
    }

    public static void main(String args[]) {

        // values in key pair ... give a key as an EnumMap and get the value .
        EnumMap<Directions, String> enumMap = new EnumMap<>(Directions.class);
        enumMap.put(Directions.EAST  , "We are in east direction");
        enumMap.put(Directions.NORTH, "Where could we find ourselves in north");
        enumMap.put(Directions.SOUTH   , "Lets turn south");

        String myDirection = enumMap.get(Directions.NORTH);

        System.out.println(myDirection);

        System.out.println("Enum Map "+enumMap);

        System.out.println(Directions.EAST+" "+enumMap.get(Directions.EAST));

        if(enumMap.containsValue("Lets turn south")) {
            System.out.println("Hurray value");
        }

        if(enumMap.containsKey(Directions.SOUTH)) {
            System.out.println("Hurray key");
        }
    }
}
