package com.stephen;

import java.math.BigInteger;
import java.util.ArrayList;

public class Svpino {

    public Svpino() {
        // Basic constructor
    }

    // Given an array of non-negative ints, return the largest int.
    public void largestNumber() {
        ArrayList<Integer> array = new ArrayList<Integer>();
        ArrayList<Integer> largestNum = new ArrayList<Integer>();

        array.add(50);
        array.add(2);
        array.add(1);
        array.add(9);


        for(int i = 0; i < array.size(); i++) {
            int largest = 10;
            int index = 0;

            while(true) {
                
            }
        }

    }

    // Return the first hundred Fibonacci number.
    public void firstHundredFibonacci() {
        ArrayList<BigInteger> fibonacci = new ArrayList<BigInteger>();
        BigInteger zero = new BigInteger("0", 10);
        BigInteger one = new BigInteger("1", 10);
        fibonacci.add(zero);
        fibonacci.add(one);

        for(int i = 0; i < 99; i++) {
            fibonacci.add(fibonacci.get(i).add(fibonacci.get(i + 1)));
        }

        for(int i = 0; i < fibonacci.size(); i++) {
            System.out.println("Number " + i + " " + fibonacci.get(i));
        }
    }

    // Merge the contents of two arrays.
    public void mergeArrays() {
        int arrayToMerge1[] = {1, 2, 3};
        char arrayToMerge2[] = {'a', 'b', 'c'};

        ArrayList<Object> mergedArray = new ArrayList<Object>();

        int index = 0;
        while (index < (arrayToMerge1.length)) {
            mergedArray.add(arrayToMerge1[index]);
            mergedArray.add(arrayToMerge2[index]);
            index++;
        }

        System.out.print("Merged array is: ");
        for(int i = 0; i < mergedArray.size(); i++) {
            if(i < mergedArray.size()) {
                System.out.print(mergedArray.get(i).toString() + ", ");
            } else {
                System.out.print(mergedArray.get(i).toString());
            }
        }
    }

    // Sum an array using for loop, while loop, and recursion
    public void sumArrays() {
        int arrayToSum[] = {0, 1, 2, 3, 4, 5};

        System.out.println("Going to sum using a for loop");
        int sum = 0;
        for(int i = 0; i < arrayToSum.length; i ++) {
            sum += arrayToSum[i];
        }
        System.out.println("For loop sum is: " + sum);

        System.out.println("Going to sum using a while loop");
        sum = 0;
        int i = 0;
        while(i < arrayToSum.length) {
            sum += arrayToSum[i];
            i++;
        }
        System.out.println("While loop sum is: " + sum);

        System.out.println("Going to do a recursive sum");
        sum = recursiveArraySum(arrayToSum, arrayToSum.length);
        System.out.println("Recursive sum is: " + sum);

    }

    // The recursive function used to sum the array.
    public int recursiveArraySum(int array[], int lastIndex) {
        if(lastIndex == 0) {
            return 0;
        }

        return array[lastIndex - 1] + recursiveArraySum(array, lastIndex - 1);
    }
}
