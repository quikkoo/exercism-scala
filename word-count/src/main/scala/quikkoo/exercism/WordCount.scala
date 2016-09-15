package quikkoo.exercism

object WordCount {

  private val pattern = "[^'a-zA-Z0-9]+".r

  def count(phrase: String): Map[String, Int] = {
    val words = pattern.split(phrase)

    words.foldLeft(Map[String, Int]())({ (acc, wrd) =>
      val word = wrd.toLowerCase
      val count = acc.get(word).getOrElse(0) + 1
      acc + (word -> count)
    })
  }
}
