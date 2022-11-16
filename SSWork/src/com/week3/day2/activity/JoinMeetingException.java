package com.week3.day2.activity;

public class JoinMeetingException extends Exception {
    // no-arg
    public JoinMeetingException() {
        super("Unable to join meeting for some reason.");
    }

    //message
    public JoinMeetingException(String message) {
        super(message);
    }

    // cause
    public JoinMeetingException(Throwable cause) {
        super(cause);
    }

}
