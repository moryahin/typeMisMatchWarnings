class RxJava3AnnotationTest {
    fun main(a: RxJava3Annotation<String>, a1: RxJava3Annotation<String?>) {
//      RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS
        a.foo("", null)?.length
        a.foo("", null).length

        a.foo(null, "").length

        a.field?.length
        a.field.length

        a.baz("").length
        a.baz("")?.length
        a.baz(null).length

//      NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS
        a1.baz("")!!.length
        a1.baz(null)!!.length
    }
}