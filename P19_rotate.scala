def rotate[A](n: Int, list: List[A]): List[A] = {
  if (n > 0)
    (list drop n) ::: (list take n)
  else
    (list drop list.size + n) ::: (list take list.size + n)
}
println(rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
println(rotate(0, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
println(rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
println(rotate(-9, rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))))
