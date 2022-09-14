package ru.arshaev.spring.spring_introduction;

public class Dog implements Pet {

    @Override
    public void say() {
        System.out.println("Гав-гав!");
    }
}
