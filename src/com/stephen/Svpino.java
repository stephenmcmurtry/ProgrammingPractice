package com.stephen;

public class Svpino {

    public Svpino() {
        // Basic constructor
    }

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

    public int recursiveArraySum(int array[], int index) {
        if(index == 0) {
            return 0;
        }

        return array[index - 1] + recursiveArraySum(array, index - 1);
    }
}
