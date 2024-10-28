package com.Spel;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Driver {
    public static void main(String[] args) {
        try{
            AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/LifeCycle/Spel/spel.xml");
            Demo dem = context.getBean("demo",Demo.class);

//            System.out.println(dem);
//
//            SpelExpressionParser pareser = new SpelExpressionParser();
//            Expression exp = pareser.parseExpression("5+4-23");
//            System.out.println(exp.getValue());

            MethodDemo method = context.getBean("methodDemo",MethodDemo.class);
            System.out.println(method);
        }catch (Exception e){
            System.out.println(e.getMessage());;
        }
    }
}
