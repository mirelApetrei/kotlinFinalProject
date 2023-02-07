package RPG_Game.HeroesTypes

import RPG_Game.Bad_Guy.Opponent
import RPG_Game.Extras.ExtraItem
import RPG_Game.PlayerTeam
import kotlin.random.Random

open class Hero(
    var heroName: String

) {
    var healthPoints: Int = 50
    var currentHealtPoints = healthPoints
    var level: Int = Random.nextInt(1, 5)
    var damagePower: Int = 100

    open var specialFeature: ExtraItem? = null

    override fun toString(): String {
        return "The ${this.heroName} HP =  ${this.healthPoints} \n " +
                "The ${this.heroName} level =  ${this.level} \n" +
                "The ${this.heroName} Power =  $damagePower "
    }



    open fun heal() {
        println("An healling potion has being used, this means that your healtPoints will be restored in 50 points.")
//        this.healthPoints = this.healthPoints?.plus(50)!!
    }

    open fun defense(team: PlayerTeam, badGuy: Opponent) {
        println("A defense move has been taken.")
        // badGuy.damagePower = 0
    }

    open fun boost(team: PlayerTeam, badGuy: Opponent) {
//        for (member in team){
//            member.
//        }
    }

    open fun heroAttack(enemy: Opponent) {
        println("This hero, ${this.heroName} with $damagePower points, will now attack....")
        var damageAmount: Int = this.damagePower
        if (enemy.currentHealtPoints > 0){
            enemy.takeDamage(damageAmount)
        }


    }
    open fun takeDamage(damageAmount: Int){
        this.currentHealtPoints -= damageAmount

        println("${this.heroName} has suffered $damageAmount damage.")
        println("Remaining HP: $currentHealtPoints/$healthPoints")

        if (currentHealtPoints <= 0){
            println("${this.heroName} has suffered a killing blow :(")
        }
    }


}