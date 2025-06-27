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

fun main() {
    // Arithmetic Operators
    val a = 10
    val b = 3

    println("Arithmetic Operators:")
    println("a = $a, b = $b")
    println("a + b = ${a + b}   // Addition")
    println("a - b = ${a - b}   // Subtraction")
    println("a * b = ${a * b}   // Multiplication")
    println("a / b = ${a / b}   // Division (integer division)")
    println("a % b = ${a % b}   // Modulus (remainder)")

    var c = 5
    println("\nc before increment: $c")
    c++
    println("c after increment (c++): $c")
    c--
    println("c after decrement (c--): $c")

    println("\n-----------------------------\n")

    // Assignment Operators
    var x = 10
    println("Assignment Operators:")
    println("Initial x = $x")
    x += 5
    println("x += 5  -> $x")
    x -= 3
    println("x -= 3  -> $x")
    x *= 2
    println("x *= 2  -> $x")
    x /= 4
    println("x /= 4  -> $x")
    x %= 3
    println("x %= 3  -> $x")

    println("\n-----------------------------\n")

    // Comparison Operators
    val y = 7
    println("Comparison Operators:")
    println("a = $a, y = $y")
    println("a == y: ${a == y}   // Equal to")
    println("a != y: ${a != y}   // Not equal to")
    println("a > y: ${a > y}     // Greater than")
    println("a < y: ${a < y}     // Less than")
    println("a >= y: ${a >= y}   // Greater than or equal to")
    println("a <= y: ${a <= y}   // Less than or equal to")

    println("\n-----------------------------\n")

    // Logical Operators
    val cond1 = a > b
    val cond2 = y < b
    println("Logical Operators:")
    println("cond1 (a > b): $cond1")
    println("cond2 (y < b): $cond2")
    println("cond1 && cond2: ${cond1 && cond2}   // Logical AND")
    println("cond1 || cond2: ${cond1 || cond2}   // Logical OR")
    println("!cond1: ${!cond1}                   // Logical NOT")
}