package org.example;

import java.util.Scanner;
abstract class Calculation{
    double result;
    double n2;
    Calculation(double r, double y){
        result = r;
        n2 = y;
    }
    abstract double calc();
}
class Addition extends Calculation{
    Addition(double r, double y) {
        super(r, y);
    }
    double calc(){
        return result += n2;
    }
}
class Subtraction extends Calculation{
    Subtraction(double r, double y) {
        super(r, y);
    }
    double calc(){
        return result -= n2;
    }
}
class Multiplication extends Calculation{
    Multiplication(double r, double y) {
        super(r, y);
    }
    double calc(){
        return result *= n2;
    }
}
class Division extends Calculation{
    Division(double r, double y) {
        super(r, y);
    }

    double calc(){
        return result /= n2;
    }
}
public class Calculator {
    public static void main(String[] args) {
        double x;
        double y;
        double result;
        char ch;
        Calculation c;
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        x = s.nextDouble();
        result = x;
        while (true) {
            System.out.println("Enter the Opertion Symbol:");
            ch = s1.next().charAt(0);
            switch (ch) {
                case '+' :
                    y = s.nextDouble();
                    c = new Addition(result, y);
                    System.out.println(c.calc());
                    result = c.result;
                    break;
                case '-' :
                    y = s.nextDouble();
                    c = new Subtraction(result, y);
                    System.out.println(c.calc());
                    result = c.result;
                    break;
                case '*' :
                    y = s.nextDouble();
                    c = new Multiplication(result, y);
                    System.out.println(c.calc());
                    result = c.result;
                    break;
                case '/' :
                    y = s.nextDouble();
                    c = new Division(result, y);
                    System.out.println(c.calc());
                    result = c.result;
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}