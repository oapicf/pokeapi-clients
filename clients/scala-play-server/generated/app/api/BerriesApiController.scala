package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BerryDetail
import model.BerryFirmnessDetail
import model.BerryFlavorDetail
import model.PaginatedBerryFirmnessSummaryList
import model.PaginatedBerryFlavorSummaryList
import model.PaginatedBerrySummaryList

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class BerriesApiController @Inject()(cc: ControllerComponents, api: BerriesApi) extends AbstractController(cc) {
  /**
    * GET /api/v2/berry-firmness/?limit=[value]&offset=[value]&q=[value]
    */
  def berryFirmnessList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedBerryFirmnessSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.berryFirmnessList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/berry-firmness/:id/
    * @param id This parameter can be a string or an integer.
    */
  def berryFirmnessRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): BerryFirmnessDetail = {
      api.berryFirmnessRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/berry-flavor/?limit=[value]&offset=[value]&q=[value]
    */
  def berryFlavorList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedBerryFlavorSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.berryFlavorList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/berry-flavor/:id/
    * @param id This parameter can be a string or an integer.
    */
  def berryFlavorRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): BerryFlavorDetail = {
      api.berryFlavorRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/berry/?limit=[value]&offset=[value]&q=[value]
    */
  def berryList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedBerrySummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.berryList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/berry/:id/
    * @param id This parameter can be a string or an integer.
    */
  def berryRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): BerryDetail = {
      api.berryRetrieve(id)
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
