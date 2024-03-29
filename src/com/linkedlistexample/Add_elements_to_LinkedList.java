package com.linkedlistexample;
import java.util.LinkedList;
public class Add_elements_to_LinkedList {
    public static void main(String[] args){
        // create linkedlist
        LinkedList<String> animals = new LinkedList<>();

        // add() method without the index parameter
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        System.out.println("LinkedList: " + animals);

        // add() method with the index parameter
        animals.add(1, "Horse");
        System.out.println("Updated LinkedList: " + animals);
    }
}
