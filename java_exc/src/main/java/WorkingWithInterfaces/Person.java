package WorkingWithInterfaces;

public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        int lastCmp = this.lastName.compareToIgnoreCase(other.lastName);
        if (lastCmp != 0) return lastCmp;

        int firstCmp = this.firstName.compareToIgnoreCase(other.firstName);
        if (firstCmp != 0) return firstCmp;

        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (Age: " + age + ")";
    }
}