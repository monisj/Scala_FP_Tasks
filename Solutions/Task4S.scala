object Task4S {
  object Exercise {
    def join(J1: Option[String], J2: Option[String], J3: Option[String]) = for {
      s1 <- J1
      s2 <- J2
      s3 <- J3
    } yield s1 + s2 + s3
  }

  def main(args: Array[String]) {
    import Exercise._
    //Joins Check via Some
    println(join(Some("aa"), Some("bb"), Some("cc")) == Some("aabbcc"))
    println(join(Some("aa"), None, Some("cc")) == None)
    import EffectsLibrary._
    //Map check via Just
    println(map2(Just(1), Just(2))(_ + _) == Just(3))
    println(map2(Just(5), Just(7))(_ - _) == Just(10))
    println(map2(Just(5), Just(7))(_ * _) == Just(35))
    println(map2(Just(0), Just(2))(_ / _) == Just(2))

    println(sequence(List(Just(1), Just(2), Just(3), Just(4))) == Just(List(1, 2, 3, 4)))
    println(sequence(List(Just(1), Just(2), Empty, Just(4))) == Empty)

  }

  //ADDITIONAL
  object EffectsLibrary {

    sealed trait Maybe[+A] {
      def flatMap[B](f: A => Maybe[B]): Maybe[B] = this match { //Flatmap just and empty case assignments
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


    def map2[A, B, C](Map1: Maybe[A], Map2: Maybe[B])(f: (A, B) => C): Maybe[C] = for {
      a <- Map1
      b <- Map2
    } yield f(a, b) 

    def sequence[A](l: List[Maybe[A]]): Maybe[List[A]] =
      l.foldRight[Maybe[List[A]]](Just(List.empty[A]))((a, b) => map2(a, b)((a, b) => a :: b))

  }
}