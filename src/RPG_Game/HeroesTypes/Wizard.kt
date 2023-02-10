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
        this.level = Random.nextInt(1,5)

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
        println("This hero, ${this.heroName} with $damagePower points, will now attack....")
        val damageAmount: Int = this.damagePower
        if (enemy.currentHealthPoints > 0) {
            enemy.takeDamage(damageAmount)
            Thread.sleep(1000)
        }
        if (this.level < 5){
        level++
            currentHealthPoints += 30
            team.currentTeamHP += 30
            damagePower += 30
            //this calculate false
           // println("The $heroName HP = ${this.currentHealthPoints}, Power = ${this.damagePower}")
            println("TEAM HP = ${team.currentTeamHP}")
        } else {
            this.currentHealthPoints += 50
            println("The $heroName HP = ${this.currentHealthPoints}")
        }
    }

}
