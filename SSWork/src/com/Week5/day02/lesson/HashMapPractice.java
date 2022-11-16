package com.Week5.day02.lesson;

import java.util.HashMap;

public class HashMapPractice {

    public static void main(String[] args) {
        // Students logins -- for class of 23 students
        HashMap<String, String> logins = new HashMap<>(30);

        logins.put("bob", "password");
        logins.put("Johns", "1234");
        logins.put("Troy", "P@$w0rD");
        logins.put("Ferris Beuler", "porsh123");
        System.out.println(logins);

        //get a login
        String username = "bob";
        String password = "password";

        System.out.println(logins.get(username));

    }
}
