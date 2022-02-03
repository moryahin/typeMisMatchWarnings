typealias C2<T> = MapLike<T>

val test2 = C2(if (true) 1 else null)
val test3 = C2(C2((if (true) 1 else null)))
