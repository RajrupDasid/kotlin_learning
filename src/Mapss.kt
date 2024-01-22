fun main(){
//    val users = mapOf<Int,String>(1 to "Maria",2 to "Susan",3 to "Max",4 to "Ben") //immutable map where you cannot add values at runtime
//    println(users[1])
    val users = mutableMapOf<Int,String>(1 to "Maria",2 to "Susan",3 to "Max",4 to "Ben")
    users[5]="Addison" // for adding a value at runtime
    users.remove(2)//remove elements
    users.forEach{
        t,u->
        println("$t and $u")
    }
}