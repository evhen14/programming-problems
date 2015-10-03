def insertAt[T](el: T, pos: Int, list: List[T]): List[T] = {
  if (pos < 0) List()
  else if (pos >= list.size) list ::: (List(el))
  else if (list.isEmpty) List(el)
  else {(list take pos) ::: (el :: (list drop pos))}
}

println(insertAt('new, 0, List()))
println(insertAt('new, 1, List('a,'b)))
println(insertAt('new, 5, List('a,'b)))
