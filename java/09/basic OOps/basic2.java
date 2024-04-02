class dog{
    int id;
    String name = "dog";
}

public class basic2 {
    public static void main(String[] args) {
        dog d = new dog();
        System.out.println(d.id);
        System.out.println(d.name);
    }
}

/*
 * object can be initialized in 3 ways:
 *  - by reference
 * - by method
 * -by constructor
 */