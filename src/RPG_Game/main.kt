package RPG_Game

import RPG_Game.Bad_Guy.Enemy

fun main(args: Array<String>) {



    var myTeam3: PlayerTeam = PlayerTeam()
    myTeam3.teamBuilding()
    println(myTeam3.toString())
    println("-----------------------------")
    println(myTeam3.calculateTeamHP())
    println("-----------------------------")
   println(myTeam3.calculateTeamPower())

    println()
    var dragon = Enemy()
    dragon.toString()
    dragon.attack(myTeam3)

    //myTeam3.teamAttack(dragon)

}

