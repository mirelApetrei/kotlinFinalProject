package RPG_Game.Bad_Guy

import RPG_Game.Extras.ExtraItem
import RPG_Game.Team
import kotlin.random.Random

open class Opponent(
    var enemyName: String
) {
    var healthPoints: Int = 0
    var currentHealthPoints = healthPoints
    var level: Int = Random.nextInt(1, 5)
    var damagePower: Int = 0


    open fun attack(team: Team) {
        var randomChoices = listOf<Int>(1, 2, 3).random()
        println("The enemy`s attack choice is the following ... ")
        when (randomChoices) {
            1 -> {
                levelUp()
                damagePower = 0
                return
            }
            2 -> {
                enemyHit(team)
                return
            }
            else -> {
                healing()
                damagePower = 0
                return
            }
        }
    }


    private fun healing() {
        Thread.sleep(500)
        println("The enemy HEALTH POINTS will increase with 150 points...")
        this.healthPoints = this.healthPoints.plus(150)
    }

    private fun levelUp() {
        Thread.sleep(500)
        println("The $enemyName will level up now..")
        this.level++
        this.healthPoints += 150
        this.damagePower += 100
        println(
            "${this.enemyName}\n" +
                    "${this.enemyName} HP are ${this.healthPoints}\n" +
                    "${this.enemyName} Damage Power is: ${this.damagePower}"
        )
        println("------------------------------")
    }

    private fun enemyHit(team: Team) {
        Thread.sleep(500)
        println("The ${this.enemyName} with $damagePower DAMAGE POWER, will now HIT....")
        team.currentTeamHP -= this.damagePower


    }

    fun takeDamage(damageAmount: Int) {
        this.currentHealthPoints -= damageAmount

        println("${this.enemyName} has suffered $damageAmount damage.")
        println("Remaining HP: $currentHealthPoints/$healthPoints")

        if (currentHealthPoints <= 0) {
            println("${this.enemyName} has suffered a killing blow :(")

        }
    }

    override fun toString(): String {
        println("..........................")
        println(
            "${this.enemyName}\n" +
                    "${this.enemyName} level is $level \n" +
                    "${this.enemyName} HP are ${this.healthPoints}\n" +
                    "${this.enemyName} Damage Power is: ${this.damagePower}"
        )
        println("------------------------------")
        return ""
    }
}
