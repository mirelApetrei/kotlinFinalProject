package RPG_Game.WariorsType

import RPG_Game.Extras.ExtraItem
import RPG_Game.Extras.Paralyze

class Wizard(heroName: String = "Wizzard",
             healthPoints: Int = 115,
             level: Int = 1,
             damagePower: Int = 75 ): Hero(heroName, healthPoints, level, damagePower) {

    override var specialFeature: ExtraItem? = Paralyze("Paralyze")


 }
