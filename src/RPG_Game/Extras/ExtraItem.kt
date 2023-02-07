package RPG_Game.Extras

import RPG_Game.HeroesTypes.Hero

open class ExtraItem(val name: String) {

    var equiped: Boolean = false

//    constructor(name: String, hero: Hero): this(name){
//        ownedBy = hero
//        equiped = true
//    }

    open fun equip(){
        equiped = true
    }

    open fun unequip(){
        equiped = false
    }


}