package patterns.proxy

case class Proxy(subject: Subject) extends Subject {
  override def request(): Unit = subject.request()
}
