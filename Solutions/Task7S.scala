import java.util.concurrent.TimeUnit
import scala.concurrent.{Await, Future}
import scala.util.{Try, Failure, Success}

object Task7S {
    import scala.concurrent.ExecutionContext.Implicits.global
    import scala.concurrent.duration._
  object Exercise {
    case class Driver(name: String)
    case class Car(model: String)
    val drivers = List(Driver("John"), Driver("Jane"), Driver("Kubica"),Driver("Linus"))
    val cars = List(Car("Polonez"), Car("Porsche"))
    def combinations(): List[(String, String)] = for {
      car <- cars
      drivers <- drivers
    } yield (drivers.name, car.model)
  }

  def main(args: Array[String]) {
    //println("\n\nExercises")
    import Exercise._
    println(s"Check=${combinations() == List(("John", "Polonez"), ("Jane", "Polonez"), ("Kubica", "Polonez"),("Linus","Polonez"),
      ("John", "Porsche"), ("Jane", "Porsche"), ("Kubica", "Porsche"),("Linus","Porsche"))}")
  }


}