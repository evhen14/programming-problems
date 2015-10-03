package object P01 {
  def last[A](list: List[A]): A = list match {
    case x::Nil => x
    case x::xs => last(xs)
    case _ => throw new NoSuchElementException()
  }
}


