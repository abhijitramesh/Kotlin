fun main(args: Array<String>){

/*
Here the Elvis Operator is used this is used to provide
Alternative Values if the variable being used is null
*/

val username = null

val name = username?: "No name"
print(name)
}
