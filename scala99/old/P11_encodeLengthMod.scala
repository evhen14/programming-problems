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

def encodeLengthModSpan[A](list: List[A]): List[Any] = {
  packSpan(list).map(x => {
    if (x.size == 1) x.head
    else (x.size, x.head)
  })
}

def encodeLengthModTail[A](list: List[A]): List[Any] = {
  if (list.isEmpty)
    Nil
  else {
    val res = (list.takeWhile(_ == list.head).size, list.head)
    if (res._1 == 1)
      res._2 :: encodeLengthModTail(list.dropWhile(_ == list.head))
    else
      res :: encodeLengthModTail(list.dropWhile(_ == list.head))
  }
}

def encodeLengthModGo[A](list: List[A]): List[Any] = {
  def go(xs: List[A], curRes:(Int, A), acc: List[Any]): List[Any] = {
    xs match {
      case h::t if curRes._2 == h => go(t, (curRes._1 + 1, curRes._2), acc)
      case h::t if curRes._1 == 1 => go(t, (1, h), curRes._2::acc)
      case h::t => go(t, (1, h), curRes::acc)
      case Nil if curRes._1 == 1 => curRes._2::acc
      case Nil => curRes::acc
    }
  }
  if (list.isEmpty)
    List[(Int, A)]()
  else go(list.tail, (1, list.head), List[(Int, A)]()).reverse
}

println(encodeLengthModTail(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
println(encodeLengthModGo(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
println(encodeLengthModSpan(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
