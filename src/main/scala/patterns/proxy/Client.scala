package patterns.proxy

class Client {
  def callSubject(subject: Subject): Unit = subject.request()

}
