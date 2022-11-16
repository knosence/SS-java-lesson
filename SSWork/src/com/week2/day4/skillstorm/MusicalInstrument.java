package com.week2.day4.skillstorm;

// still a class under the hood, but must use keyword "interface" when declaring it
public interface MusicalInstrument {
    // all properties in an interface are, by default, static AND final
    // essentially class constants
    boolean AWESOME = true; // don't have to use keywords; this is equivalent to -- static final int value = 10;

    // all methods in an interface MUST BE, and are by default, abstract
    // don't have to use keyword "abstract"
    void play();
    void stop();
}
