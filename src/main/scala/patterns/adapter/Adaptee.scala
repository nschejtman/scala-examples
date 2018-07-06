package patterns.adapter

class Adaptee {
  def adaptedOperation(valueA: Double): Double = {
    Math.pow(valueA, 2)
  }

}
