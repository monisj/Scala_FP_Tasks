object Task5{
    def main(args: Array[String]): Unit = {
        def func(n:Int):Boolean = {
            if(n%2==0) true //Check if n is even 
            else false
        }
        val seq: Seq[Int] = Seq(1,2,3,4,5,6,7,8,9,10)
        val make_map = buildmap[Int,Boolean](seq,func)
        println(make_map)
    }
    def buildmap[A,B](data: Seq[A],f:A=>B):Map[A,B] = { //build map function
        return(data zip data.map(d=>f(d))).toMap
    }
}