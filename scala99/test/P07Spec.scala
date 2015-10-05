import org.scalatest._
import Matchers._
import P07._

class P07Spec extends WordSpec {
  "Problem 7" when {
    "given an empty list" should {
      "be an empty list" in {
	flatten(List[Int]()) should be (List[Int]())
      }
    }
    "given a list of 1 element" should {
      "be a list of 1 element" in {
	flatten(List(1)) should be (List(1))
      }
    }
    "given a nested list of 2 elements and one list of 1 element" should {
      "be a flattened list of three elements" in {
	flatten(List(1, List(4, 1))) should be (List(1, 4, 1))
      }
    }
  }
}

