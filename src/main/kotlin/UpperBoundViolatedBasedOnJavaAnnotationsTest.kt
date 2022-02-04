package UPPER_BOUND_VIOLATED_BASED_ON_JAVA_ANNOTATIONS;

//UPPER_BOUND_VIOLATED_BASED_ON_JAVA_ANNOTATIONS
fun test0(map : MapLike<Int?, Int>) {}
fun <K> test11(map : MapLike<K, K>) {}
fun <K> test12(map : MapLike<K?, K>) {}
fun <K : Any> test13(map : MapLike<K, K>) {}
fun <K : Any> test14(map : MapLike<K?, K>) {}

class Foo<K>

typealias A<A> = MapLike<A, Int>
typealias A2<B> = Foo<MapLike<B, Int>>
typealias A3<C> = ListLike<List<C>>

//UPPER_BOUND_VIOLATED_BASED_ON_JAVA_ANNOTATIONS
fun main1(x: A<Int?>) {}
fun main2(x: A2<Int?>) {}
fun main3(x: A3<Int?>) {}
fun main3() {
    val x = A3<Int?>()
    val x2 = A<Int?>()
    val y: A3<Int?> = A3<Int?>()
}
