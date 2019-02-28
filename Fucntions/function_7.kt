fun printNumbers(First_number : Double, vararg second_number: Int, last_Float: Float)
{
println(First_number)
for(n in second_number){
println(n)}
println(last_Float)
}
fun main(args: Array<String>){

val intsArray: IntArray = intArrayOf(1,2,3,4)
printNumbers(3.3333,*intsArray,last_Float=4.4F)

}
