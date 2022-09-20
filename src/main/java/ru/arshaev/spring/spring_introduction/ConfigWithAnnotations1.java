package ru.arshaev.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
//        Cat myCat = context.getBean("cat", Cat.class);
//        myCat.say();

        context.close();
    }
}
