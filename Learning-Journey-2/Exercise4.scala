object Exercise4{
    def main(args: Array[String]): Unit = {
        //Simple way to perform operation on an array with higher order function
        val num = Array(1,2,3,4,5,6)
        val func = (x:Int) => x*2
        val mult_two = num.map(func)
        print(s"Result = ${mult_two.mkString(" ")}")

        //But what if we beef this up
        def ArrayTester(cond: Boolean, Fruit: String): (String, String) => Array[String] = {
            val Fruit_no = if (cond) "Fruit1" else "Fruit2"
        (f1: String, f2: String) => Array(Fruit_no,Fruit,f1,f2)
        }

        val Fruit_Type = "WaterMelon"
        def getFruit = ArrayTester(cond=true, Fruit_Type)
        val f1 = "70% Water"
        val f2 = "30% Sugar"
        val fruit_get = getFruit(f1, f2)
        println(s"\n${fruit_get.mkString(" ")}")
    }
}