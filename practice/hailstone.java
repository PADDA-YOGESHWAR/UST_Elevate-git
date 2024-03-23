import java.util.Scanner;
public class hailstone{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int steps = 0;
        while(n!=1){
            if (n%2 == 0){
                System.out.println(n+" is even so i take half: "+n/2);
                steps++;
                n=n/2;
            }
            else{
                System.out.println(n+" is odd so i make 3n+1: "+(3*n+1));
                steps++;
                n=3*n+1;
            }
        }
        System.out.println("There are total "+steps+" steps to reach 1");
    }
}