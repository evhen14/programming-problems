import org.scalatest._
import Matchers._
import P01._

class P01Spec extends WordSpec {
  "Problem 1" when {
    "given a list of elements" should {
      "produce last element of the list" in {
        val list = List(1, 2, 3, 4)
	P01.last(list) should be (4)
      }
    }
    "given an empty list of elements" should {
      "product NoSuchElementException" in {
        intercept[NoSuchElementException] {
	  val list = List()
	  P01.last(list)
	}
      }
    }
  } 
}
