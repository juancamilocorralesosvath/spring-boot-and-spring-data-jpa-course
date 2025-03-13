package com.rochaco.pioHealth;


public class MyFirstClass  {

    private String myVar;

    public MyFirstClass(String myVar) {
        this.myVar = myVar;
    }

    public String sayHello(){
        return "hello from MyFirstClass, my var is " + myVar;
    }
}
