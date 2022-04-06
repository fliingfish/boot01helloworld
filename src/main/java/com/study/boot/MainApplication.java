package com.study.boot;

import com.study.boot.bean.Pet;
import com.study.boot.bean.User;
import com.study.boot.confg.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @version 1.0
 * @auther 张兆星
 *
 *
 */


/**
 * @SpringBootApplication ：这是一个主程序类 ，主配置类 ，就是主程序应用
 *
 */


 //@SpringBootApplication(scanBasePackages = "com.study.boot") 以下三个等价于这一个
@SpringBootConfiguration
@EnableAutoConfiguration//自动注入
@ComponentScan("com.study.boot")//包扫描
public class MainApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String s: beanDefinitionNames
             ) {
            System.out.println(s);

        }

        MyConfig bean = run.getBean(MyConfig.class);



        User user = bean.getuser();
        User user1 = bean.getuser();
        System.out.println(user == user1);
        System.out.println(user.toString());
        System.out.println(user1.toString());

        Pet tom = bean.getpet();

        System.out.println(tom == user1.getPet());
        System.out.println(tom.toString());
        System.out.println(tom.toString() +"main");

    }



}
