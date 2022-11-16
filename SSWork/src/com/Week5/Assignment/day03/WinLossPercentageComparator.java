package com.Week5.Assignment.day03;

import java.util.Comparator;

public class WinLossPercentageComparator implements Comparator<Athlete> {
    @Override
    public int compare(Athlete o1, Athlete o2) {
        int winPercentage = (o1.getWinPercentage() > o2.getWinPercentage()) ? -1 : 1;
        int average = (int) o2.getAverage() - (int)o1.getAverage();
        return (average == 0) ? winPercentage : average ;
    }
}
