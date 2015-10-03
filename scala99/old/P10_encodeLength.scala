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

def encodeLengthSpan[A](list: List[A]): List[(Int, A)] = {
  packSpan(list).map(x => (x.size, x.head))
}

def encodeLengthGo[A](list: List[A]): List[(Int, A)] = {
  def go(xs: List[A], curRes:(Int, A), acc: List[(Int, A)]): List[(Int, A)] = {
    xs match {
      case h::t if curRes._2 == h => go(t, (curRes._1 + 1, curRes._2), acc)
      case h::t => go(t, (1, h), curRes::acc)
      case Nil => curRes::acc
    }
  }
  if (list.isEmpty)
    List[(Int, A)]()
  else go(list.tail, (1, list.head), List[(Int, A)]()).reverse
}

def encodeLengthTail[A](list: List[A]): List[(Int, A)] = {
  if (list.isEmpty)
    Nil
  else {
    val res = (list.takeWhile(_ == list.head).size, list.head)
    res :: encodeLengthTail(list.dropWhile(_ == list.head))
  }
}

def encodeLengthFold[A](list: List[A]): List[(Int, A)] = {
  if (list.isEmpty)
    Nil
  else {
    list.tail.foldLeft(List((1, list.head)))((res, a) => {
      if (res.head._2 == a) (res.head._1 + 1, a) :: res.tail
      else (1, a) :: res
    }).reverse
  }
}

println(encodeLengthSpan(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
println(encodeLengthGo(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
println(encodeLengthTail(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
println(encodeLengthFold(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
