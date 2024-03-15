package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-15T11:09:53.787967121Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Singleton
class MoveBattleStyleApiController @Inject()(cc: ControllerComponents, api: MoveBattleStyleApi) extends AbstractController(cc) {
  /**
    * GET /api/v2/move-battle-style/?limit=[value]&offset=[value]
    */
  def moveBattleStyleList(): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      api.moveBattleStyleList(limit, offset)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/move-battle-style/:id/
    */
  def moveBattleStyleRead(id: Int): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      api.moveBattleStyleRead(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
