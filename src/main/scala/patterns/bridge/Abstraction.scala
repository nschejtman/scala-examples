package patterns.bridge

class Abstraction(implementor: Implementor) {
  def operation(): Unit = implementor.operationImpl()

}
