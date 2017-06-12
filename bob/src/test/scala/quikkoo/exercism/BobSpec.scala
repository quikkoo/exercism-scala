package quikkoo.exercism

import org.scalatest.{ FlatSpec, Matchers }

class BobSpec extends FlatSpec with Matchers {

  val bob = new Bob

  it should "respond to a statement" in {
    val response = bob.hey("Tom-ay-to, tom-aaaah-to.")
    response should be ("Whatever.")
  }

  it should "respond to shouting" in {
    val response = bob.hey("WATCH OUT!")
    response should be ("Whoa, chill out!")
  }

  it should "respond to questions" in {
    val response = bob.hey("Does this cryogenic chamber make me look fat?")
    response should be ("Sure.")
  }

  it should "respond to questions ending with numbers" in {
    val response = bob.hey("You are what, like 15?")
    response should be ("Sure.")
  }

  it should "respond to forceful talking" in {
    val response = bob.hey("Let's go make out behind the gym!")
    response should be ("Whatever.")
  }

  it should "respond to acroynms in regular speech" in {
    val response = bob.hey("It's OK if you don't want to go to the DMV.")
    response should be ("Whatever.")
  }

  it should "respond to forceful questions as shouting" in {
    val response = bob.hey("WHAT THE HELL WERE YOU THINKING?")
    response should be ("Whoa, chill out!")
  }

  it should "respond to shouting with special characters" in {
    val response = bob.hey("ZOMG THE %^*@#$(*^ ZOMBIES ARE COMING!!11!!1!")
    response should be ("Whoa, chill out!")
  }

  it should "respond to numbers when shouting" in {
    val response = bob.hey("1, 2, 3, GO!")
    response should be ("Whoa, chill out!")
  }

  it should "respond to numbers as speech" in {
    val response = bob.hey("1, 2, 3")
    response should be ("Whatever.")
  }

  it should "respond to questions with only numbers" in {
    val response = bob.hey("4?")
    response should be ("Sure.")
  }

  it should "respond to shouting with no exclamation mark" in {
    val response = bob.hey("I HATE YOU")
    response should be ("Whoa, chill out!")
  }

  it should "respond to statements containing question mark" in {
    val response = bob.hey("Ending with ? means a question.")
    response should be ("Whatever.")
  }

  it should "respond to prattling on" in {
    val response = bob.hey("Wait! Hang on. Are you going to be OK?")
    response should be ("Sure.")
  }

  it should "respond to silence" in {
    val response = bob.hey("")
    response should be ("Fine. Be that way!")
  }

  it should "respond to prolonged silence" in {
    val response = bob.hey("          ")
    response should be ("Fine. Be that way!")
  }

  it should "respond to others blank characters" in {
    val response = bob.hey("\n\r \t\u000B\u00A0\u2002")
    response should be ("Fine. Be that way!")
  }

  it should "respond to multiple line questions" in {
    val response = bob.hey("""
      |Does this cryogenic chamber make me look fat?
      |no""")
    response should be ("Whatever.")
  }

  it should "respond to non-letters with question" in {
    val response = bob.hey(":) ?")
    response should be ("Sure.")
  }
}
