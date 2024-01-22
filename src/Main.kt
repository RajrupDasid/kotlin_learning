fun main() {
//    collections
// val names = listOf<String>("Name 1","Name 2","Name 3") //immutable list where we cannot add or remove elements
//    println(names[0])
// val names = mutableListOf("Name 1", "Name 2","Name 3") //mutable list
//    names.add("Name 4")
//    names.removeAt(0)
//    names.remove("Name 3")
//    names.forEach { println(it) }
val user1=User("Name1")
val user2=User("Name2")
val user3=User("Name3")
val user4=User("Name4")
val user5=User("Name5")
val user6=User("Name6")
val user7=User("Name7")
    val user8=User("Name7")

    val names = mutableSetOf<User>(user1,user2,user3,user4,user5,user6,user7,user8)
    names.forEach { println(it.names) }

}

data class User(val names: String) //data class can determine if the values are unique or not
