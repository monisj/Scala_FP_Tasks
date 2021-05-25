object Exercise10{
    def main(args: Array[String]):Unit =  {


    def implcit(a:Any,b:Any):Unit = {
        implicit def any_input(a:Any,b:Any):String = {
            a.toString()
            b.toString()
        }
        val a_Seq : Any = (a + b.toString() ) :Any
        println(a_Seq)

}
        implcit(36,"Monis")}
}