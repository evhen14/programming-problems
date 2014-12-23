def encodeDirect[A](list: List[A]):List[(Int,A)] = {
  if (list.isEmpty) List[(Int,A)]()
  else {
    val (packed, tail) = list span (_ == list.head)
    (packed.size, packed.head)::encodeDirect(tail)
  }
}
println(encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
