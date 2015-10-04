import org.scalatest._
import Matchers._
import P05._

class P05Spec extends WordSpec {
  "Problem 5" when {
    "given an empty list" should {
      "be a reverse to itself" in {
	reverse(List[Int]()) should be (List[Int]())
      }
    }
    "given a list of 1 element" should {
      "be a reverse to itself" in {
	reverse(List(1)) should be (List(1))
      }
    }
    "given a polindrome list of 3 element" should {
      "be a polindrome" in {
	val list = List(1, 2, 7)
	reverse(reverse(list)) should be (list)
      }
    }
  }
}
