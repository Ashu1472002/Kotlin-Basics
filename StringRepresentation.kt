//let's know about strings representations
fun main() {
	val numberStrings = listOf("One","Two","Three","Four")
    println(numberStrings)
    println(numberStrings.joinToString())
    
    //from this, we joins the two strings
    val listString = StringBuffer("The list of numbers:")
    println(numberStrings.joinTo(listString))
    
    //syntax : joinToString(seperator,prefix to string,suffix to string)
    println(numberStrings.joinToString("|","start:",":end"))
   
   	//toList() converts range into list
    val numbers = (1 .. 100).toList()
    println(numbers)
    
    //limit option set the limit and 
    //truncated option truncate the list and replace it with given string
    println(numbers.joinToString(limit=15,truncated="<...>"))
    
    println(numberStrings.joinToString{ "Element: ${it.uppercase()}"})
    
}
