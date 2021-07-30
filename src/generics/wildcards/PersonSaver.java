package generics.wildcards;

import java.io.*;
import java.util.List;

import generics.interfaces.*;

public class PersonSaver {
    private final RandomAccessFile file;

    public PersonSaver(File file) throws FileNotFoundException{
        this.file = new RandomAccessFile(file, "rw");
    }

    public void save(Person person) throws IOException {
        file.writeUTF(person.getClass().getName());
        file.writeUTF(person.getName());
        file.writeInt(person.getAge());
    }

    /*
    "T extends Person" means all instances of "T" must be same type and T must be Person or one of its subtypes
          Use "T extends" when you want to declare a generic type and refer to that type elsewhere
    "? extends Person" means type can be anything as long as it is Person or one of its subtypes
          Use "? extends" for something like a parameter on a method
     */

    public void saveAll(List<? extends Person> persons) throws IOException
    {
        //When trying to get elements out of a collection, it is only safe to get a class or its children.
        for (Person person : persons){
            save(person);
        }
    }

    //this works also!  But the ? extends is a bit more terse.
    public <T extends Person> void saveAll2(List<T> persons) throws IOException
    {
        for (Person person : persons){
            save(person);
        }
    }
}
