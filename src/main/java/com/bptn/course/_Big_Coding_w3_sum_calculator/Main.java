package com.bptn.course._Big_Coding_w3_sum_calculator;

public class Main {

    public static void main(String[] args) {
        
        // Create two SumCalculator threads to calculate the sum of two different ranges
        SumCalculator sumCalculator1 = new SumCalculator(1, 50);
        SumCalculator sumCalculator2 = new SumCalculator(51, 100);

        // Start both threads
       sumCalculator1.start();
       sumCalculator2.start();

        try {
          sumCalculator1.join();
          sumCalculator2.join();
            // Wait for both threads to finish using join() method of each thread.
        } catch (InterruptedException e) {
            // Print the stack trace if an interruption occurs
            e.printStackTrace();
        }

        // Calculate the total sum by adding the sum of both ranges
        int totalSum = sumCalculator1.getSum() + sumCalculator2.getSum();
        
        // Print the total sum
        System.out.println("Total sum: " + totalSum);
    }
}
