public class DemoSealedClass {
    public static void runDemo() {

    }
}

// sealed classes can't be extended or implemented by other classes except the permitted child/derived classes
// helpful for designing application
sealed class A permits B, D {

}

// All sealed class subclasses must either be final, sealed or non-sealed
non-sealed class B extends A{

}

// If you try to extend A compiler will throw this error - 'C' is not allowed in the sealed hierarchy
class C {

}

final class D extends A{

}

// For interface, it can be sealed but the derived interface must be sealed or non-sealed but not final as interface can never be final
sealed interface X permits Y {

}

// can't be final
non-sealed interface Y extends X {

}