package generics.genericmethod;

import org.junit.jupiter.api.*;
import generics.interfaces.AgeComparator;
import generics.interfaces.Person;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public class GenericMethodTest {
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
    void canGetYoungestCastMember(){
        Person youngestCastMember = (Person) unsafeMin(madMen, new AgeComparator());
        System.out.println(youngestCastMember);
    }

    private static Object unsafeMin(List values, Comparator comparator){
        if ( values.isEmpty())
        {
            throw new IllegalArgumentException("List is empty, cannot find minimum");
        }

        Object lowestElement = values.get(0);

        for (Object element : values){
            if(comparator.compare(element, lowestElement) < 0){
                lowestElement = element;
            }
        }

        return lowestElement;
    }

    @Test
    void canGetYoungestCastMemberSafely(){
        Person youngestCastMember = safeMin(madMen, new AgeComparator());
        System.out.println(youngestCastMember);
    }

    private static <T> T safeMin(List<T> values, Comparator<T> comparator){
        if ( values.isEmpty())
        {
            throw new IllegalArgumentException("List is empty, cannot find minimum");
        }

        T lowestElement = values.get(0);

        for (T element : values){
            if(comparator.compare(element, lowestElement) < 0){
                lowestElement = element;
            }
        }

        return lowestElement;
    }

    @Test
    void canUseGenericMethodOnOtherTypes(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(safeMin(numbers, Integer::compare));
    }
}
