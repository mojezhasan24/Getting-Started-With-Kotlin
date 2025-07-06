/*
Boolean in Kotlin

A Boolean is a basic data type used for logic and decision making.
It can only have two values: true or false.

Examples of Boolean logic:
- true or false
- on or off
- yes or no

But in Kotlin, only true or false are valid Boolean values.
*/

// 1. Boolean values
val isTrue: Boolean = true      // true value
val isFalse: Boolean = false    // false value

// 2. Boolean expressions (using comparison operators)
val isEqual: Boolean = (5 == 5)     // true, because 5 equals 5
val isNotEqual: Boolean = (5 != 3)  // true, because 5 is not equal to 3

// 3. Boolean operators
val andOperation: Boolean = (true && false) // false, both must be true for AND
val orOperation: Boolean = (true || false)  // true, at least one must be true for OR
val notOperation: Boolean = !true           // false, NOT inverts the value

fun main() {
    // 4. Using Boolean in conditions
    if (isTrue) {
        println("isTrue: Yes, the value is true")
    } else {
        println("isTrue: No, the value is false")
    }

    if (isEqual) {
        println("isEqual: 5 is equal to 5")
    } else {
        println("isEqual: 5 is not equal to 5")
    }

    if (andOperation) {
        println("andOperation: Both are true")
    } else {
        println("andOperation: At least one is false")
    }

    if (orOperation) {
        println("orOperation: At least one is true")
    } else {
        println("orOperation: Both are false")
    }

    if (notOperation) {
        println("notOperation: The value is true")
    } else {
        println("notOperation: The value is false")
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

    // 8. Boolean in control flow (using when)
    println("checkNumber(10): " + checkNumber(10))  // Positive
    println("checkNumber(-5): " + checkNumber(-5))  // Negative
    println("checkNumber(0): " + checkNumber(0))    // Zero
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

/*
Sample Output:

isTrue: Yes, the value is true
isEqual: 5 is equal to 5
andOperation: At least one is false
orOperation: At least one is true
notOperation: The value is false
Is 4 even? true
Is 5 odd? true
Boolean List: [true, false, true]
Boolean Map: {isTrue=true, isFalse=false}
User: Alice, Active: true
Alice is active
checkNumber(10): Positive
checkNumber(-5): Negative
checkNumber(0): Zero
*/
