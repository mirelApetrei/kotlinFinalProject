package RPG_Game.Extras

import RPG_Game.HeroesTypes.Hero

class Heal(name: String = "HeallingPotion"): ExtraItem(name) {

    fun healling(hero: Hero){
        hero.currentHealtPoints += (hero.healthPoints * 0.8).toInt()
    }
}