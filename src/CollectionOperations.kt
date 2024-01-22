
//transformations are some functions which  can change some collections using lambda functions
fun main(){
val numbers= setOf(1,2,3,4,5,6,7,8,9)
    println(numbers.map { it * 10 }) //transformations using lambda function map
    println(numbers.map{if (it==7) it * 100 else it * 10})// map trasformation
    println(numbers.mapIndexedNotNull{index,value-> if (index==0) null else index * value})
    val numbersMap = mapOf("key 1" to 1, "key 2" to 2, "key 3" to 3, "key 4" to 4, "key 5" to 5) //map collection
    println(numbersMap.mapKeys { it.key.uppercase() })
    println(numbersMap.mapValues{it.value+it.key.length})

//    colors
    val colors= listOf("red","brown","gray")
    val animals = listOf("tiger","lion","bison")
    println(colors.zip(animals))
    println(colors.zip(animals){color,animal-> "The ${animal.replaceFirstChar { it.uppercase() }} is $color"})
    val numberPairs = listOf("One" to 1, "Two" to 2, "Three" to 3, "Four" to 4)
    println(numberPairs)
    println(numberPairs.unzip())
}