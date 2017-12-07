package object P10
{
    def encode[A](list: List[A]): List[(Int, A)] = {
        val combined: List[List[A]] = P09.pack3(list)
        combined map { x => 
            (x.length, x.head)
        }
    }
}