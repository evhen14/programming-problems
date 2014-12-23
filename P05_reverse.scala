def reverse[A](list: List[A]): List[A] = {
  def go(xs: List[A], rev: List[A]): List[A] = xs match {
    case Nil => rev
    case h :: t => go(t, h :: rev)
  }
  go(list, Nil)
}

def reverseFun[A](list: List[A]):List[A] = list.foldLeft(List[A]())((res, head) => {
    head :: res
  })

println(reverse(List(1,2,3,4,5)))
println(reverseFun(List(1,2,3,4,5)))
