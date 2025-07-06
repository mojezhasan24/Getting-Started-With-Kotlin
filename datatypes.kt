/* 
Kotlin Data Types

Kotlin is a statically typed language, which means every variable and constant has a data type known at compile time. Understanding data types is essential for writing safe and efficient code.

Numbers in Kotlin:
------------------
Kotlin supports several numeric types, divided into two main categories:

1. Integers (whole numbers, no decimal point)
2. Floating-point numbers (numbers with a decimal point)
3. Scientific numbers (floating-point numbers in scientific notation)

INTEGERS
--------
- Byte  : 8-bit, stores whole numbers from -128 to 127. Use when you need to save memory and the value fits this range.
- Short : 16-bit, stores whole numbers from -32768 to 32767.
- Int   : 32-bit, stores whole numbers from -2147483648 to 2147483647. Most commonly used integer type.
- Long  : 64-bit, stores whole numbers from -9223372036854775808 to 9223372036854775807. Use when Int is too small.

FLOATING-POINT NUMBERS
----------------------
- Float  : 32-bit, stores fractional numbers, ends with "F" (e.g., 3.14F). Less precise than Double.
- Double : 64-bit, stores fractional numbers with double precision (e.g., 3.14159). Default for floating-point numbers.

SCIENTIFIC NUMBERS
------------------
Floating point numbers can also be written in scientific notation using "e" or "E" to indicate the power of 10.
Example: 3.5e2 = 3.5 * 10^2 = 350.0

BOOLEAN
-------
- Stores only true or false values. Used for logic and conditions.

CHARACTERS
----------
- Char stores a single character, surrounded by single quotes (e.g., 'A'). Not the same as a String.

STRINGS
-------
- String stores a sequence of characters, surrounded by double quotes (e.g., "Hello"). Used for text.

ARRAYS
------
- Used to store multiple values in a single variable. Arrays can hold values of the same type. (More on arrays in upcoming lessons.)

TYPE CONVERSION
---------------
- Sometimes you need to convert a value from one data type to another (e.g., Int to Long, Double to Int). Kotlin provides methods like .toInt(), .toLong(), .toDouble(), etc.

Why Data Types Matter:
----------------------
- Data types help the compiler catch errors before your program runs.
- They help you use memory efficiently.
- They make your code easier to understand and maintain.

Let's see some examples of each data type in action!
*/

fun integers() {
    val myNum: Byte = 100
    println("Byte: $myNum")

    // val myNum1: Short = 55555555 // Error: value too large for Short
    // println(myNum1)

    val myNum2: Int = 123
    println("Int: $myNum2")

    val myNum3: Long = 93239L // Optionally end Long value with "L"
    println("Long: $myNum3")
}

fun floating() {
    val myNum4: Float = 54.4F // End float values with "F"
    println("Float: $myNum4")

    val myNum5: Double = 54.4
    println("Double: $myNum5")
}

fun scientific() {
    val myNum6: Float = 35E5F // 35 * 10^5 as Float
    val myNum7: Double = 35e4 // 35 * 10^4 as Double
    println("Scientific Float: $myNum6")
    println("Scientific Double: $myNum7")
}

fun bool() {
    val isGitfun = true
    val isCodingfun = false
    println("Boolean true: $isGitfun")
    println("Boolean false: $isCodingfun")
}

fun characters() {
    val myGrade: Char = 'B' // Only a single character
    println("Char: $myGrade")
}

fun str() {
    val myText: String = "hello, user"
    println("String: $myText")
}

fun conv() {
    // Type conversion example
    // val x: Int = 10
    // val y: Long = x // Error: Type mismatch

    val m: Int = 10
    val n: Long = m.toLong() // Convert Int to Long
    println("Converted Int to Long: $n")
}

fun main() {
    println("---- Integers ----")
    integers()
    println("---- Floating-point Numbers ----")
    floating()
    println("---- Scientific Numbers ----")
    scientific()
    println("---- Boolean ----")
    bool()
    println("---- Characters ----")
    characters()
    println("---- String ----")
    str()
    println("---- Type Conversion ----")
    conv()
}

/*
Sample Output:

---- Integers ----
Byte: 100
Int: 123
Long: 93239
---- Floating-point Numbers ----
Float: 54.4
Double: 54.4
---- Scientific Numbers ----
Scientific Float: 3500000.0
Scientific Double: 350000.0
---- Boolean ----
Boolean true: true
Boolean false: false
---- Characters ----
Char: B
---- String ----
String: hello, user
---- Type Conversion ----
Converted Int to Long: 10
*/
