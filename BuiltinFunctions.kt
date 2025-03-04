//let's know about some built-in functions
fun main() {
    
    //Retrieve collection parts
    val numbers = listOf("one","two","three","four","five")
    
    //slice : it only prints the elements which slice under given range
    println(numbers.slice(1..3))
    println(numbers.slice(0..4 step 2))
    
    println(numbers.take(3)) //take 3 elements from list
    println(numbers.takeLast(3)) //take last 3 elements from list
    println(numbers.drop(1))   //drop 1 element
    println(numbers.dropLast(4)) //drop last 5 elements
    
    println(numbers.takeWhile{ !it.startsWith("f")})
    println(numbers.takeLastWhile {it != "three"})
    println(numbers.dropWhile{it.length == 3})
    println(numbers.dropLastWhile {it.contains("i")})
    
    val numbers2 = (0..13).toList()
    println(numbers2.chunked(3)) //it returns the chunks of 3 elements
    println(numbers2.chunked(3){it.sum()}) //it return the sum of 3 elements
    
    val numbers3 = numbers
    println(numbers3.windowed(3)) // it similar to the chunked
    
    //Retrieve single elements
    println(numbers.elementAt(3))
    println(numbers.first()) //retrieve first element
    println(numbers.last()) //retrieve last element
    
    println(numbers.first{it.length > 3}) //retrive element which has length > 3
    println(numbers.last{it.startsWith("f")}) //retrive element which starts with "f"
    println(numbers.random())  //gets random number everytime
    println(numbers.isEmpty()) //return false

}