//DATA STRUCTURES HOMEWORK
//TAHIR FURKAN SARIDIKEN
//200316004
//COMPUTER ENGINEERING

import java.util.Queue;
import java.util.LinkedList;

public class FirstProblem{
    
    public static int problem_one(int[] ticketNumbers, int k) {

        //Created the n variable for the get array's length to use in for loop to add every elements of the array to the queue.
        int n = ticketNumbers.length;
        //Created the ticketNumber queue with the type of Integer.
        //Used LinkedList implementation because it is dynamic data structure.
        //It is effiecent. It can add and remove from both ends.
        //I don't have to implement all the queue methods that I need from scratch.
        Queue<Integer> ticketNumber = new LinkedList<>();
        //For loop for the add every element from ticketNumbers array which is given by user, to the ticketNumber queue.
        for (int i = 0; i < n; i++) {
            //I use offer with the help of LinkedList implementation.
            //Offer method return false if it can't add the element to the queue. But add throw an exception. And this situtation make my work harder.
            ticketNumber.offer(i);
        }
        //Created time variable.
        int time = 0;
        //While loop will be continue until the ticketNumber queue is empty.
        while (!ticketNumber.isEmpty()) {
            //I will assign the current person on the front of the queue to the currentPerson variable with the help of poll method.
            //This method get the front element on the queue with removing the element from queue.
            int currentPerson = ticketNumber.poll();
            //If condition will be true if the current person on the front of the queue still has tickets to buy.
            if (ticketNumbers[currentPerson] > 0) {
                //Deleting one ticket from the current person's desired ticket numbers.
                ticketNumbers[currentPerson]--;
                //If condition will be true if the desired person is on front of the queue.
                if (currentPerson == k) {
                    //And if the desired person has bought all their ticket this If condition will be true too.
                    //And after that add plus one to the time. Then return to time variable.
                    if (ticketNumbers[k] == 0) {
                        return time + 1;
                    }
                }
                //Before the If condition (started on line 29) I use poll method the get front element on the queue and remove it from queue.
                //In this If condition I checked current person's ticket numbers. And if it is true I have deleted one ticket.
                //After that I have to add this person to the end of the queue. Because this person still has tickets to buy.
                ticketNumber.offer(currentPerson);
            }
            //If condition will be true if the current person bought all their tickets and this current person is not the desired person which declared by the variable k.
            if (ticketNumbers[currentPerson] == 0 && currentPerson != k) {
                //Removing this person from the queue due to this person bought all their tickets.
                ticketNumber.remove(currentPerson);
            }
            //Plus one to the time variable.
            time++;
        }
        //If I achieve this return, this mean desired person still has ticket to buy.
        //So it will return -1 to time variable.
        //I check this condition on main function.
        //If the program works properly I should not see this condition's results.
        return -1; 
    }

}