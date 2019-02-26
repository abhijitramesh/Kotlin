fun main(args: Array<String>){
val TrueBoolean = true //inferences the value to be boolean
val FalseBoolean = false
println(TrueBoolean)
println(FalseBoolean)

/*
  * Boolean values are used to cheak some conditions like
  * disjunction ||
  * conjunction &&
  * negation !
*/

val x = 1
val y = 2
val z = 3
val m = 4

val n = x < y && m > z
println(n)

val b = x < z || m < z
println(b)

val c = !(x < z || m < z)
println(c)





}
