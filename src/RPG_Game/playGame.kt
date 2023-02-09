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
    println("***************************************")
    println("My team current Healt Points are: ${myTeam.currentTeamHP}")
    println("My team damage power is ${myTeam.myTeamPower}")
    println("***************************************")
    println()
    //val teamExtras = PlayerTeam().chooseExtraItems()
    // myTeam.showExtraItems(teamExtras)
    println()

    println("""///////////////////////////////////////""")
    println("***************************************")
    println("""\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\""")
    println("Now it will be chosen your enemy....")
    Thread.sleep(1000)
    val enemy = Enemy()
    enemy.toString()
//    println(enemyLogo)

    while (myTeam.currentTeamHP > 0 && enemy.currentHealtPoints > 0) {
        oneRoundFight(myTeam, enemy)
        myTeam.checkForWinner(myTeam, enemy)

    }


}

fun oneRoundFight(team: PlayerTeam, enemy: Enemy) {
//    while (team.currentTeamHP > 0 && enemy.currentHealtPoints > 0) {

            team.teamAttack(enemy)
            if (enemy.currentHealtPoints <= 0) {
                println("Your enemy is defeated.")
//                break
            } else {
                enemy.enemyAttack(team)
                if (team.currentTeamHP > 0)
                    team.removeHero()
            }
        // team.usePotion(enemy)
        enemy.attack(team)
        team.removeHero()

//    }


}


fun playGame(myTeam: PlayerTeam, enemy: Enemy) {


}

