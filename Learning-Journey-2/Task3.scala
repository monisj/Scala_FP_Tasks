object Task3{
    def main(args: Array[String]): Unit = {
        def sum_arrays(array_1:Array[Double],array_2:Array[Double]):Array[Double]={
            def tail_Recursion(array_1: Array[Double],array_2: Array[Double],index:Int,out_Array:Array[Double]):Array[Double]={
                if(index== array_1.size) out_Array
                else tail_Recursion(array_1,array_2,index+1,out_Array:+array_1(index)+array_2(index))
            }
            tail_Recursion(array_1,array_2,0,Array())
            }
        val array_1= Array[Double](2,4,6)
        val array_2= Array[Double](1,3,5)
        println(s"Array 1 =${array_1.mkString(" ")}")
        println(s"Array 2 =${array_2.mkString(" ")}")
        println(s"Sum of Array 1 & Array 2 =${sum_arrays(array_1,array_2).mkString(" ")}")
        }
    }
