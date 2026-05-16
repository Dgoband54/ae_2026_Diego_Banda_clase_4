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

clase 4-4
/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
data class Student(
    val id: Long,
    val name: String,
    val email:String,
    val grade: Int,
    val isActive: Boolean

)

fun main(){
    val jorge = Student(
        name = "Jorge",
        email = "Jorge@puce.com",
        grade = 8,
        id = 1,
        isActive = true
    
    )
    println(jorge)
}

clase 4-5
/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
data class Student(
    val id: Long,
    val name: String,
    val email:String,
    val grade: Int,
    val isActive: Boolean

)

fun getStudents(): List<Student>{    
    val sebastian = Student(
        name = "Sebastian",
        email = "sebastian@puce.com",
        grade = 8,
        id = 1,
        isActive = true
    
    )
    val david = Student(
        name = "David",
        email = "David@puce.com",
        grade = 8,
        id = 2,
        isActive = true
    
    )
        val josue = Student(
        name = "Josue",
        email = "Josue@puce.com",
        grade = 8,
        id = 3,
        isActive = true
    
    )
    return listOf(sebastian, david, josue)
    
}

fun getResult(grade: Int): String{
    return if (grade>7) "Aprobado" else "reprobado"
        
}

fun main(){
    for (student in getStudents()){
        println("${student.name} esta ${getResult(student.grade)}")
    }

}

clase 4-6
/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
data class Student(
    val id: Long,
    val name: String,
    val email:String,
    val grade: Int,
    val isActive: Boolean

)

fun getStudents(): MutableList<Student>{    
    val sebastian = Student(
        name = "Sebastian",
        email = "sebastian@puce.com",
        grade = 8,
        id = 1,
        isActive = true
    
    )
    val david = Student(
        name = "David",
        email = "David@puce.com",
        grade = 8,
        id = 2,
        isActive = true
    
    )
        val josue = Student(
        name = "Josue",
        email = "Josue@puce.com",
        grade = 5,
        id = 3,
        isActive = true
    
    )
    return mutableListOf(sebastian, david, josue)
    
}

fun getResult(grade: Int): String{
    return if (grade>7) "Aprobado" else "reprobado"
        
}

fun main(){
    val estudiantesEstudiosos: MutableList<Student> = mutableListOf()
    for (student in getStudents()){
        if(student.grade>7){
            estudiantesEstudiosos.add(student)
        }
    
    }
    print(estudiantesEstudiosos)
    
     val estudiantesEstudiosos2: List<Student> = getStudents().filter { loQueSea -> 
         loQueSea.grade > 7
         
     }
     print(estudiantesEstudiosos2)
}
