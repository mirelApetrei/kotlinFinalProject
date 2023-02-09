package RPG_Game

import RPG_Game.Bad_Guy.Opponent
import RPG_Game.HeroesTypes.*

//*
// TODO: with the help of this Class, we are building our team randomly, and also our teamPotionsList wich we will use in combat
// */


class Team() {

    var myLogo = """
               /\_[]_/\
              |] _||_ [|
       ___     \/ || \/
      /___\       ||
     (|0 0|)      ||
   __/{\U/}\_ ___/vvv
  / \  {~}   / _|_P|
  | /\  ~   /_/   []
  |_| (____)        
  \_]/______\        -TEAM-
     _\_||_/_           
    (_,_||_,_)
    """.trimIndent()

    private var heroesList: MutableList<Hero>? = mutableListOf()
    var myTeamHP: Int
    var currentTeamHP: Int
    var myTeamPower: Int

    private var paladin = Paladin()
    private var knight = Knight()
    private var ranger = Ranger()
    private var elemental = Elemental()
    private var healer = Healer()
    private var wizzard = Wizard()

    var myTeam: MutableList<Hero> = mutableListOf()
    //    Every time the game will initiate, it  will fill the heroes list and the special feature list with default values.
    init {

        this.heroesList = mutableListOf(paladin, knight, ranger, elemental, healer, wizzard)
        println("STARTING THE GAME....")
        println(myLogo)
        println("********************************")
        Thread.sleep(500)
        myTeam = choseTeamFromInput()
        this.myTeamHP = calculateTeamHP()
        this.myTeamPower = calculateTeamPower()
        currentTeamHP = myTeamHP
        println()
        println("__________________________")
        println("Your TEAM MEMBERS are: ")
       for (hero in myTeam){
           hero.toString()
       }

    }


    private fun choseTeamFromInput(): MutableList<Hero> {
        val listWithHerosTypes: List<String> = listOf("Wizard", "Knight", "Paladin", "Ranger", "Healer")

        while (this.myTeam.size < 3) {
            println("Please chose your team from the following categories:")
            println(listWithHerosTypes)
            try {
                val chosenTeamMember = readln().lowercase()
                Thread.sleep(600)
                when (chosenTeamMember) {
                    "wizard" -> {
                        this.myTeam.add(wizzard)
                        println("A Wizard was added to your team...")
                    }

                    "knight" -> {
                        this.myTeam.add(knight)
                        println("A Knight was added to your team...")
                    }

                    "paladin" -> {
                        this.myTeam.add(paladin)
                        println("A Paladin was added to your team...")
                    }

                    "ranger" -> {
                        this.myTeam.add(ranger)
                        println("A Ranger was added to your team...")
                    }

                    "healer" -> {
                        myTeam.add(healer)
                        println("A Healer was added to your team...")
                    }

                    else ->
                        println("Type incorrect...please try again.")
                }
            } catch (e: Error) {
                println("Name or type non-valid...please try again!")
            }
            continue

        }
        return myTeam

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

    /* fun showExtraItems(specialFeatureList: MutableList<ExtraItem>) {
         for (element in specialFeatureList) {
             println(element.name)
         }
     }*/

    private fun calculateTeamHP(): Int {
        for (entry in this.myTeam) {
            myTeamHP = myTeamHP.plus(entry.healthPoints)
        }

        return myTeamHP
    }

    private fun calculateTeamPower(): Int {
        for (entry in this.myTeam) {
            myTeamPower = myTeamPower.plus(entry.damagePower)
        }

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
            Thread.sleep(300)
            println("..........................")
        }
        return ""
    }


    fun checkForWinner(team: Team, enemy: Opponent) {
        if (team.currentTeamHP <= 0) {
            println("Your enemy has won, because you don`t have any more HEALTH POINTS!")
        } else if (enemy.currentHealthPoints <= 0) {
            println("YOU WOOOONNNN !!!")

        }

    }

    fun removeHero() {
        for (hero in myTeam) {
            if (hero.currentHealthPoints <= 0) {
                this.myTeam.remove(hero)
                println(" This hero, ${hero.heroName}, has been removed from your team, because is DEAD.")
            }
        }
    }

    fun teamAttack(team: Team, enemy: Opponent) {
//        val damageAmount: Int = this.myTeamPower
        for (member in myTeam) {
            if (enemy.currentHealthPoints > 0) {
                when (member) {
                    Healer() -> member.heal(team)
                    Knight() -> if (member.currentHealthPoints >= 50) {
                        member.defense(enemy)
                        println("The ${member.heroName} has decided to protect the team against enemy`s attack..")
                    } else {
                        member.heroAttack(team, enemy)

                    }

                    else -> {
                        member.heroAttack(team, enemy)

                        println("#####################################")
                        println()
                    }
                }
            }
        }
        checkForWinner(team, enemy)
    }

    fun teamTakeDamage(damageAmount: Int) {
//        this.currentTeamHP -= damageAmount
        for (hero in myTeam) {
            hero.currentHealthPoints -= damageAmount
            println("$hero has suffered $damageAmount damage.")
            println("Remaining HP: ${hero.currentHealthPoints}/${hero.healthPoints}")

            println("################################################")
            println()
            removeHero()
        }
        for (player in myTeam) {
            currentTeamHP += player.currentHealthPoints
        }

    }


}