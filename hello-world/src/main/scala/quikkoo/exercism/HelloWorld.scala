package quikkoo.exercism

object HelloWorld {

  def greet(name: String = "World"): String = {
    Option(name) match {
      case None => throw new IllegalArgumentException()
      case Some("") => "Hello, World!"
      case Some(name) => s"Hello, $name!"
    }
  }
}
