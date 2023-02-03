package RPG_Game

import RPG_Game.WariorsType.*

fun main(args: Array<String>) {

    var myTeam: PlayerTeam = PlayerTeam()
    myTeam.teamBuilding()
    println(myTeam.toString())

    var myTeam3: PlayerTeam = PlayerTeam()
    myTeam3.teamBuilding()
    println(myTeam3.toString())
    println(myTeam3.calculateTeamHP())
   println(myTeam3.calculateTeamPower())

}

