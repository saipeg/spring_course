package com.zaurtregulov.spring.spring_introduction;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("com.zaurtregulov.spring.spring_introduction")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean() {
        return new Cat();
    }
    @Bean
    public Person personBean() {
        return new Person(catBean());
    }


}
