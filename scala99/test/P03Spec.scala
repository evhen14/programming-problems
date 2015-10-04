import org.scalatest._
import Matchers._
import P03._

class P03Spec extends WordSpec {
  "Problem 3" when {
    "given a list of elements and nth index 2" should {
      "produce nth element of the list" in {
        val list = List(1, 2, 3, 4)
	P03.nth(2, list) should be (3)
      }
    }
    "given a list of elements and nth index 0" should {
      "produce nth element of the list" in {
        val list = List(1, 2, 3, 4)
	P03.nth(0, list) should be (1)
      }
    }
    "given a list of elements and nth index 3" should {
      "produce nth element of the list" in {
        val list = List(1, 2, 3, 4)
	P03.nth(3, list) should be (4)
      }
    }
    "given a list with one element and nth index larger than size" should {
      "product NoSuchElementException" in {
        intercept[NoSuchElementException] {
	  val list = List(1)
	  P03.nth(1, list)
	}
      }
    }
    "given an empty list of elements" should {
      "product NoSuchElementException" in {
        intercept[NoSuchElementException] {
	  val list = List()
	  P03.nth(0, list)
	}
      }
    }
  } 
}
