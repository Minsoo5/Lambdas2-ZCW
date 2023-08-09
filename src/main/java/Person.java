import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;
import java.util.List;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person() {
        this("name", null, null, null);
    }

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress){
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(int year, Month month, int dayOfMonth) {
        this.birthday = LocalDate.of(year, month, dayOfMonth);
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        //return LocalDate - this.birthday;
        LocalDate today = LocalDate.now();
        //return (today.compareTo(birthday));
        return Period.between(birthday, today).getYears();

    }

    public void printPerson() {
        //System.out.printf("%s is a %s and is %d years old found at %s.", this.getName(), this.getGender(), this.getAge());
        String print = "%s is %d years old. They are a %s. Email them at %s\n";
        System.out.format(print, name, getAge(), gender, emailAddress);

    }

    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

}