package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWinthAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Cat myCat = context.getBean("catBean", Cat.class);
        myCat.say();
        context.close();
    }
}
