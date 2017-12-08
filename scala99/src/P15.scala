package object P15 {
    def duplicateN[A](n: Int, list: List[A]): List[A] = {
        list.foldRight(List[A]())((a, curr) => List.fill(n)(a)++curr)
    }
}