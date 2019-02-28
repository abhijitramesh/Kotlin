fun main(args: Array<String>){

val currenciesMap : MutableMap<String,String> = mutableMapOf("rupees" to "India","Dollar" to "US","Pound" to "UK")
println(currenciesMap)
currenciesMap.put("Dirham","Dubai")
println(currenciesMap)
currenciesMap.remove("Dollar")
println(currenciesMap)
println(currenciesMap["rupees"])

}
