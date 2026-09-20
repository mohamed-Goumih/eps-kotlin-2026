import org.w3c.dom.Text

fun main() {
    println(nombreEnMots(123))
    //81
    println(somme2(15,10))
    println(factorial(3))
    println(factorial1(5))
    var mot ="salut"
    println(double(mot))
    //84
    val nombres=listOf(2,5,8,7)
    println(listeEntier(nombres))
    //85
    val nbr = 546_781_915
    println("Le nombre $nbr en mots est: " + nbr2Word(nbr))
}

fun somme(x:Int,y:Int) : Int{
    return x+y
}

fun somme2(x:Int,y:Int):Int = x+y



//82

fun factorial(x:Int):Int{
    if (x == 1){
        return 1
    }else{
        return x*factorial(x-1)
    }
}


fun factorial1(x:Int):Int{
    if (x == 1 ) {
        return 1
    }else {
        var fact = 1
        var N = x
        while (N!=0){
            fact *=N
            N--
        }
        return fact
    }


}
//83
fun double ( text: String):String{
    var resultat = " "
    for (i in text){
        resultat += "$i$i"
    }
    return resultat
}

//84
fun listeEntier(liste: List<Int>):List<Int>{
    return liste.filter{it%2!=0}
}
//85
fun nombreEnMots(n: Int):String {
    val nombre = arrayOf(
        "", "un", "deux", "trois", "quatre",
        "cinq", "six", "sept", "huit", "neuf", "dix", "onze", "douze",
        "treeze", "quatorze", "quinze", "seize", "dix-sept", "dix-huit",
        "dix-neuf"
    )
    val dizaines = arrayOf(
        "", "", "vignt", "trente", "quarente", "siquante", "soixante", "soixante",
        "quatre-vignt", "quartre-vignt"
    )
    var result = ""
    val cent = n / 100
    result += nombre[cent] + " cent "

    val rm = n % 100
    result += when {
        rm < 20 -> nombre[rm]
        rm in 20..70 -> dizaines[rm/10] +' '+ nombre[rm % 10]
        rm in 70..79 -> dizaines[rm/10] +' '+nombre[rm - 60]
        rm in 90..99 -> dizaines[rm/10] +' '+ nombre[rm - 80]
        else -> dizaines[rm] +' '+ nombre[rm % 10]
    }

    return result
}

fun nbr2Word(nbr: Int): String{
    // making local variables
    var nbrCopy = nbr
    var txt = ""
    var order = 0

    // setting up array of words
    val txt1sArray = arrayOf("","un","deux","trois","quatre","cinq","six","sept","huit","neuf",
        "dix","onze","douze","treize","quatorze","quinze","seize","dis-sept","dis-huit","dix-neuf")
    val txt10sArray = arrayOf("","","vingt","trent","quarante","cinquate","soixante","soixante","quatre-vingt","quatre-vingt")
    // txt100s is always "cent"
    val txt1000sArray = arrayOf("","mille","milliard","billiard")

    while (nbrCopy > 0) {
        // getting first 3 digits
        val nbr1 = nbrCopy % 1000
        val nbr2 = nbr1 % 100
        val nbr1s = nbr2 % 10

        // getting individual digits
        val nbr100s = (nbr1 - nbr2) / 100
        val nbr10s = (nbr2 - nbr1s) / 10

        // formatting the words based on digits
        val txt100s = when (nbr100s) {
            0 -> ""
            1 -> "cent-"
            else -> txt1sArray[nbr100s] + "-cent-"
        }
        val txt10s = when (nbr10s) {
            0,1 -> txt10sArray[nbr10s]
            else -> txt10sArray[nbr10s] + "-"
        }
        val txt1s = when (nbr10s) {
            1, 7, 9 -> txt1sArray[nbr1s + 10] + "-"
            else -> when (nbr1s) {
                0 -> ""
                else -> txt1sArray[nbr1s] + "-"
            }
        }

        // adding up all the words into full text
        txt = txt100s + txt10s + txt1s + txt1000sArray[order] + "-" + txt

        // incrementing the order of 1000s
        order++

        // updating nbrCopy before next iteration
        nbrCopy = (nbrCopy - (nbrCopy % 1000)) / 1000
    }

    // trimming "-" from finished string
    txt = txt.substring(0,txt.length-2)

    return txt
}


