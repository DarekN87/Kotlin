package modifirers

class ChildModifier:MyModifier() {

    private val mod = MyModifier()
    fun print(){
        println(mod.namePub)
        println(namePub)
        println(mod.nameInter)
        println(nameInter)
        println(nameProtected)
// zmienna private nie jest widoczna
    }
}