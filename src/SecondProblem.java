//DATA STRUCTURES HOMEWORK
//TAHIR FURKAN SARIDIKEN
//200316004
//COMPUTER ENGINEERING

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class SecondProblem {
    
    public static void problem_two() {
        //I use Vector instead of an array to set the size of it, with the decision of the user.
        Vector<Integer> stack = new Vector<Integer>();
        //Initiliaze the stack size.
        int stackSize = 0;
        //Creating scanner to get inputs from user.
        Scanner scanner = new Scanner(System.in);
        //Ask to user about stack size.
        System.out.println("How many numbers do you want to sort?");
        stackSize = scanner.nextInt();
        //Ask for inputs to user.
        System.out.println("Please enter the numbers.");
        for(int i = 0; i<stackSize; i++){
            stack.add(scanner.nextInt());
        }
        //Closing the scanner object for efficiency.
        scanner.close();
        //Printing the unsorted stack.
        System.out.println("Unsorted stack: ");
            System.out.print(stack + " ");
        
        System.out.println();
        //Creating randomNumbers object to convert Vector named stack to the array.
        Object[] randomNumbers = stack.toArray();
        //Using sort method to sort the array from smallest to largest.
        Arrays.sort(randomNumbers);
        //Printing the sorted stack with for loop.
        System.out.println("Sorted stack: ");
        for(int i = 0; i < randomNumbers.length; i++){
            System.out.print(randomNumbers[i] + " ");
        }
        
    }
}
