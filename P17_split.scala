def split[A](n: Int, list: List[A]): (List[A], List[A]) = {
  (list.take(n), list.drop(n))
}
println(split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
