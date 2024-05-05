interface Calculator {
    int calculate(int x, int y);

} 
public class lambaExp {

    public static  void main(String[] args) {
        Calculator add = (x,y)->x+y;
        System.out.println("addition "+add.calculate(5,3));
        
        Calculator mul = (x,y)->x*y;
        System.out.println("multiplication "+mul.calculate(5,3));
    }
}
