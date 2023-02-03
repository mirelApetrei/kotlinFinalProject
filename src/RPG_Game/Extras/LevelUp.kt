package RPG_Game.Extras

import RPG_Game.WariorsType.Hero

class LevelUp(name:String): ExtraItem(name) {

    fun powerUp(ally: Hero){
        ally.damagePower += 50
    }
}