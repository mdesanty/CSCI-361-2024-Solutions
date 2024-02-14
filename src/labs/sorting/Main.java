package labs.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();

        Person randy = new Person("Randy", 21);
        people.add(randy);

        Person pete = new Person("Pete", 12);
        people.add(pete);

        Person dan = new Person("Dan", 18);
        people.add(dan);

        System.out.println(people);
        // [<Name: Randy, Age: 21>, <Name: Pete, Age: 12>, <Name: Dan, Age: 18>]

        // Using sort with our class that implements comparator:
        Collections.sort(people);
        System.out.println(people);
        // [<Name: Pete, Age: 12>, <Name: Dan, Age: 18>, <Name: Randy, Age: 21>]

        // Using an anonymous class to define sorting on the fly:
        Collections.sort(people,
            new Comparator<Person>() {
                @Override
                public int compare(Person personA, Person personB) {
                    int comparison = personA.getName().compareTo(personB.getName());

                    // Sort by name ascending.
                    if (comparison < 0)
                        // personA is less than personB.
                        return -1;
                    else if (comparison > 0)
                        // personA is greater than personB.
                        return 1;
                    else
                        // personA is the same as personB.
                        return 0;
                }
            }
        );
        System.out.println(people);
        // [<Name: Dan, Age: 18>, <Name: Pete, Age: 12>, <Name: Randy, Age: 21>]

        // Using a lamba to define sorting on the fly:
        Collections.sort(people,
            (Person personA, Person personB) -> {
                int comparison = personA.getName().compareTo(personB.getName());

                // Sort by name descending.
                if (comparison < 0)
                    // personA is less than personB.
                    // but since we want descending order we return 1 so that personA is placed
                    // before personB.
                    return 1;
                else if (comparison > 0)
                    // personA is greater than personB.
                    // but since we want descending order we return 1 so that personA is placed
                    // after personB.
                    return -1;
                else
                    // personA is the same as personB.
                    return 0;
            }
        );
        System.out.println(people);
        // [<Name: Randy, Age: 21>, <Name: Pete, Age: 12>, <Name: Dan, Age: 18>]
    }
}
