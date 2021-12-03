import java.time.LocalDate;
import java.util.List;

public class Anonymous implements CheckPerson{

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
        if(p.birthday == LocalDate.MAX && p.emailAddress.equals("zipcode123@gmail.com")){
            return true;
        }
        return false;
    }
}
