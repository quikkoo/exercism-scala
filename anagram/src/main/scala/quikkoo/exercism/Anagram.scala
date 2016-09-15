package quikkoo.exercism

import scala.collection.mutable.ArrayBuffer

class Anagram(subject: String) {

  def matches(candidates: Seq[String]): Seq[String] = {
    val lsub = subject.toLowerCase
    var ssub = lsub.toCharArray.sorted

    candidates.filter { candidate =>
      val lcan = candidate.toLowerCase
      val scan = lcan.toCharArray.sorted

      lazy val isSame = lsub.equals(lcan)
      lazy val hasSameSize = lsub.length == lcan.length
      lazy val hasSameElements = ssub.corresponds(scan) { _ == _ }

      hasSameSize && !isSame && hasSameElements
    }
  }
}
