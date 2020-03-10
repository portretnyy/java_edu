package classes;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int income;

    public Person(String firstName, String lastName, int age, int income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.income = income;
    }

    public Person() {}

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getIncome() {
        return income;
    }

    public void setAge(int age) {
        if (age < 18 ) {
            this.age = 18;
        } else {
            this.age = age;
        }
    }

    public void setIncome(int income) {
        this.income = income;
    }

    String getFullName() {
        return firstName + " " + lastName;
    }
}
