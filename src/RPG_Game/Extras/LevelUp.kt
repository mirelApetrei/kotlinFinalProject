package RPG_Game.Extras

import RPG_Game.WariorsTypes.Hero

class LevelUp(name:String): ExtraItem(name) {

    fun powerUp(ally: Hero){
        ally.damagePower = ally.damagePower.plus(50)
    }
}