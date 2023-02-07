package RPG_Game.Extras

import RPG_Game.Bad_Guy.Enemy
import RPG_Game.Bad_Guy.Opponent

class Paralyze(name: String = "Paralyze"): ExtraItem(name) {


    fun paralyze(){
        var enemy: Opponent = Enemy()
        enemy.damagePower = 0
    }

}