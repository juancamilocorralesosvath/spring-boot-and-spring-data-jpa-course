package com.rochaco.pioHealth;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    //generated value para que el mismo spring se encargue de generar el id de mi objeto
    // cuando lo corremos, podemos ver en la consola: Hibernate:
    //    create sequence student_seq start with 1 increment by 50
    @GeneratedValue
    private int id;

    @Column(
            name = "c_fname",
            length = 50
    )
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private int age;
    // para datos que no queramos actualizar, por ejemplo, fecha de creacion del usuario.
    @Column(
            updatable = false
    )
    private String some_colum;

    public Student() {}

    public Student(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }


}
