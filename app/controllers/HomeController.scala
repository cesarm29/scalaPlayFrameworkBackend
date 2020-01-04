package controllers


import javax.inject._
import play.api.libs.json.{JsValue, Json}
import play.api.mvc._

import scala.util.parsing.json.{JSONArray, JSONObject}



/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def plainText = Action {
    Ok("This is just a text message.");
  }

  def resultJson = Action {
    val json: JsValue = Json.parse("""
        {
          "user": {
            "name" : "toto",
            "age" : 25,
            "email" : "toto@jmail.com",
            "isAlive" : true,
            "friend" : {
              "name" : "tata",
              "age" : 20,
              "email" : "tata@coldmail.com"
            }
          }
        }
        """)
    Ok(Json.toJson(json));
  }







}
