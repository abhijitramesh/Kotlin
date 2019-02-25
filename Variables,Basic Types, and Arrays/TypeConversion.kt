fun main(args: Array<String>){
/*
 *Kotlin uses functions to perfrom casting of one datatype to other
 *examples of these functions are
 *toByte()
 *toInt()
 *toLong()
 *toDouble()
 *toChar()
 *toShort()
*/
val number= 19
val new_number : Long = number.toLong()
println(new_number)
/*
  * Here we have done casting of a smaller value to a datatype
  * of bigger value
  * The opposite is also possible but this will truncate the value to
  * fit the size hence it should be used only when needed
*/

val stringNumber = "101"
val intValueofstringNumber = stringNumber.toInt()

println(intValueofstringNumber)

/*
  * here the stringNumber is converted to the corrsponding
  * Integer value, this type of casting is possible in Kotlin
*/

}
