package assignments.sorting_algorithms.merge_sort;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        if (lastName.compareTo(other.lastName) == 0) {
            if (firstName.compareTo(other.firstName) == 0) {
                return Integer.compare(age, other.age);
            }
            return firstName.compareTo(other.firstName);
        }
        return lastName.compareTo(other.lastName);
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName + " " + age;
    }
}
