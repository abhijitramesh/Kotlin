fun main(args: Array<String>){


/*
  The null Safty can be bypassed using !!
  This will result in a NullPointerExeotion
*/


val v: String? = null
val length: Int = v!!.length
println(length)

}
