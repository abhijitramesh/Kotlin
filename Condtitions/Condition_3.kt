fun main(args: Array<String>){
/*
When is used insted of traditional switch
This is more concise and powerful than switch
*/
println("Enter a number")

val number = readLine()!!
when (number.toInt()){
    1 -> println("The number is 1")
    2 -> println("The number is 2")
    3 -> println("The number is 3")
    else -> println("The number is not 1 2 or 3")
}


}
