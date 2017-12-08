import org.scalatest._
import Matchers._

class P15Spec extends WordSpec {
    "P15 duplicate list elements n times" when {
        "empty list" should {
            "produce empty list" in {
                P15.duplicateN(3, List[Int]()) should be (List[Int]())
            }
        }
        "one-element list" should {
            "produce duplicate of the same element in a list" in {
                P15.duplicateN(3, List('a)) should be (List('a, 'a, 'a))
                P15.duplicateN(4, List('a)) should be (List('a, 'a, 'a, 'a))
            }
        }
        "list of elements" should {
            "produce a duplicate of each element in a list" in {
                P15.duplicateN(3, List('a, 'b, 'c, 'c, 'd)) should be (List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd))
            }
        }
    }
}
