fun main() {
    var colors =listOf("red","blue","black","yellow")
    var streams= mutableListOf("lisalab","lovelace","AnitaB")
    streams.add("Zambia")
    println(streams)
    val nums=listOf(21,4,22,67,89,22)
    var sortedNums=nums.sorted()
    println(sortedNums)
    println(nums.sortedDescending())
    println(nums.size)
    println(nums.count())
    println(nums.maxOrNull())
    println(nums.sum())
    println(nums.average())
    println(nums[3])
    println(nums.first())
    println(nums.last())
    println(nums.get(1))
    println(nums.indexOf(22))
    println(nums.lastIndexOf(22))
    val names= listOf("james","Lucy","Lona")
    for(name in names) {
        println(names)
        names.forEach { name ->
            println(name)
            var x = Car("Toyota", "Premia")
            var y = Car("Audi", "A5")
            var z = Car("Nissan", "pat")
            var cars = listOf(x, y, z)
            println(cars)


            var sorted = cars.sortedByDescending { car -> car.model }
            println(sorted)
            var names = listOf("Abed", "Lucy", "Elizabeth", "Tanasha")
            var l5 = names.filter { name -> name.length > 5 }
            println(l5)
            var a = Person("Akinyi", 23)
            var b = Person("Laura", 16)
            var c = Person("Mary", 26)
            var Person = listOf(a, b, c)
            var p = Person.filter { Person -> Person.age >=18 }
            println(p)

        }


}


}
data class Car(var make:String,var model:String)

data class Person(var name:String,var age:Int)

