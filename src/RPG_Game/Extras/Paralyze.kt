package RPG_Game.Extras

import RPG_Game.Bad_Guy.Opponent

class Paralyze(name: String): ExtraItem(name) {


    fun paralyze(enemy: Opponent){
        enemy.damagePower = 0
    }

}