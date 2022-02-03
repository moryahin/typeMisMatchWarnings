typealias C2<T> = MapLike<T>

//UPPER_BOUND_VIOLATED_IN_TYPEALIAS_EXPANSION_BASED_ON_JAVA_ANNOTATIONS
val test2 = C2(if (true) 1 else null)
val test3 = C2(C2((if (true) 1 else null)))
