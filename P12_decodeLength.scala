def decodeLen[A](list: List[(Int, A)]): List[A] = {
  if (list.isEmpty)
    List[A]()
  else List.fill(list.head._1)(list.head._2) ++ decodeLen(list.tail)
}

def decodeLenFlatMap[A](list: List[(Int, A)]): List[A] = {
  list flatMap {x => List.fill(x._1)(x._2)}
}


println(decodeLen(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))
println(decodeLenFlatMap(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))
