package patterns.adapter

case class ConcreteAdapter(adaptee: Adaptee) extends Adapter {

  override def operation(value: Int): Int = {
    val result = adaptee.adaptedOperation(value)
    result.asInstanceOf[Int]
  }
}
