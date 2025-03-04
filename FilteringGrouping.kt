//let's know about filtering
fun main() {
    //The basic filtering function is filter()
    val numbers = listOf("one","two","three","four")
    val longerThan3 = numbers.filter{ it.length > 3 }
    println(longerThan3)
    
    val numbersMap = mapOf("key 1" to 1,"key 2" to 2, "key 3" to 3, "key 101" to 101)
	val filterMap = numbersMap.filter{it.key.endsWith("1") && it.value > 100}
    println(filterMap)
    
    val filterIndex = numbers.filterIndexed{index,value -> (index != 0) &&(value.length < 5)}
    val filteredNot = numbers.filterNot{it.length <= 3}
    println(filterIndex)
    println(filteredNot)
    
    val mixedList = listOf(1,2,3,'A','B',"Hello","Alex",false)
    mixedList.filterIsInstance<Char>().forEach{println(it)}
    
    //partition
    val (match,rest) = numbers.partition {it.length > 3}
    println(match)
    println(rest)
 
    //test predifects
    println(numbers.any{it.endsWith("e")})
    println(numbers.none{it.endsWith("w")})
    println(numbers.all{it.length > 1})
    
    //plus and minus operator in kotlin
    val numbers2 = mutableListOf("one","two","three","four")
    val plusList = numbers + "five"
    val minusList = numbers - mutableListOf("three","four")
    println(plusList)
    println(minusList)
    
    //Grouping
    val numberList = listOf("one","two","three","four","five")
    println(numberList.groupBy{it.first().uppercase()})
    println(numberList.groupBy(keySelector = {it.first()}, valueTransform = {it.uppercase()}))
    
    
}
