//let's know about the concept of Collections
fun main() {
    //if i use mutableListOf() then we can directly change the elements 
    //of the list
    println("Use of mutableListOf()")
    val names = mutableListOf("Name 1","Name 2","Name 3")
    names.add("Name 4")
    for(name in names){
        println(name)
    }
    
    //use of setOf()
    println("Use of setOf()")
    val names2 = mutableSetOf<String>("Name 1","Name 2","Name 3","Name 1")
    names2.add("Name 4")
    for(name in names2){
        println(name)
    }
    
    //make an objects
    println("\n make an set of Objects")
    val user1 = User("Name 1")
    val user2 = User("Name 2")
    val user3 = User("Name 3")
    val user4 = User("Name 4")
    val user5 = User("Name 5")
    val user6 = User("Name Ash")
    val user7 = User("Name Ash")
    
    val userNames = mutableSetOf<User>(user1,user2,user3,user4,user5,user6,user7)
    for(user in userNames){
        println(user.name)
    }
    
    //Map Collection- this is a immutable collection
    println("Use of Map collection")
   //val users = mapOf<Int, String>(1 to "Maria", 2 to "Alex", 3 to "John")
    //println(users[1])
    
    //this is a mutable map collection
    val users = mutableMapOf<Int, String>(1 to "Maria", 2 to "Alex", 3 to "John")
    users[5]="Ron"
    users.forEach { t, u ->
        println("$t is $u")
    }
}


//write a class
//class User(val name:String)

//if we use  data keyword in ptrefix of class then it works as same as function
data class User(val name:String)
