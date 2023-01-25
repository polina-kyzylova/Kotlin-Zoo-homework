abstract class Animal(val animalType: String)
{
    abstract val animalAction: String

    abstract fun breath()
    abstract fun move()
    abstract fun action()
    abstract fun info()
}


class Beast(animalType: String): Animal(animalType)
{
    override var animalAction: String = ""

    override fun move()
    {
        println("${this.animalType} передвигается по земле с помощью передних и задних лап")
    }

    override fun breath()
    {
        println("${this.animalType} дышит с помощью носа")
    }

    override fun action()
    {
        println("${this.animalType} умеет ${this.animalAction}")
    }

    override fun info()
    {
        println("${this.animalType} - зверь")
        move()
        breath()
        action()
    }
}


class Bird(animalType: String): Animal(animalType)
{
    override var animalAction: String = ""

    override fun move() {
        println("${this.animalType} передвигается по воздуху с помощью крыльев")
    }

    override fun breath()
    {
        println("${this.animalType} дышит с помощью носовых полостей в клюве")
    }

    override fun action()
    {
        println("${this.animalType} умеет ${this.animalAction}")
    }

    override fun info()
    {
        println("${this.animalType} - птица")
        move()
        breath()
        action()
    }
}


class Fish(animalType: String): Animal(animalType)
{
    override var animalAction: String = ""

    override fun move() {
        println("${this.animalType} передвигается под водой с помощью плавников и хвоста")
    }

    override fun breath()
    {
        println("${this.animalType} дышит под водой с помощью жабр")
    }

    override fun action()
    {
        println("${this.animalType} умеет ${this.animalAction}")
    }

    override fun info()
    {
        println("${this.animalType} - рыба")
        move()
        breath()
        action()
    }
}


fun main(args: Array<String>)
{
    val lion = Beast("Лев")
    lion.animalAction = "рычать"

    val panda = Beast("Панда")
    panda.animalAction = "лазать по деревьям"

    val hare = Beast("Заяц")
    hare.animalAction = "быстро бегать"

    val eagle = Bird("Орел")
    eagle.animalAction = "парить над землей"

    val swan = Bird("Лебедь")
    swan.animalAction = "летать на большие расстояния"

    val pelican = Bird("Пеликан")
    pelican.animalAction = "ловить клювом рыбу"

    val shark = Fish("Акула")
    shark.animalAction = "быстро плавать"

    val carp = Fish("Карп")
    carp.animalAction = "метать икру"

    val seahorse = Fish("Рыба-хамелеон")
    seahorse.animalAction = "менять окрас под окружающую среду"


    val animals = listOf<Animal>(lion, panda, hare, eagle, swan, pelican, shark, carp, seahorse)

    println("Список животных в зоопарке: ")
    for (i in animals.indices)
    {
        println("${i+1}: ${animals[i].animalType}")
    }

    print("\nВыберите номер животного для вывода информации о нем: ")
    var animalNumber: Int = readln().toInt()

    while (animalNumber < 1 || animalNumber > animals.size)
    {
        print("Такого номера нет в списке животных, введите новый: ")
        animalNumber = readln().toInt()
    }

    println(animals[animalNumber-1].info())
}