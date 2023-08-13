public class CheckPersonConcrete implements CheckPerson {

    @Override
    public boolean test(Person p) {
        return (p.getBirthday() != null && p.getGender() != null);
    }

}
