object Task2{
    def main(args: Array[String]): Unit = {
        def charArray(start:Int) : List[Char]={
            def recursion(char_List:List[Char],start:Int,end:Int):List[Char] ={
                if(start==end) char_List
                else recursion(start.toChar :: char_List,start+1,end)
            }
            //recursion(List(),start,123) //Uncomment to see the tail recursion running backwards
            recursion(List(),start,123).reverse  //As the letter z ends in 122 we take +1 as the function will return in -1 of itself
        }
    println(s"Characters Printer Using Tail Recursion = ${charArray(65)}")
    }
}