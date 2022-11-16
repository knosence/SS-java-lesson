package com.week4.day5.lesson;

public class SleepyPerson extends Person {

    private boolean sleepy;

    public SleepyPerson() {
        this.sleepy = true;
    }

    public SleepyPerson(boolean sleepy) {
        this.sleepy = sleepy;
    }

    public boolean isSleepy() {
        return sleepy;
    }

    public void setSleepy(boolean sleepy) {
        this.sleepy = sleepy;
    }

    @Override
    public String toString() {
        return "com.week4.day5.lesson.SleepyPerson{" +
                "sleepy=" + sleepy +
                '}';
    }
}
