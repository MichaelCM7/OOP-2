package OOP2_CODING_CHALLENGES.CodingChallenge_11_ArrayClear;

import java.util.Arrays;

public class ArrayClear {
    public static void main(String[] args) {
        String[] pallets = {"B094","C983","D656","E510","A575"};
        System.out.println();

        System.out.println("Before: " + pallets[0].toLowerCase());

        // Clear (set to null) the first 2 elements
        Arrays.fill(pallets, 0, 2, null);

        // Check and print the first element after clearing
        if (pallets[0] != null) {
            System.out.println("After: " + pallets[0].toLowerCase());
        } else {
            System.out.println("After: null");
        }

        // Print the array length and its current content
        System.out.println("Clearing 2 ... count: " + pallets.length);
        for (String pallet : pallets) {
            System.out.println("-- " + pallet);
        }
    }
}