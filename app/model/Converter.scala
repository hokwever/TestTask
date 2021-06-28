package model


class Converter {
  val reader = new Reader()
  lazy val rates = reader.read()

  def convert(amount: Double, currency: String): Double = {
    amount*
      (currency match {
      case "USD" =>
        rates._1
      case "EUR" =>
        rates._2
      case "JPY" =>
        rates._3

      })
  }

}
