package com.study.boot.confg;

import com.study.boot.bean.Pet;
import com.study.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @version 1.0
 * @auther 张兆星
 */

/**
 * 1. 配置类中使用@bean标注在方法上给容器注入组件，默认是单实例的
 * 2.配置类本身也是组件
 * 3.proxyBeanMethods   ：代理bean的方法
 *          Full   (proxyBeanMethods = true) == 保证每个@bean的方法被调用任何次都是单实例的
 *          Lite(proxyBeanMethods = false) == 保证每个@bean调用的方法都是多实例的
 *
 *          4.@Import ({User.class,Pet.class,或者jar包中的实体类})
 *          给容器中自动创建传入的类型组件,默认导入的名字是全类名
 * */



@Import({User.class})
@Configuration(proxyBeanMethods = true) //告诉SpringBoot 这是一个配置类 === 配置文件
@ImportResource("calsspath:")//该属性是指，当第三方使用的是xml配置组件的时候，你无需将他们一个个加入的自己的框架中
//只用使用@ImportResource 导入需要加入的xml文件就可以
public class MyConfig {


    @ConditionalOnBean(name = "tom")//该注解属于条件装配，它的基类是 @Conditional
    @Bean  //方法的名字就是组件的id 返回类型就是组件的类型，返回的值就是组件的示例
    public User getuser(){
        User user  = new User("小米",15);
        user.setPet(getpet());
        return  user;
    }

    @Bean(name = "tom")
    public Pet getpet(){

        return  new Pet("阿拉斯加",6);
    }
}
