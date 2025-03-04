//let's know about the concept of Arrays using implementing arrays challenge
fun main() {
    //create function which is going to take as an argument 
    //an array of integeres then you need to figure out a way to determine 
    //which number is the biggest number in that array then 
    //we need to return that number to the function
    //And you need to create a another function which is going to do 
    //the same thing but its gonna figure out what is the minimum number
    //syored in that array and then its going to return that value
    //and third you need to find a way to combine those two function 
    //in just one function which is gonna return the maximum value stored 
    //in that array if you want or if you dont want it to return
    //the minimum value
    
    val max = maximumInteger(arrayOf(1,4,6,7,7,8,9,2,7))
    val min = minimumInteger(arrayOf(4,6,8,9,3,4,6,23,1))
    println("Max value = $max")
    println("Min value = $min")  
    val maxmin = maxMinFunction(arrayOf(4,6,8,9,3,4,6,23,1),"maximum")
    println("Max value = $maxmin")
}

fun maximumInteger(arrayOfIntegers:Array<Int>):Int{
    
    var maxi = arrayOfIntegers[0]
    for(i in arrayOfIntegers){
        if(i > maxi){
            maxi = i
        }
    }
    return maxi 
  
}

fun minimumInteger(arrayOfIntegers:Array<Int>):Int{
    var mini = arrayOfIntegers[0]
    for(i in arrayOfIntegers){
        if(i < mini){
            mini = i
        }
    }
    return mini
}

fun maxMinFunction(arrayOfIntegers:Array<Int>, function:String):Int{
    when(function){
        "maximum" -> {
            return maximumInteger(arrayOfIntegers)   
        }  
        else -> {
            
    		return minimumInteger(arrayOfIntegers)
            
        }
    }
}
