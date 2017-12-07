package object P12
{
    import scala.reflect.ClassTag
    def decode[A](list: List[Any])(implicit tag: ClassTag[A]): List[A] = {
        list flatMap {
            case x: A => List[A](x)
            case (n: Int, x: A) => {
                List.fill(n)(x)
            }
        }
    }
}