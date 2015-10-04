import org.scalatest._
import Matchers._
import P02._

class P02Spec extends WordSpec {
  "Problem 2" when {
    "given a list of elements" should {
      "produce last but one element of the list" in {
        val list = List(1, 2, 3, 4)
	P02.penultimate(list) should be (3)
      }
    }
    "given a list with one element" should {
      "product NoSuchElementException" in {
        intercept[NoSuchElementException] {
	  val list = List(1)
	  P02.penultimate(list)
	}
      }
    }
    "given an empty list of elements" should {
      "product NoSuchElementException" in {
        intercept[NoSuchElementException] {
	  val list = List()
	  P02.penultimate(list)
	}
      }
    }
  } 
}
