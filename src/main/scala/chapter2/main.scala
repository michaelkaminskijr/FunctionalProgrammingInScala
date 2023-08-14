// Exercise 2.1
def fib(n: Int): Int = {
  @annotation.tailrec
  def go(n: Int, acc1: Int, acc2: Int): Int = n match {
    case x if x <= 0 => acc2
    case x if x == 1 => acc1
    case _ => go(n-1, acc1+acc2, acc1)
  }

  go(n,1,0)
}

//Exercise 2.2
def isSorted[A](as: Array[A], gt: (A, A) => Boolean): Boolean = {
  @annotation.tailrec
  def loop(n: Int): Boolean = {
    if n > as.length-2 then true
    else if !gt(as(n+1), as(n)) then false
    else loop(n+1)
  }
  loop(0)
}

val result1 = isSorted(Array(1, 2, 3), _ > _)
val result2 = isSorted(Array(1, 2, 1), _ > _)
val result3 = isSorted(Array(3, 2, 1), _ < _)
val result4 = isSorted(Array(1, 2, 3), _ < _)