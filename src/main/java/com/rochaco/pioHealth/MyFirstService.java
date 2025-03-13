package com.rochaco.pioHealth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private final MyFirstClass myFirstClass;

    // de esta manera, le decimos a spring que necesitamos
    // usar el bean de myfirstclass a la hora de usar el service
    // lo inyecta de manera automatica
    // constructor inyection
    //@Autowired
    // ya no necsitamos el autowired, spring buscara
    // inyectar todo lo que sea inyectable
    public MyFirstService(
           MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String tellStory(){
        return  "the dependency is saying: " + myFirstClass.sayHello();
    }
}
