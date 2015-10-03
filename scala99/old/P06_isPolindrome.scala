def isPolindrome[A](list: List[A]): Boolean = {
  list == list.reverse
}

println(isPolindrome(List(1,2,3,3,2,1)))
println(isPolindrome(List(1,2,3,2,1)))
println(isPolindrome(List(1,2,3,4, 2,1)))
