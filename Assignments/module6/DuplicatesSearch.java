import java.util.*;

public class DuplicatesSearch {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 4, 7, 8, 9, 2};

       
        List<Integer> duplicates = findDuplicates(arr);


        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicates found: " + duplicates);
        }
    }

    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }

        return duplicates;
    }
}
