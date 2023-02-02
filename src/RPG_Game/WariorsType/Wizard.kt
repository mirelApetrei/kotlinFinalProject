package RPG_Game.WariorsType

import RPG_Game.Extras.LevelUp

class Wizard(heroName: String = "Wizzard",
             healthPoints: Int = 115,
             level: Int = 1,
             damagePower: Int = 75): Hero(heroName, healthPoints, level, damagePower) {

    var specialFeature: LevelUp? = null

}