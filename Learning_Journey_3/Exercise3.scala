object Exercise3{
    def main(args: Array[String]):Unit =  {
        println(s"Euclidean Norm of Vector =  3a+4b+1c = ${euclidean(List(3,4,1))}")
    }
    def euclidean(vector:List[Int]):Double={
        val a =vector(0)
        val b = vector(1)
        val c = vector(2)
        return math.sqrt(math.pow(a,2)+math.pow(b,2)+math.pow(c,2))
    }
}