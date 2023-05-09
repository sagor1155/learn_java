import static java.lang.System.out;

public class DemoInterface extends C implements A, B {

    public DemoInterface() {
        out.println("Calling DemoInterface Constructor");
    }

    public void add() {
        out.println("Calling DemoInterface add method");
    }

    public void show() {
        out.println("Calling DemoInterface show method");
        A.super.show();
        B.super.show();
    }

    public static void runDemo() {
        System.out.println("----- Demo Interface -----");

        A.hide();
        DemoInterface demoInterface = new DemoInterface();
        demoInterface.show();

        System.out.println("----- --------------- -----");
    }
}

interface A {
    void add();

    default void show() {
        System.out.println("Calling Interface-A default method");
    }

    static void hide() {
        System.out.println("Calling Interface-A static method");
    }
}

interface B {

    default void show() {
        System.out.println("Calling Interface-B default method");
    }
}

class C {

    public C() {
        out.println("Calling Class-C constructor");
    }

    public void show() {
        out.println("Calling Class-C show method");
    }
}