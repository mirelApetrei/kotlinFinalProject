package Golden_Syntax_Game

open class Hero(var heroName: String,
                var healthPoints: Int?,
                var level: Int?,
                var damagePower: Int?) {


    override fun toString(): String {
        return "The ${this.heroName} has ${this.healthPoints} healt points, is at level ${this.level} and has ${damagePower} damage power."
    }

    open fun attack() {
        println("This hero has the following damage power : $damagePower points.")
    }

    open fun heal() {}

    open fun defense() {}

    open fun pass() {}
}