fun main() {
    var myName= "Hello Celine"
    println(myName)
    var result= modulus(12,10)
    println(result)
var sum= add(30,40,20,15)
    println(sum)
    var inFact= "I am courageous"
    println(inFact)
}
fun name(myName:String):String {
    var myName= "Hello Celine"
    return myName

}
fun modulus(a: Int, b: Int):Int {
    var result= a%b
    return result
}
fun add(a:Int, b:Int, c:Int, d:Int) :Int{
    var sum=a+b+c+d
    return sum
}
fun interestFact(inFact:String) :String {
var inFact= "I am courageous"
    return inFact
}