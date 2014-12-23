def kthElem[A](xs: List[A], n: Int): A = xs match {
  case h :: t if n == 1 => h
  case _ :: t => kthElem(t, n - 1)
  case Nil => throw new NoSuchElementException
}

println(kthElem(List(1,2,3,4,5), 3))
