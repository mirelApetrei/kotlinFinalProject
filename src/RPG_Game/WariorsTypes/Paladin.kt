package RPG_Game.WariorsTypes

import kotlin.random.Random

class Paladin(heroName: String = "Paladin"
            ) : Hero(heroName) {

    init {
        this.level = Random.nextInt(1,5)


        when (this.level) {
            in (1..2) -> {
                this.damagePower = (80..120).random()
                this.healthPoints = (95..125).random()
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



//     fun attack(paladin: Paladin, enemy: Opponent) {
//        enemy.healthPoints = enemy.healthPoints?.minus(paladin.damagePower!!)
//    }

}