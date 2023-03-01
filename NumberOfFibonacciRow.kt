fun main() {
    println("Input a number:")
    val num = readln().toInt()
    var counter = 0
    var first = 0
    var second = 1
    println(first)
    println(second)
    while (counter < num) {
        var next = first + second
        println(next)
        first = second
        second = next
        counter += 1
    }
}