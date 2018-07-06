package patterns.adapter

class Client {

  def callAdapter(a: Adapter, value: Int): Int = {
    a.operation(value)
  }

}
