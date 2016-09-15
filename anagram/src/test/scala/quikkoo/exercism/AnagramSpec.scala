package quikkoo.exercism

import org.scalatest.{ FlatSpec, Matchers }

class AnagramSpec extends FlatSpec with Matchers {

  it should "detect no matches" in {
    val detector = new Anagram("diaper")
    val anagrams = detector.matches(Seq("hello", "world", "zombies", "pants"))
    anagrams should equal (Seq())
  }

  it should "detect simple anagrams" in {
    val detector = new Anagram("ant")
    val anagrams = detector.matches(Seq("tan", "stand", "at"))
    anagrams should equal (Seq("tan"))
  }

  it should "detect multiple anagrams" in {
    val detector = new Anagram("master")
    val anagrams = detector.matches(Seq("stream", "pigeon", "maters"))
    anagrams should equal (Seq("stream", "maters"))
  }

  it should "not confuse different duplicates" in {
    val detector = new Anagram("galea")
    val anagrams = detector.matches(Seq("eagle"))
    anagrams should equal (Seq())
  }

  it should "not include identical words" in {
    val detector = new Anagram("corn")
    val anagrams = detector.matches(Seq(
      "corn", "dark", "Corn", "rank", "CORN", "cron", "park"
    ))
    anagrams should equal (Seq("cron"))
  }

  it should "elimitate anagrams with same checksum" in {
    val detector = new Anagram("mass")
    val anagrams = detector.matches(Seq("last"))
    anagrams should equal (Seq())
  }

  it should "eliminate anagrams subsets" in {
    val detector = new Anagram("good")
    detector.matches(Seq("dog", "goody")) should equal (Seq())
  }

  it should "detect anagrams" in {
    val detector = new Anagram("listen")
    val anagrams = detector.matches(Seq("enlists", "google", "inlets", "banana"))
    anagrams should equal (Seq("inlets"))
  }

  it should "detect more anagrams" in {
    val detector = new Anagram("allergy")
    val anagrams = detector.matches(Seq(
      "gallery", "ballerina", "regally", "clergy", "largely", "leading"
    ))
    anagrams should equal (Seq("gallery", "regally", "largely"))
  }

  it should "treat subject anagrams as case insensitive" in {
    val detector = new Anagram("Orchestra")
    val anagrams = detector.matches(Seq(
      "cashregister", "carthorse", "radishes"
    ))
    anagrams should equal(Seq("carthorse"))
  }

  it should "treat candidate anagrams as case insensitive" in {
    val detector = new Anagram("orchestra")
    val anagrams = detector.matches(Seq(
      "Cashregister", "Carthorse", "Radishes"
    ))
    anagrams should equal(Seq("Carthorse"))
  }
}
