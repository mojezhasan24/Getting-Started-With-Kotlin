/*
Kotlin Operators and Simple Calculator Example

This file demonstrates how to use basic operators in Kotlin by implementing a simple calculator.
You will also learn how to take input from users using the readLine() function.

To take input from the user:
- Use readLine() to read a line from standard input (as a String).
- Use .toInt(), .toDouble(), etc., to convert the input String to a number.
  Example:
      print("Enter a number: ")
      val num = readLine()!!.toInt() // !! asserts input is not null

Below is a simple calculator that performs addition, subtraction, multiplication, division, and modulus based on user input.
*/

fun main() {
    println("Simple Kotlin Calculator")
    print("Enter first number: ")
    val num1 = readLine()!!.toDouble() // Read and convert input to Double

    print("Enter operator (+, -, *, /, %): ")
    val operator = readLine()!! // Read operator as String

    print("Enter second number: ")
    val num2 = readLine()!!.toDouble() // Read and convert input to Double

    val result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else "Cannot divide by zero"
        "%" -> num1 % num2
        else -> "Invalid operator"
    }

    println("Result: $result")

    // Note: readLine() reads input as String. Use .toInt(), .toDouble(), etc., for conversion.
    // Always check for null or invalid input in production code.
}