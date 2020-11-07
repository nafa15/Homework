package hw102020.inheritance;

public class D extends C {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        d.fromA();
        d.fromB();
        d.fromC();


    }
}
