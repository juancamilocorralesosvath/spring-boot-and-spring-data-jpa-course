package com.rochaco.pioHealth;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {

    // si no le decimos a spring que este es un bean desde aca
    // podemos poner la anotacion @Component en la clase que
    // queremos hacer como bean
    @Bean()
    public MyFirstClass myFirstClass() {
        return new MyFirstClass("first bean");
    }

    // es muy util si tenemos varios beans del mismo tipo
    @Bean()
    public MyFirstClass mySecondBean() {
        return new MyFirstClass("second bean");
    }
    @Bean()
    //@Primary
    public MyFirstClass myThirdBean() {
        return new MyFirstClass("third bean");
    }
}
