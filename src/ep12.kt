fun main() {
    val pairs=arrayOf(Pair(3,2),
        Pair(1,1),Pair(0,0),
        Pair(4,5),Pair(2,8))

    println(premierPair(pairs))
    println(countNumbers(pairs))
    println(sumpaire(pairs))
    println(defirence(pairs).joinToString())

}
//121
fun premierPair (pairs1: Array<Pair<Int , Int>> )  :List<Pair<Int , Int>>{
    return pairs1.filter {it.first > it.second}

}
//122
fun countNumbers (pairs2: Array<Pair<Int , Int>> )  : Int{
    return pairs2.count {it.first == it.second}

}
//123
fun sumpaire (pairs2: Array<Pair<Int , Int>> )  : Int{
    return pairs2.map {it.first}.sum()

}
fun defirence (pairs2: Array<Pair<Int , Int>> )  :Array<Int> {
    return pairs2.map { it.first -  it.second }.toTypedArray()
}
//125
fun pairPositive (pairs2: Array<Pair<Int , Int>> )  : Boolean{
    return pairs2.all {it.first>0 && it.second>0}

}
//126

fun secondPair (pairs2: Array<Pair<Int , Int>> ):List<Pair<Int , Int>>
= pairs2.filter {it.second%2==0}

//127
fun maxPair (pairs2: Array<Pair<Int , Int>> ): Pair<Int, Int>?
        = pairs2.maxByOrNull {it.first+it.second}

//128
fun inversePair (pairs2: Array<Pair<Int , Int>> ):Array<Pair<Int , Int>>
        = pairs2.map { Pair(it.second,it.first) }.toTypedArray()
//129
fun sommePair (pairs2: Array<Pair<Int , Int>> ): IntArray
        = pairs2.map { it.first+it.second }.toIntArray()

//1210
fun equalsPair (pairs2: Array<Pair<Int , Int>> ): List<Boolean>
= pairs2.map { it.first==it.second }

//1211
fun impairSommePair (pairs2: Array<Pair<Int , Int>> ): Int
        = pairs2.count { (it.first+it.second)%2!=0 }