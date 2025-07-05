/* Boolean in kotlin is a unique yet a datatype that is present in most of the programing languages and is the base of computer functioning and logic.
A booloean value is either:
1. true of false
2. on of off
3. yes or no
but technically speaking only implementations are true of false that a variable or constant can only have one value which is amongs these only.
  */
// Implementations
// 1. Boolean values
val isTrue: Boolean = true // A boolean variable that is true
val isFalse: Boolean = false // A boolean variable that is false
// 2. Boolean expressions
val isEqual: Boolean = (5 == 5) // A boolean expression that checks if 5 is equal to 5
val isNotEqual: Boolean = (5 != 3) // A boolean expression that checks if 5 is not equal to 3
// 3. Boolean operators
val andOperation: Boolean = (true && false) // A boolean expression that checks if true AND false is true
val orOperation: Boolean = (true || false) // A boolean expression that checks if true OR false is true
val notOperation: Boolean = !true // A boolean expression that negates true to false    
// 4. Boolean conditions
if (isTrue) {
    println("The value is true") // This block executes if isTrue is true
} else {
    println("The value is false") // This block executes if isTrue is false
}
if (isEqual) {
    println("5 is equal to 5") // This block executes if isEqual is true
} else {
    println("5 is not equal to 5") // This block executes if isEqual is false
}
if (andOperation) {
    println("Both conditions are true") // This block executes if andOperation is true
} else {
    println("At least one condition is false") // This block executes if andOperation is false
}
if (orOperation) {
    println("At least one condition is true") // This block executes if orOperation is true
} else {
    println("Both conditions are false") // This block executes if orOperation is false
}
if (notOperation) {
    println("The negation is true") // This block executes if notOperation is true
} else {
    println("The negation is false") // This block executes if notOperation is false
}   
// 5. Boolean functions
fun isEven(number: Int): Boolean {
    return number % 2 == 0 // Returns true if the number is even, false otherwise
}   
fun isOdd(number: Int): Boolean {
    return number % 2 != 0 // Returns true if the number is odd, false otherwise
}
fun main() {
    // Testing the boolean functions
    println("Is 4 even? ${isEven(4)}") // Should print true
    println("Is 5 odd? ${isOdd(5)}") // Should print true

    // Using boolean values in conditions
    if (isTrue) {
        println("This is a true statement.") // This will execute
    } else {
        println("This is a false statement.")
    }

    if (isFalse) {
        println("This is a false statement.")
    } else {
        println("This is a true statement.") // This will execute
    }
}
// 6. Boolean in collections
val booleanList: List<Boolean> = listOf(true, false, true, false) 
// A list of boolean values
val booleanSet: Set<Boolean> = setOf(true, false)
// A set of boolean values
val booleanMap: Map<String, Boolean> = mapOf("isTrue" to true, "isFalse" to false)
// A map with string keys and boolean values    
// 7. Boolean in data classes
data class User(val name: String, val isActive: Boolean) // A data class with a boolean property
fun main() {
    val user = User("Alice", true) // Creating an instance of User with isActive as true
    println("User: ${user.name}, Active: ${user.isActive}") // Accessing the boolean property
    if (user.isActive) {
        println("${user.name} is active") // This will execute if isActive is true
    } else {
        println("${user.name} is not active") // This will execute if isActive is false
    }
}
// 8. Boolean in control flow
fun checkNumber(number: Int): String {
    return if (number > 0) {
        "Positive" // Returns "Positive" if the number is greater than 0
    } else if (number < 0) {
        "Negative" // Returns "Negative" if the number is less than 0
    } else {
        "Zero" // Returns "Zero" if the number is equal to 0
    }
}
fun main() {
    println(checkNumber(10)) // Should print "Positive"
    println(checkNumber(-5)) // Should print "Negative"
    println(checkNumber(0)) // Should print "Zero"
    // Using boolean values in control flow
    if (isTrue) {
        println("This is a true condition.") // This will execute if isTrue is true
    } else {
        println("This is a false condition.") // This will execute if isTrue is false
    }
    if (isFalse) {
        println("This is a false condition.") // This will execute if isFalse is true
    } else {
        println("This is a true condition.") // This will execute if isFalse is false
    }
    // Using boolean expressions in control flow
    if (isEqual) {
        println("5 is equal to 5") // This will execute if isEqual is true
    } else {
        println("5 is not equal to 5") // This will execute if isEqual is false
    }
    if (isNotEqual) {
        println("5 is not equal to 3") // This will execute if isNotEqual is true
    } else {
        println("5 is equal to 3") // This will execute if isNotEqual is false
    }
    if (andOperation) {
        println("Both conditions are true") // This will execute if andOperation is true
    } else {
        println("At least one condition is false") // This will execute if andOperation is false
    }
    if (orOperation) {
        println("At least one condition is true") // This will execute if orOperation is true
    } else {
        println("Both conditions are false") // This will execute if orOperation is false
    }
    if (notOperation) {
        println("The negation is true") // This will execute if notOperation is true
    } else {
        println("The negation is false") // This will execute if notOperation is false
    }
