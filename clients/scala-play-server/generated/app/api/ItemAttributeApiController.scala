package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-25T00:39:24.943010519Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class ItemAttributeApiController @Inject()(cc: ControllerComponents, api: ItemAttributeApi) extends AbstractController(cc) {
  /**
    * GET /api/v2/item-attribute/?limit=[value]&offset=[value]
    */
  def itemAttributeList(): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      api.itemAttributeList(limit, offset)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/item-attribute/:id/
    */
  def itemAttributeRead(id: Int): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      api.itemAttributeRead(id)
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
