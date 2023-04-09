//DATA STRUCTURES HOMEWORK
//TAHIR FURKAN SARIDIKEN
//200316004
//COMPUTER ENGINEERING

import java.util.Stack;

public class ThirdProblem<T> {
    private Stack<T> inbox = new Stack<>();
    private Stack<T> outbox = new Stack<>();

    //This method add element to the back of the queue.
    public void enqueue(T item) {
        inbox.push(item);
    }

    //This method remove and return the element at the front of the queue
    public T dequeue() {
        //If the outbox stack is empty when dequeue method is called, the elements from the inbox stack are transferred
        //to the outbox stack in reverse order.
        //So that the first element added to the inbox stack will be the first element in the outbox stack.
        if (outbox.empty()) {
            while (!inbox.empty()) {
                outbox.push(inbox.pop());
            }
        }
        //Return with pop method to remove and return the oldest element in the queue.
        //Because I want to implement a standard queue, where the first element added to the queue is the first one to be removed(FIFO)
        return outbox.pop();
    }

    //This method return the element at the front of the queue without removing it
    public T peek() {
        //If the outbox stack is empty when peek method is called, the elements from the inbox stack are transferred
        //to the outbox stack in reverse order.
        //So that the first element added to the inbox stack will be the first element in the outbox stack.
        if (outbox.empty()) {
            while (!inbox.empty()) {
                outbox.push(inbox.pop());
            }
        }
        //Return to the first element in the outbox with peek method without removing it.
        return outbox.peek();
    }

    //inbox and outbox stacks are used to implement the queue.
    //inbox stack used to store elements that are added to the back of the queue.
    //outbox stack used to store elements that are removed from the front of the queue.
    
}