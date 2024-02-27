package labs.sets_and_maps;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Plates main = new Plates();
        main.buildMap(args[0]);
        main.printCounts();

        /*
         * The output should be:
         *
         * Number of Plates: 6
         * CT -> 1
         * MA -> 2
         * RI -> 4
         * ME -> 3
         * NY -> 5
         * VT -> 1
         */
    }
}
