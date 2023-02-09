package RPG_Game.Bad_Guy

import RPG_Game.PlayerTeam
import kotlin.random.Random


class Enemy(enemyName: String = "Dragon"): Opponent(enemyName) {

    init {
        this.level = Random.nextInt(1, 5)
        when (level) {
            in (1..2) -> {
                this.damagePower = (300..350).random()
                this.healthPoints = (300..450).random()

            }

            in (2..3) -> {
                this.damagePower = (350..450).random()
                this.healthPoints = (450..600).random()

            }

            in (3..4) -> {
                this.damagePower = (450..600).random()
                this.healthPoints = (600..700).random()

            }

            in (4..5) -> {
                this.damagePower = (600..800).random()
                this.healthPoints = (700..900).random()
            }

        }
        this.currentHealtPoints = this.healthPoints

    }

    override fun enemyAttack(team: PlayerTeam){
        team.currentTeamHP -= this.damagePower
        team.teamTakeDamage(this.damagePower)

    }

}