package com.Week6.day01.Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class MainClass {
    public static void main(String[] args) {

        AssignmentSubmission studentOne = new AssignmentSubmission("StudentOne", 95, false);
        AssignmentSubmission studentTwo = new AssignmentSubmission("StudentTwo", 100, true);
        AssignmentSubmission studentThree = new AssignmentSubmission("StudentThree", 65, true);
        AssignmentSubmission studentFour = new AssignmentSubmission("StudentFour", 0, false);
        AssignmentSubmission studentFive = new AssignmentSubmission("StudentFive", 50, false);

        List<AssignmentSubmission> submissions = Arrays.asList(studentOne, studentTwo, studentThree, studentFour, studentFive);

        Stream<AssignmentSubmission> newStream = submissions.stream();

        Stream<AssignmentSubmission> highestScore = newStream.filter((student) -> {
            boolean cheatingCheck = student.hasCheated();
            return !cheatingCheck;
        });

        Integer highestScoreResult = highestScore.reduce(new AssignmentSubmission("one", 0, false), (soFar, score) -> {
            if (soFar.getScore() > score.getScore())
                return soFar;
            else
                return score;
        }).getScore();

        System.out.println(highestScoreResult);

        //Problem 2

        Stream<AssignmentSubmission> newStream2 = submissions.stream();


        Stream<AssignmentSubmission> lowestScore = newStream2.filter((student) -> {
            boolean cheatingCheck = student.hasCheated();
            return !cheatingCheck;
        });

        Integer lowestScoreResult =  lowestScore.reduce(new AssignmentSubmission("one", 100, false), (soFar, score) -> {
            if (soFar.getScore() < score.getScore() || score.getScore() == 0)
                return soFar;
            else
                return score;
        }).getScore();

        System.out.println(lowestScoreResult);





    }
}
