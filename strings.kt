fun main() {
    val name = "John"
    val age = 30
    val height = 5.9

    // String interpolation
    println("My name is $name, I am $age years old, and my height is $height feet.")

    // String concatenation
    println("Hello, " + name + "! You are " + age + " years old.")

    // Multiline string
    val multilineString = """
        This is a multiline string.
        It can span multiple lines.
        Useful for longer text.
    """.trimIndent()
    println(multilineString)

    // String length
    println("Length of name: ${name.length}")

    // String comparison
    val anotherName = "John"
    if (name == anotherName) {
        println("Names are equal.")
    } else {
        println("Names are not equal.")
    }

    // String to uppercase and lowercase
    println("Uppercase name: ${name.toUpperCase()}")
    println("Lowercase name: ${name.toLowerCase()}")

    // String trimming
    val paddedString = "   Hello, World!   "
    println("Trimmed string: ${paddedString.trim()}")

    // String replacement
    val originalString = "Hello, John!"
    val replacedString = originalString.replace("John", "Alice")
    println("Replaced string: $replacedString")

    // String splitting 
    val csv = "apple,banana,cherry"
    val fruits = csv.split(",")
    println("Fruits: $fruits")

    // String indexing 
    val firstChar = name[0] 
    println("First character of name: $firstChar")

    // String substring
    val substring = name.substring(0, 2)
    println("Substring of name: $substring")

    // String formatting
    val formattedString = "Name: %s, Age: %d, Height: %.1f".format(name, age, height)
    println("Formatted string: $formattedString")

    // String contains
    val sentence = "Kotlin is a great programming language."
    if (sentence.contains("great")) {
        println("The sentence contains the word 'great'.")
    } else {
        println("The sentence does not contain the word 'great'.")
    }

    // String startsWith and endsWith
    val greeting = "Hello, Kotlin!"
    if (greeting.startsWith("Hello")) {
        println("Greeting starts with 'Hello'.")
    } else {
        println("Greeting does not start with 'Hello'.")
    }
    if (greeting.endsWith("Kotlin!")) {
        println("Greeting ends with 'Kotlin!'.")
    } else {
        println("Greeting does not end with 'Kotlin!'.")
    }

    // String indexOf
    val index = greeting.indexOf("Kotlin")
    if (index != -1) {
        println("The index of 'Kotlin' in the greeting is: $index")
    } else {
        println("'Kotlin' not found in the greeting.")
    }

    // String isEmpty and isBlank
    val emptyString = ""
    val blankString = "   "
    if (emptyString.isEmpty()) {
        println("The emptyString is empty.")
    } else {
        println("The emptyString is not empty.")
    }
    if (blankString.isBlank()) {
        println("The blankString is blank.")
    } else {
        println("The blankString is not blank.")
    }

    // String toCharArray
    val charArray = name.toCharArray()
    println("Character array of name: ${charArray.joinToString(", ")}")

    // String toByteArray
    val byteArray = name.toByteArray()
    println("Byte array of name: ${byteArray.joinToString(", ")}")

    // String character access (safe way)
    println("First character: ${name[0]}")
    println("Second character: ${name[1]}")
    println("Last character: ${name[name.length - 1]}")

    // Output section for reference
    /*
    Sample Output:
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
    First character: J
    Second character: o
    Last character: n
    */
}