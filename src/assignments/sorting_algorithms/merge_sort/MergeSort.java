package assignments.sorting_algorithms.merge_sort;

import java.util.List;
import java.util.ArrayList;

public class MergeSort {
    public static List<Person> sort(List<Person> people) {
        if (people.size() <= 1) {
            return people;
        }

        List<Person> left = people.subList(0, people.size() / 2);
        List<Person> right = people.subList(people.size() / 2, people.size());

        return merge(sort(left), sort(right));
    }

    private static List<Person> merge(List<Person> left, List<Person> right) {
        int leftIndex = 0;
        int rightIndex = 0;

        List<Person> result = new ArrayList<>(left.size() + right.size());

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex).compareTo(right.get(rightIndex)) < 0) {
                result.add(left.get(leftIndex));
                leftIndex++;
            } else {
                result.add(right.get(rightIndex));
                rightIndex++;
            }

        }

        if (leftIndex < left.size()) {
            result.addAll(left.subList(leftIndex, left.size()));
        } else {
            result.addAll(right.subList(rightIndex, right.size()));
        }

        return result;
    }
}
