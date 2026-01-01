package javabasics;

import java.util.Scanner;

public class AllOperatorsInONeClassUsingScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first element :- ");
        int first = sc.nextInt();
        System.out.println("Enter the second element :- ");
        int second = sc.nextInt();

        System.out.println("------------------Airthmetic operator---------------------");
        System.out.println("Addition :- "+(first+second));
        System.out.println("Subtraction :- "+(first-second));
        System.out.println("Multiplication :- "+(first*second));
        System.out.println("Division :- "+(first/second));
        System.out.println("Modulas :- "+(first%second));

        System.out.println("--------------Unary operator-----------------------------");
        System.out.println("PreIncrement : "+(++first));
        System.out.println("PostIncrement : "+(second++));
        System.out.println("PreDecrement : "+(--first));
        System.out.println("PostDecrement : "+(second--));

        System.out.println("----------------------------Relation operator----------------");
        System.out.println("Greater then : "+(first>second));
        System.out.println("Greater then : "+(first<second));
        System.out.println("Greater then equal to : "+(first>=second));
        System.out.println("Less then equal to : "+(first<=second));
        System.out.println("Not equal to : "+(first!=second));

        System.out.println("-------------------Logical Operator-----------");
        System.out.println("And operator : "+((first > second) && (first < second)));
        System.out.println("And operator : "+((first > second) || (first < second)));
        System.out.println("And operator : "+(! (first < second)));

        System.out.println("------------------Assignment Operators-------------");
        first +=5;
        second -=3;
        System.out.println("Assignment operator : "+first);
        System.out.println("Same as Assignment operator : "+second);


        System.out.println("-----------------Bitwise operator-------------");
        System.out.println("Bitwise AND operator : "+(first & second));
        System.out.println("Bitwise OR operator : "+(first | second));
        System.out.println("Bitwise XOR operator : "+(first ^ second));

    }
}
