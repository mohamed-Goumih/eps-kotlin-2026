fun main() {

    //71
    val name = "   Hallo Wold    "
    //val result = name.uppercase()
    //println(result)
    //72
    //val result2= name[4]
    //println(result2)
    //73
    //val result3 = name.startsWith("yas")
    //println(result3)
    //74
    val result4 = name.contains("ss")
    println(result4)

    //75
    val l=name.split("").size
    println(l)
    //76
    println(name.reversed())
    //77
    println(name.trim())
    //78
    val caractere = 'l'
    println(name.count({ it == caractere }))
    //79
    println(name.replace('l','i'))

    //710
    val str="abc123d4"
    val D = str.filter {it . isDigit()}
    println("$D")
    //711
    val s1="silent"
    val s2="lisent"
    val L =s1.lowercase().toCharArray().sorted()==s2.lowercase().toCharArray().sorted()
    println("$L")

    //712
    val names="Mohamed ,Ali,Sara"
    val listeNames=names.split(",")
    println("la liste des names est: $listeNames")

    //713
    val app ="2pplication Mobil4"
//    app[0]='a'
//    app[app.length-1]='e'
    val newApp = "A" + app.substring(1,app.length-1) + "e"
    println("Le titre aprés modifier le premier est dernier lettre est: $newApp")

    val app2=app.replaceRange(0,1,"A")
        .replaceRange(app.length-1,app.length,"e")
    println("$app2")

    //714
    val motlongs="bonjour tout le monde"
    val tabMots=motlongs.split(" ")
    var max=tabMots[0].length
    var motDeMax=tabMots[0]
    for (i in tabMots.indices){
        if (tabMots[i].length>max){
            max=tabMots[i].length
            motDeMax=tabMots[i]
        }
    }
    println("le mot le plus long est: $motDeMax de taille: $max")

    val motLePlusLong=motlongs.split(" ")
        .maxBy { it.length }!!
    println("$motLePlusLong")
//715
    val motsCapitilize=motlongs.split(" ")
        .joinToString (" " )
        {it.replaceFirstChar { i->i.uppercase() } }

    println("$motsCapitilize")

}
