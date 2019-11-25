import java.util.LinkedList;
import java.io.*;

public class ReverseInteger_2 {

    public static int reverse(int x) {

        LinkedList<Integer> aLinkedList;

        if (x<0){
            aLinkedList = transforIntIntoLinkedList(-x);
        } else {
            aLinkedList = transforIntIntoLinkedList(x);
        }

        long solution = 0;
        long decimalPlace;

        if (aLinkedList.size() == 1) {
            decimalPlace = 1;
        } else {
            decimalPlace = (int) Math.pow(10, aLinkedList.size()-1);
        }

        while (aLinkedList.size() > 0) {
            solution = solution + aLinkedList.pop() * decimalPlace;
            decimalPlace = decimalPlace / 10;
        }

        if (solution > Integer.MAX_VALUE){
            return 0;
        }

        if (x<0){
            return (int) -solution;
        }

        return (int) solution;

    }

    public static LinkedList transforIntIntoLinkedList(int x) {
        LinkedList<Integer> aLinkedList = new LinkedList<Integer>();
        int numbers = x;

        while (numbers>0){
            aLinkedList.add(numbers%10);
            numbers = numbers/10;
        }

        return aLinkedList;
    }


}
