package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.LanguageDetail
import model.PaginatedLanguageSummaryList

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class UtilityApiController @Inject()(cc: ControllerComponents, api: UtilityApi) extends AbstractController(cc) {
  /**
    * GET /api/v2/language/?limit=[value]&offset=[value]&q=[value]
    */
  def languageList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedLanguageSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.languageList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/language/:id/
    * @param id This parameter can be a string or an integer.
    */
  def languageRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): LanguageDetail = {
      api.languageRetrieve(id)
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
