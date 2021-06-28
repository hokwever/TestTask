package model

import org.scalatest.FlatSpec
import org.scalatestplus.play.guice.GuiceOneAppPerTest

class ReaderSpec extends FlatSpec {
  "Reader" should "read USD=1" in {
    val r = new Reader()
    assertResult(1)(r.read("USD"))
  }

  "Reader" should "read EUR=2" in {
    val r = new Reader()
    assertResult(2)(r.read("EUR"))
  }

  "Reader" should "read JPY=3" in {
    val r = new Reader()
    assertResult(3)(r.read("JPY"))
  }
}
