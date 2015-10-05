package object P08 {
  def compress(list: List[Int]) = {
    def rec(a: Int, lst: List[Int]): List[Int] = lst match {
      case Nil => Nil
      case x::xs if x == a => rec(a, xs)
      case x::xs => x::rec(x, xs) 
    }
    list match {
      case Nil => Nil
      case x::xs => x::rec(x, xs) 
    }
  }
  
  def compress2(list: List[Int]) = {
    list.foldRight(List[Int]())((h, res) => if (res.isEmpty || res.head != h) h::res else res)
  }
}
