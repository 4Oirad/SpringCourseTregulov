package ru.arshaev.spring.spring_introduction;

public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog Bean is created");
    }

    @Override
    public void say() {
        System.out.println("Гав-гав!");
    }
}
