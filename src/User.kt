class User {
    //atribus
    var name: String
    var age: Int
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
    //getters
    fun _getName(): String {
        return name
    }
    fun _getAge(): Int {
        return age
    }
    //setters
    fun _setName(name: String) {
        this.name = name
    }
    fun _setAge(age: Int) {
        this.age = age
    }

    override fun toString(): String {
        return "User(name='$name', age=$age)"
    }
}

data class Personne(var name: String, var age: Int)