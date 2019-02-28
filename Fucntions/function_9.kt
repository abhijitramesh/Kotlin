fun getNumber(id : Int): Triple<Int, Int, Int>{
var first_number = 0
var second_number = 0
var third_number = 0

if(id == 1){
first_number = 1
second_number = 2
third_number = 3
}
return Triple(first_number,second_number,third_number)

}
fun main(args: Array<String>){

println(getNumber(1))
}
