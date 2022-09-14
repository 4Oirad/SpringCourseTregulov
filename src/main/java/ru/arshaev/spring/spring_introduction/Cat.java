package ru.arshaev.spring.spring_introduction;

public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat Bean is created");

    }

    @Override
    public void say() {
        System.out.println("Мяу!");
    }
}
