import org.scalatest._
import Matchers._
import P04._

class P04Spec extends WordSpec {
  "Problem 4" when {
    "given a list of 4 elements" should {
      "produce length 4" in {
        val list = List(1, 2, 3, 4)
	P04.length(list) should be (4)
      }
    }
    "given a list of 1 elements" should {
      "produce length 1" in {
        val list = List(4)
	P04.length(list) should be (1)
      }
    }
    "given an empty list of elements" should {
      "produce length 0" in {
        val list = List()
	P04.length(list) should be (0)
      }
    }
  } 
}
