package quikkoo.exercism

class Bob {

  private val fine = """^[\s\v\u00A0\u2002]*$""".r
  private val whoa = """^[^\p{Ll}]*[A-Z][^\p{Ll}]*$""".r
  private val sure = """^.*\?$[\s\v]*""".r

  def hey(question: String): String = {
    question match {
      case fine() => "Fine. Be that way!"
      case whoa() => "Whoa, chill out!"
      case sure() => "Sure."
      case _ => "Whatever."
    }
  }
}
