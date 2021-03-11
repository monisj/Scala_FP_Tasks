
import scala.io.Source
import scala.util.{Success, Failure, Try}
object Task5S {
  object Exercise {
    def stringToInt(s: String): Try[Int] = Try(s.toInt)
    def tryToAdd(S1: String, S2: String, S3: String, S4: String) = for {
      IN1 <- stringToInt(S1)
      IN2 <- stringToInt(S2)
      IN3 <- stringToInt(S3)
      IN4 <- stringToInt(S4)
    } yield (IN1 + IN2 + IN3 + IN4)

  }

  def main(args: Array[String]) {
    //Demonstration.demonstrate()

    import Exercise._
    println("\n\n   ---- EXERCISES ----  ")
    println(tryToAdd("1", "2", "3", "4") == Try(11))
    println(tryToAdd("1", "2", "Random Mumbo Jumbo", "4").isFailure == true)



    import EffectsLibrary._
    println(map2(Try(1), Try(2))(_ + _) == Try(3))
    println(sequence(List(Try(1), Try(2), Try(3))) == Try(List(1, 2, 3)))
    println(map3(Just(5), Just(5), Just(5))(_ + _ + _) == Just(15))
  }


  object EffectsLibrary {

    //ADDITIONAL
    def map2[A, B, C](t1: Try[A], t2: Try[B])(f: (A, B) => C): Try[C] = for {
      a <- t1
      b <- t2
    } yield f(a, b)

    def map2[A, B, C](m1: Maybe[A], m2: Maybe[B])(f: (A, B) => C): Maybe[C] = for {
      a <- m1
      b <- m2
    } yield f(a, b)

    def sequence[A](l: List[Maybe[A]]): Maybe[List[A]] =
      l.foldRight[Maybe[List[A]]](Just(List.empty[A]))((a, b) => map2(a, b)((a, b) => a :: b))

    def sequence[A](l: List[Try[A]]): Try[List[A]] =
      l.foldRight[Try[List[A]]](Try(List.empty[A]))((a, b) => map2(a, b)((a, b) => a :: b))


    def map3[A, B, C, D](m1: Maybe[A], m2: Maybe[B], m3: Maybe[C])(f: (A, B, C) => D): Maybe[D] = for {
      a <- m1
      b <- m2
      c <- m3
    } yield f(a, b, c)


    sealed trait Maybe[+A] {
      def flatMap[B](f: A => Maybe[B]): Maybe[B] = this match {
        case Just(v) => f(v)
        case Empty => Empty
      }

      def map[B](f: A => B): Maybe[B] = this match {
        case Just(v) => Just(f(v))
        case Empty => Empty
      }
    }

    case class Just[A](value: A) extends Maybe[A]

    case object Empty extends Maybe[Nothing]


    def lift[A, B](f: A => B): Option[A] => Option[B] = _ map f
    def liftMaybe[A, B](f: A => B): Maybe[A] => Maybe[B] = ma => ma map f
  }


}