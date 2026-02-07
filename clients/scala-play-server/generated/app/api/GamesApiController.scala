package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.GenerationDetail
import model.PaginatedGenerationSummaryList
import model.PaginatedPokedexSummaryList
import model.PaginatedVersionGroupSummaryList
import model.PaginatedVersionSummaryList
import model.PokedexDetail
import model.VersionDetail
import model.VersionGroupDetail

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class GamesApiController @Inject()(cc: ControllerComponents, api: GamesApi) extends AbstractController(cc) {
  /**
    * GET /api/v2/generation/?limit=[value]&offset=[value]&q=[value]
    */
  def generationList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedGenerationSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.generationList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/generation/:id/
    * @param id This parameter can be a string or an integer.
    */
  def generationRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): GenerationDetail = {
      api.generationRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/pokedex/?limit=[value]&offset=[value]&q=[value]
    */
  def pokedexList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedPokedexSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.pokedexList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/pokedex/:id/
    * @param id This parameter can be a string or an integer.
    */
  def pokedexRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): PokedexDetail = {
      api.pokedexRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/version-group/?limit=[value]&offset=[value]&q=[value]
    */
  def versionGroupList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedVersionGroupSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.versionGroupList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/version-group/:id/
    * @param id This parameter can be a string or an integer.
    */
  def versionGroupRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): VersionGroupDetail = {
      api.versionGroupRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/version/?limit=[value]&offset=[value]&q=[value]
    */
  def versionList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedVersionSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.versionList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/version/:id/
    * @param id This parameter can be a string or an integer.
    */
  def versionRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): VersionDetail = {
      api.versionRetrieve(id)
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
