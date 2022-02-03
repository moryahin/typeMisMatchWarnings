class TypeMismatchWarning {
//  TYPE_MISMATCH_WARNING
    fun doTheMapThing1(elements: List<CharSequence>): List<String> {
        return elements.flatMap {
            when (it) { // Type mismatch: inferred type is List<String>? but TypeVariable(_R) was expected
            is String -> listOf("Yeah")
            else -> null
        }
        }
    }

    fun doTheMapThing2(elements: List<CharSequence>): List<String> {
        return elements.flatMap {
            if (it is String) listOf("Yeah") else null // Type mismatch: inferred type is List<String>? but List<String> was expected
        }
    }
}