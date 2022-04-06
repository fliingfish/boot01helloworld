package com.study.boot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @auther 张兆星
 */

//属性绑定Springboot提供了一个 @ConfigurationProperties ,只有该注解无法生效，因为他没有放在SpringBoot的容器中
@Component
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private String name;

    private float price;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


}
