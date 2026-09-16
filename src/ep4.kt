import java.util.Scanner
fun main() {
    //41
    println("entrer une lettre")
    val button =readln()
    //val button ="M"
    val action=when(button){
        "M" -> "Yes"
        "B"->"No"
        "X"->"Menu"
        "Y"->"Nothing"
        else->"There no such button"
    }
    println(action)
    //42
    println("entrez votre age")
    var age1 = readln().toInt()

    var result:String = if(age1>18)  "majeur" else "mineur"
    println(result)
    //42
    println("entrez votre age")
    val age =readln().toInt()
    if (age >= 18) {
        println("tu es majeur")
    }else{
        println("tu es mineur")
    }
    //43
    println("entrez un nombre")
    val nombre =readln().toInt()
     if (nombre > 0) {
           println("positif")
       }else if(nombre == 0){
          println("nul")
       }else{
           println("négatif")
       }

    //45
    val scanner = Scanner(System.`in`)

    println("entrez votre note ")
    val note=scanner.nextInt()
    val score=when(note){
        in 90..100 -> {"A"}
        in 80..89 -> {"B"}
        in 70..79 -> {"C"}
        in 60..69 -> {"D"}
        in 0..59 -> {"F"}
        else -> {"aucun score"}
    }
    println("votre score est $score")




}