fun math(str: String): Double{
    val expr = str.trim().split(" ")
    require(expr.size == 3){"nombre de parametres doit etre 3"}
    val a = expr[0].toDouble()
    val op = expr[1]
    val b = expr[2].toDouble()

   // var (a, op ,b) = expr

    return when(op){
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> if(b == 0.0) throw ArithmeticException("Division by zero imposible")else (a / b)

        else -> throw IllegalArgumentException("Operator innconu")
    }
}

fun main() {
 try{
     println("entrez une expression: ")
     val exp = readln().toString()
     println(math(exp))
 }catch(e: ArithmeticException){
     println(e.toString())
 }catch(e: IllegalArgumentException){
     println(e.toString())
 }finally {
     println("Fin ")
 }
}