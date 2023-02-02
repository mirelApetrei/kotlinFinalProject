package RPG_Game.Extras

import RPG_Game.WariorsType.Hero

class LevelUp(hero: Hero, val damageIncrease: IntRange, damagePoints: Int, name: String): ExtraItem(name) {

    override fun equip() {
        super.equip()
        ownedBy?.equippedWeapon = this
    }
}