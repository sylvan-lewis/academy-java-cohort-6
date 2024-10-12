package com.bptn.course._Big_Coding_w3;

import java.util.ArrayList; // import ArrayList class
import java.util.HashSet; // import HashSet class
import java.util.List; // import List interface
import java.util.Set; // import Set interface

public class PhoneNumberPrefix {
    public static void main(String[] args) {
        
        // Create a list of phone numbers
        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("555-555-1234");
        phoneNumbers.add("555-555-2345");
        phoneNumbers.add("555-555-3456");
        phoneNumbers.add("444-444-1234");
        phoneNumbers.add("333-333-1234");   

        // Create a set to hold the unique prefixes
        Set<String> prefixes = new HashSet<>();
       
       // Use a for-each loop to iterate over the phoneNumbers list
        for (String phoneNumber : phoneNumbers) {

            // Extract the first 7 characters (prefix) using substring
            String prefix = phoneNumber.substring(0, 7);

        // Add the prefix of each phone number to the set using a loop
            prefixes.add(prefix);
        }
        // Print the unique prefixes
        System.out.println("Unique prefixes: " + prefixes);
    }

}