package RPG_Game.HeroesTypes

import RPG_Game.Bad_Guy.Opponent
import RPG_Game.Extras.ExtraItem
import RPG_Game.Extras.Paralyze
import RPG_Game.Team
import kotlin.random.Random

class Wizard(
    heroName: String = "Wizzard"
) : Hero(heroName) {



    init {
        this.level = Random.nextInt(1, 5)

        when (level) {
            in (1..2) -> {
                this.damagePower = (70..110).random()
                this.healthPoints = (85..115).random()
            }

            in (2..3) -> {
                this.damagePower = (110..140).random()
                this.healthPoints = (115..145).random()
            }

            in (3..4) -> {
                this.damagePower = (140..160).random()
                this.healthPoints = (145..180).random()
            }

            in (4..5) -> {
                this.damagePower = (160..190).random()
                this.healthPoints = (180..210).random()
            }
        }
    }

    override fun heroAttack(team: Team, enemy: Opponent) {
        println("This hero, ${this.heroName} with $damagePower Power points, will now attack....")
        val damageAmount: Int = this.damagePower
        if (enemy.currentHealthPoints > 0) {
            enemy.takeDamage(damageAmount)
        }
        if (this.level < 5) {
            this.level++
            println("The level from ${this.heroName} will rise with 1")
            this.currentHealthPoints += 30
            this.damagePower += 30
            println(
                "Now the $heroName has $currentHealthPoints HP \n" +
                        "And $damagePower damage power."
            )
        } else {
            this.currentHealthPoints += 50
        }
//        this.toString()
    }

}
