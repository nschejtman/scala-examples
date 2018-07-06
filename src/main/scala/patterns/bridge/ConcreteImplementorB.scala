package patterns.bridge

class ConcreteImplementorB extends Implementor {
  override def operationImpl(): Unit = println("This is the real implementation B")
}
