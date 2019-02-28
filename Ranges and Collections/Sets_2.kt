fun main(args: Array<String>){
/*
Declaring a java HashSet
*/
val Hash_Set: java.util.HashSet<Int> = hashSetOf(1,2,3,4)
/*
Since this is a java HashSet we can add remove or clear elements
in this set using functions
*/

println(Hash_Set)
Hash_Set.add(5)
println(Hash_Set)
Hash_Set.remove(1)
println(Hash_Set)
Hash_Set.clear()
println(Hash_Set)



}
