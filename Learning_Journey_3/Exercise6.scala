object Exercise6{
    def main(args: Array[String]):Unit =  {
        case class Person(var firstname: String, lastname:String)
        var p1 = Person("Ahmed","Siddiqui")
        var p2 = p1.copy(lastname="Zaman") // This is a shalow copy of the case class Person
        //Scala case class only supports Shallow Copy
        println(s"${p1}")
        println(s"${p2}")

        //With a shallow copy, all values are still pointed at their original values, there isn't a second string created.
    }
}