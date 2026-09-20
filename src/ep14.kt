
//data class Personne(var nom:String?=null,var age:Int?=null)
////instance
//fun main() {
//    var p=Personne("Ahmed",20)
//    println(p.nom)
//    p.age=25
//    println(p.age)
//
//    var listeEtudiants= mutableListOf<Personne>
//    (p,
//    Personne("Ali",16),
//    Personne("sara",20),
//    Personne("sara",20),
//    )
//}

data class Etudiant(val nom: String, val age: Int , val note: Double)
data class Classe(val nom: String, val etudiants: List<Etudiant>)

fun main() {
    val etudiants =mutableListOf(
        Etudiant("fatima",17 ,14.0),
        Etudiant("ALI",18 ,15.0),
        Etudiant("Ahmed",20 ,19.0),
        Etudiant("salma",16 ,18.0),
    )
    println("$etudiants")

    //142
    val majeurs =etudiants.filter { it.age>=18 }
    println("$majeurs")

    //143
    val dev101= Classe("dev101",etudiants.take(2))
    val dev2= Classe("dev101",etudiants.takeLast(2))
    val dev3 =Classe("dev3 ",listOf(Etudiant("Amal",17,15.0)))
    val classes =listOf(dev101,dev2,dev3)
    println("$classes")

    //144
    val classAvecEtud =classes
        .flatMap{c -> c.etudiants.map{ e ->Pair(e, c.nom)}
            .distinctBy {it}
        }
   println("$classAvecEtud")
    //145
    val bonEtudiants =classes
        .flatMap{it.etudiants}
        .filter{it.note>15}
        .distinctBy { it.nom }

    println("$bonEtudiants")

    //146
    val topEtudiant = classes.map{ cls -> cls.etudiants.maxByOrNull{ it.note } }
    val mapTopEtuCls:Map<String,Etudiant?> = classes.associate { it.nom to it.etudiants.maxByOrNull{ it.note } }
    println("L'association du top etudiants avec leur note est: $mapTopEtuCls")
    // println("L'etudiant avec le meilleur note est: $topEtudiant")

    //147
    val jeuneEtudiant = classes.map{ cls -> cls.etudiants.minByOrNull{ it.age } }.distinct()
    println("L'etudiant le plus jeune est: $jeuneEtudiant")

    //148
    val totEtudiants = classes
        .fold(0){ tot, cls -> tot + cls.etudiants.size }
    println("Le nombre total de tous les etudiants est: $totEtudiants")

    //149
    val sommeNotes=classes.
    flatMap {it.etudiants  }.sumOf { it.note }
        println("sommeNotes: est :${sommeNotes} ")

    //1410
    val moyDEV101=dev101.etudiants.map { it.note }.average()
    println("moyDEV101:${moyDEV101}")

    //1411
    val clasPlus18 = classes.filter {
        it.etudiants.any{it.note>18}
    }.map{it.nom}

    println("les class ayant un etudiant avec note 18 est : $clasPlus18")

    //1412
    val sumAge =classes.flatMap{it.etudiants}.sumOf{it.age}
    println("sumAge:$sumAge")

    //1413
    val bassNote =classes.flatMap{it.etudiants}.minByOrNull { it.note }
    println("basseNote :$bassNote")

    //1414
    val plusGrandEtu =classes.maxByOrNull{it.etudiants.size}

    println("$plusGrandEtu")

    //1415
    val etudiantNomPlusCour=etudiants.minByOrNull{it.nom.length}
}