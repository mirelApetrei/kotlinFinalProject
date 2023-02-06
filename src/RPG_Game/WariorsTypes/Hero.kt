package RPG_Game.WariorsTypes

import RPG_Game.Bad_Guy.Opponent
import RPG_Game.Extras.ExtraItem
import RPG_Game.PlayerTeam
import kotlin.random.Random
import kotlin.random.nextInt

open class Hero(
    var heroName: String

) {
    var healthPoints: Int = 50
    var level: Int = Random.nextInt(1, 5)
    var damagePower: Int = 100

    open var specialFeature: ExtraItem? = null

    override fun toString(): String {
        return "The ${this.heroName} HP =  ${this.healthPoints} \n " +
                "The ${this.heroName} level =  ${this.level} \n" +
                "The ${this.heroName} Power =  ${damagePower} "
    }

    open fun attack( enemy: Opponent) {
        println("This hero has the following damage power : $damagePower points.")
        this.damagePower = this.damagePower - this.damagePower
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


}