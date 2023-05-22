package com.zenk.kotlinbasics

fun main() {

   //type string
   var myName = "Al"
   var myStr = "This is a string"

   //type int 32 bit
   var myAge = 33
   val myByte: Byte = 10
   val myShort: Short = 125
   val myInt: Int = 123456789
   val myLong: Long = 1234567891012

   //String interpolation
   print("Hello, $myName")
   print("\n")
   print("I am $myAge.")
   print("\n")
   print(myStr[0])
   print("\n")
   print("Here is a string: $myStr and the length of myStr is ${myStr.length}")
   print("\n")
   val myFloat: Float = 13.37F
   val myDouble: Double = 3.145267384905
   var isSunny: Boolean = true;

   //Arithmetic Operators(+, -, *, /, %)
   var result = 5 + 3
   result /= 2
   result *= 2
   result += 2
   print(result)
   print("\n")
   result = 15 % 2
   print(result)
   val a = 5.0
   val b = 3
   var resultDouble: Double = a / b
   print("\n")
   println(resultDouble)

   //Comparison Operators(==, !=, <, >, <=, >=)
   val isEqual = 5 == 3
   println(isEqual)
   println("Is 5 greater than 3 ${5>3}")

   var myNum = 4
   println("myNum + 1 is ${++myNum}")
   println("myNum - 1 is ${--myNum}")

   //If statements
   var heightPerson1 = 170
   var heightPerson2 = 189

   if(heightPerson1 > heightPerson2)
   {
      println("Use raw force.")
   }
   else if (heightPerson1 == heightPerson2)
   {
      println("Use mixed technique.")
   }
   else
   {
      println("use technique.")
   }

   var age = 33

   when {
       age >= 21 -> {
          println("Old enough to drink.")
       }
       age >= 18 -> {
          println("Old enough to vote.")
       }
       age >= 16 -> {
          println("Old enough to drive.")
       }
       else -> {
          println("You're too young.")
       }
   }

   var season = 3

   when(season)
   {
      1 -> println("Spring")
      2 -> println("Summer")
      3 -> println("Fall")
      4 -> println("Winter")
      else -> println("Invalid season")
   }

   var month = 3
   when(month)
   {
      in 3..5 -> println("Spring")
      in 6..8 -> println("Summer")
      in 9..11 -> println("Fall")
      12, 1, 2 -> println("Winter")
      else -> println("Invalid season")
   }

   var x: Any = 13.37

   when(x)
   {
      is Int -> println("$x is an int.")
      is Double -> println("$x is a double")
      is String -> println("$x is a String")
      else -> println("$x is none of the above.")
   }

   //While Loops
   var i = 0
   while(i <= 10)
   {
      println(i)
      i++
   }

   var j = 100
   while(j >= 0)
   {
      if(j % 2 == 0)
      {
         println(j)
      }

      j--
   }

   var interval = 100
   while(interval >= 0)
   {
      println(interval)
      interval -= 2
   }

   //Do While Loops
   var z = 20
   do
   {
      println(z)
   } while(z <= 10)

   var feltTemp = "cold"
   var roomTemp = 10
   while(feltTemp == "cold")
   {
      roomTemp++
      if(roomTemp >= 20)
      {
         feltTemp = "comfy"
         println("It's $feltTemp now")
      }
   }

   //For Loops
   for(num in 1..10)
   {
      println("$num")
   }

   for(i in 1 until 10)
   {
      print("$i ")
   }

   println()

   for(i in 10 downTo  1)
   {
      print("$i ")
   }

   println()

   for(i in 10 downTo 1 step 2)
   {
      print("$i ")
   }

   println()

   for(i in 0..10000)
   {

      if(i == 9001)
      {
         println("IT'S OVER 9000")
      }

      println("$i")

   }

   var humidityLevel = 80
   var humidity = "humid"
   while(humidity == "humid")
   {


      humidityLevel -= 5
      println(humidityLevel)
      println("Humidity decreased")

      if(humidityLevel < 60)
      {
         println("It's comfy now.")
         humidity = "comfy"
      }

   }

   var iterable = 12
   do {
      println("$iterable ")
   }while(z <= 10)

   //Break and Continue
   for(i in 1..20)
   {
      print("$i ")
      if(i/2 == 5)
      {
         break
      }


   }
   for(i in 1..20)
   {
      //Skips 11 because it is treated as an int in the division below so 5.5 is rounded down to 5.
      if(i/2 == 5)
      {
         continue
      }
      print("$i ")

   }

   myFunction()

   //Argument when passed to a function, parameter when specified by a function.
   println(sum(5,3))

   //Method is a function within a class.

   println(average(13.0, 2.0))
}

fun myFunction()
{
   println("Called from myFunction")

}

//Parameterized Function
fun sum(a: Int, b: Int) : Int
{
   return a + b
}

fun average(a: Double, b: Double) : Double
{
   return (a + b) / 2
}
