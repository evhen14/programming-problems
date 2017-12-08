import org.scalatest._
import Matchers._

class P16Spec extends WordSpec {
    "Problem 16 - drop every nth element" when {
        "given empty list" should {
            "return empty list" in {
                P16.drop(2, List[Int]())
            }
        }
        "given one-element list and drop 2nd" should {
            "return the same list" in {
                P16.drop(2, List[Int](7))
            }
        }
        "given a list of elements" should {
            "remove every nth element in the list" in {
                P16.drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be (List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
            }
        }
    }
}