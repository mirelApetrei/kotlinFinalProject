package RPG_Game.Bad_Guy

import RPG_Game.Extras.ExtraItem
import RPG_Game.PlayerTeam
import kotlin.random.Random

open class Opponent(
    var enemyName: String
) {
    var healthPoints: Int = 50
    var level: Int = Random.nextInt(1, 5)
    var damagePower: Int = 100

    var equippedWeapon: ExtraItem? = null



    open fun attack(team: PlayerTeam) {
        println("This enemy has attacked:...")
        team.myTeamHP = team.myTeamHP?.minus(this.damagePower)
        println()
    }

    open fun heal() {
        println("An healing potion has being used, this means that your health Points will be restored in 50 points.")
        this.healthPoints = this.healthPoints.plus(100)
    }

    open fun defense(team: PlayerTeam) {
        println("A defense move has been taken.")
        team.myTeamPower = 0
    }

    open fun boost(team: PlayerTeam, badGuy: Opponent) {
//        for (member in team){
//            member.
//        }
    }

    override fun toString(): String {
        return "The ${this.enemyName} HP =  ${this.healthPoints} \n " +
                "The ${this.enemyName} level =  ${this.level} \n" +
                "The ${this.enemyName} Power =  $damagePower "
    }
}