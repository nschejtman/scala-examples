package patterns.composite

trait Component {
  def operation()

  def add(c: Composite)
  def remove(c: Composite)


}
