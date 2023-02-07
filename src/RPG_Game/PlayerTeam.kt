package RPG_Game

import RPG_Game.Extras.*
import RPG_Game.HeroesTypes.*

//*
// TODO: with the help of this Class, we are building our team randomly, and also our teamPotionsList wich we will use in combat
// */
class PlayerTeam() {

    private var heroesList: MutableList<Hero>? = mutableListOf()
    private var teamPotionsList: MutableList<ExtraItem> = mutableListOf()
    var myTeamHP: Int
    var currentTeamHP: Int
    var myTeamPower: Int

    private var paladin = Paladin()
    private var knight = Knight()
    private var ranger = Ranger()
    private var elemental = Elemental()
    private var healer = Healer()
    private var wizzard = Wizard()


    var moreDamage = DamagePowerUp()
    var paralyze = Paralyze()
    var heal = Heal()
    var resurrect = Resurrect()


    private var myTeam: MutableList<Hero> = mutableListOf()
    var specialFeatureList: MutableList<ExtraItem> = mutableListOf()

    //    Every time the game will initiate, it  will fill the heroes list and the special feature list with default values.
    init {
        this.heroesList = mutableListOf(paladin, knight, ranger, elemental, healer, wizzard)
        myTeamHP = calculateTeamHP()
        myTeamPower = calculateTeamPower()
        currentTeamHP = myTeamHP
        this.specialFeatureList = mutableListOf(heal, resurrect, moreDamage, paralyze)
    }

    fun choosePotion(): ExtraItem {
        specialFeatureList.shuffle()
        return this.specialFeatureList.removeFirst()
    }

    fun chooseExtraItems(): MutableList<ExtraItem> {
        for (i in 1..3) {
            teamPotionsList.add(this.choosePotion())
        }
        return teamPotionsList
    }

    private fun choseMember(): Hero? {

        this.heroesList?.shuffle()
        return if (heroesList?.isEmpty() == true) {
            null
        } else {
            this.heroesList?.removeFirst()
        }
    }

    fun showExtraItems(specialFeatureList: MutableList<ExtraItem>) {
        for (element in specialFeatureList) {
            println(element.name)
        }
    }

    fun removeHero(hero: Hero) {
        if (hero.healthPoints <= 0) {
            this.myTeam.remove(hero)
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
        //var myTeamHP: Int = 0
        for (entry in myTeam) {
            myTeamHP = myTeamHP.plus(entry.healthPoints)
        }
        println("Your team Health Points are: ")
        return myTeamHP
    }

    fun calculateTeamPower(): Int {
        // var myTeamPower: Int = 0
        for (entry in myTeam) {
            myTeamPower = myTeamPower.plus(entry.damagePower)
        }
        println("Your team power is: ")
        return myTeamPower
    }


    override fun toString(): String {
        println()
        for (member in myTeam) {
            println(
                "${member.heroName}\n" +
                        "The ${member.heroName} HP =  ${member.healthPoints}\n" +
                        "The ${member.heroName} level =  ${member.level}\n" +
                        "The ${member.heroName} Power =  ${member.damagePower}\n"
            )
            println("...................")
        }
        return ""
    }


//    fun teamAttack(enemy: Opponent) {
//        println("This hero, ${this.myTeam} with $myTeamPower points, will now attack....")
//        var damageAmount: Int = this.myTeamPower
//
//        for (member in myTeam){
//            if (enemy.currentHealtPoints > 0){
//                member.heroAttack(enemy)
//                enemy.takeDamage(damageAmount)
//            }
//        }
//
//
//
//    }
//    fun teamTakeDamage(damageAmount: Int){
//        this.currentTeamHP -= damageAmount
//
//        println("${this.myTeam} has suffered $damageAmount damage.")
//        println("Remaining HP: $currentTeamHP/$myTeamHP")
//
//        if (currentTeamHP <= 0){
//            println("${this.myTeam} has suffered a killing blow :(")
//        }
//    }


}