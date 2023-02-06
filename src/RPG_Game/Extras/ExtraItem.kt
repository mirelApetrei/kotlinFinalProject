package RPG_Game.Extras

import RPG_Game.WariorsTypes.Hero

open class ExtraItem(val name: String) {
    var ownedBy: Hero? = null
    var equiped: Boolean = false

    constructor(name: String, hero: Hero): this(name){
        ownedBy = hero
        equiped = true
    }

    open fun equip(){
        equiped = true
    }

    fun unequip(){
        equiped = false
    }


}