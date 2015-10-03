def flatten[A](list:List[List[A]]): List[A] = list.foldLeft(List[A]())((b, a) => b ::: a)

println(flatten(List(List(1,2,3), List(11,12, 13), List(44,1,2))))
