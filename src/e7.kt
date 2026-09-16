fun main() {

//   // exercice 71
//   // println("enter a sentence : ")
//    val sentence = readLine().toString()
//   // println(sentence.uppercase())
//
//
//
//
////exercice 72
//
//    //println("enter a sentence : ")
//    val sentence2 = readLine().toString()
//    //println(sentence2[5])
//
//
////exercice 73
//    //println("enter a sentence : ")
//    val sentence3 = readLine().toString()
//    //println(sentence3.startsWith("un"))
//
//
//
////exercice 74
////println("enter a sentence : ")
//val sentence4 = readLine().toString()
////println(sentence4.contains("hello"))
//
//
//
//
////exercice 75
////println("enter a sentence : ")
//val sentence5 = readLine().toString()
//    //println(sentence5.count())









//exercice 76
//println("enter a sentence : ")
val sentence6: String = readLine().toString()
val words = sentence6.split(" ")
var list = ""
for (word in words) {
    list+=word.reversed() + " "
}
//println("each word is reversed : $list")


//77
    var chaine="        kotlin is fun     "
    var chaine2=chaine.trim()
    println(chaine2)
    //println(chaine.trim())

//78
    val c: Char='i'
    val chaine3="kotlin is fun is easy"
    val compteur=chaine3.count { it == c }
    println(compteur)

    //79
   val newChaine=chaine3.replace("is","are")
    println(newChaine)









}