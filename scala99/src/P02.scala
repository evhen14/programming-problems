package object P02 {
  def penultimate[A](list: List[A]): A = list match {
    case x::y::Nil => x
    case x::xs => penultimate(xs)
    case _ => throw new NoSuchElementException()
  }
}

