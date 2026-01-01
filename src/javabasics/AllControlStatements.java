package javabasics;

import java.util.Scanner;

public class AllControlStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. if statement ,2. if-else 3. ladder if-else statement 4.nested if \n5.for loop , 6.while loop, 7.Do-while loop");
        System.out.print("Enter tour choice : ");
        int choise = sc.nextInt();

        switch (choise){
            case 1 :
                System.out.println("Wlcome to if statement");
                int a = 50;
                int b = 100;
                if(a<b){
                    System.out.println("B number is bigger");
                }
                break;
            case 2 :
                System.out.println("Welcome to if-else Statement");
                int num = 7;
                if(num % 2 == 0) {
                    System.out.println("Even Number");
                } else {
                    System.out.println("Odd Number");
                }
                break;
            case 3 :
                System.out.println("Welcome to Ladder if-else statement");
                int val = 30;
                if(val < 0){
                    System.out.println("This number is positive");
                } else if (val == 0) {
                    System.out.println("This number is zero");
                }else{
                    System.out.println("This number is negative");
                }
                break;
            case 4 :
                System.out.println("Welcome to nested if statement");
                int data = 120;
                if(data > 0){
                    if(data >100) {
                        System.out.println("this number is positive and greater then 100");
                    }
                }else{
                    System.out.println("this number is negetive ");
                }
                break;
            case 5:
                System.out.println("Welcome to for loop");
                for(int i = 0; i <= 100; i++){
                    System.out.println(i);
                }
                break;
            case 6 :
                System.out.println("Welcome to while loop");
                int i = 0;
                while(i<=50){
                    System.out.println(i);
                    i++;
                }
                break;
            case 7 :
                System.out.println("Welcome to Do-while loop");
                int k = 0;
                do{
                    System.out.println(k);
                    k++;
                }while(k<=50);
                break;
            default:
                System.out.println("Please Dont Enter the Invalid Number");
        }
    }
}
