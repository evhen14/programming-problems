def lastButOne[A](xs: List[A]): A = xs match {
  case h :: h2 :: Nil => h
  case _ :: t => lastButOne(t)
  case _ =>
}

println(lastButOne(List(1,2,3,4,5)))
