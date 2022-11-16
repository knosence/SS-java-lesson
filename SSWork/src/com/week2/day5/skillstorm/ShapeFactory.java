package com.week2.day5.skillstorm;

// this is the class that's actually going to build our shapes
public class ShapeFactory {

    // return type of this method refers to the reference type of the Object returned, not necessarily the Object's class
    // as long as I return some Object that IS A Shape, I'm okay
    public Shape createShape(int corners){

        // covers all int values for corners
        // any input validation will have happened prior to reaching this method
        switch (corners) {
            case 0:
                return new Circle();
            case 3:
                return new Triangle();
            case 4:
                return new Rhombus();
            case 8:
                return new Octagon();
            // covers
            default:
                //totally acceptable to do this
                // can output some default value of Object
                //System.out.println("# of corners doesn't match, Here's a circle!");
                //return new Circle();

                //or, can be useful to throw an exception
                // stops in the parentheses will print out to the console as an error message
                throw new IllegalArgumentException("No Shapes in this Factory have " + corners + " corners.");
        }
    }

}
