object Exercise1{
    def main(args: Array[String]):Unit =  {
        val a1=Array(1,2,3) 
        val s1=Array("Carrots","Bananas","Watermelon") // Simple Arrays
        println(s"Simple Array for Numbers = ${a1.mkString(" ")}")
        println(s"Simple Array for Strings = ${s1.mkString(" ")}") // the .mkString is to convert collection (containers) to string with space identifiers

        //Normally the datatype is identified but it can be forced manually
        val x1 = Array[Float](1.0123f,2.2431f,3.3123f)
        println(s"Array of Float values = ${x1.mkString("")}")

        //Specifically you can initialize the array size then append or add the items later on
        val y1 = new Array[String](4)
        y1(0)= "WaterMelon"
        y1(1)= "Grapes"
        y1(2)= "Apples"
        y1(3)= "Bananas"

        //To see all the values in an iterative manner
        for(i <- 0 until 4){
            println(s"Value of y1 at ${i} is ${y1(i)}")
        }

        println(s"Entire array = ${y1.mkString(" ")}")

    

        //Although Not Recommended you can create references of an array for future use
        //var z1 : Array[String] = _
       // println(s"Currently z1 array = ${z1.mkString(" ")}")
        //z1 = Array ("Baseball","Cricket","Hockey")
        //println(s"Now z1 array = ${z1.mkString(" ")}")

        //Now we have different ways to populate an Array
        val b1 = Array.range(1,10)
        val c1 = Array.range(0,10,2)
        val d1 = Array.fill(3)("Hello")
        val e1 = Array.tabulate(5)(n => n* n) // Here n = 0 at start then n= 1
        val f1 = List(1,2,3).toArray
        println(s"range=${b1.mkString(" ")}")
        println(s"range with steps=${c1.mkString(" ")}")
        println(s"Array fill with string=${d1.mkString(" ")}")
        println(s"tabulate with function basically multiplying=${e1.mkString("")}")
        println(s"Converting List to Array=${(f1.toArray).mkString(" ")}")
        println(s"Converting String to Array =${("World".toArray).mkString(" ")}")



    }
}
