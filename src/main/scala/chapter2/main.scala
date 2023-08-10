import scala.annotation.tailrec

// Exercise 2.1
def fib(n: Int): Int = {
  @tailrec
  def go(n: Int, acc1: Int, acc2: Int): Int = n match {
    case x if x <= 0 => acc2
    case x if x == 1 => acc1
    case _ => go(n-1, acc1+acc2, acc1)
  }

  go(n,1,0)
}

