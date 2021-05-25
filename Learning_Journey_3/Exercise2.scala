object Exercise2{
    def main(args: Array[String]):Unit =  {
        val a = List.range(-3,4)
        val a1=List_range(a)
        println(s"${a}")
        println(s"${a1}")
        println(s"${zip(a,a1)}")
    }

    def List_range(a:List[Int]): List[Int]= {
        val x = a.map(x=>x)
        //println(s"First List = ${a.mkString(" ")}")
        //println(s"Mapped List =${x.mkString(" ")}")
        return x
    }

    def zip(l1:List[Int],b1:List[Int])={
        val list_zip = l1.zip(b1).zipWithIndex
        println(s"Both Ziped List with index =${list_zip}")
        var sum=0
        l1.foreach(sum +=_)
        val x:Float = sum / l1.length
        println(s"Mean of List f(x) =${x}")
        
    }
}