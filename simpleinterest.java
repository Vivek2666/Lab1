package javaprogram;

import java.io.*;

class simpleinterest {
    public static void main(String args[]) {
        float principal = 10000; 
        float rate = 5; 
        float time = 5; 

      
        float simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple interest = " + simpleInterest);
    }
}
