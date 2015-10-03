def length[A](list: List[A]): Int =  {
  def go(xs: List[A], currLen: Int):Int = xs match {
    case Nil => currLen
    case h :: t => go(t, currLen + 1)
  }
  go(list, 0)
}
println(length(List(1, 1, 2, 3, 5, 8)))
println(length(List(1, 1, 2, 3, 5, 8)) == 6)
