def removeAt[T](pos: Int, list: List[T]): (List[T], T) = {
  if (list.isEmpty || list.size <= pos) (list, list(0))
  else ((list take pos) ::: (list drop pos + 1), list(pos))
}

println(removeAt(1, List(1,2,3,4)))
println(removeAt(4, List(1,2,3,4)))
