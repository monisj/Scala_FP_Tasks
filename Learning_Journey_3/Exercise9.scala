object Exercise9{
    def main(args: Array[String]):Unit =  {


    def implcit(a:Any):Unit = {
        implicit def any_input(a:Any):String = {
            return a.toString()
            
        }
        val cat = any_input(a)
        println(s"Number converted to string = ${cat}")
}
        implcit(36)}
}