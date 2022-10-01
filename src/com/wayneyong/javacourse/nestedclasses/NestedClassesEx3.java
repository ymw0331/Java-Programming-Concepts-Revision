package com.wayneyong.javacourse.nestedclasses;

/**
 * static nested classes (static refer to the entire class,
 * non-static refer to object )
 * <p>
 * allow us to create message of object using the Builder
 */

class Person {
    private String firstName;
    private String lastName;

    private Person() {
    }

    private Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void display() {
        System.out.printf("Firstname is %s \nLastname is %s \n", firstName, lastName);
    }

    static class Builder {
        Person internalState = new Person();

        //fluent interface
        public Builder withFirstName(String firstName) {
            internalState.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            internalState.lastName = lastName;
            return this;

        }

        public Person build() {
            return internalState;
        }
    }
}

public class NestedClassesEx3 {
    public static void main(String[] args) {
//        Person p1 = new Person("a", "b");
//        p1.display();
//
//        Person.Builder personBuilder = new Person.Builder();
//        personBuilder.withFirstName("a");
//        personBuilder.withLastName("b");
//        Person p = personBuilder.build();

        Person.Builder personBuilder = new Person.Builder();
        Person p = personBuilder
                .withFirstName("a")
                .withLastName("b")
                .build();
        p.display();
    }
}
