package javabasics;

public class LogicalOperator {
    public static void main(String[] args) {
        int age = 19;
        if (age >= 18 && age <= 60) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
}
