import junit.framework.TestCase;
import org.junit.Assert;

import java.time.Month;

public class PersonTest extends TestCase {

    public void testGetAge() {
        //Given
        int expected = 23;

        //When
        Person jon = new Person();
        jon.setBirthday(2000, Month.AUGUST, 1);
        int actual = jon.getAge();

        //Then
        Assert.assertEquals(expected, actual);

    }

    public void testPrintPerson() {
    }

    public void testPrintPersons() {
    }

    public void geSexTest() {
        //Given
        Person p = new Person();
        p.setGender(Person.Sex.FEMALE);

        //When
        Person.Sex actual = p.getGender();
        Person.Sex expected = Person.Sex.FEMALE;

        //Then
        Assert.assertEquals(expected, actual);
    }
}