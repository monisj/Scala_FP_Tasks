object Task2S {
    object MeetupDomain {
      case class User(id: Int, name: String, email: String)
    }
    object UsersDAO {
      import MeetupDomain._
      private val database = Map(1 -> User(1, "User1", "User1@xyz.com"),2 -> User(2, "User2", "User2@xyz.com"))
      def find(id: Int): Option[User] = database.get(id)
    }
    object Conversions {
      import FrontEnd._
      import MeetupDomain._
      def userToHTML(u: User): HTML = s"""<a href="mailto:${u.email}">${u.name}</a>"""
    }
    object FrontEnd {
      type HTML = String
      def displayPage(body: String): HTML =s"""<html>
      <body>$body</body>
      </html>"""
      def displayError(content: String): HTML =s"""<h1>THERE IS AN ERROR : $content</h1>"""
    }
  def main(args: Array[String]):Unit = {
    
    import Conversions._
    import FrontEnd._
    val html1 = UsersDAO.find(1).map(userToHTML).fold(displayError("The User with the given id is not Present !!"))(displayPage)
    val html2 = UsersDAO.find(2).map(userToHTML).fold(displayError("The User with the given id is not Present !!"))(displayPage)
    UsersDAO.find(2).map(userToHTML).map(displayPage).orElse(Some(displayError("The User with the given id is not Present !!"))).foreach(println)
    val html3 = UsersDAO.find(3).map(userToHTML).map(displayPage).getOrElse(displayError("The User with the given id is not Present !!"))
    println(s"[ID=1] : $html1")
    println(s"[ID=2] : $html2")
    println(s"[ID=3] : $html3")

    import EffectsLibrary._
    def absOptional: (Option[Int]) => Option[Int] = lift(Math.abs)
    println(s"  -- optional abs None :${absOptional(None)} ")
    println(s"  -- optional abs Some :${absOptional(Some(-7))} ")
    //println(map(Just(7))(_ * 2))
    //println(mapDifferentSignature((i: Int) => i * 2)(Just(7)))
    //println(liftMaybe(Math.abs)(Just(-7)))

  }
  object EffectsLibrary {
    def lift[A, B](f: A => B): Option[A] => Option[B] = _.map(f)

    sealed trait Maybe[+A]

    case class Just[A](value: A) extends Maybe[A]

    case object Empty extends Maybe[Nothing]

    def map[A, B](m: Maybe[A])(f: A => B): Maybe[B] = m match {
      case Just(v) => Just(f(v))
      case Empty => Empty
    }

    def mapDifferentSignature[A, B](f: A => B)(m: Maybe[A]): Maybe[B] = m match {
      case Just(v) => Just(f(v))
      case Empty => Empty
    }

    def liftMaybe[A, B](f: A => B): Maybe[A] => Maybe[B] = ma => map(ma)(f)

  }

}