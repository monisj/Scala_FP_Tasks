import scala.collection._


object Exercise1{
    def main(args: Array[String]):Unit =  {
        val a=3
        val b=5
        val c=7
        val li=List.range(-3,4)
        println(s"${quad(a,b,c)}")
        println(s"${(List_range(li))}")

    def quad(a:Int,b:Int,c:Int): Double ={
       return (-b+0.5*(math.pow(b,2)-(4*a*c)+4*a)/2*a) 
    }

    def List_range(a:List[Int]) {
        val x = a.map(_*1)
        println(s"First List = ${a.mkString(" ")}")
        println(s"Mapped List =${x.mkString(" ")}")
        
    }
    }

}