package generics.wildcards;

import java.awt.event.ActionEvent;
import java.io.*;
import java.lang.reflect.Constructor;
import java.util.*;
import generics.interfaces.*;

public class PersonLoader {
    private final RandomAccessFile file;

    public PersonLoader(File file) throws FileNotFoundException {
        this.file = new RandomAccessFile(file, "rw");
    }

    public Person load() throws ClassNotFoundException{
        try{
            String className = file.readUTF();
            String personName = file.readUTF();
            int age = file.readInt();

            Class<?> personClass = Class.forName(className);
            //Constructor<?> constructor = personClass.getConstructor(String.class)
        }catch (IOException e) {return null;}
        return null;
    }

    public void loadAll(List<? super Person> people) throws ClassNotFoundException {
        //When adding to a collection, it is only safe to add a class or its parents
        Person person;
        while ((person = load()) != null){
            people.add(person);
        }
    }
}
