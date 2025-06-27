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
Operator 	Name 	Description 	Example 	Try it
+ 	Addition 	Adds together two values 	x + y 	
- 	Subtraction 	Subtracts one value from another 	x - y 	
* 	Multiplication 	Multiplies two values 	x * y 	
/ 	Division 	Divides one value from another 	x / y 	
% 	Modulus 	Returns the division remainder 	x % y 	
++ 	Increment 	Increases the value by 1 	++x 	
-- 	Decrement 	Decreases the value by 1 	--x 	
Kotlin Assignment Operators

Assignment operators are used to assign values to variables.

In the example below, we use the assignment operator (=) to assign the value 10 to a variable called x:
Example

var x = 10

The addition assignment operator (+=) adds a value to a variable:
Example

var x = 10
x += 5

A list of all assignment operators:
Operator 	Example 	Same As 	Try it
= 	x = 5 	x = 5 	
+= 	x += 3 	x = x + 3 	
-= 	x -= 3 	x = x - 3 	
*= 	x *= 3 	x = x * 3 	
/= 	x /= 3 	x = x / 3 	
%= 	x %= 3 	x = x % 3 	
Kotlin Comparison Operators

Comparison operators are used to compare two values, and returns a Boolean value: either true or false.
Operator 	Name 	Example 	Try it
== 	Equal to 	x == y 	
!= 	Not equal 	x != y 	
> 	Greater than 	x > y 	
< 	Less than 	x < y 	
>= 	Greater than or equal to 	x >= y 	
<= 	Less than or equal to 	x <= y 	

You will learn much more about Booleans in the Boolean chapter and Conditions.
Kotlin Logical Operators

Logical operators are used to determine the logic between variables or values:
Operator 	Name 	Description 	Example 	Try it
&&  	Logical and 	Returns true if both statements are true 	x < 5 &&  x < 10 	
||  	Logical or 	Returns true if one of the statements is true 	x < 5 || x < 4 	
! 	Logical not 	Reverse the result, returns false if the result is true 	! (not) is used to reverse the result of a condition.   
 */

fun main() {
    // Arithmetic Operators
    val a = 10
    val b = 3

    println("a + b = ${a + b}") // Addition
    println("a - b = ${a - b}") // Subtraction
    println("a * b = ${a * b}") // Multiplication
    println("a / b = ${a / b}") // Division (integer division)
    println("a % b = ${a % b}") // Modulus

    var c = 5
    println("c before increment: $c")
    c++
    println("c after increment: $c")
    c--
    println("c after decrement: $c")

    println()

    // Assignment Operators
    var x = 10
    println("x = $x")
    x += 5
    println("x += 5 -> $x")
    x -= 3
    println("x -= 3 -> $x")
    x *= 2
    println("x *= 2 -> $x")
    x /= 4
    println("x /= 4 -> $x")
    x %= 3
    println("x %= 3 -> $x")

    println()

    // Comparison Operators
    val y = 7
    println("a == y: ${a == y}")
    println("a != y: ${a != y}")
    println("a > y: ${a > y}")
    println("a < y: ${a < y}")
    println("a >= y: ${a >= y}")
    println("a <= y: ${a <= y}")

    println()

    // Logical Operators
    val cond1 = a > b
    val cond2 = y < b
    println("cond1 (a > b): $cond1")
    println("cond2 (y < b): $cond2")
    println("cond1 && cond2: ${cond1 && cond2}")
    println("cond1 || cond2: ${cond1 || cond2}")
}