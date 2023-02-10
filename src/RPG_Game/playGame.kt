package RPG_Game

import RPG_Game.Bad_Guy.Enemy


var enemyLogo = """
                            ==(W{==========-      /===-                        
                              ||  (.--.)         /===-_---~~~~~~~~~------____  
                              | \_,|**|,__      |===-~___                _,-' `
                 -==\\        `\ ' `--'   ),    `//~\\   ~~~~`---.___.-~~      
             ______-==|        /`\_. .__/\ \    | |  \\           _-~`         
       __--~~~  ,-/-==\\      (   | .  |~~~~|   | |   `\        ,'             
    _-~       /'    |  \\     )__/==0==-\<>/   / /      \      /               
  .'        /       |   \\      /~\___/~~\/  /' /        \   /'                
 /  ____  /         |    \`\.__/-~~   \  |_/'  /          \/'                  
/-'~    ~~~~~---__  |     ~-/~         ( )   /'        _--~`                   
                  \_|      /        _) | ;  ),   __--~~                        
                    '~~--_/      _-~/- |/ \   '-~ \                            
                   {\__--_/}    / \\_>-|)<__\      \                           
                   /'   (_/  _-~  | |__>--<__|      |                          
                  |   _/) )-~     | |__>--<__|      |                          
                  / /~ ,_/       / /__>---<__/      |                          
                 o-o _//        /-~_>---<__-~      /                           
                 (^(~          /~_>---<__-      _-~                            
                ,/|           /__>--<__/     _-~                               
             ,//('(          |__>--<__|     /                  .----_          
            ( ( '))          |__>--<__|    |                 /' _---_~\        
         `-)) )) (           |__>--<__|    |               /'  /     ~\`\      
        ,/,'//( (             \__>--<__\    \            /'  //        ||      
      ,( ( ((, ))              ~-__>--<_~-_  ~--____---~' _/'/        /'       
    `~/  )` ) ,/|                 ~-_~>--<_/-__       __-~ _/                  
  ._-~//( )/ )) `                    ~~-'_/_/ /~~~~~~~__--~                    
   ;'( ')/ ,)(                              ~~~~~~~~~~                         
  ' ') '( (/                                                                   
    '   '  `
    """.trimIndent()


fun main(args: Array<String>) {
    playGame()
}

fun playGame() {
    val team = Team()
    Thread.sleep(1500)
    println()

    println("***************************************")
    println()
    println("Your team current Health Points are: ${team.currentTeamHP}")
    println("Your team damage power is ${team.myTeamPower}")
    println()
    Thread.sleep(1500)
    println("***************************************")
    println()
    println()

    println("""///////////////////////////////////////""")
    println("***************************************")
    println("""\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\""")

    println("Now it will be chosen your enemy....")
    println()
    Thread.sleep(1000)
    val enemy = Enemy()
    println(enemyLogo)
    enemy.toString()
    Thread.sleep(1000)


    while (team.currentTeamHP > 0 && enemy.currentHealthPoints > 0) {
        println("THE FIGHT BEGINS......")
        Thread.sleep(1000)
        oneRoundFight(team, enemy)
        Thread.sleep(800)
    }
}

fun oneRoundFight(team: Team, enemy: Enemy) {
    team.teamAttack(team, enemy)
    Thread.sleep(800)
    if (enemy.currentHealthPoints <= 0) {
        println("Your enemy is defeated.")
        return
    } else {
        enemy.attack(team)
        Thread.sleep(600)
    }
    println("*******************************")
    println("|||||||||||||||||||||||||||||||")
    println("*******************************")
    Thread.sleep(500)
}



