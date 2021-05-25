object Exercise7{
    def main(args: Array[String]):Unit =  {
    class Add(){
        def apply(x:List[Int])=x.reduce((x,y) => x+y)
    }
    val adder_list = new Add()
    println(s"${adder_list(List(1,2,3))}")
}
}