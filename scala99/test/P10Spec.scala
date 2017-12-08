import org.scalatest._
import Matchers._

class P10Spec extends WordSpec {
    "Problem 10" when {
        "given empty list of elements" should {
            "produce an empty list" in {
                P10.encode(List[Int]()) should be (List[(Int, Int)]())
            }
        }

        "given consecutive duplicates of elements" should {
            "produce an encoding for the running-length" in { 
                P10.encode(List(1, 1, 2, 3, 3, 3, 4, 1, 1, 1, 1)) should be (List((2, 1), (1, 2), (3, 3), (1, 4), (4, 1)))
            }
        }
    }
}