//Concept of Generics
fun main(args:Array<String>) {
    val footballPlayer = FootballPlayer("fbp1")
    val footballPlayer2 = FootballPlayer("fbp2")
    
    val baseballPlayer = BaseballPlayer("bbp1")
    val baseballPlayer2 = BaseballPlayer("bbp2")
    
    val fbteam = Team("fbp1",mutableListOf(footballPlayer))
    fbteam.addPlayers(footballPlayer2)
    
    val bbteam = Team("bbp1",mutableListOf(baseballPlayer))
    bbteam.addPlayers(baseballPlayer2)
}

class Team<T>(val name:String, val players: MutableList<T>){
    fun addPlayers(player: T){
        if(players.contains(player)){
            println("Player : ${(player as Player).name} is already in the team ${this.name}")
        }else{
            players.add(player)
            println("Player: ${(player as Player).name} was added in the team ${this.name}")
        }
    }
}

open class Player(val name:String)
class FootballPlayer(name:String):Player(name)
class BaseballPlayer(name:String):Player(name)