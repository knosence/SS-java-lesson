package com.week3.day2.activity;

public class Member implements Attendee{

    @Override
    public void join(Meeting meeting){

        try {
            meeting.add(this);
            System.out.println("Joining meeting.");
        } catch (JoinMeetingException e){
            System.out.println(e.getMessage());
        }
    }
}
