public class RecursiveExmpl{
    static int sum(int x){
        return x==0?0:x+sum(x-1);
    }
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
