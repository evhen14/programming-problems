def packTail[A](list: List[A]): List[List[A]] = {
  def go(xs: List[A], el:A, currList: List[A], acc: List[List[A]]): List[List[A]] = xs match {
    case h :: t if h == el => go(t, el, h :: currList, acc)
    case h :: t => go(t, h, List(h), currList :: acc)
    case Nil => currList :: acc
  }
  (list match {
    case h :: t => go(list, h, List(), List[List[A]]())
    case Nil => Nil
  }).reverse
}

def packFold[A](list: List[A]): List[List[A]] = list match {
  case Nil => Nil
  case h :: t => t.foldLeft((h, List(h), List(List(h))))((b, a) => {
    if (b._1 == a) (a, a::b._2, if (b._3.isEmpty) List(a::b._2) else (a::b._2)::b._3.tail)
    else (a, List(a), List(a)::b._3)
  })._3.reverse
}

def packSpan[A](list: List[A]): List[List[A]] = {
  if (list.isEmpty) List(List())
  else {
    val (packed, rest) = list span {_ == list.head}
    rest match {
      case Nil => List(packed)
      case s => packed::packSpan(s)
    }
  }
}

println(packTail(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
println(packFold(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
println(packSpan(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
println(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e).span(a => a == 'a))
