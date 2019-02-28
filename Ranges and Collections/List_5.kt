fun main(args: Array<String>){

val Mutable_Car_List : MutableList<String> = mutableListOf<String>("BMW","mercedes","Lamborghini","Ferari")
Mutable_Car_List.remove("BMW")
Mutable_Car_List.removeAt(1)
Mutable_Car_List.set(0,"Mclaren")
Mutable_Car_List.add(0,"Maybach")

for(car in Mutable_Car_List){
println(car)
}
}
