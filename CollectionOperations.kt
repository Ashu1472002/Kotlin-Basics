//let's know about the Collection Operations
fun main() {
	//mapping using map function
    val numbers = setOf(1, 2, 3, 4,5)
    println(numbers.map { if(it == 3) it*100 else it*10})
    
   //map transformation with map
   val numbersMap = mapOf("key 1" to 1,"key 2" to 2, "key 3" to 3)
   println(numbersMap.mapKeys{it.key.uppercase()})
   println(numbersMap.mapValues { it.value + it.key.length})
   
  	//zipping
    val colors = listOf("red","blue","grey")
    val animals = listOf("fox","bear","wolf")
    println(colors zip animals)
    println(colors.zip(animals){color, animal -> "The ${animal.replaceFirstChar {it.uppercase()}} is $color"})
  	
    //flatten
    val numbersSets = listOf(setOf(1,2,3),setOf(4,5,6),setOf(7,8,9))
    //its printing in the 2-dimensional array
    for(numbers in numbersSets){
        for(number in numbers){
            print("$number\t")
        }
        println("\n")
    }
    
    //its transforming the 2-dimensional array in 1-dimensional array
    val numbersFlatten = numbersSets.flatten()
    for(number in numbersFlatten){
        print("$number\t")
    }
    
}
