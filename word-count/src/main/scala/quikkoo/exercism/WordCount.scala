package quikkoo.exercism

object WordCount {

  private val pattern = "[']?[^'a-zA-Z0-9]+[']?".r

  def calculate(phrase: String): Map[String, Int] = {
    pattern.split(phrase.toLowerCase).
      foldLeft(Map[String, Int]())({ (acc, word) =>
        val count = acc.get(word).
          getOrElse(0) + 1

        acc + (word -> count)
      })
  }
}
