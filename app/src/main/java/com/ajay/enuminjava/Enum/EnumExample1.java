package com.ajay.enuminjava.Enum;

public class EnumExample1 {

    public enum Week {
         SUNDAY,
         MONDAY,
         TUESDAY,
         WEDNESDAY,
         THRUSDAY,
         FRIDAY,
         SATURDAY,
    }


    public enum Directions {
        SOUTH(4), EAST(5), WEST(6), NORTH(7);

        private int value;  // we will get out data from this variable

        private Directions(int value) {    // it has private contrustor
            this.value = value;
        }


        public static void main(String args[]) {
            for (Week w : Week.values()) {
                System.out.println(w);
            }


            //===========================

            Week w2 = Week.FRIDAY;
            System.out.println(w2 + " YO");


            //=============== ENUM with default values ===================

            for (Directions d : Directions.values()) {
                System.out.println(d + " " + d.value);
            }


        }

    }
}

