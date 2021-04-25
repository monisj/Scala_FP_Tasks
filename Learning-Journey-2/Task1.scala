import scala.util.Random._

object Task1{
    def main(args: Array[String]): Unit = { 
        val List1: List[Int] = List.fill(15)(50+scala.util.Random.nextInt(500-50)+1)
        println(s"List of Random Number = ${List1.mkString(" ")}")
        val List2: List[Int] = List1.map(x1 => if(prime(2,x1))x1 else 0).filter(_>0).sorted
        val prime_no = (List2.map(x2 => List1.indexOf(x2)) zip List2).toMap
        println(s"Prime Numbers =${prime_no}")
    }
    def prime(n:Int, max:Int):Boolean = {
        if(n== max) true
        else if (max % n == 0) false
        else prime(n+1,max)
    }
}