package labs.sorting;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this("", 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        if (getAge() > other.getAge())
            return -1;
        else if (getAge() < other.getAge())
            return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return String.format("<Name: %s, Age: %s>", getName(), getAge());
    }
}
