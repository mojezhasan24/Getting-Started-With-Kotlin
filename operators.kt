/*
Kotlin Operators

Operators are used to perform operations on variables and values.

The value is called an operand, while the operation (to be performed between the two operands) is defined by an operator:
Operand 	Operator 	Operand
100 	+ 	50

In the example below, the numbers 100 and 50 are operands, and the + sign is an operator:
Example

var x = 100 + 50

Although the + operator is often used to add together two values, like in the example above, it can also be used to add together a variable and a value, or a variable and a variable:
Example

var sum1 = 100 + 50       // 150 (100 + 50)
var sum2 = sum1 + 250     // 400 (150 + 250)
var sum3 = sum2 + sum2    // 800 (400 + 400)

Kotlin divides the operators into the following groups:

    Arithmetic operators
    Assignment operators
    Comparison operators
    Logical operators

Arithmetic Operators

Arithmetic operators are used to perform common mathematical operations.
+ 	Addition 	Adds together two values 	x + y 	
- 	Subtraction 	Subtracts one value from another 	x - y 	
* 	Multiplication 	Multiplies two values 	x * y 	
/ 	Division 	Divides one value from another 	x / y 	
% 	Modulus 	Returns the division remainder 	x % y 	
++ 	Increment 	Increases the value by 1 	++x 	
-- 	Decrement 	Decreases the value by 1 	--x 	

Assignment Operators

=   Assigns value to variable
+=  Adds and assigns
-=  Subtracts and assigns
*=  Multiplies and assigns
/=  Divides and assigns
%=  Modulus and assigns

Comparison Operators

==  Equal to
!=  Not equal to
>   Greater than
<   Less than
>=  Greater than or equal to
<=  Less than or equal to

Logical Operators

&&  Logical and
||  Logical or
!   Logical not
*/

/*
Simple Calculator Example

This program demonstrates how to take input from the user and use basic operators in Kotlin.

How to take input:
- Use readLine() to read a line from standard input (as a String).
- Use .toInt(), .toDouble(), etc., to convert the input String to a number.
  Example:
      print("Enter a number: ")
      val num = readLine()!!.toInt() // !! asserts input is not null

Below is a simple calculator that performs addition, subtraction, multiplication, division, and modulus based on user input.
*/

fun main() {
    println("Simple Kotlin Calculator")

    // Prompt the user to enter the first number.
    // readLine() reads input as a String from the user.
    // !! asserts that the input is not null.
    // .toDouble() converts the input String to a Double.
    print("Enter first number: ")
    val num1 = readLine()!!.toDouble()

    // Prompt the user to enter an operator.
    // The operator is read as a String (e.g., "+", "-", "*", "/", "%").
    print("Enter operator (+, -, *, /, %): ")
    val operator = readLine()!!

    // Prompt the user to enter the second number.
    // Again, input is read as a String and converted to Double.
    print("Enter second number: ")
    val num2 = readLine()!!.toDouble()

    // The 'when' expression checks the value of 'operator'
    // and performs the corresponding calculation.
    // If the operator is not recognized, it returns "Invalid operator".
    val result = when (operator) {
        "+" -> num1 + num2           // Addition
        "-" -> num1 - num2           // Subtraction
        "*" -> num1 * num2           // Multiplication
        "/" -> if (num2 != 0.0) num1 / num2 else "Cannot divide by zero" // Division with zero check
        "%" -> num1 % num2           // Modulus (remainder)
        else -> "Invalid operator"   // Handles invalid input
    }

    // Print the result of the calculation.
    println("Result: $result")

    // Note:
    // - readLine() always returns a String? (nullable String).
    // - The !! operator will throw an exception if the input is null.
    // - .toInt(), .toDouble(), etc., are used to convert input to numbers.
    // - In production code, always check for null or invalid input to avoid crashes.
}