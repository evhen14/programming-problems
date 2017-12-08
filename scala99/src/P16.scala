package object P16 {
    def drop[A](n: Int, list: List[A]): List[A] = {
        if (n <= 0) {
            throw new UnsupportedOperationException("n must be 1 or greater")
        }
        def fun(cnt: Int, acc: List[A], l: List[A]): List[A] = {
            l match {
                case x::xs if cnt == n =>
                    fun(1, acc, xs)
                case x::xs =>
                    fun(cnt + 1, x::acc, xs)
                case Nil => acc
            }
        }
        fun(1, List[A](), list).reverse
    }
}