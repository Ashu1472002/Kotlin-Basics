//let's implement some Loops challenges
fun main() {
    //create an arbitary range of numbers then we need to find a way to go 
    //to that arbitary range of numbers and to determine if a number is an
    //even number or if another number is even number
    //and based on that if the number is odd number, skip that number or 
    //if the number is an even number then print it on the console.
    //additionally should create a way to count all the even numbers that
    //you found in your range and display it.
    
    var num1 = 1
    var num2 = 30
    var cnt = 0
    for(i in num1..num2){
        if(i % 2 == 0){
            print("$i\t")
            cnt++
        }else{
            continue
        }
    }
    print("\n\n Count of even numbers in the given range: $cnt")
    
      
}

