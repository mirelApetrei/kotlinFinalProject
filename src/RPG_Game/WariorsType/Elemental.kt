package RPG_Game.WariorsType

import RPG_Game.Bad_Guy.Opponent

class Elemental(heroName: String = "Elemental",
                healthPoints: Int = 95,
                level: Int = 1,
                damagePower: Int = 50): Hero(heroName, healthPoints, level , damagePower) {

    override fun attack(hero: Hero, badGuy: Opponent) {
        super.attack(hero, badGuy)
        badGuy.damagePower = 0
    }

//    override fun boost() {
//        super.boost()
//
//    }
}