class ClassTypeParameterBoundWithWarningsTest {
//    UPPER_BOUND_VIOLATED_BASED_ON_JAVA_ANNOTATIONS
    fun main(x: ClassTypeParameterBoundWithWarnings<String?>, y: ClassTypeParameterBoundWithWarnings<String>, a: String?, b: String) {
        val x2 = ClassTypeParameterBoundWithWarnings<String?>()
        val y2 = ClassTypeParameterBoundWithWarnings<String>()

//    NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS
        val x3 = ClassTypeParameterBoundWithWarnings(a)
        val y3 = ClassTypeParameterBoundWithWarnings(b)

        val x4: ClassTypeParameterBoundWithWarnings<String?> = ClassTypeParameterBoundWithWarnings()
        val y4: ClassTypeParameterBoundWithWarnings<String> = ClassTypeParameterBoundWithWarnings()
    }

}