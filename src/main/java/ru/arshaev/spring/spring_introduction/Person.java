package ru.arshaev.spring.spring_introduction;

public class Person {

    private Pet pet;
    private String surname;
    private int age;

//    public Person(Pet pet) {
//        System.out.println("Person Bean is created");
//        this.pet = pet;
//    }

    public Person() {
        System.out.println("Person Bean is created");
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: set Pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Привет, мое любимое животное");
        pet.say();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
