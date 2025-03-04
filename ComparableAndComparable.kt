fun main() {
    //Aggregate functions
    val numbers = listOf(6,10,14,4,100)
    println("The sum is : ${numbers.sum()}") //returns sum of elements
    println("The average is : ${numbers.average()}") //returns average
    println("The count of elements is : ${numbers.count()}")
    println("the max value is : ${numbers.max()}") //returns maximum value
    println("The min value is : ${numbers.min()}") //returns minimum value
    println("The sum is : ${numbers.sumOf{it*2}}")
    
    //Comparable and Comparator
    val numbers2 = mutableListOf(2,5,1,40,20,100,60)
    numbers.sorted().forEach{print("$it\t")}
    
    println("\n")
    val laptops = mutableListOf(
    	Laptop("Dell",2021,4,60000),
        Laptop("HP",2022,8,80000),
        Laptop("Acer",2020,8,70000))
    
    laptops.sorted().forEach{println(it)}
    
    println("\n")
    laptops.sortedWith(ComparatorRam()).forEach{println(it)}
    
}

data class Laptop(val brand:String, val year:Int, val ram:Int, val price:Int) : Comparable<Laptop>{
    override fun compareTo(other:Laptop):Int{
        if(this.price > other.price){
            return 1
        }else if(this.price < other.price){
            return -1
        }else{
            return 0
        }
    }
}

class ComparatorRam : Comparator<Laptop>{
    override fun compare(laptop1 : Laptop, laptop2: Laptop):Int{
        return if(laptop1.ram > laptop2.ram){
            return 1
        }else if(laptop1.ram < laptop2.ram){
            -1
        }else{
            0
        }
    }
}
