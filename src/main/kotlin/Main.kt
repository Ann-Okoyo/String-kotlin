fun main() {
   placename()
    println(information("Ann",20))
    println(length(""))
    println(namecheck("Ann"))




}


fun placename() {
    val place = "AkiraChix"
    println(place[0])
    println(place[2])
    println(place[3])
}
fun information(name:String,age:Int) : String {
    val info = "Hi my name is $name and I am $age"
    return info
}
fun length(detail: String):Int {
    val detail = "I am intelligent"
    return detail.length
}
fun namecheck(name:String){
    if (name == "Ann")
        println("Thats me!")
             else{
                 println("I do not know")
    }
}



























































