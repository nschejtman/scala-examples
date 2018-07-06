package patterns.bridge

class ConcreteImplementorA extends Implementor {
  override def operationImpl(): Unit = println("This is the real implementation A")
}
