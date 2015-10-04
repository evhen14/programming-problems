import org.scalatest._
import Matchers._
import P06._

class P06Spec extends WordSpec {
  "Problem 6" when {
    "given an empty list" should {
      "be a polindrome" in {
	isPolindrome(List[Int]()) should be (true)
      }
    }
    "given a list of 1 element" should {
      "be a polindrome" in {
	P06.isPolindrome(List(1)) should be (true)
      }
    }
    "given a polindrome list of 3 element" should {
      "be a polindrome" in {
	P06.isPolindrome(List(1, 4, 1)) should be (true)
      }
    }
    "given a polindrome list of 4 element" should {
      "be a polindrome" in {
	P06.isPolindrome(List(1, 5, 5, 1)) should be (true)
      }
    }
  }
}
