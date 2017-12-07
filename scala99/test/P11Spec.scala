import org.scalatest._
import Matchers._

class P11Spec extends WordSpec {
    "Problem 11" when {
        "given empty list of elements" should {
            "product an empty list" in {
                P11.encode(List[Int]()) should be (List[Any]())
            }
        }

        "given one-element list" should {
            "produce the same one-element list" in { 
                P11.encode(List(4)) should be (List(4))
            }
        }

        "given consecutive duplicates of elements" should {
            "produce an encoding for the running-length with un-combined single elements" in { 
                P11.encode(List(1, 1, 2, 3, 3, 3, 4, 1, 1, 1, 1)) should be (List((2, 1), 2, (3, 3), 4, (4, 1)))
            }
        }
    }
}