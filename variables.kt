fun main() {
    // Immutable (read-only) variable
    val burgers = 5 // Int (cannot be changed)
    val coke = 5 // Int

    // Mutable variable
    var customers = 10 // Int (can be changed)
    customers = 8 // OK: var can be reassigned

    // Uncommenting the next line will cause a compile error: val cannot be reassigned
    // burgers = 3

    // Basic variable types
    val age: Int = 25
    val pi: Double = 3.14159
    val isKotlinFun: Boolean = true
    val grade: Char = 'A'
    val name: String = "Alice"
    val score: Float = 99.5f
    val bigNumber: Long = 123456789L
    val smallNumber: Short = 10
    val tinyNumber: Byte = 1

    // Printing variables
    println("Name: $name, Age: $age, Grade: $grade")
    println("Pi: $pi, Score: $score, Big Number: $bigNumber")
    println("Is Kotlin fun? $isKotlinFun")

    // Type inference (Kotlin figures out the type automatically)
    val city = "London" // String
    val temperature = 20 // Int

    // Constants (compile-time)
    // Use 'const val' at top-level or inside objects
    // Example:
    // const val COUNTRY = "India"

    // Basic string methods
    println("City in uppercase: ${city.toUpperCase()}")
    println("First letter of name: ${name[0]}")
    println("Name length: ${name.length}")
    println("Temperature in 5 years: ${temperature + 5}")

    // String interpolation
    println("Hello, my name is $name and I am $age years old.")

    // Arithmetic operations
    val sum = age + temperature
    val product = age * 2
    val division = age / 2
    val remainder = age % 3
    println("Sum: $sum, Product: $product, Division: $division, Remainder: $remainder")

    // Boolean logic
    val isAdult = age >= 18
    println("Is adult: $isAdult")

    // Nullability
    var nickname: String? = null // Nullable type (can be null)
    println("Nickname: $nickname")
    nickname = "Ally"
    println("Updated Nickname: $nickname")

    // --- More Example Implementations ---

    // Example 1: Swapping values using a temporary variable
    var a = 1
    var b = 2
    println("Before swap: a=$a, b=$b")
    val temp = a
    a = b
    b = temp
    println("After swap: a=$a, b=$b")

    // Example 2: Using arithmetic with different types
    val total: Double = age + pi
    println("Sum of age and pi: $total")

    // Example 3: Checking if a string is empty or not
    val emptyString = ""
    println("Is emptyString empty? ${emptyString.isEmpty()}")

    // Example 4: Safe call with nullable variable
    println("Nickname length (safe call): ${nickname?.length}")

    // Example 5: Using Boolean in if-else
    if (isAdult) {
        println("$name is an adult.")
    } else {
        println("$name is not an adult.")
    }
}

// Variables can be declared outside the main() function at the beginning of your program. Variables declared in this way are said to be declared at top level.
// It is recommended that you declare all variables as read-only (val) by default. Declare mutable variables (var) only if necessary.