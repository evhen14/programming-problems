package object P14 {
    def duplicate[A](list: List[A]): List[A] = {
        list.foldRight(List[A]())((a, curr) => a::a::curr)
    }
}