package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import model.Converter

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index() = Action { implicit request: Request[AnyContent] =>
    SeeOther("/convert")
  }

  def convert(amount: Double, currency: String) = Action { implicit request: Request[AnyContent] =>
    val converter = new Converter()
    val res = converter.convert(amount, currency)
    Ok(s"{ \"result\":$res }")
  }
  
}
