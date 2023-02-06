package RPG_Game.WariorsTypes

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


    override fun attack( enemy: Opponent) {
        super.attack(enemy)
        if (this.healthPoints == 150){
            this.damagePower = 85
        } else if (this.healthPoints < 100){
            this.damagePower = 50
        }
    }

    override fun defense(team: PlayerTeam, enemy: Opponent) {
        super.defense(team, enemy)
        if (this.healthPoints >= 150){
            enemy.damagePower.minus(50)
        }
    }

}