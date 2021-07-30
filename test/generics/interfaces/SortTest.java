package generics.interfaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortTest {
    private List<Person> madMen;

    @BeforeEach
    void setUp() {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson", 65);
        Person bertCooper = new Person("Bert Cooper", 100);

        madMen = new ArrayList<>();
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        madMen.add(bertCooper);
    }

    @Test
    void canSortByAgeComparator(){
        System.out.println(madMen);
        Collections.sort(madMen, new AgeComparator());
        System.out.println(madMen);
    }

    @Test
    void canSortByAnonymousClass(){
        System.out.println(madMen);
        Collections.sort(madMen, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return Integer.compare(person1.getAge(), person2.getAge());
            }
        });
        System.out.println(madMen);
    }

    @Test
    void canReverseSortWithGenericDecorator(){
        System.out.println(madMen);
        Collections.sort(madMen, new ReverseComparator<>(new AgeComparator()));
        System.out.println(madMen);
    }
}