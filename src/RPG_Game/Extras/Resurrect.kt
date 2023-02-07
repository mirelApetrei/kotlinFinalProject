package RPG_Game.Extras

import RPG_Game.HeroesTypes.Hero

class Resurrect(name: String = "Resurrect"): ExtraItem(name) {

    fun resurrect(friend: Hero){
        if (friend.currentHealtPoints <= 0){
            friend.currentHealtPoints = friend.healthPoints
        }

    }
}