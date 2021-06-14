package com.onlypankaj;

class Animal {
    private String type;
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

class Cat extends Animal {
}

public class Question8 {
    private static Animal animal;
    public static void main(String[] args) {
        animal = new Cat();
        animal.setType("Cat");
        eat(animal);
        eat(animal);
    }

    private static void eat(Animal animal) {
        if (animal instanceof Cat) {
            System.out.println(animal.getType() + " has eaten");
            animal.setType("Domesticated Cat");
        }
        animal = null;

        
    }
}
