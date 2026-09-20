//91
fun repeatAction(n: Int, action: () -> Unit) {
    repeat(n) { action() }



}
//92
val produit: (Int, Int) -> Int = { a, b -> a * b }
//93
val nombres = listOf(1, 2, 3, 4, 5, 6, 7)
val impairs = nombres.filter { it % 2 != 0 }

//94
val mots = listOf("Kotlin", "Go", "Python", "JavaScript")
val tries = mots.sortedBy { it.length }

//95
fun ajouter(n: Int): (Int) -> Int = { x -> x + n }
val plusCinq = ajouter(5)

//96
val nums = listOf(1, 2, 3, 4)
val sommeCarres = nums.map { it * it }.sum()

//97
val prenoms = listOf("Ali", "Mohamed", "Sami", "Zineb")
val tries2 = prenoms.sortedBy { it.length }

//98
val list = listOf(1, 2, 3, 4, 5, 6)
val carresPairs = list.filter { it % 2 == 0 }.map { it * it }

//99
val fruits = listOf("Pomme", "Banane", "Orange")

//910
val mots2 = listOf("chat", "chien", "éléphant", "lion")
val resultat = mots2.find { it.length > 5 } ?: "Aucun mot trouvé"

//91
val c={a:Int,action:()->Unit->
    for (i in 1..a) action() }
//92
val prod: (Int,Int) -> Int = { a,b -> a*b}
//93
val nombre = listOf(2,11,5,8,7,9)
val filt = nombre.filter{ it % 2 != 0}

//94
 val chaines=listOf("kotlin","java","python","javaScript")
val newChaine= chaines.sortedBy { it.length }

//95

val addNumber :(Int)->(Int)->Int={x-> {y->x+y}}
val addFive =addNumber(5)

//96

//97

fun main() {
   //91
c(5,{println("bonjour")})
    //92
    println(prod(4,5))
    //93
    //println(filt)
    println(listOf(2,11,5,8,7,9).filter{it % 2 != 0})
    //94
    println("chaine :$newChaine")
    //95
    println("ajouter 5 a 10 :${addFive(10)}")

    //96

    println("La liste du cubes est: " +
            "${listOf(2,11,5,8,7,9).map{ it * it}
                .fold(0){ sum,nbr -> sum + nbr }}")

    println("La liste du cubes est: " +
            "${listOf(2,11,5,8,7,9).sumOf { it * it }}")

    //97
    println("La liste du prenoms triées est: ${listOf("Ahmed","Maryam","Khalid","Younes","Zakaria").sortedBy { it.length }}")
}