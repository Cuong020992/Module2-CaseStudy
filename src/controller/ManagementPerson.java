package controller;

import model.Person;

import java.util.ArrayList;
import java.util.List;

public class ManagementPerson {
    private List<Person> personList;

    public ManagementPerson() {
        this.personList = new ArrayList<>();
    }

    public void  addPerson(Person person){
        this.personList.add(person);
    }

    public void showListPerson(Person person){
        this.personList.forEach(o -> System.out.println(o.toString()));
    }

}
