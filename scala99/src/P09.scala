package object P09
{
  def pack[A](list: List[A]): List[List[A]] = {
    def rec(l: List[A], cur:A, nl: List[A], res: List[List[A]]): List[List[A]] = {
      l match {
        case Nil => nl::res
        case x::xs if x == cur =>  rec(xs, x, x::nl, res)
	case x::xs => rec(xs, x, List(x),  nl::res)
      }
    }
    if (list.isEmpty) List[List[A]]()
    else rec(list.tail, list.head, List(list.head), List[List[A]]()).reverse
  }
  
  def pack2[A](list: List[A]): List[List[A]] = {
    if (list.isEmpty) List[List[A]]()
    else {
      val inter = list.foldRight((List[A](), List[List[A]]()))((cur, res) => 
        if (res._1.isEmpty || res._1.head == cur) (cur::res._1, res._2)
	else (List(cur), res._1::res._2)
      )
      inter._1::inter._2
    }
  }
  
  def pack3[A](list: List[A]): List[List[A]] = {
    if (list.isEmpty) List[List[A]]()
    else {
      val (packed, remaining) = list.span{ _ == list.head}
      packed::pack3(remaining)
    }
  }
}
