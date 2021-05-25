object Exercise4{
    def main(args: Array[String]):Unit =  {
        Li_11_2()
        Li_11_3()
        Li_11_4()
        Li_11_5()
    }
    
    def Li_11_2()={
        val uList = List(1,2,3,4,5)
        val uList_Twice = uList.map(_*2)
        println(s"List doubled ${uList_Twice}")

        def f(x:Int) = if (x>2) x*x else None
        val uList_Squared = uList.map(f(_) )
        println(s"List Squared = ${uList_Squared}")

    }

    def Li_11_3()={
        val uList:List[Int] = List(1,2,3,4,5)
        def g(v:Int)=List(v-1,v,v+1)
        val uList_Extended = uList.map(g(_))
        println(s"Extended List using map - ${uList_Extended}")


        val uList_Extended_flatmap = uList.flatMap(g(_))
        println(s"Extended List using flatMap - ${uList_Extended_flatmap}")
    }

    def Li_11_4()={
        val uList:List[Int] = List(1,2,3,4,5)
        def f(x:Int) = if (x>2) Some(x) else None
        val uList_selective = uList.map(f(_))
        println(s"Selective elements of List with .map - ${uList_selective}")

        val uList_selective_flatMap = uList.flatMap(f(_))
        println(s"Selective elements of List with .flatMap -${uList_selective_flatMap}")
    }

    def Li_11_5()={
        val uMap = Map ('a'->2,'b'->4,'c'->6)
        val uMap_mapValues = uMap.mapValues(_*2)
        println(s"Maped doubled values =${uMap_mapValues}")
    }

    
}