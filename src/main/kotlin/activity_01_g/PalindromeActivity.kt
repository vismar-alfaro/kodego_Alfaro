package activity_01_g

import mu.KotlinLogging

private val logger = KotlinLogging.logger{}

fun main(args: Array<String>) {
//    Create an application that will accept 1 string.
//
//    Your application will print “Palindrome” if the string is a palindrome.

    var word: String? = null
    var reverse: String? = ""


    logger.info { "Please Input a word: " }
    word = readLine().toString()
    var indexDec = word.length -1

    while (indexDec in word.length downTo  0) {
        reverse = reverse + word[indexDec]
        indexDec--}

    if (word.lowercase() == reverse?.lowercase()) {
            logger.info { "$word - Palindrome" }
        } else {
            logger.info { "$word - Not Palindrome" }
        }

}
