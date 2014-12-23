def compress[A](list: List[A]): List[A] = {
  def go(xs: List[A], curr: A): List[A] = xs match {
    case h :: t if curr != h => h :: go(t, h)
    case h :: t => go(t, h)
    case Nil => Nil
  }
  list match {
    case Nil => Nil
    case h :: t => h :: go(t, h)
  }
}

def compressTail[A](list: List[A]): List[A] = list match {
  case Nil => Nil
  case h :: t => t.foldLeft((h, List[A](h)))((b, a) => if (a == b._1) b else (a, a::b._2 ))._2.reverse
}

println(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e, 'a)))
println(compressTail(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e, 'a)))
println(compressTail(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
