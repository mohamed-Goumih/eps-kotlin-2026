fun main() {
   //61
    val n=123
    val number =n.toString()
    println("$number")

    //62
    val pi=3.1415926f
    val number62 =String.format("%.2f",pi)
    println("$number62")

    //63 :inverser un nombre
    val num = 1331
    /*val inverse = num.toString().reversed().toInt()
    println("$inverse")*/
    var i=num
    var inverse=0
    while (i!=0){
        val rest=i % 10
        inverse=inverse*10 + rest
        i/=10
    }
    println("$inverse")
    //64 :palindrome
if(num==inverse) println("inverse $inverse est palindrome ") else println("inverse $inverse n'est pas palindrome ")
    //65:nombre parfait
    val nbr = 28
    var sum = 0
    for(i in 1..nbr/2) {
        if(nbr % i == 0) sum += i
    }
    println("Esque 28 un nombre parfait? ${sum == nbr}")

    //66 :méthodes operateurs
    val calcul=2+10-5*4/5%10

    val result = 2.plus(10)
        .minus(
            (5)
    .times(4)
    .div(5)
    .rem(10)
        )
    println(result)
    println(2+10-5*4/5%10)

    println(if (result%2==0) "pair " else "impair")






}