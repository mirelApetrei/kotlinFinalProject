package RPG_Game

import RPG_Game.Bad_Guy.Opponent
import RPG_Game.Extras.*
import RPG_Game.HeroesTypes.*

//*
// TODO: with the help of this Class, we are building our team randomly, and also our teamPotionsList wich we will use in combat
// */
class PlayerTeam() {

    private var heroesList: MutableList<Hero>? = mutableListOf()
    var teamPotionsList: MutableList<ExtraItem> = mutableListOf()
    var myTeamHP: Int
    var currentTeamHP: Int
    var myTeamPower: Int
    var myTeamSize: Int

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
        this.specialFeatureList = mutableListOf(heal, resurrect, moreDamage, paralyze)
        myTeam = teamBuilding()
        myTeamHP = calculateTeamHP()
        myTeamPower = calculateTeamPower()
         myTeamSize = calculateTeamSize()
        currentTeamHP = myTeamHP
        //teamPotionsList = chooseExtraItems()
    }
    private fun calculateTeamSize(): Int{
        for(hero in myTeam){
            myTeamSize++
        }
        return myTeamSize
    }

    /*private fun choosePotion(): ExtraItem {
        this.specialFeatureList.shuffle()
        return this.specialFeatureList.removeFirst()
    }

    fun chooseExtraItems(): MutableList<ExtraItem> {
        for (i in 1..3) {
            this.teamPotionsList.add(this.choosePotion())
        }
        return this.teamPotionsList
    }*/

    private fun choseMember(): Hero? {

        this.heroesList?.shuffle()
        return if (heroesList?.isEmpty() == true) {
            null
        } else {
            this.heroesList?.removeFirst()
        }
    }

   /* fun showExtraItems(specialFeatureList: MutableList<ExtraItem>) {
        for (element in specialFeatureList) {
            println(element.name)
        }
    }*/

    fun removeHero() {
       for (hero in myTeam){
           if (hero.healthPoints <= 0) {
               this.myTeam.remove(hero)
           }
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

//    fun usePotion(enemy: Opponent){
//        teamPotionsList.shuffle()
//        var potionToUse = teamPotionsList.random()
//        potionToUse.equip()
//    }

    fun checkForWinner(enemy: Opponent) {
        if (myTeam.isEmpty()){
            println("Your enemy has won, because you don`t have any hero in your team.")
        } else if (enemy.currentHealtPoints <= 0){
            println("YOU WOOOONNNN!!!")
        }
    }
    fun teamAttack(enemy: Opponent) {

        val damageAmount: Int = this.myTeamPower

        for (member in myTeam) {
            if (enemy.currentHealtPoints > 0) {
                when(member){
                    Healer() -> myTeam.first().heal()
                    Knight() ->  if (member.currentHealtPoints >= 50){
                                        member.defense(enemy)
                                            println("The ${member.heroName} has decided to prtect the team against enemy`s attack..")
                                } else {
                                    member.heroAttack(enemy)
                                    println("The ${member.heroName} with ${member.damagePower} will now attack....")
                                }
                    else -> { member.heroAttack(enemy)
                                println("The ${member.heroName} with ${member.damagePower} will now attack....")
                    }
                }
                enemy.takeDamage(damageAmount)
            }
        }
    }
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