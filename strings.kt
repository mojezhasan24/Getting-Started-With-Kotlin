fun main() {
    val name = "John" // String variable
    val age = 30 // Integer variable
    val height = 5.9 // Double variable

    // String interpolation
    println("My name is $name, I am $age years old, and my height is $height feet.")//formatting string with variables

    // String concatenation
    println("Hello, " + name + "! You are " + age + " years old.")

    // Multiline string
    val multilineString = """
        This is a multiline string.
        It can span multiple lines.
        Useful for longer text.
    """.trimIndent() // trimIndent() removes the leading whitespace from each line

    println(multilineString)

    // String length
    println("Length of name: ${name.length}") // Using string template to get length

    // String comparison
    val anotherName = "John"
    if (name == anotherName) {  // Using == for value comparison and if is a control flow statement
        println("Names are equal.")
    } else { // else is a control flow statement
        println("Names are not equal.")
    }

    // String to uppercase and lowercase
    println("Uppercase name: ${name.toUpperCase()}") // Using string template to convert to uppercase
    println("Lowercase name: ${name.toLowerCase()}") // Using string template to convert to lowercase

    // String trimming
    val paddedString = "   Hello, World!   "
    println("Trimmed string: ${paddedString.trim()}") // Using string template to trim whitespace

    // String replacement
    val originalString = "Hello, John!"
    val replacedString = originalString.replace("John", "Alice") // Replacing "John" with "Alice"
    println("Replaced string: $replacedString") // Using string template to display replaced string

    // String splitting
    val csv = "apple,banana,cherry"
    val fruits = csv.split(",") // Splitting the string by comma
    println("Fruits: $fruits") // Using string template to display the list of fruits

    // String indexing
    val firstChar = name[0] // Accessing the first character of the string
    println("First character of name: $firstChar") // Using string template to display the first character

    // String substring
    val substring = name.substring(0, 2) // Getting a substring from index 0 to 2 (exclusive)
    println("Substring of name: $substring") // Using string template to display the substring
    
    // String formatting
    val formattedString = "Name: %s, Age: %d, Height: %.1f".format(name, age, height) // Using format to create a formatted string
    println("Formatted string: $formattedString") // Using string template to display the formatted string

    // String contains
    val sentence = "Kotlin is a great programming language."
    if (sentence.contains("great")) { // Checking if the sentence contains the word "great"
        println("The sentence contains the word 'great'.") // Using string template to display the message
    } else {
        println("The sentence does not contain the word 'great'.") // Using string template to display the message
    }

    // String startsWith and endsWith
    val greeting = "Hello, Kotlin!"
    if (greeting.startsWith("Hello")) { // Checking if the string starts with "Hello"
        println("Greeting starts with 'Hello'.") // Using string template to display the message
    } else {
        println("Greeting does not start with 'Hello'.") // Using string template to display the message
    }
    if (greeting.endsWith("Kotlin!")) { // Checking if the string ends with "Kotlin!"
        println("Greeting ends with 'Kotlin!'.") // Using string template to display the message
    } else {
        println("Greeting does not end with 'Kotlin!'.") // Using string template to display the message
    }

    // String indexOf
    val index = greeting.indexOf("Kotlin") // Finding the index of the substring "Kotlin"
    if (index != -1) { // Checking if the substring was found
        println("The index of 'Kotlin' in the greeting is: $index") // Using string template to display the index
    } else {
        println("'Kotlin' not found in the greeting.") // Using string template to display the message
    }

    // String isEmpty and isBlank
    val emptyString = ""
    val blankString = "   "
    if (emptyString.isEmpty()) { // Checking if the string is empty
        println("The emptyString is empty.") // Using string template to display the message
    } else {
        println("The emptyString is not empty.") // Using string template to display the message
    }

    if (blankString.isBlank()) { // Checking if the string is blank (contains only whitespace)
        println("The blankString is blank.") // Using string template to display the message
    } else {
        println("The blankString is not blank.") // Using string template to display the message
    }

    // String toCharArray
    val charArray = name.toCharArray() // Converting the string to a character array
    println("Character array of name: ${charArray.joinToString(", ")}") // Using string template to display the character array

    // String toByteArray
    val byteArray = name.toByteArray() // Converting the string to a byte array
    println("Byte array of name: ${byteArray.joinToString(", ")}") // Using string template to display the byte array

"""
    O/P
    My name is John, I am 30 years old, and my height is 5.9 feet.
    Hello, John! You are 30 years old.
    This is a multiline string.
    It can span multiple lines.
    Useful for longer text.
    Length of name: 4
    Names are equal.
    Uppercase name: JOHN
    Lowercase name: john
    Trimmed string: Hello, World!
    Replaced string: Hello, Alice!
    Fruits: [apple, banana, cherry]
    First character of name: J
    Substring of name: Jo
    Formatted string: Name: John, Age: 30, Height: 5.9
    The sentence contains the word 'great'.
    Greeting starts with 'Hello'.
    Greeting ends with 'Kotlin!'.
    The index of 'Kotlin' in the greeting is: 7
    The emptyString is empty.
    The blankString is blank.
    Character array of name: J, o, h, n
    Byte array of name: 74, 111, 104, 110
"""

}