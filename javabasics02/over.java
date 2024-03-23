import java.util.Arrays;

class PrimitiveArray {
    private int[] array;

    public PrimitiveArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1)
                sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public void sort() {
        Arrays.sort(array);
    }

    public int[] getArray() {
        return array;
    }
}

public class over {
    public static void main(String[] args) {
        int[] intArray = {5, 2, 7, 1, 3};
        PrimitiveArray primitiveArray = new PrimitiveArray(intArray);

        System.out.println("Original Array: " + primitiveArray);

        primitiveArray.sort();
        System.out.println("Sorted Array: " + primitiveArray);

        // Comparing arrays
        int[] newArray = {5, 2, 7, 1, 3};
        PrimitiveArray newPrimitiveArray = new PrimitiveArray(newArray);

        if (Arrays.equals(primitiveArray.getArray(), newPrimitiveArray.getArray())) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }
    }
}
