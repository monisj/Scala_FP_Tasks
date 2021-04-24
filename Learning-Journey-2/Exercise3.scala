object Exercise3{
    def main(args: Array[String]): Unit = {
        import Absoulte._
         //def absOptional: (Option[Int]) => Option[Int] = abs(Math.abs)
         //println(s"Absolute Value of -17 = ${absOptional(Some(-17))}")  //Way to Calculate Absoulte with Option Type

         //Another Way is to get option type 
         val fruits = Map (1->"Bananas",2->"Orange",3->"Watermelon")
         println(s"Fruit Two = ${fruitsoption(Some(2))}")
         val name = fruitsoption(Some(2))
         println(s"Fruit Name = ${fruits(2)}")         
    }
object Absoulte {
    //def abs[A, B](f: A => B): Option[A] => Option[B] = _.map(f)
    def fruitsoption(x: Option[Int]) = x match{
        case Some(s) => s
        case None => None
    }
}
}
