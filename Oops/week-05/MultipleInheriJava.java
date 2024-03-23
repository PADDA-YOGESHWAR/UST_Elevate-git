import java.util.*;

class mythology {

    void says() {
        System.out.println("tells about powerfull demons");
    }
}

class present extends mythology {

    void print() {
        System.out.println("lucifer is a devil.");
    }
}

class past extends mythology {

    void print() {
        System.out.println("lucifer is an angel.");
    }
}

class real extends present,past
{

    public void write() {
        System.out.println("everyone is afraid of him");
    }
}

class MultipleInheriJava {
    public static void main(String[] args) {
        real r = new real();
        r.print();
        r.write();
        r.says();

    }

}
