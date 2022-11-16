package com.Week5.Assignment.day03;

import java.util.Objects;

public class Athlete {

    String name;
    short careerWins;
    short careerLosses;

    public Athlete() {
        super();
    }

    public Athlete(String name, short careerWins, short careerLosses) {
        setName(name);
        setCareerWins(careerWins);
        setCareerLosses(careerLosses);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Please check the athlete's name for null values");
        }
        this.name = name;
    }

    public short getCareerWins() {
        return careerWins;
    }

    public void setCareerWins(short careerWins) {
        if (careerWins < 0) {
            throw new IllegalArgumentException("Please check the career wins for player " + this.name + ", it is less than 0");
        }
        this.careerWins = careerWins;
    }

    public short getCareerLosses() {
        return careerLosses;
    }

    public void setCareerLosses(short careerLosses) {
        if (careerLosses < 0) {
            throw new IllegalArgumentException("Please check the career losses for player " + this.name + ", it is less than 0");
        }
        this.careerLosses = careerLosses;
    }

    public double getAverage() {
        return (careerLosses + careerWins) / 2.0;
    }

    public double getWinPercentage() {
        return (double) careerWins / (careerWins + careerLosses) * 100;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Athlete athlete = (Athlete) o;
        return getCareerWins() == athlete.getCareerWins() && getCareerLosses() == athlete.getCareerLosses() && Objects.equals(getName(), athlete.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCareerWins(), getCareerLosses());
    }

    @Override
    public String toString() {
        return "    Athlete{" +
                "name='" + name + '\'' +
                ",\n\t Career Wins= " + careerWins +
                ", Career Losses= " + careerLosses +
                ", Win Percentage= " + this.getWinPercentage() +
                '}';
    }
}
