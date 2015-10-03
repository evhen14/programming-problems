def slice[A](s: Int, e: Int, list: List[A]):List[A] = list.drop(s).take(e-s)

println(slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
