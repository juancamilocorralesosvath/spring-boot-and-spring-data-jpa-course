package com.rochaco.pioHealth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@PropertySources({
        @PropertySource("classpath:custom.properties"),
        @PropertySource("classpath:custom-2.properties")
})
public class MyFirstService {

    private final MyFirstClass myFirstClass;
    @Value("${custom.prop}")
    private String customProperty;
    @Value("${second.custom.prop}")
    private String secondCustomProperty;

    public MyFirstService(
            @Qualifier("mySecondBean") MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String tellStory(){
        return  "the dependency is saying: " + myFirstClass.sayHello();
    }

    public String getCustomProperty() {
        return customProperty;
    }

    public String getSecondCustomProperty() {
        return secondCustomProperty;
    }
}
