def duplicateN[A](n: Int, list: List[A]): List[A] = list flatMap {x => List.fill(n)(x)}
println(duplicateN(3, List('a, 'b, 'c, 'c, 'd)))
