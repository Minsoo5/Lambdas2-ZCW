import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class CheckPersonTest {
    @Test
    public void checkPersonWithLocalClass(){
        //Given
        List<Person> peeps = new ArrayList<>();
        peeps.add(new Person("Joe", LocalDate.of(1990, Month.APRIL, 23), Person.Sex.MALE, "JoeandGreg@gmail.com"));
        peeps.add(new Person("Greg", LocalDate.of(1991, Month.NOVEMBER, 10), Person.Sex.MALE, "JoeandGreg@gmail.com"));
        peeps.add(new Person("Lisa", LocalDate.of(2000, Month.MARCH, 7), Person.Sex.FEMALE, "Lisa@gmail.com"));
        peeps.add(new Person("Min", LocalDate.of(1996, Month.AUGUST, 16), Person.Sex.MALE, "Min@gmail.com"));

        CheckPersonConcrete tester = new CheckPersonConcrete();

        //When
        Person.printPersons(peeps, tester);

        //Then

    }

    @Test
    public void checkPersonWithAnonClass(){
        //Given
        List<Person> peeps = new ArrayList<>();
        peeps.add(new Person("Joe", LocalDate.of(1990, Month.APRIL, 23), Person.Sex.MALE, "JoeandGreg@gmail.com"));
        peeps.add(new Person("LittleSarah", LocalDate.of(2021, Month.AUGUST, 16), Person.Sex.FEMALE, "LittleSarah@gmail.com"));
        peeps.add(new Person("Greg", LocalDate.of(1991, Month.NOVEMBER, 10), Person.Sex.MALE, "JoeandGreg@gmail.com"));
        peeps.add(new Person("Lisa", LocalDate.of(2000, Month.MARCH, 7), Person.Sex.FEMALE, "Lisa@gmail.com"));
        peeps.add(new Person("Min", LocalDate.of(1996, Month.AUGUST, 16), Person.Sex.MALE, "Min@gmail.com"));
        peeps.add(new Person("Youngster", LocalDate.of(2010, Month.AUGUST, 16), Person.Sex.MALE, "Youngster@gmail.com"));

        //When
        Person person = new Person();

        Person.printPersons(peeps, person.checkObject);

        //Then

    }
}
