package ru.arshaev.spring.spring_introduction;

public class Person {

    private Pet pet;

    public Person(Pet pet) {
        System.out.println("Person Bean is created");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Привет, мое любимое животное");
        pet.say();
    }
}
