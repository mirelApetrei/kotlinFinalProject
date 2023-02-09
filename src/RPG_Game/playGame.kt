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


fun playGame() {
    var team = Team()
    Thread.sleep(500)
    println()
    Thread.sleep(500)
    println("***************************************")
    println()
    println("Your team current Health Points are: ${team.myTeamHP}")
    team.currentTeamHP = team.myTeamHP
    println("Your team damage power is ${team.myTeamPower}")
    println()
    println("***************************************")
    println()
    println()

    println("""///////////////////////////////////////""")
    println("***************************************")
    println("""\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\""")
    println("Now it will be chosen your enemy....")
    println()
    Thread.sleep(800)
    val enemy = Enemy()
    println(enemyLogo)
    enemy.toString()

    while (team.currentTeamHP > 0 && enemy.currentHealthPoints > 0) {
        println("THE FIGHT BEGINS......")
        Thread.sleep(2000)
        oneRoundFight(team, enemy)
        println("_____________________________")
    }
}

fun oneRoundFight(team: Team, enemy: Enemy) {
    team.teamAttack(team, enemy)
    println("Enemy remaining Hp are : ${enemy.currentHealthPoints}")
    if (enemy.currentHealthPoints <= 0) {
        println("Your enemy is defeated.")
        return
    } else {
        enemy.attack(team)
        team.teamTakeDamage(enemy)
    }
    println("*******************************")
    println("|||||||||||||||||||||||||||||||")
    println("*******************************")
    team.checkForWinner(team, enemy)
    Thread.sleep(1000)
}



