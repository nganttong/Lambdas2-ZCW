public class LambdaExpress {

    CheckPerson person = p -> p.gender == Person.Sex.FEMALE && p.name.equals("Cay") && p.emailAddress.equals("ZCW123@gmail.com");

}
