package classes;

public class Demo {
    public static void main(String[] args) {
        String personFirstName;
        String personLastName;
        int age;
        int income;


        String anotherPersonFirstName;
        //....


        String anotherOtherPersonFirstName;


        Person person = new Person("Ivan", "Ivanov", 18, 0);
        Person anotherPerson = new Person();


        person.setAge(12);
        person.setIncome(60000);
        System.out.println(person.getFullName());
        System.out.println(person.getAge());

    }
}
