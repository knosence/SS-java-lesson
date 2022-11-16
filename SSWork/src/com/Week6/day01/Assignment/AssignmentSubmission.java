package com.Week6.day01.Assignment;

public class AssignmentSubmission {
    private String student;
    private int score;
    private boolean cheated;

    AssignmentSubmission(String student, int score, boolean cheated) {
        setStudent(student);
        setScore(score);
        setCheated(cheated);
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        if (student == null || student.isEmpty()){
            throw new IllegalArgumentException("No name was given, check the name of the student and try again.");
        }
        this.student = student;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score is out of bounds, need to be within 0 and 100.");
        }
        this.score = score;
    }

    public boolean hasCheated() {
        return cheated;
    }

    public void setCheated(boolean cheated) {
        this.cheated = cheated;
    }

    @Override
    public String toString() {
        return "AssignmentSubmission{" +
                "student='" + student + '\'' +
                ", score=" + score +
                ", cheated=" + cheated +
                ", hasCheated=" + hasCheated() +
                '}';
    }
}
