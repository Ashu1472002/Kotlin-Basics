//let's explore Loops and it's types
fun main() {
    
    //for loop which prints 1 to 10
	for(i in 1..10){
        print("i = $i\t")
    }
    print("\n")
    
    //this for loop also prints 1 to 10 list but in this, 10 is excluded
    //so the output is from 1 to 9
    for(i in 1 until 10){
        print("$i \t")
    }
    print("\n")
    
    //this code gives the ouput as from 10 to 1 using "downTo" keyword
    //downTo keyword is used for reverse the list
    for(i in 10 downTo 1){
        print("$i \t")
    }
    print("\n")
    
    //this gives output as 1 3 5 7 9
    for(i in 1..10 step 2){ 
        print("$i \t")
    }
    print("\n")
    
    //working of while loop
    //given while loop outputs as - 0 1 2 3 4 5 6 7 8 9
    var num = 0
    while(num < 10){
        print("$num\t")
        num++
    }
    print("\n")
    
    //working of do-while loop
    var num1 = 5
    do{
        print("$num1\t")
        num1++
    }while(num1 < 10)
    
    //there are two keywords which we used in loops mostly
    //1. continue : this keyword is used for skip the execuition of loop
    //when specific condition gets true
    //2. break : this keyword is used for breaking the loop at the 
    //specific condition.
      
}