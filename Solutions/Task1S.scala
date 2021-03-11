object Task1S {
  object UserCredentails {
    case class User(User_id: Int, name: String, email: String)
  }
  object UsersDAO {
    import UserCredentails._
    private val database_user = Map(1 -> User(1, "User1", "User1@xyz.com"),2 -> User(2, "User2", "User2@xyz.com"))
    def find_User_or_null(User_id: Int): User = if (database_user.contains(User_id)) database_user(User_id) else null

    def findOrException(User_id: Int): User = if (database_user.contains(User_id)) database_user(User_id) else throw new RuntimeException("break computation!")
    
    def findOrDefault(User_id: Int, defaultUser: User): User = if (database_user.contains(User_id)) database_user(User_id) else defaultUser
    
    def findOption(User_id: Int): Option[User] = database_user.get(User_id)
  }

  object Conversions {
    import FrontEnd._
    import UserCredentails._
    def userToHTML(u: User): HTML = s"""<a href="mailto:${u.email}">${u.name}</a>"""
  }

  object FrontEnd {
    type HTML = String
    def displayPage(body: String): HTML =
      s"""<html>
              <body>$body</body>
      </html>"""
      
    def displayError(content: String): HTML =s"""<h1>THERE IS AN ERROR : $content</h1>"""
  }

  //Driver Code
  def main(args: Array[String]):Unit =  {
    import Conversions._
    import FrontEnd._

    //Part a (call user and find its exsistance on the code)
    val User_login = UsersDAO.findOption(1)
    if (User_login.isDefined) {
      println(s" User is defined = ${User_login.get}")
    } else { // If the User does not exsist
      println(s" ${displayError("The User with the given id is not Present !!")}")
    }

    ///part b (Converting User to HTML if he/she does not exsist)
    val userOrNull = UsersDAO.find_User_or_null(3)
    if (userOrNull != null) {
        println(s"${displayPage(userToHTML(userOrNull))}")
    } else {
        println(s"${displayError("The User with the given id is not Present !!")}")
    }


    //Part d (Login and check for exsisting user)
    val user = UsersDAO.findOrDefault(1, UserCredentails.User(1, "User1", "User1@xyz.com"))
    if (user.User_id == 1) {
      println(s"${displayPage(userToHTML(user))}")
    } else {  //Part e (Go to error page)
      println(s"${displayError("The User with the given id is not Present !!")}")
    }


  }
}