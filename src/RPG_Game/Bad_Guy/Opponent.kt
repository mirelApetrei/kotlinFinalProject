package RPG_Game.Bad_Guy

import RPG_Game.Extras.ExtraItem

open class Opponent(
    var heroName: String,
    var healthPoints: Int?,
    var level: Int?,
    var damagePower: Int?,
    var equippedWeapon: ExtraItem? = null
) {


}