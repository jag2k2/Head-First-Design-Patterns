package generics.wildcards;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import generics.interfaces.*;
import java.io.*;
import java.util.*;

class PersonSaverTest {
    private Partner donDraper;
    private Partner bertCooper;
    private Employee peggyOlson;

    private File file;
    private PersonSaver personSaver;
    private PersonLoader personLoader;

    @BeforeEach
    void setUp() {
        donDraper = new Partner("Don Draper", 89);
        bertCooper = new Partner("Bert Cooper", 100);
        peggyOlson = new Employee("Peggy Olson", 68);
    }

    @Test
    void canAddChildrenToPersonList(){
        Person madPerson = new Person("Jeff", 40);
        List<Person> madMen = new ArrayList<>();
        madMen.add(donDraper);                              // adding Partner
        madMen.add(peggyOlson);                             // adding Employee
        madMen.add(madPerson);                              // adding Person

        // can assign subType to supertype variable;
        madPerson = donDraper;

        /*
        But you cannot assign List<subtype> to List<supertype> variable.  Lists are not co-variant.
        You can however pass List<subtype> to List<? extends supertype> parameter.  PersonSaver demonstrates this.
        */
        List<Partner> madPartners = new ArrayList<>();
        //madMen = madPartners;
    }

    @Test
    void saveAndLoadsPerson() throws Exception {
        Person person = new Person("Bob", 20);
        personSaver.save(person);
        assertEquals(person, personLoader.load());
    }

    @Test
    void savesAndLoadsArraysOfPeople() throws Exception {
        List<Partner> persons = new ArrayList<>();
        persons.add(donDraper);
        persons.add(bertCooper);

        personSaver.saveAll(persons);                   //Partner is subclass of Person.  List<Partner> is not subclass of List<Person>!!!
        personSaver.saveAll2(persons);

        assertEquals(donDraper, personLoader.load());
        assertEquals(bertCooper, personLoader.load());
    }

    @Test
    void loadsListsOfPeople() throws Exception {
        personSaver.save(donDraper);
        personSaver.save(peggyOlson);

        List<Object> people = new ArrayList<>();
        personLoader.loadAll(people);
    }
}