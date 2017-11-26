object Notes {
  def main(args: Array[String]): Unit = {

    // Source: https://twitter.github.io/scala_school

    val two = 1 + 1 // cannot change the binding
    var name = "scala" // can change the binding
    def addOne(m: Int): Int = m + 1 // create functions with def
    def three() = 1 + 2
    three // You can leave off parentheses on functions with no arguments
    // (x: Int) => x + 1 // anonymous functions
    def timesTwo(i: Int): Int = {
      println("multi line")
      i * 2
    }
    def adder(m: Int, n: Int) = m + n
    val add2 = adder(2, _:Int) // partial application
    def multiply(m: Int)(n: Int): Int = m * n
    val timesThree = multiply(3) _ // curry
    def capitalizeAll(args: String*) = { //  take parameters of a repeated type
      args.map { arg =>
        arg.capitalize
      }
    }
    class Calculator(brand: String) {
      // Constructors are not special methods, they are the code outside of method definitions in your class.
      val color: String = if (brand == "TI") {
        "blue"
      } else if (brand == "HP") {
        "black"
      } else {
        "white"
      }
      def add(m: Int, n: Int): Int = m + n
    }
    val calc = new Calculator("TI")
    calc.add(1, 2)
    // calc.color
    // Inheritance
    class ScientificCalculator(brand: String) extends Calculator(brand) {
      def log(m: Double, base: Double) = math.log(m) / math.log(base)
    }
    // Overloading methods
    class EvenMoreScientificCalculator(brand: String) extends ScientificCalculator(brand) {
      def log(m: Int): Double = log(m, math.exp(1))
    }
    abstract class Shape {
      def getArea():Int    // subclass should define this
    }
    class Circle(r: Int) extends Shape {
      def getArea():Int = { r * r * 3 }
    }
    val c = new Circle(2)
    trait Car {
      val brand: String
    }
    trait Shiny {
      val shineRefraction: Int
    }
    // One class can extend several traits using the with keyword
    class BMW extends Car with Shiny {
      val brand = "BMW"
      val shineRefraction = 12
    }
    // type variables
    trait Cache[K, V] {
      def get(key: K): V
      def put(key: K, value: V)
      def delete(key: K)
    }
    def remove[K](key: K) = ""
    println("End")
  }
}
