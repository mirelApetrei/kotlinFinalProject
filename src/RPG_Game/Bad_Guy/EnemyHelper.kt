package RPG_Game.Bad_Guy

import kotlin.random.Random

class EnemyHelper(heroName: String = "Orc" ): Opponent(heroName){


    init {
        this.level = Random.nextInt(1, 4)
        when (level) {
            in (1..2) -> {
                this.damagePower = (200..250).random()
                this.healthPoints = (250..300).random()

            }

            in (2..3) -> {
                this.damagePower = (250..400).random()
                this.healthPoints = (300..400).random()

            }

            in (3..4) -> {
                this.damagePower = (400..600).random()
                this.healthPoints = (400..500).random()

            }

        }
        this.currentHealthPoints = this.healthPoints

    }


}