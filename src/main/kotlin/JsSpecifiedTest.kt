import jspecifyJavaFiles.Derived
import jspecifyJavaFiles.IgnoreAnnotations

class JsSpecifiedTest {
    fun main(a: IgnoreAnnotations, x: Derived): Unit {
        // RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS
        a.foo(x, null).foo()
        a.foo(null, x).foo()

        a.field.foo()

        a.everythingNotNullable(null).foo()
        a.everythingNotNullable(x).foo()

        a.everythingNullable(null).foo()
        a.everythingUnknown(null).foo()
    }
}