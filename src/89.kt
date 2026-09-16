import  kotlin.random.Random
fun main(){
    println("entrez un maximale de la plage :")
    val maximale = readln()!!.toInt()
    val secret = Random.nextInt(1, maximale + 1)
    var essai = 0
    var joueur = 1
    var gagne = false
    while(!gagne) {
        println("joueur $joueur, proposer un nombre :")
        val proposition = readln()!!.toInt()
        essai++
        if (proposition == 1) {
            println("jeu terminer")
            println("nombre des esais : $essai")
            if (joueur == 1) {
                println("joueur 2 est gagne ")
                println("nombre des esais : $essai")
            } else {
                println("joueur 1 est gagne ")
                println("nombre des esais : $essai")
            }
            break
        }

            if(proposition == secret){
                println("joueur $joueur est gagne ")
                println("nombre des esais : $essai")
                gagne = true
            }else if(proposition < secret){
                println("plus grand")
            }else{
                println("plus moins")
            }
            if(joueur == 1){
                joueur=2
            }else{
                joueur=1
            }
        }

}