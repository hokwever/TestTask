package model

import scala.io.Source

class Reader {
  type Currencies = (Double, Double, Double)
  val filePath = "/home/alex/Service_Plus/play-samples-play-scala-hello-world-tutorial/exchange_rate.txt"
  def read(): Currencies = {
    var usd,eur,jpy:Double = 0
    val file = Source.fromFile(filePath).getLines()
    file.map(x => x.split("; "))
      .foreach(x => {
        x(0) match {
          case "USD" =>
            usd = x(1).toDouble
          case "EUR" =>
            eur = x(1).toDouble
          case "JPY" =>
            jpy = x(1).toDouble
        }
      })
    (usd,eur,jpy)
  }

  def read(currency: String): Double = {
    currency match {
      case "USD" =>
        1
      case "EUR" =>
        2
      case "JPY" =>
        3
    }
  }

}
