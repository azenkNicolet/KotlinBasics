package com.zenk.kotlinbasics


data class User(val id: Long, var name: String)
{

}

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
   println("Is 5 greater than 3 ${5 > 3}")

   var myNum = 4
   println("myNum + 1 is ${++myNum}")
   println("myNum - 1 is ${--myNum}")

   //If statements
   var heightPerson1 = 170
   var heightPerson2 = 189

   if (heightPerson1 > heightPerson2) {
      println("Use raw force.")
   } else if (heightPerson1 == heightPerson2) {
      println("Use mixed technique.")
   } else {
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

   when (season) {
      1 -> println("Spring")
      2 -> println("Summer")
      3 -> println("Fall")
      4 -> println("Winter")
      else -> println("Invalid season")
   }

   var month = 3
   when (month) {
      in 3..5 -> println("Spring")
      in 6..8 -> println("Summer")
      in 9..11 -> println("Fall")
      12, 1, 2 -> println("Winter")
      else -> println("Invalid season")
   }

   var x: Any = 13.37

   when (x) {
      is Int -> println("$x is an int.")
      is Double -> println("$x is a double")
      is String -> println("$x is a String")
      else -> println("$x is none of the above.")
   }

   //While Loops
   var i = 0
   while (i <= 10) {
      println(i)
      i++
   }

   var j = 100
   while (j >= 0) {
      if (j % 2 == 0) {
         println(j)
      }

      j--
   }

   var interval = 100
   while (interval >= 0) {
      println(interval)
      interval -= 2
   }

   //Do While Loops
   var z = 20
   do {
      println(z)
   } while (z <= 10)

   var feltTemp = "cold"
   var roomTemp = 10
   while (feltTemp == "cold") {
      roomTemp++
      if (roomTemp >= 20) {
         feltTemp = "comfy"
         println("It's $feltTemp now")
      }
   }

   //For Loops
   for (num in 1..10) {
      println("$num")
   }

   for (i in 1 until 10) {
      print("$i ")
   }

   println()

   for (i in 10 downTo 1) {
      print("$i ")
   }

   println()

   for (i in 10 downTo 1 step 2) {
      print("$i ")
   }

   println()

   for (i in 0..10000) {

      if (i == 9001) {
         println("IT'S OVER 9000")
      }

      println("$i")

   }

   var humidityLevel = 80
   var humidity = "humid"
   while (humidity == "humid") {


      humidityLevel -= 5
      println(humidityLevel)
      println("Humidity decreased")

      if (humidityLevel < 60) {
         println("It's comfy now.")
         humidity = "comfy"
      }

   }

   var iterable = 12
   do {
      println("$iterable ")
   } while (z <= 10)

   //Break and Continue
   for (i in 1..20) {
      print("$i ")
      if (i / 2 == 5) {
         break
      }


   }
   for (i in 1..20) {
      //Skips 11 because it is treated as an int in the division below so 5.5 is rounded down to 5.
      if (i / 2 == 5) {
         continue
      }
      print("$i ")

   }

   myFunction()

   //Argument when passed to a function, parameter when specified by a function.
   println(sum(5, 3))

   //Method is a function within a class.

   println(average(13.0, 2.0))

   elvisOperator()

   //Creating instance of Person Class. Class is blueprint, object is implementation.
   var al = Person("Al", "Zenk", 33)

   var samsungGalaxy = MobilePhone("Android", "Samsung", "Galaxy S23")
   var iPhone = MobilePhone("iOS", "Apple", "iPhone 14");
   var jitterbug = MobilePhone("Jitter OS", "Jitterbug", "JB14")

   println("${al.firstName} ${al.lastName} is ${al.age} years old.")
   al.hobby = "Fishing"
   al.stateHobby()


   val user1 = User(1, "Al")

   println(user1.name)
   val user2 = User(1, "Al")

   println(user1 == user2)

   val updatedUser = user1.copy(name = "John Smith")
   println(updatedUser)

   println(updatedUser.component1()) //Prints id
   println(updatedUser.component2()) //Prints name

   //Deconstruction
   val (id, name) = updatedUser

   var newPhone = MobilePhone("Android", "Samsung", "Galaxy S22")
   newPhone.chargeBattery(30)
   newPhone.chargeBattery(0)

   var audiA3 = Car(200.0, "A3", "Audi")
   var teslaS = ElectricCar(240.0, "S-Model", "Tesla", 85.0)

   teslaS.extendRange(200.0)
   audiA3.drive(200.0)
   teslaS.drive(200.0)

   teslaS.brake()

   val stringList: List<String> = listOf("Denis", "Frank", "Michael", "Gary")
   val mixedTypeList: List<Any> = listOf("Denis", 31, 5, "BDay", 70.5, "weights", "Kg")

   for (value in mixedTypeList) {
      when (value) {
         is Int -> {
            println("Integer: '$value'")
         }
         is Double -> {
            println("Double: '$value' with Floor value ${kotlin.math.floor(value)}")
         }
         is String -> {
            println("String: '$value' of length ${value.length}")
         }
         else -> {
            println("Unknown type")
         }
      }
   }

   //Smart cast
   val obj1: Any = "I have a dream"

   if (obj1 !is String)
   {
      println("Not a string")
   }
   else
   {
      println("Found a string of length ${obj1.length}")
   }

   //Explicit (unsafe) casting
   val str1: String = obj1 as String
   println(str1.length)

   //Explicit (safe) casting
   val obj3: Any = 1337
   val str3: String? = obj3 as? String
   println(str3)

   arrays()
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

//Nullables
fun createNullable()
{
   var name : String? = "Al"
   name = null

   //Old way to check for null value.
   if(name != null) {
      var len = name.length
   }

   //New way to account for null value/
   var len2 = name?.length

  // name?.let { println(it.length) }
}

fun elvisOperator()
{
   var nullableName : String? = "Al"
   nullableName = "George"

   //Elvis Operator will plug in default value of Guest if nullableName were assigned the value
   //of null above.
   val name = nullableName ?: "Guest"

   println(name)

   //Not null assertion operator(!!)
   println(nullableName!!.toLowerCase())
}

class Person(firstName: String = "John", lastName: String = "Doe")
{

   //Member Variables
   var age : Int? = null
   var hobby : String? = null
   var firstName : String? = null
   var lastName : String? = null

   init
   {
      println("Person created with firstName = $firstName and lastName = $lastName.")
   }

   //Secondary Constructor Member
   constructor(firstName: String, lastName: String, age: Int) : this(firstName, lastName)
   {
      this.age = age
      this.firstName = firstName
      this.lastName = lastName
      println("Initialized a new person object with firstName = $firstName and lastName = $lastName and age = $age." )
   }

   //Member Fns - Methods
   fun stateHobby()
   {
      println("$firstName\'s hobby is $hobby")
   }
}

class MobilePhone(osName: String, brand: String, model: String)
{
   var battery = 49

   fun chargeBattery(charged: Int)
   {
      var sum = battery + charged
      println("Initial battery state: $battery")
      println("Amount charged: $charged")
      println("Current battery percentage: $sum")
      battery += charged
   }

   init
   {
      println("osName = $osName, brand = $brand, model = $model")

   }
}



open class Car(override val maxSpeed: Double, val name: String, val brand: String): Drivable
{
   open var range: Double = 0.0

   fun extendRange(amount: Double)
   {
      if(amount > 0)
      {
         range += amount
      }
   }

   override fun drive(): String
   {
      return "Driving the interface drive."
   }

   open fun drive(distance: Double)
   {
      println("Drove for $distance KM.")
   }

}

class ElectricCar(maxSpeed: Double, name: String, brand: String, batteryLife: Double) : Car(maxSpeed, name, brand)
{
   override var range = batteryLife * 6

   override fun drive(distance: Double)
   {
      println("Drove for $distance KM on electricity")
   }

   override fun drive(): String
   {
      return "Drove for $range KM on electricity"
   }

   override fun brake() {
      super.brake()
   }
}

interface Drivable
{
   val maxSpeed: Double
   fun drive(): String
   fun brake()
   {
      println("The drivable is braking.")
   }
}

fun arrays()
{
   val numbers: IntArray = intArrayOf(1,2,3,4,5,6)

   //type inference
   val numbers1 = intArrayOf(1,2,3,4,5,6)

   //Further simplified
   val numbers2 = arrayOf(1,2,3,4,5,6)

   //Prints address of array.
   println(numbers)

   //Prints contents of array.
   println(numbers.contentToString())

   //Print contents using for loop
   for(i in numbers)
   {
      println(i)
   }
}



