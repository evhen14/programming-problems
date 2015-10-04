package object P03 {
  def nth[A](n:Int, list: List[A]): A = list match {
    case x::_ if n == 0 => x
    case _::xs => nth(n - 1, xs)
    case _ => throw new NoSuchElementException()
  }
}

