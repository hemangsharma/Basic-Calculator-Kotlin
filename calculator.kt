import java.lang.NumberFormatException
import java.util.*

fun operation(para1:Double,para2:Double,para3:String):Double{
    if(para3.equals("+"))
        return para1+para2
    else if(para3.equals("-"))
        return para1-para2
    else if(para3.equals("*"))
        return para1*para2
    else if(para3.equals("/"))
        return para1/para2
    else if(para3.equals("%"))
        return para1%para2

    else
        return throw Exception()
}


fun main() {
    try {
        print("ENTER NUMBER 1:")
        val value1 = Scanner(System.`in`)
        val d1: Double = value1.nextDouble()

        val value2 = Scanner(System.`in`)
        print("ENTER NUMBER 2:")
        val d2: Double = value2.nextDouble()

        val value3 = Scanner(System.`in`)
        print("ENTER OPERATION(+ - * / %):")
        val op: String = value3.nextLine()

        val result = operation(d1, d2, op)
        println("$result")

    }catch(e:KotlinNullPointerException){
        print("Value is null")
    }catch (e:NumberFormatException){
        println("${e.message} is not a number")
    }catch (e:java.lang.Exception){
        print("Unknown Expression")
    }

}