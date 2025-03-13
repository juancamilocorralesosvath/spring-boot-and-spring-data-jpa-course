package com.rochaco.pioHealth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    // de esta manera hacemos setter injection
    @Autowired
    @Qualifier("mySecondBean")
    private MyFirstClass myFirstClass;



    public String tellStory(){
        return  "the dependency is saying: " + myFirstClass.sayHello();
    }
}
