package object P05 {
  def reverse[A](list: List[A]): List[A] = list match {
    case x::xs => reverse(xs) ++ List(x)
    case Nil => List()
  }
  
  def reverse2[A](list: List[A]): List[A] = list.foldLeft(List[A]())((res, x) => x :: res)
}
