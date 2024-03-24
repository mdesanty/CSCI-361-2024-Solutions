package assignments.sorting_algorithms.merge_sort;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Frank", "Denton", 73));
        people.add(new Person("Mark", "Cohen", 44));
        people.add(new Person("Tim", "Smith", 22));
        people.add(new Person("Steve", "Denton", 16));
        people.add(new Person("Andy", "Ashton", 44));
        people.add(new Person("Albert", "Denton", 58));
        System.out.println("Before: " + people);

        List<Person> result = MergeSort.sort(people);
        System.out.println("After: " + result);
    }
}
