fun main() {
    //Kotlin is a Type Inference that's why we don't need to explicitly teell
    //to the compiler that it is string or integer or boolean,etc.
    
    //we can change the value of var type at any time
    var userName = "Ashwini"
    userName = "Bhush"
    
    //we cannot change the value of val type at any time
    val password = "Ash123"
    //password = "Bhush123"
    
    var age: Int = 22
    age = 27
    
    println("Hello $userName your age is $age")
    
    //Range of integer type value
    //Integer occupies 32 bits
    val maxIntegerValue: Int = Int.MAX_VALUE
    val minIntegerValue: Int = Int.MIN_VALUE
    println("Int Maximum Value is: $maxIntegerValue")
    println("Int Manimum Value is: $minIntegerValue")
    
    //Range of byte type value 
    //byte occupies 8bits
    val myMaxByteValue: Byte = Byte.MAX_VALUE
    val myMinByteValue: Byte = Byte.MIN_VALUE
    println("Byte Maximum Value is: $myMaxByteValue")
    println("Byte Minimum Value is: $myMinByteValue")
    
    //Range of short type value
    //short occupies 16 bits
    val myMaxShortValue: Short = Short.MAX_VALUE
    val myMinShortValue: Short = Short.MIN_VALUE
    println("Short Maximum Value is: $myMaxShortValue")
    println("Short Minimum Value is: $myMinShortValue")
    
    //Range of long type value
    //long occupies 128 bits
    val myMaxLongValue: Long = Long.MAX_VALUE
    val myMinLongValue: Long = Long.MIN_VALUE
    println("Long Maximum Value is: $myMaxLongValue")
    println("Long Minimum Value is: $myMinLongValue")
    
    //Declaration of Floating point numbers
    val myFloatNumber = 2.5f
    
    //Declaration of Double number
    val myDoubleNumber = 2.55
    
    println("myFloatNumber = $myFloatNumber and myDoubleNumber = $myDoubleNumber")
    
    //Declaration char datatype
    val myCharValue:Char = 'A'
    
    //Declaration Boolean data type
    val myBooleanValue:Boolean = true
    println("myCharValue = $myCharValue and myBooleanValue = $myBooleanValue")
    
    //Recap : There are 8 datatypes in Kotlin
    //1.Byte 2.Short 3.Int 4.Long 5.Float 6.Double 7.Char 8.Boolean
    