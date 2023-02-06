package RPG_Game

import RPG_Game.Bad_Guy.Opponent
import RPG_Game.HeroesTypes.*
//import Thread

class PlayerTeam() {

    private var heroesList: MutableList<Hero>? = mutableListOf()
    var myTeamHP: Int? = null
     var myTeamPower: Int? = null


    private var paladin = Paladin()

    private var knight = Knight()
    private var ranger = Ranger()
    private var elemental = Elemental()
    private var healer = Healer()
    private var wizzard = Wizard()

    private var myTeam: MutableList<Hero> = mutableListOf()
    init {
        this.heroesList = mutableListOf(paladin, knight, ranger, elemental, healer, wizzard)
    }


    private fun choseMember(): Hero? {

        this.heroesList?.shuffle()
        return if (heroesList?.isEmpty() == true) {
            null
        } else {
            this.heroesList?.removeFirst()
        }
    }


    fun teamBuilding(): MutableList<Hero> {
        println("Your team members will be random chosen now...")
        Thread.sleep(1000)
        for (i in 1..3) {
            myTeam.add(this.choseMember()!!)
        }
        return myTeam
    }

    fun calculateTeamHP(): Int {
        var teamHP: Int = 0
        for (entry in myTeam) {
            teamHP = entry.healthPoints?.let { teamHP.plus(it) }!!
        }
        println("Your team Health Points are: ")
        return teamHP
    }

    fun calculateTeamPower(): Int {
        var teamPower: Int = 0
        for (entry in myTeam) {
            teamPower = entry.damagePower?.let { teamPower.plus(it) }!!
        }
        println("Your team power is: ")
        return teamPower
    }

    override fun toString(): String {
        println()
        for(member in myTeam){
            println("The ${member.heroName} HP =  ${member.healthPoints}\n" +
                    "The ${member.heroName} level =  ${member.level}\n" +
                    "The ${member.heroName} Power =  ${member.damagePower} ")
            println("..............")
        }
        return ""
    }

    fun teamAttack(enemy: Opponent){
        for (member in myTeam){
            member.attack(enemy)
        }
    }


}