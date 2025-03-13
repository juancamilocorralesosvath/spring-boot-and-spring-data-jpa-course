package com.rochaco.pioHealth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private MyFirstClass myFirstClass;

    @Autowired
    public void setMyFirstClass(
            @Qualifier("myFirstClass") MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String tellStory(){
        return  "the dependency is saying: " + myFirstClass.sayHello();
    }
}
