package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-24T08:45:05.479546Z[Etc/UTC]")
@Singleton
class LocationAreaApiController @Inject()(cc: ControllerComponents, api: LocationAreaApi) extends AbstractController(cc) {
  /**
    * GET /api/v2/location-area/?limit=[value]&offset=[value]
    */
  def locationAreaList(): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
      api.locationAreaList(limit, offset)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/location-area/:id/
    */
  def locationAreaRead(id: Int): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      api.locationAreaRead(id)
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
