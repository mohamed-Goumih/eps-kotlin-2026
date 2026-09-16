import kotlin.random.Random
import kotlin.math.sqrt

fun randomR(): Double{
    val r = Random.nextInt(1, 11)

    require(r != 1){"1 is not a valid random number"}

    return sqrt(r.toDouble())

}

fun main() {
    println(randomR())
}