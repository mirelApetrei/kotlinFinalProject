package RPG_Game

import RPG_Game.WariorsType.*

fun main(args: Array<String>) {

    var teamOfHeroes: MutableList<Hero> = mutableListOf()
    var paladin = Paladin()
    var knight = Knight()
    var ranger = Ranger()
    var elemental =Elemental()
    var healer = Healer()
    var wizzard = Wizard()

    teamOfHeroes.add(paladin)
    teamOfHeroes.add(knight)
    teamOfHeroes.add(ranger)
    teamOfHeroes.add(elemental)
    teamOfHeroes.add(healer)
    teamOfHeroes.add(wizzard)
    teamOfHeroes.shuffle()


}

