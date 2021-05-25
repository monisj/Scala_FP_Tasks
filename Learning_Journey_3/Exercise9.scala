object Exercise9{
    def main(args: Array[String]):Unit =  {


    def implcit(a:Any,b:Any):Unit = {
        implicit def any_input(a:Any,b:Any):String = {
            return a.toString()+b.toString()
            
        }
        val cat = any_input(a,b)
        println(s"Number converted to string = ${cat}")
        println(s"Number converted to string = ${a}")
}
        implcit(36,46)}
}