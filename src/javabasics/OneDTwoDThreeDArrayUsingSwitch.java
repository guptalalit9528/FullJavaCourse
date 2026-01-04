package javabasics;

import java.util.Scanner;

public class OneDTwoDThreeDArrayUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. One D Array, 2. Two D Array, 3. Three D Array");
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Welcome to One Dimensional  Arrray");
                int [] arr = {1,2,3,4,5,6,7,8,9,10};
                for(int i = 0; i<arr.length; i++){
                    System.out.print(arr[i]+"\t");
                }
                break;
            case 2:
                System.out.println("Welcome to Two Dimensional Array");
                Scanner ob = new Scanner(System.in);
                System.out.print("Enter the rows: ");
                int rows = sc.nextInt();

                System.out.print("Enter the columns: ");
                int cols = sc.nextInt();

                int[][] matrix = new int[rows][cols];

                System.out.println("Enter matrix elements:");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        matrix[i][j] = sc.nextInt();
                    }
                }
                System.out.println("Matrix is:");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Enter the MultiDimensional Array");
                int[][][] arr2 = {{{1, 2}, {3, 4}},
                        {{5, 6}, {7, 8}}};

                System.out.println("3D Array elements:");
                for (int i = 0; i < arr2.length; i++) {           // block
                    for (int j = 0; j < arr2[i].length; j++) {    // row
                        for (int k = 0; k < arr2[i][j].length; k++) { // column
                            System.out.print(arr2[i][j][k] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Please dont enter invalid choice");
        }
    }
}
