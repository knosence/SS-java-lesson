package com.Week6.day02.Lesson;

public enum Color {


    RED("#FF0000"), // Final constants so define property here
    ORANGE("#FFA500"),
    YELLOW("#FFFF00"),
    GREEN("#008000"),
    BLUE("#0000FF");

    private String hexValue;

    private Color(String hexValue) { //No public constructors -- don't let user construct more, set is final
        this.hexValue = hexValue;
    }

    public String getHexValue() {
        return hexValue;
    }

    // should we create a setter?
    // NO these are constants (final) so should not be changing
}
