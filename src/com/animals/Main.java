package com.animals;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Zoo zoo = new Zoo();
        zoo.init();
        zoo.runAnimalByObjectReference();
        zoo.runAnimalsByInterfaceReference();
        zoo.hideAnimalsByInterfaceReference();
        zoo.makeNoiseAnimalsByInterfaceReference();
    }

}
