package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T13:23:19.534127305Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Singleton
class EggGroupApiController @Inject()(cc: ControllerComponents, api: EggGroupApi) extends AbstractController(cc) {
  /**
    * GET /api/v2/egg-group/?limit=[value]&offset=[value]
    */
  def eggGroupList(): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      api.eggGroupList(limit, offset)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/egg-group/:id/
    */
  def eggGroupRead(id: Int): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      api.eggGroupRead(id)
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
