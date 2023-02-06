package RPG_Game

fun main(args: Array<String>) {

    var myTeam: PlayerTeam = PlayerTeam()
    myTeam.teamBuilding()
    println(myTeam.toString())
    println("-----------------------------")

    var myTeam2: PlayerTeam = PlayerTeam()
    myTeam2.teamBuilding()
    println(myTeam2.toString())
    println("-----------------------------")

    var

    var myTeam3: PlayerTeam = PlayerTeam()
    myTeam3.teamBuilding()
    println(myTeam3.toString())
    println("-----------------------------")
    println(myTeam3.calculateTeamHP())
    println("-----------------------------")
   println(myTeam3.calculateTeamPower())
//    myTeam3.teamAttack()

}

