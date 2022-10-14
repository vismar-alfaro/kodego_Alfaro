package activity_1_d

import java.lang.ArithmeticException
import java.util.*

fun main(args: Array<String>) {

    var sum: Int? = null
    var num1: Int? = null
    var num2: Int? = null
    var num3: Int? = null
    var num4: Int? = null
    var num5: Int? = null
    var result: Double? = null
    var divisor1: Int? = null
    var sumTotal: Double? = null
    var amount1: String? = null
    print("Enter first amount: ")
    amount1 = readLine()?.toString()
    var amount2: String? = null
    print("Enter second amount: ")
    amount2 = readLine()?.toString()
    var amount3: String? = null
    print("Enter third amount: ")
    amount3 = readLine()?.toString()
    var amount4: String? = null
    print("Enter fourth amount: ")
    amount4 = readLine()?.toString()
    var amount5: String? = null
    print("Enter fifth amount: ")
    amount5 = readLine()?.toString()

    var divisor: String? = null
    print("Divide the value by how much?: ")
    divisor = readLine().toString()

    try {
        var num1 = amount1?.toInt()
        var num2 = amount2?.toInt()
        var num3 = amount3?.toInt()
        var num4 = amount4?.toInt()
        var num5 = amount5?.toInt()
        var sum1 = num1?.plus(num2!!)
        var sum2 = num3?.plus(sum1!!)
        var sum3 = num4?.plus(sum2!!)
        var sum4 = num5?.plus(sum3!!)
        sumTotal = sum4?.toDouble()

        try {
            divisor1 = divisor?.toInt()
            try {
                result = divisor1?.toDouble()?.let { sumTotal?.div(it) }
                println("The answer is: $result")
            } catch (e: ArithmeticException) {
                println("Divisor is invalid")
            }
        } catch (e: NumberFormatException) {
            println("Please give a number")
        }
    } catch (e: NumberFormatException) {
        println("Input is invalid")
        println("Please give a number")
    }

}