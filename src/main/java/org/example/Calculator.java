package org.example;

import java.util.Scanner;
import java.util.logging.*;

public class Calculator {
    public static void main(String[] args) {
        double x;
        double y;
        double result;
        char ch;
        Calculation c;
        Logger l = Logger.getLogger("com.api.jar");
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        x = s.nextDouble();
        result = x;
        while (true) {
            l.info("Enter the Opertion Symbol:");
            ch = s1.next().charAt(0);
            switch (ch) {
                case '+' :
                    y = s.nextDouble();
                    c = new Addition(result, y);
                    l.log(Level.INFO, c::calc);
                    result = c.result;
                    break;
                case '-' :
                    y = s.nextDouble();
                    c = new Subtraction(result, y);
                    l.log(Level.INFO, c::calc);
                    result = c.result;
                    break;
                case '*' :
                    y = s.nextDouble();
                    c = new Multiplication(result, y);
                    l.log(Level.INFO, c::calc);
                    result = c.result;
                    break;
                case '/' :
                    y = s.nextDouble();
                    c = new Division(result, y);
                    l.log(Level.INFO, c::calc);
                    result = c.result;
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
