package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.EncounterConditionDetail
import model.EncounterConditionValueDetail
import model.EncounterMethodDetail
import model.PaginatedEncounterConditionSummaryList
import model.PaginatedEncounterConditionValueSummaryList
import model.PaginatedEncounterMethodSummaryList
import model.PokemonEncountersRetrieve200ResponseInner

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class EncountersApiController @Inject()(cc: ControllerComponents, api: EncountersApi) extends AbstractController(cc) {
  /**
    * GET /api/v2/encounter-condition/?limit=[value]&offset=[value]&q=[value]
    */
  def encounterConditionList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedEncounterConditionSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.encounterConditionList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/encounter-condition/:id/
    * @param id This parameter can be a string or an integer.
    */
  def encounterConditionRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): EncounterConditionDetail = {
      api.encounterConditionRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/encounter-condition-value/?limit=[value]&offset=[value]&q=[value]
    */
  def encounterConditionValueList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedEncounterConditionValueSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.encounterConditionValueList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/encounter-condition-value/:id/
    * @param id This parameter can be a string or an integer.
    */
  def encounterConditionValueRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): EncounterConditionValueDetail = {
      api.encounterConditionValueRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/encounter-method/?limit=[value]&offset=[value]&q=[value]
    */
  def encounterMethodList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedEncounterMethodSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.encounterMethodList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/encounter-method/:id/
    * @param id This parameter can be a string or an integer.
    */
  def encounterMethodRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): EncounterMethodDetail = {
      api.encounterMethodRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/pokemon/:pokemonId/encounters
    */
  def pokemonEncountersRetrieve(pokemonId: String): Action[AnyContent] = Action { request =>
    def executeApi(): List[PokemonEncountersRetrieve200ResponseInner] = {
      api.pokemonEncountersRetrieve(pokemonId)
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
