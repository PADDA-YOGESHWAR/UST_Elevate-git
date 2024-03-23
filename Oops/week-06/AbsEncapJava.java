
/*Write a Java class 'AccessSpecifierDemo' with the following members: Member Variables :
1. private int priVar
2. protected int proVar
3. public int pubVar Member Methods:
1. public void setVar(int priValue,int proValue, int pubValue)
2. public void getVar()
Assign values for each member variable(priVar,proVar,pubvar) and using methods(setVar(),getVar()) and disaply them.*/
import java.util.*;

class AbsEncapJava {
    private int priVar;
    protected int proVar;
    public int pubVar;

    public void setVar(int priValue, int proValue, int pubValue) // set values
    {
        priVar = priValue;
        proVar = proValue;
        pubVar = pubValue;
    }

    public void getVar() // get that values
    {
        System.out.println(priVar);
        System.out.println(proVar);
        System.out.println(pubVar);
    }

    public static void main(String[] args) {
        AbsEncapJava obj = new AbsEncapJava();
        obj.setVar(10, 20, 30);
        obj.getVar();

    }
}
