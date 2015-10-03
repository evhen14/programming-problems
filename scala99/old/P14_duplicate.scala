def duplicate[A](list: List[A]): List[A] = list match {
  case h::t => h::h::duplicate(t)
  case Nil => Nil
}

def duplicate2[A](list: List[A]): List[A] = list flatMap {x => List(x, x)}


println(duplicate(List('a, 'b, 'c, 'c, 'd)))
println(duplicate2(List('a, 'b, 'c, 'c, 'd)))
