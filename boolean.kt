/*
Boolean in Kotlin

A Boolean is a basic data type present in most programming languages. It is fundamental to computer logic and decision making.

A Boolean value can only be:
1. true or false
2. on or off
3. yes or no

But technically, only true or false are valid values for a Boolean variable or constant.
*/

// 1. Boolean values
val isTrue: Boolean = true      // A boolean variable that is true
val isFalse: Boolean = false    // A boolean variable that is false

// 2. Boolean expressions
val isEqual: Boolean = (5 == 5)     // true, because 5 is equal to 5
val isNotEqual: Boolean = (5 != 3)  // true, because 5 is not equal to 3

// 3. Boolean operators
val andOperation: Boolean = (true && false) // false, both must be true for AND
val orOperation: Boolean = (true || false)  // true, at least one must be true for OR
val notOperation: Boolean = !true           // false, NOT inverts the value

fun main() {
    // 4. Boolean in conditions
    if (isTrue) {
        println("The value is true")
    } else {
        println("The value is false")
    }

    if (isEqual) {
        println("5 is equal to 5")
    } else {
        println("5 is not equal to 5")
    }

    if (andOperation) {
        println("Both conditions are true")
    } else {
        println("At least one condition is false")
    }

    if (orOperation) {
        println("At least one condition is true")
    } else {
        println("Both conditions are false")
    }

    if (notOperation) {
        println("The negation is true")
    } else {
        println("The negation is false")
    }

    // 5. Boolean functions
    println("Is 4 even? ${isEven(4)}") // true
    println("Is 5 odd? ${isOdd(5)}")   // true

    // 6. Boolean in collections
    val booleanList = listOf(true, false, true)
    println("Boolean List: $booleanList")

    val booleanMap = mapOf("isTrue" to true, "isFalse" to false)
    println("Boolean Map: $booleanMap")

    // 7. Boolean in data classes
    val user = User("Alice", true)
    println("User: ${user.name}, Active: ${user.isActive}")
    if (user.isActive) {
        println("${user.name} is active")
    } else {
        println("${user.name} is not active")
    }

    // 8. Boolean in control flow
    println(checkNumber(10))  // Positive
    println(checkNumber(-5))  // Negative
    println(checkNumber(0))   // Zero
}

// Boolean functions
fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

fun isOdd(number: Int): Boolean {
    return number % 2 != 0
}

// Boolean in data classes
data class User(val name: String, val isActive: Boolean)

// Boolean in control flow
fun checkNumber(number: Int): String {
    return when {
        number > 0 -> "Positive"
        number < 0 -> "Negative"
        else -> "Zero"
    }
}
