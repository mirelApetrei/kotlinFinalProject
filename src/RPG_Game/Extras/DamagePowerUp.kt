package RPG_Game.Extras

import RPG_Game.HeroesTypes.Hero

class DamagePowerUp(name:String = "MoreDamage"): ExtraItem(name) {

    fun damagePowerUp(ally: Hero){
      ally.damagePower += 150
    }
}