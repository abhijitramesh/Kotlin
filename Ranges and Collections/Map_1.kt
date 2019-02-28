fun main(args: Array<String>){

val sample_map_collection: Map<Int,String> = mapOf(123 to "Kerala",456 to "TamilNadu",789 to "Karnataka")
println(sample_map_collection)

println(sample_map_collection[123])
println(sample_map_collection.size)
println(sample_map_collection.isEmpty())
println(sample_map_collection.containsKey(1))
println(sample_map_collection.containsValue("Kerala"))
println(sample_map_collection.get(456))
println(sample_map_collection.keys)
println(sample_map_collection.values)
/*
size: this property returns the size of map collection.
isEmpty(): returns true if the map is empty or false otherwise.
containsKey(key: K): returns true if the map contains the key in the argument.
containsValue(value: V): returns true if the map maps one or more keys to the value passed as an argument.
get(key: K): returns the value matching the given key or 'null' if none is found.
keys: this property returns an immutable Set of all the keys in the map.
values: returns an immutable Collection of all the values in the map.
*/





}
