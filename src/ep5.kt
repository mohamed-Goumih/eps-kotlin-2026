fun main() {
    //51
    for(a in 1..5){
        println(a)
    }
    //52
    var b = 2
    while(b <= 10){
        println(b)
        b+=2
    }
    //53
    for (c in 10 downTo 1){
        println(c)
    }
    var d = 10
    while(d >= 1){
        println(d)
        d--
    }
    //54
    for (e in 1..20 step 2){
        println(e)
    }
    // 55
    for (f in 1..10 ){
        if (f == 5) continue
        println(f)
    }
    //56
    for(g in 1..10){
        if(g % 5== 0) {
            println("le premier multiple de 5 est $g")
            break
        }
    }
    //57:factorielle
    println("entrez un nombre:")
    val n = readln().toInt()
    var factorielle = 1
    for (i in 1..n) {
        factorielle *=i
    }
    println("le factorielle de $n = $factorielle")

    //58:table de multiplication
    for (i in 1..5){
        println("table de multiplication de $i")
        for (j in 1..10){
            var M = i*j
            println("$i x $j = $M")
        }
    }
    //59:nombres jumeaux
    var precedent=0
    for (n in 3 ..100){
     var estPremier=true
        var d=2
        while(d*d<=n){
            if(n%d==0){
                estPremier=false
                break
            }
            d++
        }
        if(estPremier){
          if(precedent!=0 && n-precedent==2){
              println("$precedent et $n sont jumeaux")
          }
            precedent=n
        }
 //510
        println("entrez un nombre :")
        var n=readln().toInt()
        var collatz=""

        while(n!=1) {
            if (n % 2 == 0) {
                n /= 2
                collatz=collatz+"   "+n
            } else {
                n = n * 3 + 1
                collatz =collatz+" "+n
            }

        }
        println(" la suite de collatz de $n est $collatz")



    }

//511

}