fun main(args: Array<String>){

//declaring an array using arrayOf() function
val Array1 = arrayOf(1,2,3,4)
for(element in Array1)
print(element)
println()





//declaring array with different datatype
val Array2 = arrayOf(1,2,3,4,"one","two","three","four",true)
for(element in Array2)
print(element)
println()





//specifying the type of Array
val Array3 = arrayOf<Int>(5,6,7,8,9)
for(element in Array3)
print(element)
println()

// Making an Array using Array() constructor and Lambda expressions


val Array4 = Array(5,{i -> i+1})
for(element in Array4)
print(element)



}
