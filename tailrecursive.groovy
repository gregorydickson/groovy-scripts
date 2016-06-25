import groovy.transform.TailRecursive

@TailRecursive
long sumUp(long number, long sum = 0) {
  if (number == 0)
      return sum;
  sumUp(number - 1, sum + number)
}
def sum = sumUp(1000, 0)
println(sum)