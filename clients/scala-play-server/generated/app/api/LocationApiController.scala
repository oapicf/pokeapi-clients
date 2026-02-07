package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.LocationAreaDetail
import model.LocationDetail
import model.PaginatedLocationAreaSummaryList
import model.PaginatedLocationSummaryList
import model.PaginatedPalParkAreaSummaryList
import model.PaginatedRegionSummaryList
import model.PalParkAreaDetail
import model.RegionDetail

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class LocationApiController @Inject()(cc: ControllerComponents, api: LocationApi) extends AbstractController(cc) {
  /**
    * GET /api/v2/location-area/?limit=[value]&offset=[value]
    */
  def locationAreaList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedLocationAreaSummaryList = {
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
    * @param id A unique integer value identifying this location area.
    */
  def locationAreaRetrieve(id: Int): Action[AnyContent] = Action { request =>
    def executeApi(): LocationAreaDetail = {
      api.locationAreaRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/location/?limit=[value]&offset=[value]&q=[value]
    */
  def locationList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedLocationSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.locationList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/location/:id/
    * @param id This parameter can be a string or an integer.
    */
  def locationRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): LocationDetail = {
      api.locationRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/pal-park-area/?limit=[value]&offset=[value]&q=[value]
    */
  def palParkAreaList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedPalParkAreaSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.palParkAreaList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/pal-park-area/:id/
    * @param id This parameter can be a string or an integer.
    */
  def palParkAreaRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): PalParkAreaDetail = {
      api.palParkAreaRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/region/?limit=[value]&offset=[value]&q=[value]
    */
  def regionList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedRegionSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.regionList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/region/:id/
    * @param id This parameter can be a string or an integer.
    */
  def regionRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): RegionDetail = {
      api.regionRetrieve(id)
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
