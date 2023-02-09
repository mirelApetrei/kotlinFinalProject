package RPG_Game.HeroesTypes

import RPG_Game.Bad_Guy.Opponent
import RPG_Game.PlayerTeam
import kotlin.random.Random

class Knight(heroName: String = "Knight"
            ) : Hero(heroName) {

    init {
        this.level = Random.nextInt(1,5)

        when (level) {
            in (1..2) -> {
                this.damagePower = (100..140).random()
                this.healthPoints = (100..140).random()
            }
            in (2..3) -> {
                this.damagePower = (120..150).random()
                this.healthPoints = (125..155).random()
            }
            in (3..4) -> {
                this.damagePower = (150..180).random()
                this.healthPoints = (155..200).random()
            }
            in (4..5) -> {
                this.damagePower = (180..250).random()
                this.healthPoints = (200..250).random()
            }
        }
    }



   override fun heroAttack(enemy: Opponent) {
        println("This hero, ${this.heroName} with $damagePower points, will now attack....")
        val damageAmount: Int = this.damagePower
        if (enemy.currentHealtPoints > 0) {
            println("The enemy suffered damage of ${this.damagePower}")
            enemy.takeDamage(damageAmount)
        }
    }

   override fun defense(enemy: Opponent) {
        if (this.healthPoints >= 50){
            enemy.damagePower.minus(200)
        }
    }

}