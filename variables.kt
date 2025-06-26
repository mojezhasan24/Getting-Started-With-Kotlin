fun main () {
    val burgers = 5 //immmutable(readonly) datatype declaration VAL
    val coke = 5
    var customers = 10 // mutable datatype declaration VAR
    // mutation value
    customers = 8 // errorless mutation 
    burgers = 3 // will raise compile time error: val cannot be reassigned
    println(customers)
}
// Variables can be declared outside the main() function at the beginning of your program. Variables declared in this way are said to be declared at top level.
// is is recommend that you declare all variables as read-only (val) by default. Declare mutable variables (var) only if necessary.