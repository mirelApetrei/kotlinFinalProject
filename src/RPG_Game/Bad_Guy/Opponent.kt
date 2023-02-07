package RPG_Game.Bad_Guy

import RPG_Game.Extras.ExtraItem
import RPG_Game.PlayerTeam
import kotlin.random.Random

open class Opponent(
    var enemyName: String) {
    var healthPoints: Int = 0
    var currentHealtPoints = healthPoints
    var level: Int = Random.nextInt(1, 5)
    var damagePower: Int = 0

    var equippedWeapon: ExtraItem? = null


    open fun attack(team: PlayerTeam) {
        println("This enemy has attacked:...")
        //team.myTeamHP = team.myTeamHP.minus(this.damagePower)
        println()
    }

    open fun heal() {
        println("An healing potion has being used, this means that your health Points will be restored in 50 points.")
        this.healthPoints = this.healthPoints.plus(150)
    }

    open fun defense(team: PlayerTeam) {
        println("A defense move has been taken.")
        //  team.myTeamPower = 0
    }

fun enemyAttack(team: PlayerTeam) {
        println("This hero, ${this.enemyName} with $damagePower points, will now attack....")
        var damageAmount: Int = this.damagePower
//        val heroIterator = team.iterator()


    }
    fun takeDamage(damageAmount: Int){
        this.currentHealtPoints -= damageAmount

        println("${this.enemyName} has suffered $damageAmount damage.")
        println("Remaining HP: $currentHealtPoints/$healthPoints")

        if (currentHealtPoints <= 0){
            println("${this.enemyName} has suffered a killing blow :(")
        }
    }
    override fun toString(): String {
        println("..........................")
        println(
            "${this.enemyName}\n" +
                    "${this.enemyName} HP are ${this.healthPoints}\n" +
                    "${this.enemyName} Damage Power is: ${this.damagePower}"
        )
        println("------------------------------")
        return ""
    }

}