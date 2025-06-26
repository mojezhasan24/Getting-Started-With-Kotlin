/* 
Numbers: 1. integers, 2. floating-point numbers 3. scientific numbers

INTEGERS
1. BYTE : The Byte data type can store whole numbers from -128 to 127. This can be used instead of Int or other integer types to save memory when you are certain that the value will be within -128 and 127
2. SHORT: The Short data type can store whole numbers from -32768 to 32767
3. INT: The Int data type can store whole numbers from -2147483648 to 2147483647
4. LONG: This is used when int is too small to store a value can store whole numbers from -9223372036854775808 to 9223372036854775807

FLOATING-POINT NUMBERS
1. FLOAT
2. DOUBLE
   Floating point types represent numbers with a decimal, such as 9.99 or 3.14515.
   The Float and Double data types can store fractional numbers

SCIENTIFIC NUMBERS
A floating point number can also be a scientific number with an "e" or "E" to indicate the power of 10
*/

fun integers() {
    val myNum: Byte=100
    println(myNum)

    // val myNum1: Short=55555555 // error as value bigger than 32767
    // println(myNum1)

    val myNum2: Int= 123
    println(myNum2)

    val myNum3: Long= 93239L // optionally we can end long value by "L" 
    println(myNum3)

}

fun floating(){
    val myNum4: Float = 54.4F // you should end float values with "F".
    println(myNum4)

    val myNum5: Double = 54.4 
    println(myNum5)

}

fun scientific () {
    val myNum6: Float = 35E5F
    val myNum7: Double = 35e4 
    // "e" or "E" ton indicate the power of 10
    println(myNum6)
    println(myNum7)
}

/* BOOLEAN: takes onllt True and False 
 */

fun bool(){
    val isGitfun = true
    val isCodingfun = false
    println(isGitfun) // o/p = true
    println(isCodingfun) // o/p = false
}

/*
CHARACTERS: Char is a datatype that stores only single character. it must be sourrounded by single qoutes 
 */

fun characters() {
    val myGrade: Char = 'B' //cant store more than single character
    println(myGrade)
}

/*
STRINGS: teh String datatype is used to stora a sequence of character data which Char cant. it is sorrounded by double qoutes.
more on strings in upcomming pushes.
 */

fun str(){
    val myText: String = "hello, user"
    println(myText)
}

/*
ARRAYS: ar eused to store multiplealues in single variable, instead of declaring separate variables fo reach variable
more on arrays in upcomming pushes
 */

/*
TYPECONVERSION: process of converting the value of one datatype to another
 */

fun conv(){
    // val x: Int = 10
    // val y: Long = x
    // println(y) // Error:: Type mismatch

    val m: Int = 10
    val n: Long = m.toLong()
    println(n)
}

fun main(){
    integers()
    floating()
    scientific()
    bool()
    characters()
    str()
    conv()
}
/*
o/p

100
123
93239
54.4
54.4
3500000.0
350000.0
true
false
B
hello, user
10
*/
