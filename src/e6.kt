fun main() {

    //61
    println("entrer un number :")
    val n = readln().toInt()
    val r = n.toString()
    println("string ; '$r' ")
    //62
    println("entrer  number 2 :")
    val s = readln().toDouble()
    val r2 = String.format("%.2f",s)
    println("number floatant ; $r2")

    //63
    println("entrer  number POUR inverser :")
    var number1 = readln().toInt()
    var inverse = 0
    while (number1 !=0) {
        val reste = number1 % 10
        inverse = inverse * 10 + reste
        number1 /= 10
    }
    println("l'INVERSE  est :$inverse")
    //64
    println("entrer  number palindrome :")
    var number2 = readln().toInt()
    val n2 = number2
    var inverse2 = 0
    while (number2 !=0) {
        val reste2 = number2 % 10
        inverse2 = inverse2 * 10 + reste2
        number2 /= 10
    }
    val p1 = n2.toString()
    val p2 = inverse2.toString()
    println("$p1 et $p2")
    if (p1.equals(p2)) {
        println("$p1 est un plindrome")
    }else{
        println("$p1 n'est pas plindrome")
    }
    //SOLUTION 2
    var number3 = readln()
    var i = 0
    var j = number3.length-1
    var estplindrome = true
    while (i < j) {
        if (number3[i] != number3[j] ) {
        estplindrome = false
            break
        }
        i++
        j--
    }
    if (estplindrome) {
        println("$number3 est plindrome")
    }else{
        println("$number3 n'est pas plindrome")
    }
    //65
    println("entrer  number 4 :")
    var number4 = readln().toInt()
    var sum = 0
    for(i in 1 until number4) {
        if (number4 % i == 0){
            sum += i
        }

    }
    if (number4 == sum){
        println("$number4 est un nombre parfait ")
    }else{
        println("$number4 n'est un nombre parfait ")
    }
    //66
    val number5 = 2.plus(10).minus((5)
        .times(4).div(5).rem(10))
    val resultat=if (number5%2==0) "$number5 est pair" else "$number5 est impair"
    println(resultat)


}