package ru.arshaev.spring.spring_introduction;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog Bean is created");
    }

    @Override
    public void say() {
        System.out.println("Гав-гав!");
    }
}
