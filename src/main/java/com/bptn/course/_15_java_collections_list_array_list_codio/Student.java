package com.bptn.course._15_java_collections_list_array_list_codio;


class Student {

   private String name;
   private String email;
   private int id;

   public Student(String initName, String initEmail, int initId) {
      name = initName;
      email = initEmail;
      id = initId;
   }

   // toString() method
   public String toString() {
     return id + ": " + name + ", " + email;
   }

}