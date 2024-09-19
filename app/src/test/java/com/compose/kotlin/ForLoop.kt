package com.compose.kotlin

class ForLoop {

}

fun main() {
    println("Iterate Through a Range:")

    println("---------------")
    forLoop1()
    println()
    forLoop2()
    println()
    forLoop3()
    println()
    forLoop4()
    println()
    forLoop5()
    println()
    forLoop6()
    println()
    forLoop7()
    println()
    forLoop8()
    println()
    forLoop9()
    println()

    rangeLoop1()
    rangeLoop2()
    rangeLoop3()
    rangeLoop4()
    rangeLoop5()
    rangeLoop6()
    rangeLoop7()
    rangeLoop8()


}

private fun rangeLoop1() {
    println("Character range: ")
    for (ch in 'a'..'e') {
        print("${ch}, ")
    }
}

private fun rangeLoop2() {
    println("")
    for (num in 1.rangeTo(5)) {
        print("$num, ")
    }
}

private fun rangeLoop3() {
    println("")
    for (ch in 'a'.rangeTo('e')) {
        print("$ch, ")
    }
}

private fun rangeLoop4() {
    println("")
    for (ch in 'e'.downTo('a')) {
        print("${ch}, ")
    }
}

private fun rangeLoop5() {
    println("")
    (2..5).forEach(::println)
}

private fun rangeLoop6() {
    var i = 2
    for (i in 3..10 step 2) {
        print("$i ")
    }
    println()
    println("First value of the range : " + (11..20 step 2).first)
    println("Last value of the range " + (11..20).last)
    println("Step used in the range " + (11..20 step 5).step)
}

private fun rangeLoop7() {
    var range = 2..8
    for (x in range.reversed()) {
        print("$x ")
    }
}

private fun rangeLoop8() {
    val predefined = (15..20)
    println("The minimum value of range is " + predefined.min())
    println("The maximum value of range is " + predefined.max())
    println("The sum of all value of range is " + predefined.sum())
    println("The average value of range is " + predefined.average())
}

private fun forLoop1() {
    print("for (i in 1..5) - ")
    for (i in 1..5) {
        print("Itme $i, ")
    }
}

private fun forLoop2() {
    print("for (i in 5..1) - ")
    for (i in 5..1) {
        print("Item $i, ")
    }
    print(" Prints nothing ")
}

private fun forLoop3() {
    print("for (i in 5 downTo 1) - ")
    for (i in 5 downTo 1) {
        print("Item $i, ")
    }
}

private fun forLoop4() {
    print("for (i in 1..5 step 2) - ")
    for (i in 1..5 step 2) {
        print("Item $i, ")
    }
}

private fun forLoop5() {
    print("for (i in 5 downTo 1 step 2) - ")
    for (i in 5 downTo 1 step 2) {
        print("Item $i, ")
    }
}

private fun forLoop6() {
    var language = arrayOf("Ruby", "Kotlin", "Python", "Java")
    for (item in language) {
        print("$item, ")
    }
}

private fun forLoop7() {
    var language = arrayOf("Ruby", "Kotlin", "Python", "Java")
    for (item in language.indices) {
        if (item % 2 == 0) {
            print("${language[item]}, ")
        }
    }
}

private fun forLoop8() {

    var text = "kotlin"
    for (letter in text) {
        print("$letter, ")
    }
}

private fun forLoop9() {
    var text = "kotlin"
    for (letter in text.indices) {
        print("${text[letter]}, ")
    }
}