import java.util.List;

public class Local implements CheckPerson {

    public static void printPersons(
            List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    @Override
    public boolean test(Person p) {
        if(p.name.equals("Cay") && p.gender == Person.Sex.FEMALE){
            return true;
        }
        return false;
    }
}
