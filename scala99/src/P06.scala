package object P06 {
  def isPolindrome(list: List[Int]) = {
    P05.reverse(list) == list
  }
}
