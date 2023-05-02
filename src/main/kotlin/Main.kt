fun main() {

    userName("Lynet",19,"Kenyan")
    println( addNums(4,5,6,7))
    println( findAvarage(2,4,4,10,8))
    personRecords("Lynet",19,"0798023456","musembi@gmail.com",50.5,true)

}
//1. Create and invoke a function that takes in a users name, age, and nationality and prints out
//“Hello my name is ${name}, I am ${age} and I am from ${nationality}” e.g
//given “Lucy”, 23, and “Kenya” it will print out “Hello my name is Lucy, I am 23 years old and I
//am from Kenya” (2 points)

fun userName(name:String,age:Int,nationality:String){
    println("Hello my name is $name, I am $age years and I am from $nationality")
}
//2. Create and invoke a function that returns the sum of any given 4 numbers (3 points)
fun addNums(num1:Int,num2:Int,num3:Int,num4:Int):Int{
    var result = num1+num2+num3+num4
    return result
}
//3. Create and invoke a function that given any 5 numbers, it returns their average (2 points)
fun findAvarage(num1:Int,num2:Int,num3:Int,num4:Int,num5:Int):Int{
    var avg = (num1+num2+num3+num4+num5)/5
    return avg

}
//4. You are creating an app to capture a person’s records. Some of the data you will
//capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not. (3 points)

fun personRecords(fullName:String,age:Int,phoneNumber:String,email:String,weight:Double,citizen:Boolean){
    println("$fullName")
    println("$age")
    println("$phoneNumber")
    println("$email")
    println("$weight")
    println("$weight")
    println("$citizen")

}



