fun main(){ // main function is a declaration that is supposed to be in the program always and is the executable body of the program
    println("Hello, World!") // to display a msg or value in o/p we use println
    print("i am your kotlin trainer")
    print("lets get started") // The only difference between println() and print() is that it does not insert a new line at the end of the output where as println does.

    // o/p
    //Hello, World!
    //i am your kotlin trainerlets get started

}

// Function to demonstrate how to take user input in Kotlin
fun inputExample() {
    // Prompt the user to enter their name
    print("Enter your name: ")
    val name = readLine() // readLine() reads a line from standard input as a String

    // Prompt the user to enter their age
    print("Enter your age: ")
    val age = readLine()!!.toInt() // Converts the input String to Int. (!! asserts input is not null)

    // Display the input back to the user
    println("Hello, $name! You are $age years old.")

    // Note:
    // - readLine() returns a nullable String (String?).
    // - Use !! to assert it's not null, or handle null safely in real applications.
    // - Use .toInt(), .toDouble(), etc., to convert input to numbers.
}