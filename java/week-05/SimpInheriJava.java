import java.util.Scanner;
class library
{
    void facility()
    {
      System.out.println("College Library..\n");  
    }
}
class students extends library
{
    void resource()
    {
        System.out.println("Students can use it.\n");
    }
}
class SimpInheriJava
{
    public static void main(String[] args)
    {
        students obj = new students();
        obj.facility();
        obj.resource();
    }
}