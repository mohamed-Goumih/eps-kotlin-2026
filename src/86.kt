import java.util.Collections.max
import kotlin.math.max

fun kPlusGrands(liste:List<Int> ,k:Int): List<Int>{
    var copiedList = liste.toMutableList()
    var resultList =mutableListOf<Int>()
    for (i in 1..k){
        var max=max(copiedList)
        resultList.add(max)
        copiedList.remove(max)
    }
    return resultList.sorted()
    //return liste.sortedDescending().take(k).sorted()
}

fun main() {
val liste= listOf(6,4,0,2,1)//max=6->(6,4,2) copie(0,2,1)
    println(kPlusGrands(liste,3))
}