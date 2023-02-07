package RPG_Game

import RPG_Game.Bad_Guy.Enemy
import RPG_Game.Extras.ExtraItem


var myLogo = """
                |\                |\                |\                |\
   || .---.          || .---.          || .---.          || .---.
   ||/_____\         ||/_____\         ||/_____\         ||/_____\
   ||( '.' )         ||( '.' )         ||( '.' )         ||( '.' )
   || \_-_/_         || \_-_/_         || \_-_/_         || \_-_/_
   :-"`'V'//-.       :-"`'V'//-.       :-"`'V'//-.       :-"`'V'//-.
  / ,   |// , `\    / ,   |// , `\    / ,   |// , `\    / ,   |// , `\
 / /|Ll //Ll|| |   / /|Ll //Ll|| |   / /|Ll //Ll|| |   / /|Ll //Ll|| |
/_/||__//   || |  /_/||__//   || |  /_/||__//   || |  /_/||__//   || |
\ \/---|[]==|| |  \ \/---|[]==|| |  \ \/---|[]==|| |  \ \/---|[]==|| |
 \/\__/ |   \| |   \/\__/ |   \| |   \/\__/ |   \| |   \/\__/ |   \| |
 /\|_   | Ll_\ |   /|/_   | Ll_\ |   /|/_   | Ll_\ |   /|/_   | Ll_\ |
`^""${'"'}^`||_|  `^""${'"'}^`||_|   `^""${'"'}^`||_|  `^""${'"'}^`||_|
    |   |   ||/       |   |   ||/       |   |   ||/       |   |   ||/
    |   |   |         |   |   |         |   |   |         |   |   |
    |   |   |         |   |   |         |   |   |         |   |   |
    |   |   |         |   |   |         |   |   |         |   |   |
    L___l___J         L___l___J         L___l___J         L___l___J
     |_ | _|           |_ | _|           |_ | _|           |_ | _|
    (___|___)         (___|___)         (___|___)         (___|___)
     ^^^ ^^^           ^^^ ^^^           ^^^ ^^^           ^^^ ^^^
    """.trimIndent()
var enemyLogo = """
                         ___====-_  _-====___
           _--^^^#####//      \\#####^^^--_
        _-^##########// (    ) \\##########^-_
       -############//  |\^^/|  \\############-
     _/############//   (@::@)   \\############\_
    /#############((     \\//     ))#############\
   -###############\\    (oo)    //###############-
  -#################\\  / VV \  //#################-
 -###################\\/      \//###################-
_#/|##########/\######(   /\   )######/\##########|\#_
|/ |#/\#/\#/\/  \#/\##\  |  |  /##/\#/  \/\#/\#/\#| \|
`  |/  V  V  `   V  \#\| |  | |/#/  V   '  V  V  \|  '
   `   `  `      `   / | |  | | \   '      '  '   '
                    (  | |  | |  )
                   __\ | |  | | /__
                  (vvv(VVV)(VVV)vvv)
    
    """.trimIndent()


fun start(){
    println("The Game will begin...")
    Thread.sleep(1500)

    val myTeam = PlayerTeam()
    myTeam.teamBuilding()

    println()

    println(" This is your random chosen team:... ")
    println(myLogo)
    Thread.sleep(1000)
    println()

    val teamHP = myTeam.calculateTeamHP()
    println(teamHP)
    val teamPower = myTeam.calculateTeamPower()
    println(teamPower)
    println()
    var teamExtras = PlayerTeam().chooseExtraItems()
    println("***************************************")
    myTeam.showExtraItems(teamExtras)
    println("***************************************")
    println()




    println("""///////////////////////////////////////""")
    println("***************************************")
    println("""\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\""")
    println("Now it will be chosen your enemy....")
    Thread.sleep(1000)
    val enemy = Enemy()
    enemy.toString()
    println(enemyLogo)


}

fun oneRoundFight(team: PlayerTeam, enemy: Enemy){}


fun playGame(myTeam: PlayerTeam, enemy: Enemy) {


}

fun checkForWinner(){

}