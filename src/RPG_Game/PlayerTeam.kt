package RPG_Game

import RPG_Game.WariorsType.*
//import Thread

class PlayerTeam() {

    private var heroesList: MutableList<Hero>? = mutableListOf()
    private var myTeamHP: Int? = null
    private var myTeamPower: Int? = null
//    init {
//        this.myTeamHP = calculateTeamHP()
//        this.myTeamPower = calculateTeamPower()
//    }

    private var paladin = Paladin()
    private var knight = Knight()
    private var ranger = Ranger()
    private var elemental = Elemental()
    private var healer = Healer()
    private var wizzard = Wizard()
//    var paralyze = Spell()

    var myTeam: MutableList<Hero> = mutableListOf()
    init {
        this.heroesList = mutableListOf(paladin, knight, ranger, elemental, healer, wizzard)
    }


    fun choseMember(): Hero? {

        this.heroesList?.shuffle()
        if (heroesList?.isEmpty() == true) {
            return null
        } else {
            return this.heroesList?.removeFirst()
        }
    }


    fun teamBuilding(): MutableList<Hero> {
        println("Your team members will be random chosen now...")
        Thread.sleep(3000)
        for (i in 1..3) {
            myTeam.add(this.choseMember()!!)
        }
        return myTeam
    }

    fun calculateTeamHP(): Int {
        var teamHP: Int = 0
        for (entry in myTeam) {
            teamHP = teamHP.plus(entry.healthPoints)
        }
        println("Your team Health Points are: ")
        return teamHP
    }

    fun calculateTeamPower(): Int {
        var teamPower: Int = 0
        for (entry in myTeam) {
            teamPower = teamPower.plus(entry.damagePower)
        }
        println("Your team power is: ")
        return teamPower
    }

    override fun toString(): String {
        var members = ""
        for(member in myTeam){
            members +=  member.heroName + " "
            return "The ${member.heroName} HP =  ${member.healthPoints} \n " +
                    "The ${member.heroName} level =  ${member.level} \n" +
                    "The ${member.heroName} Power =  ${member.damagePower} "
        }
        return null!!
    }

}