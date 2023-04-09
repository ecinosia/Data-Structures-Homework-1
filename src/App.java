//DATA STRUCTURES HOMEWORK
//TAHIR FURKAN SARIDIKEN
//200316004
//COMPUTER ENGINEERING

import java.util.Scanner;

public class App {

    public static <problem_one> void main(String[] args) throws Exception {
        
        //YOU NEED THE COMMENT THE PROBLEM ONE OR TWO TO INCASE OF THE UNWANTED RESULTS.

        //FIRST PROBLEM
        //Creating scanner object to get input from user.
        Scanner scanner = new Scanner(System.in);
        //Get the number of people who want to buy tickets.
        System.out.print("How many people want to buy tickets?");
        int n = scanner.nextInt();
        
        //Get the number of tickets to buy for every person on the queue respectively.
        int[] tickets = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Please enter the number of desired tickets for person %d: ", i);
            tickets[i] = scanner.nextInt();
        }
        
        //Get the desired person which we want to buy the all the tickets this person wants.
        System.out.print("Enter the desired person's place in queue: ");
        int k = scanner.nextInt();
        
        //Create the time variable and set it from the function.
        int time = FirstProblem.problem_one(tickets, k);
        //Closing the scanner object for efficiency.
        scanner.close();

        if (time == -1) {
            System.out.println("The kth person couldn't get all their tickets.");
        } else {
            System.out.println("It takes " + time + " seconds for the desired person to get all their tickets.");
        }


        //SECOND PROBLEM
        SecondProblem.problem_two();


        //THIRD PROBLEM
        //Can not be called.
    }
}
