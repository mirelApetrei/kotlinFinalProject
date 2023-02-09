package RPG_Game.HeroesTypes

import RPG_Game.Bad_Guy.Opponent
import kotlin.random.Random
import RPG_Game.Extras.ExtraItem
import RPG_Game.Extras.Paralyze
import RPG_Game.Team

class Elemental(
    heroName: String = "Elemental"
) : Hero(heroName) {

    init {
        this.level = Random.nextInt(1, 5)

        when (level) {
            in (1..2) -> {
                this.damagePower = (60..100).random()
                this.healthPoints = (80..120).random()
            }

            in (2..3) -> {
                this.damagePower = (100..140).random()
                this.healthPoints = (120..135).random()
            }

            in (3..4) -> {
                this.damagePower = (140..170).random()
                this.healthPoints = (135..155).random()
            }

            in (4..5) -> {
                this.damagePower = (170..200).random()
                this.healthPoints = (155..200).random()
            }

        }

    }

    override fun heroAttack(team: Team, enemy: Opponent) {
        println("This hero, ${this.heroName} with $damagePower Power points, will now attack....")
        val damageAmount: Int = this.damagePower
        if (enemy.currentHealthPoints > 0) {
            enemy.takeDamage(damageAmount)
        }
        this.currentHealthPoints += 100
        println("This hero HP will be increased by 100 points.")
        println("The $heroName currentHealthPoints are: $currentHealthPoints")
//        this.toString()
    }
}