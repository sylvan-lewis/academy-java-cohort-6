package com.bptn.course.hello;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();        
        
        names.add("David");
        names.add("Alice");
        names.add("Bob");
        names.add("Samir");
        names.add("David");
        
        int lastDavid = names.lastIndexOf("David");

        System.out.println("Last David at " + lastDavid);
    }
}