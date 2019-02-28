fun main(args: Array<String>){
/*
A sorted set is created by creating a class called TreeSet
in the background
It maintains the order
It is also immutable
*/


val Sorted_Set: java.util.TreeSet<Int> = sortedSetOf(1,7,6,5,5,9,9,3,2,66,36)
println(Sorted_Set)

Sorted_Set.add(27)
println(Sorted_Set)

Sorted_Set.remove(5)
println(Sorted_Set)

Sorted_Set.clear()
println(Sorted_Set)
}
