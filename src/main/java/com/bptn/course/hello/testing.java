package com.bptn.course.hello;

public class testing {
	public class MathUtils {
        public static int add(int a, int b) {
            System.out.println(a + b);
        }
    }   
        
    public static void main(String[] args) {
        int result = MathUtils.add(5, 3);
        System.out.println("The sum is: " + result);
    }
}