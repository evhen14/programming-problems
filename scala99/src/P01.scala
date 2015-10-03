package object P01 {
  def last(list: List[Int]): Int = list match {
    case x::Nil => x
    case x::xs => last(xs)
    case _ => throw new NoSuchElementException()
  }
}


