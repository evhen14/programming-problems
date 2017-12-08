import org.scalatest._
import Matchers._

class P13Spec extends WordSpec {
    "Problem 13 - direct encoding" when {
        "given empty list of elements" should {
            "produce an empty list" in {
                val input: List[Int] = List()
                P13.encodeDirect(input) should be (input)
            }
        }
        "given one-element list of elements" should {
            "produce encoded one-element list" in {
                val input: List[Int] = List(3)
                P13.encodeDirect(input) should be (List((1, 3)))
            }
        }
        "given duplicated list" should {
            "produce encoded list" in {
                val input: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
                P13.encodeDirect(input) should be (List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
            }
        }
    }
}