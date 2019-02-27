fun main(args: Array<String>){



/*
A list is immutable
A list does not have a specific memory it can be appended with more elements during runtime
*/





var numbers: List<Int> = listOf(1,2,3,4,5)
var words: List<String> = listOf("one","two","three","four","five")

for(n in numbers){
println(n)}
for(word in words){
println(word)
}
}
