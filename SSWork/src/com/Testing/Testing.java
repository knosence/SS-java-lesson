package com.Testing;

public class Testing {
    public static void main(String args[]) {
        int count = 0, sum = 0;
        do {
            System.out.println("before if " + count + " " + sum);
            if (count % 3 == 0) continue;
            sum += count;
            System.out.println("after if " + count + " " + sum);
        }
        while (count++ < 11);
        System.out.println("outside loop " + sum);
    }
}
