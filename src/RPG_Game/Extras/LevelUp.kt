package RPG_Game.Extras

import RPG_Game.HeroesTypes.Hero

class LevelUp(name:String): ExtraItem(name) {

    fun powerUp(ally: Hero){
        ally.damagePower = ally.damagePower.plus(50)
    }
}