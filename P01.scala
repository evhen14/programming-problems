def last[A](xs: List[A]): A = xs match {
  case x :: Nil => x
  case _ :: t => last(t)
  case Nil => throw new NoSuchElementException
}

println(last(List(1,2,3,4,5)))
