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