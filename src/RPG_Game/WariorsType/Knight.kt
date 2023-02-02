package RPG_Game.WariorsType

import RPG_Game.Bad_Guy.Opponent
import RPG_Game.PlayerTeam

class Knight(heroName: String = "Knight",
             healthPoints: Int = 150,
             level: Int = 1,
             damagePower: Int = 85 ) : Hero(heroName, healthPoints, level, damagePower) {

    override fun attack(hero: Hero, badGuy: Opponent) {
        super.attack(hero, badGuy)
        if (this.healthPoints == 150){
            this.damagePower = 85
        } else if (this.healthPoints < 100){
            this.damagePower = 50
        }
    }

    override fun defense(team: PlayerTeam, badGuy: Opponent) {
        super.defense(team, badGuy)
        if (this.healthPoints == 150){
            badGuy.damagePower = badGuy.damagePower?.minus(50)
        }
    }

}