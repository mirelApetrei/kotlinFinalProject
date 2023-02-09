package RPG_Game.HeroesTypes

import RPG_Game.Bad_Guy.Opponent
import RPG_Game.Extras.ExtraItem
import RPG_Game.Team
import kotlin.random.Random

open class Hero(
    var heroName: String

) {
    var healthPoints: Int = 50
  var currentHealthPoints = healthPoints
    var level: Int = Random.nextInt(1, 5)
    var damagePower: Int = 100

    open var specialFeature: ExtraItem? = null

    override fun toString(): String {
        println("-------------------------------")
        println( "${this.heroName} \n" +
                "The ${this.heroName} HP =  ${this.healthPoints} \n " +
                "The ${this.heroName} level =  ${this.level} \n" +
                "The ${this.heroName} Power =  $damagePower ")
        println("*********************************")
        return ""
    }



    open fun heal(team: Team) {
        println("An healing action has benn taken..")
//        this.healthPoints = this.healthPoints?.plus(50)!!
    }

    open fun defense( badGuy: Opponent) {
        println("A defense move has been taken.")
        // badGuy.damagePower = 0
    }

    open fun boost(team: Team, badGuy: Opponent) {
//        for (member in team){
//            member.
//        }
    }

    open fun heroAttack(team: Team, opponent: Opponent) {
//        println("This hero, ${this.heroName} with $damagePower points, will now attack....")
//        val damageAmount: Int = this.damagePower
//        if (enemy.currentHealthPoints > 0){
//            enemy.takeDamage(damageAmount)
//        }


    }
    open fun takeDamage(damageAmount: Int = this.damagePower){
        this.currentHealthPoints -= damageAmount

        println("${this.heroName} has suffered $damageAmount damage.")
        println("Remaining HP: $currentHealthPoints/$healthPoints")

        if (currentHealthPoints <= 0){
            println("${this.heroName} has suffered a killing blow :(")
        }
    }


}