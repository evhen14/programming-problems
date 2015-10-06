import org.scalatest._
import Matchers._
import P09._

class P09Spec extends WordSpec {
  "Problem 9" when {
    "given a list with consequent duplicates" should {
      "produce packed lists" in {
        P09.pack(List(1, 1, 2, 3, 3, 3, 4, 1, 1, 1, 1)) should be (List(List(1, 1), List(2), List(3, 3, 3), List(4), List(1, 1, 1, 1)))
        P09.pack2(List(1, 1, 2, 3, 3, 3, 4, 1, 1, 1, 1)) should be (List(List(1, 1), List(2), List(3, 3, 3), List(4), List(1, 1, 1, 1)))
        P09.pack3(List(1, 1, 2, 3, 3, 3, 4, 1, 1, 1, 1)) should be (List(List(1, 1), List(2), List(3, 3, 3), List(4), List(1, 1, 1, 1)))
      }
    }
    "given a list without consequent duplicates" should {
      "produce the list of single element lists" in {
        P09.pack(List(1, 2, 3, 4, 1)) should be (List(List(1), List(2), List(3), List(4), List(1)))
        P09.pack2(List(1, 2, 3, 4, 1)) should be (List(List(1), List(2), List(3), List(4), List(1)))
        P09.pack3(List(1, 2, 3, 4, 1)) should be (List(List(1), List(2), List(3), List(4), List(1)))
      }
    }
    "given an empty list" should {
      "produce an empty lists" in {
        P09.pack(List()) should be (List())
        P09.pack2(List()) should be (List())
        P09.pack3(List()) should be (List())
      }
    }
  }
}
