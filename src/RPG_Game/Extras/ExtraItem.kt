package RPG_Game.Extras

import RPG_Game.HeroesTypes.Hero

open class ExtraItem(val name: String) {

     var ownedBy: Hero? = null
     var equipped: Boolean = false


    constructor(name: String, player: Hero) : this(name) {
        ownedBy = player
        equipped = true
    }


    open fun equip(){
        equipped = true
    }

    open fun unequip(){
        equipped = false
    }


}