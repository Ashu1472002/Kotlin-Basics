//let's explore functions and its types
fun main() {
    
    sayHello("Ashu")
    sayHello("Bhush")
    
    val hasInternetConnection = false
    if(hasInternetConnection){
        getData("Some data")
    }else{
        showMessage()
    }
    
    //call the getMax() and print the maximum value
    var maxValue = getMax(20,70,60) 
    println("maximum marks  is $maxValue")
    
    //call the sendMessage() and only pass one parameter to the function
    sendMessage("Alexa")
    
    println(sum(5, 6, 7, 8,9,0,45))
      
}

//simple "sayHello()" function which takes one parameter called "name"
fun sayHello(name: String){
    println("Hello, $name")
}

fun getData(funData: String){
    println("Your data is : $funData")
}

fun showMessage(){
    println("There is no internet connection")
}

//Through the getMax(), we take two parameters and return the max value 
/*fun getMax(a:Int, b:Int): Int {
    val max = if(a > b) a else b
    return max
}*/

//second way to write above getMax()
/*fun getMax(a:Int,b:Int):Int{
    if(a > b){
        return a
    }else{
        return b
    }
}*/

//third way to write above getMax() in shorter way
/*fun getMax(a:Int,b:Int):Int{
    return if(a > b) a else b
}*/

//fourth way, more concise way to write function which has one line code loguc
fun getMax(a:Int, b:Int) = if(a > b) a else b

//lets dive deep into the function overloading
//In function Overloading, we have same function but 
//the different number of parameters or different types of parameters

//This is the example of overloading in which parameters are
// having different types
fun getMax(a:Double, b:Double) = if(a > b) a else b

//This is the example of overloading in which function has 
//different number of parameters
fun getMax(a:Int,b:Int,c:Int):Int{
    return if(a >= b && a >= c){
        a
    }else if(b >= a && b >= c){
        b
    }else{
        c
    }
}

//Lets explore the concept of default parameters
fun sendMessage(name:String = "User", message:String = ""){
    println("Name = $name and message = $message")
}

//use of vararg keyword is we can add any number of parameters to the functions
//when we call the function
fun sum(vararg numbers: Int): Int{
    var res = 0
    for(number in numbers){
        res += number
    }
    return res
}
