fun main(args: Array<String>){

val array_list: ArrayList<String> = arrayListOf("Hello", "Nice","To","Meet","You")

var Mutable_array_list = array_list.toMutableList()
Mutable_array_list.add("Friend")
for (name in Mutable_array_list)
println(name)
}
