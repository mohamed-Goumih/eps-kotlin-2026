//81
fun somme(a:Int, b:Int): Int = a + b
//82
fun factorial(n: Int): Int {
    if (n == 0) return 1
    return n * factorial(n - 1)
}
//83
fun duplic(str:String):String {
    var strDup = ""
    for (i in str) {
        strDup += i
        strDup += i
    }
    return strDup
}
//84
fun impaire(list: List<Int>): List<Int> {
    return list.filter { it % 2 != 0 }
}

//86

fun main() {
//81
    println(somme(1,2))
//82
    println(factorial(5))
//83
    println(duplic("Hello"))
//84
    println(impaire(listOf(1, 2, 3, 4, 5)))
}