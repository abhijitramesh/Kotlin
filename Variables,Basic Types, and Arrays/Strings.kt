fun main(args: Array<String>){



/*
* Kotlin has two types of Strings
* Single lined Strings
*/


val String1 = "This is a single lined String\n"
val String2 = "This is the next line of the above String"



/*
* and multilined String
*/




val String3 = """
This is a multilined String
pretty cool ayyyy
This is an Awesome feature of Kotlin"""

println(String1+String2)
println(String3)
/*
*Kotlin uses string interpolation
* This is a better method than String concatenation
* referencing numbers by $
*if you want to use the $ symbol use \$
*/
val number = 200
val Message = "Your bank account has a balance of $number"

println(Message)

/*
*to refer one Stiring from another String use ${}
*wrap the referencing string name inside {}
*/


val myname = "Abhijit"
val Message_2 = "This code was written by ${myname}"

//performing test condition inside a String

println(Message_2)
val age = 40
val Message_3 = "If you are $age you are ${if(age > 60) "old" else "young"}"

println(Message_3)

}
