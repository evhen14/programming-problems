import org.scalatest._
import Matchers._

class P12Spec extends WordSpec {
    "Problem 12 Run-Length Decoding" when {
        "given empty list of elements" should {
            "produce an empty list" in {
                val input: List[Any] = List()
                P12.decode(P11.encode(input)) should be (input)
            }
        }

        "given one-element list" should {
            "produce an one-element list" in {
                val input: List[Int] = List(5)
                P12.decode[Int](P11.encode(input)) should be (input)
            }
        }

        "given same-element duplicated encoded list" should {
            "produce an same-element list" in {
                val input: List[Int] = List(2, 2, 2)
                P12.decode[Int](P11.encode(input)) should be (input)
            }
        }

        "given encoded list of duplicates" should {
            "produce the original un-encoded list" in {
                val input: List[Int] = List(1, 1, 2, 3, 3, 3, 4, 1, 1, 1, 1)
                P12.decode[Int](P11.encode(input)) should be (input)
            }
        }
    }
}