package quikkoo.exercism

import org.scalatest.{ FunSuite, Matchers }

class HelloWorldTest extends FunSuite with Matchers {

  test("Without name") {
    HelloWorld.greet() should be ("Hello, World!")
  }

  test("With empty name") {
    HelloWorld.greet("") should be ("Hello, !")
  }

  test("With name Alice") {
    HelloWorld.greet("Alice") should be ("Hello, Alice!")
  }

  test("With null name") {
    an[IllegalArgumentException] should be thrownBy {
      HelloWorld.greet(null)
    }
  }
}
