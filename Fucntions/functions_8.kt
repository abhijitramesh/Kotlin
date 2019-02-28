fun getNumber(id : Int): Pair<Int, Int>{
var first_number = 0
var second_number = 0

if(id == 1){
first_number = 1
second_number = 2
}
return Pair(first_number,second_number)

}
fun main(args: Array<String>){

println(getNumber(1))
}
