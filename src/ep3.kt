import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
println("Entrez un entier: a")
    //val a=scanner.nextInt()
    println("Entrez un entier: b")
    //val b=scanner.nextInt()
//    println("la somme de a et b egal :${a+b}")
//    println("la difference de a et b egal :${a-b}")
//    println("le produit de a et b egal :${b*a}")
//    println("la division de a par b est : ${a/b}")

//35,36
    val  price: Int = 100
    val discount: Int = 20 //0.2
    val prix = price -(price*discount)/100 //price-0.2*price
    //println ("le prix avec discount est $prix")
//37,38
    val heure=2
    val minutes=150
    val nbrtotal=(heure*60)+minutes
    val nbrheure=nbrtotal/60
    val nbrminutes=nbrtotal%60
    println("le nombre des heures est $nbrheure H et les minutes " +
            "$nbrminutes")

    //37,38
    val coutparmettre:Int=10
    println("Entrez une longeur: a")
    val a=scanner.nextInt()
    var total:Float=a*coutparmettre.toFloat()
    if (a>5 ){
        total-=total*0.1F
    }
    println("le prix est: $total")
}