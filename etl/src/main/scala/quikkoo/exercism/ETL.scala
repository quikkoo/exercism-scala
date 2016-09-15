package quikkoo.exercism

object ETL {

  def transform(data: Map[Int, Seq[String]]): Map[String, Int] = {
    data.foldLeft(Map[String, Int]()) { (acc, entry) =>
      acc ++ entry._2.map { value =>
        value.toLowerCase -> entry._1
      }
    }
  }
}
