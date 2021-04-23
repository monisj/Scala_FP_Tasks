import scala.collection.mutable.Map._ // To import mutable Map function of Scala
import scala.collection.mutable.Set._ // To import mutable Set function of Scala

object Exercise2{
    def main(args: Array[String]):Unit = {
        var m1:Map[Int,Char] = Map()
        var colours = Map(1 ->"Red",2 -> "Green",3 -> "Blue")
        println(s"m1 map = ${colours.mkString("")}")
                                                        //Mutable Map
        colours = Map(1->"Green",2->"Blue",3->"Red")
        println(s"m1 map Changed Values = ${colours.mkString("")}")

        var s1: Set[Int] = Set()
        var s = Set(1,3,5,7)
        println(s"s1 Set = ${s.mkString(" ")}")
                                                        //Mutable Set
        s = Set(2,4,6,8)
        println(s"s1 Set Changed Values = ${s.mkString(" ")}")

    }
}