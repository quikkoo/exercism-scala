package quikkoo.exercism

import org.scalatest.{ FunSuite, Matchers }

class HelloWorldTest extends FunSuite with Matchers {

  test("without name") {
    HelloWorld.greet() should be ("Hello, World!")
  }

  test("with empty name") {
    HelloWorld.greet("") should be ("Hello, World!")
  }

  test("with name Scala") {
    HelloWorld.greet("Scala") should be ("Hello, Scala!")
  }

  test("with name Exercism") {
    HelloWorld.greet("Exercism") should be ("Hello, Exercism!")
  }

  test("with null name") {
    an[IllegalArgumentException] should be thrownBy {
      HelloWorld.greet(null)
    }
  }
}
