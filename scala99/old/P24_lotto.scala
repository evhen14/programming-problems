import scala.util.Random

def removeAt[T](pos: Int, list: List[T]): (List[T], T) = {
  if (list.isEmpty || list.size <= pos) (list, list(0))
  else ((list take pos) ::: (list drop pos + 1), list(pos))
}

def randomSelect[T](num: Int, list: List[T]):List[T] = {
  if (num <=0 ) Nil
  else {
    val (rest, el) = removeAt(Random.nextInt(list.size), list)
    el :: randomSelect(num - 1, rest)
  }
}

def range(from: Int, end: Int): Seq[Int] = {
  (from to end).toList
}

def lotto(num: Int, rangeSize: Int): List[Int] = {
  val vals = range(1, rangeSize).toList
  randomSelect(num, vals)
}
println(lotto(6, 70))
