fun main() {
    val number5 = 2.plus(10).minus((
            5)
        .times(4).div(5).rem(10)
    )
    val resultat=if (number5%2==0) "$number5 est pair" else "$number5 est impair"
    println(resultat)
}