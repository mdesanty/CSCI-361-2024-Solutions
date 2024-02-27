package labs.sets_and_maps;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public class Plates {
    private Map<String, Integer> plateMap;
    private Set<String> validStates;

    public Plates() {
        plateMap = new HashMap<>();
        validStates = new HashSet<>(Arrays.asList("CT", "MA", "ME", "NY", "RI", "VT"));
    }

    public void buildMap(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] data = line.split("\\s+");

            for (String word : data) {
                String plateState = sanitizeWord(word);

                if (validStates.contains(plateState)) {
                    plateMap.computeIfAbsent(plateState, k -> 0);
                    plateMap.computeIfPresent(plateState, (k, v) -> v + 1);
                }
            }
        }
        scanner.close();
    }

    public void printCounts() {
        System.out.println("Number of Plates: " + plateMap.keySet().size());

        for (Map.Entry<String, Integer> entry : plateMap.entrySet())
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
    }

    private String sanitizeWord(String word) {
        String sanitizedWord = word.toUpperCase();
        return sanitizedWord.replaceAll("[^A-Z]", "");
    }
}