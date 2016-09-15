package quikkoo.exercism

object HelloWorld {

  def greet(name: String = "World"): String = {
    if (Option(name).isEmpty) {
      throw new IllegalArgumentException()
    }

    s"Hello, $name!"
  }
}
