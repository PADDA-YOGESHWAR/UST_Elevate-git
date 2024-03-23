import java.util.Scanner;

class prvt {
    private void print() {
        System.out.println("Hey I'm in private lock");
    }
    prvt(){
        print();
    }
}

class pub {
     public void wish() {
        System.out.println("I'm public now");
    }
}

class prot {
    protected void write() {
        System.out.println("I was being protected");
    }
}

class PPPInheriJava{
    public static void main(String[] args) {
        prvt obj1 = new prvt();
        pub obj2 = new pub();
        prot obj3 = new prot();
        System.out.println("private\n");
        //obj1.print();
        System.out.println("public\n");
        obj2.wish();
        System.out.println("protected\n");
        obj3.write();
    }
}
