import org.scalatest._
import Matchers._

class P14Spec extends WordSpec {
    "P14 duplicate list elements" when {
        "empty list" should {
            "produce empty list" in {
                P14.duplicate(List[Int]()) should be (List[Int]())
            }
        }
        "one-element list" should {
            "produce duplicate of the same element in a list" in {
                P14.duplicate(List('a)) should be (List('a, 'a))
            }
        }
        "list of elements" should {
            "produce a duplicate of each element in a list" in {
                P14.duplicate(List('a, 'b, 'c, 'c, 'd)) should be (List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))
            }
        }
    }
}