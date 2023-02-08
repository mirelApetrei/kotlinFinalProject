package RPG_Game

import RPG_Game.Bad_Guy.Enemy
import RPG_Game.Extras.ExtraItem
import RPG_Game.HeroesTypes.Hero


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


fun start() {
    println("The Game will begin...")
    Thread.sleep(1500)
    val myTeam = PlayerTeam()
    println()
    println(" This is your random chosen team:... ")
//    println(myLogo)
    Thread.sleep(1000)
    myTeam.toString()
    println()

//    val teamHP = myTeam.calculateTeamHP()
    println(myTeam.currentTeamHP)
    /*println("Now must the current healt points show..")
    println(myTeam.currentTeamHP)
    println(myTeam.myTeamHP)*/


    //val teamPower = myTeam.calculateTeamPower()
  println(myTeam.myTeamPower)
    println()
    //val teamExtras = PlayerTeam().chooseExtraItems()
    println("***************************************")
   // myTeam.showExtraItems(teamExtras)
    println("***************************************")
    println()

    println("""///////////////////////////////////////""")
    println("***************************************")
    println("""\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\""")
    println("Now it will be chosen your enemy....")
    Thread.sleep(1000)
    val enemy = Enemy()
    enemy.toString()
//    println(enemyLogo)
        oneRoundFight(myTeam, enemy)
        myTeam.removeHero()
        myTeam.checkForWinner(enemy)

}

fun oneRoundFight(team: PlayerTeam, enemy: Enemy) {
    println("muss etwas zeigen....")
    println(team.currentTeamHP)
    println(enemy.currentHealtPoints)
    while (team.currentTeamHP > 0 && enemy.currentHealtPoints > 0) {

        try {
            team.teamAttack(enemy)
            enemy.takeDamage(team.myTeamPower)
            if (enemy.currentHealtPoints > 0) {
                enemy.attack(team)
            } else {
                println("Your enemy is defeated.")
            }
        } catch (e: Error) {
            println(e.message)
        }
       // team.usePotion(enemy)
        //enemy.attack(team)
    }


}


fun playGame(myTeam: PlayerTeam, enemy: Enemy) {


}

