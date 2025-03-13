package com.rochaco.pioHealth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private MyFirstClass myFirstClass;
    // environment bean
    private Environment environment;

    @Autowired
    public void setMyFirstClass(
            @Qualifier("myFirstClass") MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String tellStory(){
        return  "the dependency is saying: " + myFirstClass.sayHello();
    }

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    public String getJavaVersion(){
        return  environment.getProperty("java.version");
    }

    public String getOsName(){
        return  environment.getProperty("os.name");
    }

    public String readProperty(){
        return  environment.getProperty("my.custom.property");
    }
}
