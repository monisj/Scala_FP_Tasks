import scala.util.Random._
import _root_.scala.annotation.tailrec

object Task4{ 
    def main(args: Array[String]): Unit = {
        val array = Array.fill(100)(scala.util.Random.nextInt(100))
        def tail_recursion(array:Array[Int],index:Int,out_array:Array[Int]):Array[Int] = {
            if(index == array.size) out_array
            else if(array(index) % 2 == 0) tail_recursion(array,index+1,out_array:+array(index))
            else tail_recursion(array,index+1,out_array)
        } // Using Tail Recursion to calculate even Numbers
        println(s"Array =${array.mkString(",")}")
        println(s"Tail Even = ${tail_recursion(array,0,Array()).mkString(",")}")
        
        println(s"Even Values = ${array.count(_%2 == 0)}") //Using Higher Order Function
        //Counting the Number of Values in the even array
    }
}