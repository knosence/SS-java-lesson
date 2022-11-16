package com.Week5.day05.lesson;

public class LambdaPractice {
    public static void main(String[] args) {

        /*
         * What is functional programming?
         * 1. Function are "first class"
         * - I can treat a function like any other variable type
         * --- I can return a function from a method
         * --- I can pass in a function as a parameter
         *
         * 2. "pure" functions
         * - no side-effects
         * --- mutating an object reference passed in or changing state of your application program - Leave everything as you found it
         * - deterministic = for a given input, always return the same output
         *
         * History of Java
         * - It did NOT support functional programming
         * - java 8 added lambdas to support functional programming
         *
         * What is a lambda?
         * - lambda function
         * - anonymous function --- no method signature when writing lambdas so no name declared
         * - arrow function -- syntax we use is an -> "arrow"
         *
         * Syntax Rules
         * General Structure:
         *
         * Ex 1: Hello world
         * () -> System.out.println("Hello World!");
         *
         * () -- parenthesis are where the parameters go just like normal
         * -> -- arrow indicates where the method body starts
         * the rest === what code is going to get run, up to the first semicolon;
         *
         * Ex 2: multiple parameters
         * (name1, name2) -> System.out.println("Hello " + name1 + ", I am " + name2);
         *
         * () == parameters Dont declare a type
         *
         * Ex 3: one parameter
         * name -> System.out.println("Hi there " + name + "!");
         *
         * RULE -- with ONE parameter only situation can exclude the () for the parameter
         *
         * Ex 4: more complicated body
         * (name1, name2) -> { -- just like if statements, more than one line body needs {}
         *  System.out.println(name1);
         *  System.out.println(name2);
         *  return name1 + " " + name2;
         * }
         *
         * Ex 5: returning a value --- SPECIAL CASE
         * (a, b) -> a + b; ---- important the "return" is implied
         *
         * Ex 5b:
         * a -> a.toUppercase(); // return is implied, so takes in One value, and returns that value
         *
         * Ex 6: Be careful
         * a -> { -- Java ignores how many lines, and doesn't realize this is one line I want to returned
         *      return a.toUppercase(); Return is not implied --
         * }
         *
         * Examples: Valid or Not Lambda syntax? If not, Fix me
         * 1. () -> 1; -- good use of parans, good use of arrow, good use of implied return
         *
         * 2. a, b -> a + b; -- needs paranthesis bc more than one parameter
         * Fix: (a , b) -> a + b;
         *
         * 3. (a, b, c) -> {
         *      a = a + 1;
         *      b = b + 2;
         *      c = c + 3;
         *      // added - return a + b + c; -- needs to specify return bc mulitiline body of method
         *
         * }
         *
         * 4. -> "Hello"; --- bad needs ()
         * Fix
         * () -> "Hello";
         *
         *
         */




    }

    // Examples of pure fucntions
    static int b = 3;

    public static int add(int a) { // no-side effects
        return a + b;           // not deterministic
    }
    // add(1) == 4
    // in the future if b = 1
    // add(1) == 2

    public static int add(int a, int b) { // no side effects
        return a + b;                       //
    }
    // add(1,1) == 2
    // class b can change but my function always return 2 for add(1,1)

   public static int addAndOne(int a) { // not pure if relies on outside states -- this makes your life easier to debug the function
        return a + ++b;
   }


   public static int[] doStuff(int[] nums, Action someCalculation) {
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newArray[i] = someCalculation.act(nums[i]);
        }
        return newArray;
   }





}
