val UNITES = listOf(
    "zéro", "un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf",
    "dix", "onze", "douze", "treize", "quatorze", "quinze", "seize",
    "dix-sept", "dix-huit", "dix-neuf"
)
val DIZAINES = listOf(
    "", "", "vingt", "trente", "quarante", "cinquante",
    "soixante", "soixante", "quatre-vingt", "quatre-vingt"
)
fun deuxChiffres(n: Int): String {
    var u = n%10
    var d = n/10
    if (n<20) return UNITES[n]
        return when(n){
             in 70 ..79   -> DIZAINES[d]+"-"+UNITES[u+10]
             in 90 .. 99 -> DIZAINES[d]+"-"+UNITES[u+10]
             else -> DIZAINES[d]+"-"+ UNITES[u]
    }
}
fun troisChiffres(n: Int): String {
    var r = n%100
    var c = n/100
    return when(c){
        0->deuxChiffres(r)
        1-> "cent "+deuxChiffres(r)
        else -> UNITES[c]+"-cent "+deuxChiffres(r)
    }
}
fun main() {
    println(troisChiffres(999))
}