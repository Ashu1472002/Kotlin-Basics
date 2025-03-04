fun main() {
    
    //Let's dive deep into the operators
    //Declare two variables
    var x=5
    val y=4
    
    //First way to do this operation
    val result = x + y
    println("result = $result")
    
    //another way to do the above operation
    println("x + y = ${x+y}")
    
    //all arithmetic operators and their result
    println("x + y = ${x+y}")
    println("x - y = ${x-y}")
    println("x * y = ${x*y}")
    println("x / y = ${x/y}")
    println("x % y = ${x%y}")
    
    var res1 = x + y
    res1 = res1 + 2
    println("result = $res1")
    
    println("3 + 3 * 4 = ${3 + 3 * 4}")
    
    x = 0
    
    //use of increment operator
    println("x = ${x++}")
    println("x = ${++x}")
    
    //use decrement operator
    println("x = ${x--}")
    println("x = ${--x}")
    
    //Implementation of If-Else statement
    val isActive = true
    if(isActive == true) {
        println("The user is active.")
    } else{
        println("The user is inactive. ")
    } 
    
	//implementation of if-else ladder
    val myNumber = 150
    if(myNumber > 150){
        println("Greater Than 150")
    }else if(myNumber > 90){
        println("Greater Than 90")
    }else{
        println("All the conditions are failed.")
    }
    
    //use of logical not operator(!)
    val isActive1 = false
    if(!isActive){
        println("The user is active.")
    }else{
        println("The user is not active.")
    }
   
   	//let's take another example in which i used multiple expessions 
   	//with logical AND operator(&&)
    val isPlaying = true
    val score= 80
    if(isPlaying && score == 100){
    	  println("Next Level opened") 
    }else{
        println("Still at the same level")
    }
    
    //Logical OR operator(||)
    val num1 = 5
    val num2 = 4
    if(num1 > 0 || num2 > 0){
        println("Both conditions are true")   
    }else{
        println("The conditions are false.")
    }
    
    //Control flow statements
    //When statement
    val alarm = 13
    
    //first way to write when statement
    when(alarm){
        12 -> println("The time is $alarm")
        7 -> println("The time is $alarm")
        14 -> println("The time is $alarm")
        else -> println("The time is $alarm")
    }
    
    //second way to write when statement
    when(alarm){
        12, 7, 14 -> println("The time is $alarm")
        else -> println("The time is $alarm")
    }
    
    
    //Kotlin avoids null pointer exception
    //safe call operator (?)
    var text:String? = null
    //text = null
    /*if(text != null){
        println(text.length)
    }else{
        println("The variable is null")
    }*/
    
    //println(text!!.length)
    //println(text?.length)
    
    //first way to perform this task
    //text = "This variable is not null"
    //val text2:String = text ?: "The variable is null."
    //println(text2)
    
    //another way to perform the same task
    text = null
    var text2 =""
    if(text != null){
        text2 = text
    }else{
        text2 = " This variable is null"
    }
    println(text2)
    
    
    
    
}
    