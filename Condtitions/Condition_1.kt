fun main(args: Array<String>){

val Array = arrayOf(1,2,3,"four","five","six")

for((index, value) in Array.withIndex()){
if(value is String){
print("$value is String in index $index\n")
}
if(value is Int)
print("$value is Int in index $index\n")
}



}
