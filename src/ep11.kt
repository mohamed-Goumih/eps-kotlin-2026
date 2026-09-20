fun main() {
val arr=arrayOf(22,0,2,3,0,4,5,1,1)
println(nonzero(arr).joinToString())

    println(lstUni(arr).joinToString())
    println("118 :${deleteFromTab(arr,3).joinToString()}")
    println("1112:${orderDecroissant(arr).joinToString()}")
}
//115
fun nonzero(a:Array<Int>): List<Int>{
    val n=a.filter { it != 0 }
    val b=a.filter { it == 0 }
    val c=n+b
    return c
}

//116
fun lstUni(arr: Array<Int>): Array<Int> {
   // return arr.filter
   // { index, it -> index != arr.indexOf(it) }.toTypedArray()
    val uniques=mutableListOf<Int>()
    for (   i in    arr){
        if(!uniques.contains(i)){
            uniques.add(i)
        }
    }
    return  uniques.toTypedArray()
}
fun uniquesTabs(arr:Array<Int>): IntArray{
    return arr.toSet().toIntArray()
}
//117
fun addToTab(arr:Array<Int>,a:Int): IntArray{
    return arr.toIntArray().plus(a)
}

//118
fun deleteFromTab(arr:Array<Int>,a:Int): IntArray{
val res=mutableListOf<Int>()
    if (!arr.contains(a)) return arr.toIntArray()
    for(n in arr){
        if(n!= a) res.add(n)
    }
    return res.toIntArray()

    //return arr.filter{it!=a}.toIntArray
}
//119
fun countOcc(arr:Array<Int>,a:Int): Int{
    return arr.count{it==a}
}
//1110
fun Pairs(arr:Array<Int>): Boolean{
    return arr.all { it%2==0 }
}
//1111
fun orderDecroissant(arr:Array<Int>): IntArray{
    return arr.sortedArrayDescending().toIntArray()
}