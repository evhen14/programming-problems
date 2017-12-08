package object P13 {
    def encodeDirect[A](list: List[A]): List[(Int, A)] = {
        def fun(curr: A, acc: List[(Int, A)], l: List[A]): List[(Int, A)] = {
            if (l.isEmpty) {
                acc
            }
            l match {
                case x::xs if x == curr =>
                    val newAcc: List[(Int, A)] = (acc.head._1 + 1, curr) :: acc.tail
                    fun(x, newAcc, xs)
                case x::xs =>
                    val newAcc: List[(Int, A)] = (1, x) :: acc
                    fun(x, newAcc, xs)
                case Nil => acc
            }
        }
        if (list.isEmpty) {
            List[(Int, A)]()
        } else {
            fun(list.head, List((1, list.head)), list.tail).reverse
        }
    }
}