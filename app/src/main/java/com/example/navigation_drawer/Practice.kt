//package com.example.navigation_drawer

//fun main() {
//    println("Enter the months name:")
//    val mymonth=readLine().toString()
//
//    println("my month is: $mymonth")
//
// val month= when (mymonth) {
//    " January" -> println("months number is :1")
//     "February" -> println("months number is :2")
//     "March" -> println("months number is :3")
//     else ->
//         println("invalid months name")
// }
//    println(month)
//}

//    println("Enter number for geting factorial:")
//    val n = readLine()!!.toInt()
//    println("$n")
//     var f:Int=1
//    for (fact in 1..<n)
//     f=f+(f*fact)
//    println("factorial of $n is :$f")


//    println("Enter number for geting factorial:")
//    val n = readLine()!!.toInt()
//    println("$n")
//    var f:Int=1
//    var i=0
//    while(i<n)
//    {
//        f=f+(f*i)
//        println("factorial is: $f")
//        i++
//    }


//    println("Enter a Item name for checking Palindrom:")
//    val str = readLine()!!.toString()
////    println("$str")
//    val rev:String =str.reversed().toString()
////    println(rev)
//    if(str!=rev){
//        println("Item is Not Palindrom")
//    }else
//
//        println(" Yes !! Item is  Palindrom")


//    println("Enter a Item name for checking Palindrom:")
//    val str = readLine()!!.toString()
////   println("$str")
//        var start = 0
//        var end:Int = str.length - 1
//        while (start < end) {
//            if (str[start] != str[end]) {
//               println("Not Palindrom")
//            }
//            start++
//            end--
//        }
//    println("Yes !! Palindrom")
//
//
//   println("Enter a n number for generating fibonacci series")
//    val n:Int=readLine()!!.toInt()
//    var t1 = 0
//    var t2 = 1
//
//    print("First $n terms: ")
//
//    for (i in 1..n) {
//        print("$t1  ")
//        val sum = t1 + t2
//        t1 = t2
//        t2 = sum
//    }
//}


// fun main()
//{
//    println("Enter number of  Input values :")
//  val input=readLine()!!
//    val values=input.split(" ").map { it }.toSet()
//    println("Values are: $values")
// }

//fun main() {
//    println("Enter multiple values :")
//    val input = readLine()!!
//    val values = input.split(" ")
//    val value = values.toSet()
//    println(value)
//    }


//fun main() {
//    val input = "google"
//    val charFrequency = mutableMapOf<Char, Int>()
//
//    for (char in input) {
//        charFrequency[char] = charFrequency.getOrDefault(char, 0) + 1
//    }
//
//    println(charFrequency)
//}

//fun main() {
//    val str = "google "
//    val charFrequency = str.groupingBy { it }.eachCount()
//
//  for ((char, count) in charFrequency) {
//        print(" '$char' = $count ")
//    }
//}


//
//fun bubbleSort(arr: IntArray) {
//    val n = arr.size
//    for (i in 0 until n - 1) {
//        for (j in 0 until n - i - 1) {
//            if (arr[j] > arr[j + 1]) {
//                // Swap the elements
//                val temp = arr[j]
//                arr[j] = arr[j + 1]
//                arr[j + 1] = temp
//            }
//        }
//    }
//}
//
//fun main() {
//    val array = intArrayOf(11, 13, 15, 10, 14, 12, 16)
//    println("Original Array: ${array.joinToString(", ")}")
//    bubbleSort(array)
//    println("Sorted Array: ${array.joinToString(", ")}")
//}




//fun factorial(n: Int): Int {
//    require(n >= 0) { "n must be non-negative" }
//    return if (n <= 1) {
//        1
//    } else {
//        n * factorial(n - 1)
//    }
//}
//
//fun main() {
//    val number = 6
//    val result = factorial(number)
//    println("Factorial of $number is: $result")
//}




