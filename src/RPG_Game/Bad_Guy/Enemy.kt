package RPG_Game.Bad_Guy

import RPG_Game.PlayerTeam
import kotlin.random.Random


class Enemy(enemyName: String = "Dragon"): Opponent(enemyName) {

    init {
        this.level = Random.nextInt(1, 5)
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

            in (4..5) -> {
                this.damagePower = (600..800).random()
                this.healthPoints = (500..900).random()
            }

        }
        this.currentHealtPoints = this.healthPoints

    }

    override fun enemyAttack(team: PlayerTeam){
        team.currentTeamHP -= this.damagePower
        team.teamTakeDamage(this.damagePower)
    }

}