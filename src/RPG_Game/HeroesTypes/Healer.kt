package RPG_Game.HeroesTypes

import RPG_Game.Bad_Guy.Opponent
import RPG_Game.Team
import kotlin.random.Random

class Healer(
    heroName: String = "Healer"
) : Hero(heroName) {
    init {
        this.level = Random.nextInt(1, 5)

        when (level) {
            in (1..2) -> {
                this.damagePower = (60..100).random()
                this.healthPoints = (80..120).random()
            }

            in (2..3) -> {
                this.damagePower = (100..140).random()
                this.healthPoints = (120..135).random()
            }

            in (3..4) -> {
                this.damagePower = (140..170).random()
                this.healthPoints = (135..155).random()
            }

            in (4..5) -> {
                this.damagePower = (170..200).random()
                this.healthPoints = (155..200).random()
            }

        }
    }


    override fun heroAttack(team: Team, opponent: Opponent) {
        println("Your Team current Health Points will now increase with ${this.damagePower} ")
        team.currentTeamHP += this.damagePower
    }
      override fun heal(team: Team) {
          println("Your Team current Health Points will now increase with ${this.damagePower} ")
         team.currentTeamHP += this.damagePower
    }


}