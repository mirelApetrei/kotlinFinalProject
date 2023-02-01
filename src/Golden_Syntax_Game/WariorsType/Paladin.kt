package Golden_Syntax_Game.WariorsType

import Golden_Syntax_Game.Hero

class Paladin(heroName: String,
              healthPoints: Int?,
              level: Int?,
              damagePower: Int) : Hero(heroName, healthPoints, level, damagePower) {
    var weaponTpe: String? = null

    override fun attack() {

    }
}