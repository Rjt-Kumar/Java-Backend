package com.Features;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Locale;

public class Internationalization {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        BeanFactory facto = new ClassPathXmlApplicationContext();

        Object[] para = new Object[]{"Dwivedi" , "Hell"};

        String messgeInEnglish = context.getMessage("greeting",para,"No greetings",Locale.ENGLISH);
        System.out.println(messgeInEnglish  + " using application Context IOC container");

        String messageInFrench = context.getMessage("farewell",para,"No Bonjour",Locale.FRENCH);
        System.out.println(messageInFrench + " using BeanFactory IOC container ");

    }
}
