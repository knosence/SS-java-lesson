package com.Week6.day02.Lesson;

import java.util.Scanner;

public class EnumPractice {

    public enum Planets {
        MERCURY,
        VENUS,
        EARTH,
        MARS,
        JUPITER,
        SATURN,
        URANUS,
        NEPTUNE;


    }

    /*
        What is an Enum?
        = Enumeration
        -- Constants stored in a Set

        Ex: days of the week

        What is the benefit?
        - restrict the values that can be stored in a variable
        - comparison is faster compared to String (== instead of comparing each character)
        - better than using int because encapsulates more information

        What is a con?
        - can't add more to the Enum's set of values as the program is running
        -- for example: our IceCream assignment we had a set of flavors BUT we wanted to be able to add to it
     */
    public static void main(String[] args) {

        Day today = Day.MONDAY; // instead of "Monday" or int 1

        // for each - print out all the values of Day
        for (Day day : Day.values()) {
            System.out.print(day + " ");
        }

        // using valueOf to convert a String to an Enum
        // Day tomorrow = Day.valueOf("WEDNESDAY"); // throws error if does not exist
        Day tomorrow = Day.valueOf("Wednesday ".toUpperCase().trim());
        System.out.println("User entered: " + tomorrow);

        // anywhere I use Day, I don't need to do validation anymore like I would with String day

        Color userColor = promptUserForColor();
        System.out.println("You chose: " + userColor);

        String hexCode = getColorHexCode(userColor);
        System.out.println("The hex value is " + hexCode);

        System.out.println("Comparing Earth and Earth " + isFurtherFromSum(Planets.EARTH, Planets.EARTH));
        System.out.println("Comparing Mercury and Venus " + isFurtherFromSum(Planets.MERCURY, Planets.VENUS));
        System.out.println("Comparing Jupiter and Mars " + isFurtherFromSum(Planets.JUPITER, Planets.MARS));

    }

    // return True if planet1 IS further than planet2
    public static boolean isFurtherFromSum(Planets planet1, Planets planet2) {
        int planet1Ordinal = planet1.ordinal();
        int planet2Ordinal = planet2.ordinal();

        return planet1Ordinal < planet2Ordinal;
    }

    public static String getColorHexCode(Color color) {
        return color.getHexValue();
    }

    public static Color promptUserForColor() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a color, out of ");
        for (Color color : Color.values()) {
            System.out.print(color + " ");
        }

        String userEntry = input.nextLine();
        // sanitize the string
        userEntry = userEntry.toUpperCase().trim();
        return Color.valueOf(userEntry);
    }
}
