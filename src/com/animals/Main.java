package com.animals;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Zoo zoo = new Zoo();
        zoo.init();
        zoo.runAnimalByObjectReference();
        System.out.println("-----------------------------");
        zoo.runAnimalsByInterfaceReference();
        System.out.println("-----------------------------");
        zoo.hideAnimalsByInterfaceReference();
        System.out.println("-----------------------------");
        zoo.makeNoiseAnimalsByInterfaceReference();
        System.out.println("-----------------------------");
    }

}
