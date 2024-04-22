
public class methodGeneric {
    public static <T> void printArray(T[] array)
    {
        
        for (int index =0; index < array.length;index++) 
            {
                System.out.println(array[index]);
            }
    }
    public static <T extends Comparable<T>> T findMax(T[] array)
    {
        if(array.length == 0) { return null;}
        T max = array[0];
        for (int index =0; index < array.length;index++) 
            {
                if(array[index].compareTo(max) > 0) {
                    max = array[index];
                }
            }
        return max;
    }
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5,6,7,8,9,10};
        Double[] doubleArray ={1.12,2.12,3.12,4.12,5.88};
        String[] stringArray = {"a", "b", "c", "d", "e", "f"};
        printArray(intArray);
        System.out.println("---");
        printArray(doubleArray);
        System.out.println("---");
        printArray(stringArray);
        System.out.println("---");
        System.out.println(findMax(intArray));
        System.out.println("---");
        System.out.println(findMax(doubleArray));
        System.out.println("---");
        System.out.println(findMax(stringArray));
    }
}
