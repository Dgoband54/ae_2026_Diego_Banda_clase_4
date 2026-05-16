/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    //siempre debo tipar mis variables (0 contante)
    val mensaje = "hola mundo"
    var variableMutable: Int = 5
    println(mensaje)
    println(variableMutable)
    
    
    variableMutable = 10
    println(variableMutable)
    
    mensaje = "Hola mundo mutado"
    println(mensaje)
}   

clase 4-2

/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    val name: String = "Ana"
    val email: String = "ana@gmail.com"
    val number: Int = 67
    //Ana - ana@gmail.com
    
    println(name + " - "+ email) //nunca hacer esto
    println("$name - $email")//siempre usar string templates en log
    println("te faltan ${100-number} para llegar al 100")
}

clase 4-3
/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
   val grade: Int = 85
   
    
    if(grade > 70){
        println("Aprobado")
    }else {
        println("Reprobado")
    }
    
    val result: String = if (grade >70){
        "Aprobado"
    }else {
        "Reprobado"
    }
    
    
    
}

