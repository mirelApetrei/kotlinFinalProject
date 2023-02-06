package RPG_Game.WariorsTypes

import kotlin.random.Random

class Ranger(heroName: String = "Ranger"
            ): Hero(heroName) {

    init {
        this.level = Random.nextInt(1,5)

        when(level){
            in (1..2) -> {
                this.damagePower = (85..140).random()
                this.healthPoints = (80..120).random()
            }

            in (2..3) -> {
                this.damagePower = (140..160).random()
                this.healthPoints = (120..150).random()
            }
            in(3..4) -> {
                this.damagePower = (160..190).random()
                this.healthPoints = (150..180).random()
            }
            in(4..5) -> {
                this.damagePower = (190..230).random()
                this.healthPoints = (180..220).random()
            }

        }
    }


}