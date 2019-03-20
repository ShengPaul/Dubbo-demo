package com.google;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws Exception
    {
        ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        con.start();
        System.out.println("启动成功");
        System.in.read();
    }
}
