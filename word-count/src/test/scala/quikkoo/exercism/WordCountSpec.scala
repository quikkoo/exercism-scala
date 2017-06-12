package quikkoo.exercism

import org.scalatest.{ FlatSpec, Matchers }

class WordCountSpec extends FlatSpec with Matchers {

  it should "count one word" in {
    val phrase = "word"
    val counts = Map("word" -> 1)

    WordCount.calculate(phrase) should be (counts)
  }

  it should "count one of each" in {
    val phrase = "one of each"
    val counts = Map(
      "one" -> 1,
      "of" -> 1,
      "each" -> 1)

    WordCount.calculate(phrase) should be (counts)
  }

  it should "count multiple occurrences" in {
    val phrase = "one fish two fish red fish blue fish"
    val counts = Map(
      "one" -> 1,
      "fish" -> 4,
      "two" -> 1,
      "red" -> 1,
      "blue" -> 1)

    WordCount.calculate(phrase) should be (counts)
  }

  it should "count everything just once" in {
    val phrase = "all the kings horses and all the kings men"
    val counts = Map(
      "all" -> 2,
      "the" -> 2,
      "kings" -> 2,
      "horses" -> 1,
      "and" -> 1,
      "men" -> 1)

    WordCount.calculate(phrase) should be (counts)
  }

  it should "ignore punctuation" in {
    val phrase = "car : carpet as java : javascript!!&@$%^&"
    val counts = Map(
      "car" -> 1,
      "carpet" -> 1,
      "as" -> 1,
      "java" -> 1,
      "javascript" -> 1)

    WordCount.calculate(phrase) should be (counts)
  }

  it should "handle cramped lists" in {
    val phrase = "one,two,three"
    val counts = Map(
      "one" -> 1,
      "two" -> 1,
      "three" -> 1)

    WordCount.calculate(phrase) should be (counts)
  }

  it should "include numbers" in {
    val phrase = "testing, 1, 2 testing"
    val counts = Map(
      "testing" -> 2,
      "1" -> 1,
      "2" -> 1)

    WordCount.calculate(phrase) should be (counts)
  }

  it should "normalize case" in {
    val phrase = "go Go GO"
    val counts = Map("go" -> 3)

    WordCount.calculate(phrase) should be (counts)
  }

  it should "allow apostrophes" in {
    val phrase = "First: don't laugh. Then: don't cry."
    val counts = Map(
      "first" -> 1,
      "don't" -> 2,
      "laugh" -> 1,
      "then" -> 1,
      "cry" -> 1)

    WordCount.calculate(phrase) should be (counts)
  }

  it should "treat symbols as separators" in {
    val phrase = "hey,my_spacebar_is_broken."
    val counts = Map(
      "hey" -> 1,
      "my" -> 1,
      "spacebar" -> 1,
      "is" -> 1,
      "broken" -> 1)

    WordCount.calculate(phrase) should be (counts)
  }

  it should "counts words with quotations" in {
    val phrase = "Joe can't tell between 'large' and large."
    val counts = Map(
      "joe" -> 1,
      "can't" -> 1,
      "tell" -> 1,
      "between" -> 1,
      "large" -> 2,
      "and" -> 1)

    WordCount.calculate(phrase) should be (counts)
  }
}
