//--------------------------------------------If Expression-----------------------------------------
/*if (condition) {
    // code block A to be executed if condition is true
} else {
    // code block B to be executed if condition is false
}*/
//-------------------------------------------------------------------------------
/*fun main(){
    val age:Int = 10

    if (age > 18) {
        print("Adult")
    } else {
        print("Minor")
    }
}*/
//Minor
//-------------------------------------------------------------------------
/*fun main(args: Array<String>) {
    val age:Int = 10

    val result = if (age > 18) {
        println("Given condition is true")
        "Adult"
    } else {
        println("Given condition is false")
        "Minor"
    }
    print("The value of result : ")
    println(result)
}*/
//Given condition is false
//The value of result : Minor
//--------------------------------------------------------
/*fun main(args: Array<String>) {

    val age:Int = 13

    val result = if (age > 19) {
        "Adult"
    } else if ( age > 12 && age  < 20 ){
        "Teen"
    } else {
        "Minor"
    }
    print("The value of result : ")
    println(result)
}*/
//The value of result : Teen
//------------------------------------------------------------------------------
/*fun main(args: Array<String>) {
    val age:Int = 20

    val result = if (age > 12) {
        if ( age > 12 && age  < 20 ){
            "Teen"
        }else{
            "Adult"
        }
    } else {
        "Minor"
    }
    print("The value of result : ")
    println(result)
}*/
//-The value of result : Adult
//-------------------------------------------------------------------------------------------
/*fun main(args: Array<String>) {

    var x = 20
    var y = 15
    var z = "Mango"

    val result = if (x > y ) {
        z = "Orange"
    } else {
        z = "Apple"
    }
    println("Value of result = $z")
}*/
//Orange
//------------------------------------------------------------------------------------------
//Write an if expression that checks if a given number is positive and prints "Positive" if true.
/*fun main(){
    var q =  2


    if (q >= 0){
println("Positive")
    }
    else{
        println("False")
    }
}*/
//-----------------------------------------------------------------
/*fun main(){
    var q =  3


    if (q % 2 == 0){
        println("Even")
    }
    else{
        println("Odd")
    }
}*/
//----------------------------------------------------
/*fun main() {
    val number1 = 10
    val number2 = 7
    if (number1 > number2) {
        println("The larger number is: $number1")
    } else if (number2 > number1) {
        println("The larger number is: $number2")
    } else {
        println("The numbers are equal.")
    }
}*/
//---------------------------------------------------------
/*
fun main(){
    val inputString = ""

    if (inputString.isEmpty()) {
        println("Empty")
    } else {
        println("Not empty")
    }
}*/
//-----------------------------------------------------------
/*
fun main() {
    val char = 'a'

    if (char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u') {
        println("Vowel")
    } else {
        println("Consonant")
    }
}*/
//-------------------------------When Expression---------------------------------
/*fun main(args: Array<String>) {
    val day = 2

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)
}*/
//--------------------------------------------
/*
fun main(args: Array<String>) {
    val day = 2

    when (day) {
        1, 2, 3, 4, 5 -> println("Weekday")
        else -> println("Weekend")
    }
}*/
//-----------------------------
/*
fun main(args: Array<String>) {
    val day = 2

    when (day) {
        in 1..5 -> println("Weekday")
        else -> println("Weekend")
    }
}*/
//---------------------------------
/*fun main(args: Array<String>) {
    val x = 20
    val y = 10
    val z = 10

    when (x) {
        (y+z) -> print("y + z = x = $x")
        else -> print("Condition is not satisfied")
    }
}*/
//------------------------------------------------
/*fun main(args: Array<String>) {
    val day = 2

    when (day) {
        1 -> {
            println("First day of the week")
            println("Monday")
        }
        2 -> {
            println("Second day of the week")
            println("Tuesday")
        }
        3 -> {
            println("Third day of the week")
            println("Wednesday")
        }
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day.")
    }
}*/
//----------------------------------------------------------------
/*fun main(args: Array<String>) {
    val day = 2

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)
}*/
//--------------------------------------------------------------------------------
/*fun main(){
    val grade = 'B'

    when (grade) {
        'A' -> println("Excellent")
        'B' -> println("Good")
        'C' -> println("Average")
        'D' -> println("Poor")
        'F' -> println("Fail")
        else -> println("Invalid grade.")
    }
}*/
//--------------------------------------------------------------

//-----------------------val number = -5
//
//when {
//    number > 0 -> println("Positive")
//    number < 0 -> println("Negative")
//    else -> println("Zero")
//}--------------------------------------------
/*fun main(){
    val month = 7

    when (month) {
        3, 4, 5 -> println("Spring")
        6, 7, 8 -> println("Summer")
        9, 10, 11 -> println("Autumn")
        12, 1, 2 -> println("Winter")
        else -> println("Invalid month")
    }
}*/
//---------------------------------------For Loop----------------
/*fun main(args: Array<String>) {
    for (item in 1..5) {
        println(item)
    }
}*/
//output : 1
//2
//3
//4
//5
//---------------------------------------------------
/*fun main(args: Array<String>) {
    for (item in 5 downTo 1 step 2) {
        println(item)
    }
}*/
//--------------------------------------------------
/*fun main(args: Array<String>) {
    var fruits = arrayOf("Orange", "Apple", "Mango", "Banana")

    for (item in fruits) {
        println(item)
    }
}*/
//output : Orange
//Apple
//Mango
//Banana
//------------------------------------------------
/*fun main(args: Array<String>) {
    var fruits = arrayOf("Orange", "Apple", "Mango", "Banana")

    for (index in fruits.indices) {
        println(fruits[index])
    }
}*/
//output : Orange
//Apple
//Mango
//Banana
//----------------------------------------[------------
/*
fun main(){
    var sum = 0

    for (number in 1..100) {
        sum += number
    }

    println("The sum of numbers from 1 to 100 is: $sum")
}*///The sum of numbers from 1 to 100 is: 5050
//----------------------------------------------------
/*fun main(){
    for (number in 1..200) {
        if (number % 2 == 0) {
            println(number)
        }
    }
}*/
//------------------------------------------------------