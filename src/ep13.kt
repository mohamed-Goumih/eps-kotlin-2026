fun main() {
    //131
    val actions = listOf("title", "year", "author","tile")
   println(actions.groupBy { it.first() } )

    val prefix = "https://example.com/book-info"

    val id = 5
//https://example.com/book-info/5/title
    val urls="$prefix/$id/${actions.get(0)}"
 //   println(urls)
    val listUrls=actions.map{"$prefix/$id/$it"}
println(listUrls)
    val nombre = listOf(1,2,6,1,8,5,2,4,2,0)
    println(uniquesListe(nombre))
    println(melonge(nombre))
    println(routeur(nombre))
    println(frequence(nombre))
}
//132
fun uniquesListe(liste:List<Int>):List<Int>{
    return liste.toSet().toList()
}
//133
fun melonge(liste:List<Int>):List<Int>{
    return liste.shuffled()
}
//134
fun routeur(liste:List<Int>):List<Int>{
    if(liste.size < 2) return liste
    return liste.sortedDescending().take(2)
}
fun frequence(liste:List<Int>):List<Int>{
    return liste.groupBy { it }
        .toList().sortedByDescending { it.second.size }
        .flatMap { it.second }
}

// fun frequence2(liste:List<Int>):List<Int>{
//     val frenquecyList=liste.groupingBy { it }
//     return liste.sortedDescending{frenquecyList[it]}
// return liste
// }
