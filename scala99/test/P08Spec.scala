import org.scalatest._
import Matchers._
import P08._

class P08Spec extends WordSpec {
  "Problem 8" when {
    "given an empty list" should {
      "compressed list will be empty" in {
	compress(List[Int]()) should be (List[Int]())
      }
    }
    "given a list of 1 element" should {
      "be a list of 1 element" in {
	compress(List(1)) should be (List(1))
	compress2(List(1)) should be (List(1))
      }
    }
    "given a list of 3 identical elements" should {
      "be a list of 1 element" in {
	compress(List(1, 1, 1)) should be (List(1))
	compress2(List(1)) should be (List(1))
      }
    }
    "given a list of 4 element with duplicates in the middle" should {
      "a list of 3 elements" in {
	compress(List(1, 5, 5, 1)) should be (List(1, 5, 1))
	compress2(List(1, 5, 5, 1)) should be (List(1, 5, 1))
      }
    }
  }
}
