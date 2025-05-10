package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:55:15.341659946Z[Etc/UTC]", comments = "Generator version: 7.12.0")
@Singleton
class EncounterMethodApiController @Inject()(cc: ControllerComponents, api: EncounterMethodApi) extends AbstractController(cc) {
  /**
    * GET /api/v2/encounter-method/?limit=[value]&offset=[value]
    */
  def encounterMethodList(): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      api.encounterMethodList(limit, offset)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/encounter-method/:id/
    */
  def encounterMethodRead(id: Int): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      api.encounterMethodRead(id)
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
