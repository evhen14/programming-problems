package object P04 {
  def length[A](list: List[A]): Int = {
    def rec(lst: List[A], l: Int): Int = lst match {
      case Nil => l
      case x::xs => rec(xs, l + 1)
    }
    rec(list, 0)
  }
}

