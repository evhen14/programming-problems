def drop[A](n: Int, list: List[A]): List[A] = {
  def go(i: Int, xs: List[A]): List[A] = xs match {
    case Nil => Nil
    case h::t if i == n => go(1, t)
    case h::t => h :: go(i + 1, t)
  }
  go(1, list)
}
println(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
