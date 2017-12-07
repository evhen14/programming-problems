package object P11
{
    def encode[A](list: List[A]): List[Any] = {
        val combined: List[List[A]] = P09.pack3(list)
        combined map {
            case x if x.length == 1 => x.head
            case x => (x.length, x.head)
        }
    }
}