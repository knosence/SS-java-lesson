package com.week3.day2.activity;

public class Guest implements Attendee{

    @Override
    public void join(Meeting meeting) {
        try {
            meeting.add(this);
            System.out.println("Joining Waiting Room.");
        } catch (JoinMeetingException e) {
            System.out.println(e.getMessage());
        }

    }
}
