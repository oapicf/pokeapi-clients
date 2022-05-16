package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-16T10:34:47.121763Z[Etc/UTC]")
@Singleton
class CharacteristicApiController @Inject()(cc: ControllerComponents, api: CharacteristicApi) extends AbstractController(cc) {
  /**
    * GET /api/v2/api/v2/characteristic/?limit=[value]&offset=[value]
    */
  def characteristicList(): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
      api.characteristicList(limit, offset)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/api/v2/characteristic/:id/
    */
  def characteristicRead(id: Int): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      api.characteristicRead(id)
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
