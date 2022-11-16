package com.Week5.Assignment.day02;

import java.util.HashMap;

public class HomeworkAssignment {

    public static void main(String[] args) {
        HashMap<String, Integer> grades = new HashMap<>();

        grades.put("Josh", 95);
        grades.put("Steve", 89);
        grades.put("Mary", 65);
        grades.put("Ben", 70);

        System.out.println(findHighest(grades));
        System.out.println(findLowest(grades));
        System.out.println(findAverage(grades));
        System.out.println(findTopStudent(grades));

    }



    // Highest Grade
    public static int findHighest(HashMap<String, Integer> grades) {
        int max = 0;
        for (Integer value : grades.values()) {
            if(max < value) {
                max = value;
            }
        }
        return max;
    }

    // Lowest Grade
    public static int findLowest(HashMap<String, Integer> grades) {
        int min = 100;
        for (Integer value : grades.values()) {
            if(min > value) {
                min = value;
            }
        }
        return min;
    }

    // Average grade
    public static int findAverage(HashMap<String, Integer> grades) {
        int sum = 0;
        for (Integer value : grades.values()){
            sum = sum + value;
        }
        return sum/grades.size();
    }

    public static String findTopStudent(HashMap<String, Integer> grades) {
        int highestGrade = findHighest(grades);
        String result = "";
        return result;
    }

}
